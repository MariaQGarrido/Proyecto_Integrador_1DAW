package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.ActividadesUsuario;
import com.jamonasiatico.vistas.InformacionActividadUsuarioBaja;



public class ListenerDejarActividad implements ActionListener {
	private InformacionActividadUsuarioBaja vista;
	private BBDD bbdd;
	
	public ListenerDejarActividad(InformacionActividadUsuarioBaja informacionActividadUsuarioBaja) {
		// TODO Auto-generated constructor stub
		vista = informacionActividadUsuarioBaja;
		bbdd = new BBDD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Enviamos un dialog para confirmar si el usuario se quiere desapuntar o no de la actividad
		int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Estas seguro de darte de baja?","Baja Actividad",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		// Si lo confirma de desinscribimos
		if(confirmacion==JOptionPane.YES_OPTION){
			bbdd.DarDeBajaActividad(ListenerCrearActividad.actividad.getIdActividad(), ListenerLogin.usuario.getIdUsuario());
			ActividadesUsuario vista2 = new ActividadesUsuario();
			vista2.HacerVisible();
			vista.dispose();
		}
	}

}
