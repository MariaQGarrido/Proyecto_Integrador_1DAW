package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	

	public ListenerLogin(VistaInicioSesion login) {
		this.login = login;
		this.bbdd = new BBDD();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Usuario usuario = bbdd.obtenerUsuario(login.getNombretxt().getText(), login.getTxtpassword().getText());
				
		if (usuario != null ) {
			login.dispose();
			if(usuario.getCiclo().equals("TAFD")) {
				dtsPerMon = new DatosPersonalesMonitor(usuario);
				dtsPerMon.setVisible(true);
			} else{
				dtsPerUsr = new DatosPersonalesUsuario(usuario);
				dtsPerUsr.setVisible(true);
			}
		
		} else {
			login.getLblMensaje().setText("Datos inválidos");
		}	
	}
}
