package com.jamonasiatico.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;

public class BBDD {
	private String url = "jdbc:mysql://localhost/base_integrador";

	private String usuarioBBDD = "root";
	private String passwdBBDD = "1234567";

	private Connection con;

	/**
	 * Método para abrir la conexión a la base de datos
	 * 
	 * @return
	 */
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

	/**
	 * Método para comprobar si el usuario existe en la base de datos
	 * 
	 * @param matricula
	 * @param password
	 * @return
	 */
	public Usuario obtenerUsuario(String matricula, String password) {

		// consulta para iniciar sesión
		String consultaString = "SELECT * FROM usuarios WHERE matricula=? AND password=?";

		// aquí creamos un objeto usuario vacía para luego rellenarlo con sus atributos.
		Usuario usuario = new Usuario();
		try {
			abrirConexion();
			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(consultaString);

			// para asignar valores a los parámetros
			stmt1.setString(1, matricula);
			stmt1.setString(2, password);

			// Esto te devuelve lo que ha buscado del query.
			ResultSet resultado = stmt1.executeQuery();

			// recorrer la tabla. Mientras que haya dato de dicho atributo en la tabla
			// usuarios, que los meta en el objeto creado
			while (resultado.next()) {
				// cogemos el valor de id_usuario de la bbdd y lo metemos en nuestro objeto
				// usuario y así con todos
				int idUsuario = resultado.getInt("id_usuario");
				usuario.setIdUsuario(idUsuario);

				String nombre = resultado.getString("nombre");
				usuario.setNombre(nombre);

				String apellido = resultado.getString("apellidos");
				usuario.setApellidos(apellido);

				usuario.setMatricula(matricula);

				String ciclo = resultado.getString("ciclo");
				usuario.setCiclo(ciclo);

				return usuario;
			}

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Si no encuentra el usuario, devuelve null
		return null;
	}

	/**
	 * Método par introducir los datos de la actividad en la base de datos
	 * 
	 * @param actividad
	 */
	public void introducirDatosActividad(Actividad actividad) {

		// consulta para insertar los datos de la actividad
		String consultaString = "INSERT INTO actividades (id_monitor, id_sala, nombre_actividad, descripcion_actividad, usuarios_maximos, dia_actividad, hora) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(consultaString);

			// para asignar valores a los parámetros
			stmt1.setInt(1, ListenerLogin.usuario.getIdUsuario());
			stmt1.setString(2, actividad.getIdSala());
			stmt1.setString(3, actividad.getNombreActividad());
			stmt1.setString(4, actividad.getDescripcionActividad());
			stmt1.setInt(5, actividad.getUsuariosMaximos());
			stmt1.setString(6, actividad.getFechaActividad());
			stmt1.setString(7, actividad.getHoraActividad());

			// ejecutar la consulta
			stmt1.executeUpdate();

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para traer la informción de las activiades de la base de datos
	 */
	public void traerActividades() {

		// consulta para obtener los datos de las actividades
		String recibirActividades = "SELECT * FROM ACTIVIDADES a, SALA s WHERE a.id_sala = s.id_sala";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(recibirActividades);

			// Esto te devuelve lo que ha buscado del query.
			ResultSet resultado = stmt1.executeQuery();

			// creamos un objeto de tipo actividad vacío para luego rellenarlo con sus
			// atributos.
			ArrayList<Actividad> lista = new ArrayList<Actividad>();

			// mientras haya datos de dicho atributo en la tabla actividades, que los meta
			// en el objeto creado
			while (resultado.next()) {

				// creamos un objeto de tipo actividad y otro de tipo sala
				// en la actividad guardamos los datos de la actividad y en la sala los de la
				// sala
				Actividad actividad = new Actividad();
				Sala sala = new Sala();

				int idActividad = resultado.getInt("id_actividad");
				actividad.setIdActividad(idActividad);

				int idMonitor = resultado.getInt("id_monitor");
				actividad.setIdMonitor(idMonitor);

				String idSala = resultado.getString("id_sala");
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
			// gurdamos los datos de la list en actividades
			ListenerCrearActividad.actividades = lista;

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método para eliminar una actividad de la tabla inscrito_en de l base de datos
	 */
	public void eliminarInscritosPorIdActividad() {

		// creamos un objeto y le asignamos el id de la actividad
		Integer idActividad = ListenerCrearActividad.actividad.getIdActividad();

		// consulta para eliminar los datos de la actividad
		String eliminar = "delete from inscrito_en where id_act=?";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(eliminar);

			// para asignar valores a los parámetros
			stmt1.setInt(1, idActividad);
			// ejecutar la consulta
			stmt1.executeUpdate();

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para eliminar una actividad
	 */
	public void eliminarActividad() {

		// creamos un objeto y le asignamos el id de la actividad
		Integer idActividad = ListenerCrearActividad.actividad.getIdActividad();

		// consulta para eliminar los datos de la actividad
		String eliminar = "delete from actividades where id_actividad=?";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(eliminar);

			// para asignar valores a los parámetros
			stmt1.setInt(1, idActividad);

			// ejecutar la consulta
			stmt1.executeUpdate();

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método para editar una actividad
	 */
	public void editarActividad() {
		// consulta para actualizar una actividad
		String editar = "update actividades set  nombre_actividad=?, descripcion_actividad=?, usuarios_maximos=?, dia_actividad=?, hora=? where id_actividad=?";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(editar);

			stmt1.setString(1, ListenerCrearActividad.actividad.getNombreActividad());
			stmt1.setString(2, ListenerCrearActividad.actividad.getDescripcionActividad());
			stmt1.setInt(3, ListenerCrearActividad.actividad.getUsuariosMaximos());
			stmt1.setString(4, ListenerCrearActividad.actividad.getFechaActividad());
			stmt1.setString(5, ListenerCrearActividad.actividad.getHoraActividad());
			stmt1.setInt(6, ListenerCrearActividad.actividad.getIdActividad());

			int resultado = stmt1.executeUpdate();

			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// crear un método para saber si una actividad ha sido creada pasando por todos
	// los campos excepto el id

	/**
	 * Método para listar las salas de la base de datos
	 * 
	 * @return
	 */
	public ArrayList<Sala> listarSalas() {

		// consulta para obtener los datos de las salas
		String query = "SELECT * FROM SALA";

		try {
			abrirConexion();
			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(query);

			// Esto te devuelve lo que ha buscado del query.
			ResultSet resultado = stmt1.executeQuery();

			// creamos un objeto de tipo sala vacío para luego rellenarlo con sus atributos.
			ArrayList<Sala> lista = new ArrayList<Sala>();

			while (resultado.next()) {
				// mientras haya datos de dicho atributo en la tabla sala, que los meta en el
				// objeto creado

				Sala sala = new Sala();

				String idSala = resultado.getString("id_sala");
				sala.setIdSala(idSala);

				int capacidad = resultado.getInt("capacidad");
				sala.setCapacidad(capacidad);

				String tipoSala = resultado.getString("tipo_sala");
				sala.setTipoSala(tipoSala);

				lista.add(sala);
			}

			cerrarConexion();
			return lista;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Método para cerrar la conexión a la base de datos
	 */
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar conexión");
			e.printStackTrace();
		}
	}

	public void traerActInscritas(int usr) {
		// TODO Auto-generated method stub
		String Incrita = "SELECT * FROM INSCRITO_EN, ACTIVIDADES WHERE INSCRITO_EN.id_act = ACTIVIDADES.id_actividad AND INSCRITO_EN.id_usr=? ";
		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(Incrita);

			// para asignar valores a los parámetros
			stmt1.setInt(1, usr);

			// Esto te devuelve lo que ha buscado del query.
			ResultSet resultado = stmt1.executeQuery();

			// creamos un objeto de tipo actividad vacío para luego rellenarlo con sus
			// atributos.
			ArrayList<Actividad> lista = new ArrayList<Actividad>();

			// mientras haya datos de dicho atributo en la tabla actividades, que los meta
			// en el objeto creado
			while (resultado.next()) {

				// creamos un objeto de tipo actividad y otro de tipo sala
				// en la actividad guardamos los datos de la actividad y en la sala los de la
				// sala
				Actividad actividad = new Actividad();
				Sala sala = new Sala();

				int idActividad = resultado.getInt("id_actividad");
				actividad.setIdActividad(idActividad);

				int idMonitor = resultado.getInt("id_monitor");
				actividad.setIdMonitor(idMonitor);

				String idSala = resultado.getString("id_sala");
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

				actividad.setSala(sala);

				lista.add(actividad);
			}
			// gurdamos los datos de la list en actividades
			ListenerCrearActividad.actividadesInscritas = lista;

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void InscribirEnActividad(int usr, int act) {
		String Inscribir = "INSERT INTO INSCRITO_EN(id_usr, id_act) VALUES (?, ?)";

		try {
			abrirConexion();

			// Para ejecutar la consulta
			PreparedStatement stmt1 = con.prepareStatement(Inscribir);

			// para asignar valores a los parámetros
			stmt1.setInt(1, usr);
			stmt1.setInt(2, act);

			// ejecutar la consulta
			stmt1.executeUpdate();

			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean YaInscrito(int usr, int act) {
		String comprobar = "SELECT * FROM INSCRITO_EN WHERE id_usr=? And id_act=?";
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(comprobar);
			stmt1.setInt(1, usr);
			stmt1.setInt(2, act);
			
			ResultSet resultado = stmt1.executeQuery();;
			
			if(resultado.next()) {
				cerrarConexion();
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void DarDeBajaActividad(int act, int usr) {

		// consulta para eliminar los datos de la actividad
		String eliminar = "delete from inscrito_en where id_act=? AND id_usr=?";
		
		
		try {
			abrirConexion();

			PreparedStatement stmt1 = con.prepareStatement(eliminar);
			stmt1.setInt(1, usr);
			stmt1.setInt(2, act);
			stmt1.executeUpdate();
			
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
