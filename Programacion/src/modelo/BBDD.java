package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		
		// aquí creamos un objeto usuario vacía para luego rellenarl con sus atributos.
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
	
	// el monitor tenga opcion de login como participante
	// o en el login preguntr si quiere ser participante o monitor
	
	
	// con la matrícula hacer que en la vista datos personales muestren sus datos.
	// en el controldor del login tiene que abrir aparte de la ventana dtos actividad, hacer objeto tipo usuario
	// con los datos de la mtrícula...
	//o devuelvo un obejto tipo usuario o nda
//	/**
//	 * peticion de traerlas actividades inscritas(con los datos...)
//	 *  pedir un rraylist de actividades
//	 *  
//	 *  que se abra la vista datos personles mejor.
//	 * @param matricula
//	 * @return
//	 */
//	public boolean EsMonitor(String matricula) {
//		// TODO Auto-generated method stub
//		
//		String consultaString = "SELECT * FROM usuarios WHERE matricula=? AND ciclo='TAFD'";
//		
//		try {
//			abrirConexion();
//			PreparedStatement stmt1 = con.prepareStatement(consultaString);
//			
//			stmt1.setString(1, matricula);
//			
//			ResultSet resultado = stmt1.executeQuery();
//			
//			while (resultado.next()) {
//				//hacer un objeto de tipo usuario y que devuelv un usuario.
//				return true;
//			}
//			
//			cerrarConexion();
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//		return false;
//	}
	
	
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch(SQLException e){
			System.out.println("Error al cerrar conexión");
			e.printStackTrace();
		}
	}

	
}
