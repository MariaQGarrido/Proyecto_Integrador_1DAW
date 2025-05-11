package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/Base_Integrador (2)";

	private String usuario = "root";
	private String passwd = "1234567";
	
	private Connection con;
	
	public Connection getConexion() {
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
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch(SQLException e){
			System.out.println("Error al cerrar conexión");
			e.printStackTrace();
		}
	}
}
