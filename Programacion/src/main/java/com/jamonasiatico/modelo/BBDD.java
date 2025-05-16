package com.jamonasiatico.modelo;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class BBDD {
	private String url = "jdbc:mysql://localhost/Base_Integrador";

	private String usuarioBBDD = "root";
	private String passwdBBDD = "Tote2005@";
	
	private Connection con;
	
	public Connection abrirConexion() {
		con = null;

		try {
			con = DriverManager.getConnection(url, usuarioBBDD, passwdBBDD);
		} catch (Exception e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return con;
	}
	
	public Usuario obtenerUsuario(String matricula, String password) {
		
		// consulta para iniciar sesión
		String consultaString = "SELECT * FROM usuarios WHERE matricula=? AND password=?";
		
		// aquí creamos un objeto usuario vacía para luego rellenarlo con sus atributos.
		Usuario usuario = new Usuario();
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(consultaString);
			
			stmt1.setString(1, matricula);
			stmt1.setString(2, password);
			
			//Esto te devuelve lo que ha buscado del query.
			ResultSet resultado = stmt1.executeQuery();
			
			// recorrer la tabla. Mientras que haya dato de dicho atributo en la tabla usuarios, que los meta en el objeto creado
			while (resultado.next()) {
				// cogemos el valor de id_usuario de la bbdd y lo metemos en nuestro objeto usuario y así con todos
				int idUsuario = resultado.getInt("id_usuario");
				usuario.setIdUsuario(idUsuario);
				
				String nombre = resultado.getString("nombre");
				usuario.setNombre(nombre); 
				
				String apellido = resultado.getString("apellidos");
				usuario.setApellidos(apellido);
				
				usuario.setMatricula(matricula);
				
				String ciclo  = resultado.getString("ciclo");
				usuario.setCiclo(ciclo);
				
				return usuario;
			}
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}	
	
	
	public void introducirDatosSala(Sala sala) {
		
		String consultaString = "INSERT INTO sala (capacidad, tipo_sala) VALUES (?, ?)";
		
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(consultaString,Statement.RETURN_GENERATED_KEYS);
			
			stmt1.setInt(1, sala.getCapacidad());
			stmt1.setString(2, sala.getTipoSala());
			
			stmt1.executeUpdate();
			
			// recuperar los ids generados en la base de datos causado por un insert
			// para obtener el id de sala
			ResultSet idGenerados = stmt1.getGeneratedKeys();
			while (idGenerados.next()) {
				int idSala = idGenerados.getInt(1);
				sala.setIdSala(idSala);
			}
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void introducirDatosActividad(Actividad actividad) {
		
		String consultaString = "INSERT INTO actividades (id_monitor, id_sala, nombre_actividad, descripcion_actividad, usuarios_maximos, dia_actividad, hora) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(consultaString);
			
			stmt1.setInt(1, ListenerLogin.usuario.getIdUsuario());
			stmt1.setInt(2, actividad.getIdSala());
			stmt1.setString(3, actividad.getNombreActividad());
			stmt1.setString(4, actividad.getDescripcionActividad());
			stmt1.setInt(5, actividad.getUsuariosMaximos());
			stmt1.setString(6, actividad.getFechaActividad());
			stmt1.setString(7, actividad.getHoraActividad());
			
			stmt1.executeUpdate();
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void traerActividades() {
		String recibirActividades = "SELECT * FROM ACTIVIDADES a, SALA s WHERE a.id_sala = s.id_sala";
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(recibirActividades);
						
			ResultSet resultado = stmt1.executeQuery();
			
			ArrayList<Actividad> lista = new ArrayList<Actividad>();
			
			while (resultado.next()) {
				Actividad actividad = new Actividad();
				Sala sala = new Sala();
				
				
				int idActividad = resultado.getInt("id_actividad");
				actividad.setIdActividad(idActividad);
				
				int idMonitor = resultado.getInt("id_monitor");
				actividad.setIdMonitor(idMonitor);
				
				int idSala =resultado.getInt("id_sala");
				actividad.setIdSala(idSala);
				
				String nombreActividad = resultado.getString("nombre_actividad");
				actividad.setNombreActividad(nombreActividad);
				
				String descripcion = resultado.getString("descripcion_actividad");
				actividad.setDescripcionActividad(descripcion);
				
				int usuariosMaximos = resultado.getInt("usuarios_maximos");
				actividad.setUsuariosMaximos(usuariosMaximos);
				
				int usuariosInscritos = resultado.getInt("usuarios_inscritos");
				actividad.setUsuariosInscritos(usuariosInscritos);
				
				String diaActividad = resultado.getString("dia_actividad");
				actividad.setFechaActividad(diaActividad);
				
				String hora = resultado.getString("hora");
				actividad.setHoraActividad(hora);
				
				String tipoSala = resultado.getString("tipo_sala");
				sala.setTipoSala(tipoSala);
				
				int capacidadSala = resultado.getInt("capacidad");
				sala.setCapacidad(capacidadSala);
				
				actividad.setSala(sala);
				
				lista.add(actividad);
			}
			
			ListenerCrearActividad.actividades= lista;
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}
	
	public void eliminarActividad() {
		String eliminar = "delete from actividades where id_actividad=?";
		

		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(eliminar);
			
			stmt1.setInt(1, ListenerCrearActividad.actividad.getIdActividad());
			stmt1.executeUpdate();
						
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch(SQLException e){
			System.out.println("Error al cerrar conexión");
			e.printStackTrace();
		}
	}

	
}
