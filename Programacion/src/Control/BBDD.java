package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/Base_Integrador";

	private String usuario = "root";
	private String passwd = "Tote2005@";
	
	private Connection con;
	
	public Connection abrirConexion() {
		con = null;

		try {
			con = DriverManager.getConnection(url, usuario, passwd);
			System.out.println("Conexión establecida");
		} catch (Exception e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return con;
	}
	
	public boolean usuarioAutenticado(String matricula, String password) {
		String consultaString = "SELECT * FROM usuarios WHERE matricula=? AND password=?";
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(consultaString);
			
			stmt1.setString(1, matricula);
			stmt1.setString(2, password);
			
			ResultSet resultado = stmt1.executeQuery();
			
			while (resultado.next()) {
				return true;
			}
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public boolean EsMonitor(String matricula) {
		// TODO Auto-generated method stub
		
		String consultaString = "SELECT * FROM usuarios WHERE matricula=? AND ciclo='TAFD'";
		
		try {
			abrirConexion();
			PreparedStatement stmt1 = con.prepareStatement(consultaString);
			
			stmt1.setString(1, matricula);
			
			ResultSet resultado = stmt1.executeQuery();
			
			while (resultado.next()) {
				return true;
			}
			
			cerrarConexion();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
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
