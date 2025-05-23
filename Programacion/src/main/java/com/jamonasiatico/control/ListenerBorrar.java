package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.ActividadMonitor;

public class ListenerBorrar implements ActionListener {
	private BBDD bbdd = new BBDD();
	
	@Override
	/**
	 * Listener para el boton de borrar actividad
	 */
	public void actionPerformed(ActionEvent e) {
		// Eliminamos primero todos los usuarios que están inscritos en una actividad
		bbdd.eliminarInscritosPorIdActividad();
		// para posteriormente poder eliminar la actividad
		bbdd.eliminarActividad();
		new ActividadMonitor();
	}

}
