package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
	private int idUsuario;
	private String nombre;
	private String apellidos;
	private String matricula;
	private String ciclo;
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyecto_integrador";
	private Connection conec;
	private String usuario = "root";
	private String password = "1234567";
	
	public Usuario(int idUsuario, String nombre, String apellidos, String matricula, String ciclo) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.matricula = matricula;
		this.ciclo = ciclo;
	}

	public void infoUsuario(Usuario usr){
		
	}
	
	public boolean iniciarSesion(String nombre, String Contrasena) {
		try {
			// Miro a ver si en la base de datos estan los datos que me introducen haciendo una query
			String query = "select * from usuarios where usuario =? and password =?";
			ResultSet resultado;
			conec = DriverManager.getConnection(url, usuario, password);
			
			// Recojo los datos y hago la query
			PreparedStatement Statement = conec.prepareStatement(query);
			Statement.setString(2, nombre);
			Statement.setString(5, Contrasena);
			resultado = Statement.executeQuery();
			
			// Si hay datos te permite el acceso
			while(resultado.next()) {
				return true;
			}
			
			resultado.close();
			Statement.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean EsMonitor(String ciclo) {
		// TODO Auto-generated method stub
		if(ciclo.equals("TAFD")){
			return true;
		}else {
			return false;
		}
	}
	

	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the ciclo
	 */
	public String getCiclo() {
		return ciclo;
	}

	/**
	 * @param ciclo the ciclo to set
	 */
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	
}
