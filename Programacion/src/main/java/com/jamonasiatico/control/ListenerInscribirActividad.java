package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.ActividadesUsuario;
import com.jamonasiatico.vistas.InformacionActividadUsuarioInscribir;

import static javax.swing.JOptionPane.showMessageDialog;


public class ListenerInscribirActividad implements ActionListener {
	private InformacionActividadUsuarioInscribir vista;
	private BBDD bbdd;
	
	public ListenerInscribirActividad(InformacionActividadUsuarioInscribir informacionActividadUsuarioInscribir) {
		// TODO Auto-generated constructor stub
		this.vista = informacionActividadUsuarioInscribir;
		this.bbdd = new BBDD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Si un usuario ya esta inscrito en una actividad le mandamos un mensaje informandole que ya está inscrito
		if(bbdd.YaInscrito(ListenerLogin.usuario.getIdUsuario(), ListenerCrearActividad.actividad.getIdActividad()) == true) {
			showMessageDialog(vista, "Ya estas inscrito", "error", JOptionPane.ERROR_MESSAGE);
		}else {
			// Si no lo está le inscribimos en la actividad
			bbdd.InscribirEnActividad(ListenerLogin.usuario.getIdUsuario(), ListenerCrearActividad.actividad.getIdActividad());
			ActividadesUsuario vista2 = new ActividadesUsuario();
			vista2.HacerVisible();
			vista.dispose();
		}
		
	}

}
