package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyecto_integador";

	private String usuario = "root";
	private String passwd = "1234567";
	
	public Connection getConexion() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, passwd);
			System.out.println("Conexión establecida");
		} catch (Exception e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return con;
	}
}
