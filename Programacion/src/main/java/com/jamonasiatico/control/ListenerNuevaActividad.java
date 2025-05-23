package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.vistas.CrearActividad;



public class ListenerNuevaActividad implements ActionListener {
	CrearActividad NuevAct;
	
	@Override
	/**
	 * Listener para el boton de Nueva Actividad
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NuevAct = new CrearActividad();
		NuevAct.HacerVisible();
	}

}
