package com.jamonasiatico.control;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;
import com.jamonasiatico.vistas.DatosPersonalesMonitor;
import com.jamonasiatico.vistas.DatosPersonalesUsuario;
import com.jamonasiatico.vistas.VistaInicioSesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;



public class ListenerLogin implements ActionListener {
	private VistaInicioSesion login;
	private DatosPersonalesUsuario dtsPerUsr;
	private DatosPersonalesMonitor dtsPerMon;
	private BBDD bbdd;
	
	// Crear una variable estática, existe una sola en todo el programa Java
	// se puede acceder desde cualquier parte
	public static Usuario usuario = null;

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
				int resultado = JOptionPane.showConfirmDialog(login, "¿Quieres quedarte como monitor?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (resultado==JOptionPane.YES_OPTION) {
					dtsPerMon = new DatosPersonalesMonitor();
					dtsPerMon.setVisible(true);
					
				}else {
					dtsPerUsr = new DatosPersonalesUsuario();
					dtsPerUsr.setVisible(true);
				}


			} else{
				dtsPerUsr = new DatosPersonalesUsuario();
				dtsPerUsr.setVisible(true);
			}
		
		} else {
			login.getLblMensaje().setText("Datos inválidos");
		}	
	}
}
