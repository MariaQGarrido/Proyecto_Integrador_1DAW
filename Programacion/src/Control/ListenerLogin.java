package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Actividad;
import modelo.BBDD;
import modelo.Usuario;
import vistas.DatosPersonalesMonitor;
import vistas.DatosPersonalesUsuario;
import vistas.VistaInicioSesion;

public class ListenerLogin implements ActionListener {
	private VistaInicioSesion login;
	private DatosPersonalesUsuario dtsPerUsr;
	private DatosPersonalesMonitor dtsPerMon;
	private BBDD bbdd;
	
	// Crear una variable estática, existe una sola en todo el programa Java
	// se puede acceder desde cualquier parte
	public static Usuario usuario = null;
	private static ArrayList<Actividad> actividades= new ArrayList<Actividad>();

	public ListenerLogin(VistaInicioSesion login) {
		this.login = login;
		this.bbdd = new BBDD();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ListenerLogin.usuario = bbdd.obtenerUsuario(login.getNombretxt().getText(), login.getTxtpassword().getText());
				
		if (usuario != null ) {
			login.dispose();
			if(usuario.getCiclo().equals("TAFD")) {
				dtsPerMon = new DatosPersonalesMonitor();
				dtsPerMon.setVisible(true);
			} else{
				dtsPerUsr = new DatosPersonalesUsuario();
				dtsPerUsr.setVisible(true);
			}
		
		} else {
			login.getLblMensaje().setText("Datos inválidos");
		}	
	}
}
