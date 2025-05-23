package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;
import com.jamonasiatico.vistas.DatosPersonalesMonitor;
import com.jamonasiatico.vistas.DatosPersonalesUsuario;
import com.jamonasiatico.vistas.VistaInicioSesion;



public class ListenerLogin implements ActionListener {
	private VistaInicioSesion login;
	private DatosPersonalesUsuario dtsPerUsr;
	private DatosPersonalesMonitor dtsPerMon;
	private BBDD bbdd;
	
	// Crear una variable estática a la cual se le puede llamar desde cualquier clase
	public static Usuario usuario = null;

	/**
	 * Constructor de la clase ListenerLogin
	 * @param login
	 */
	public ListenerLogin(VistaInicioSesion login) {
		this.login = login;
		this.bbdd = new BBDD();
	}
	
	@Override
	/**
	 * Método que se ejecuta al hacer clic en el botón de inicio de sesión
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {

		//Se cre un varible de tipo usuario en el que se guardará un usuario con su contraseña si existe dicho usuario en la base de datos
		ListenerLogin.usuario = bbdd.obtenerUsuario(login.getNombretxt().getText(), login.getTxtpassword().getText());

		//Si el usuario no es nulo, significa que existe en la base de datos
		if (usuario != null ) {

			//por tanto, se cierra la ventana de inicio de sesión
			login.dispose();

			// si el ciclo del usuario es TAFD, entonces salt una ventana la cual preguntrá si quieres quedarte como usuario o como monitor
			if(usuario.getCiclo().equals("TAFD")) {
				int resultado = JOptionPane.showConfirmDialog(login, "¿Quieres quedarte como monitor?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				//si resulta que es monitor, entonces le llevará a la vista DatosPersonalesMonitor
				if (resultado==JOptionPane.YES_OPTION) {
					dtsPerMon = new DatosPersonalesMonitor();
					dtsPerMon.setVisible(true);

				//Si no, se accederá como usuario
				}else {
					dtsPerUsr = new DatosPersonalesUsuario();
					dtsPerUsr.setVisible(true);
				}

			//si el ciclo no es TAFD, entonces se accederá como usuario
			} else{
				dtsPerUsr = new DatosPersonalesUsuario();
				dtsPerUsr.setVisible(true);
			}
		//entonces si el usuario es nulo, significa que no existe en la base de datos
		} else {
			login.getLblMensaje().setText("Datos inválidos");
		}	
	}
}
