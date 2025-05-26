package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.CrearActividad;



public class ListenerNuevaActividad implements ActionListener {
	private ActividadMonitor vista;

	public ListenerNuevaActividad(ActividadMonitor vista) {
		this.vista=vista;
	}

	@Override
	/**
	 * Listener para el boton de Nueva Actividad
	 */
	public void actionPerformed(ActionEvent e) {
		CrearActividad NuevAct = new CrearActividad();
		NuevAct.HacerVisible();
		vista.dispose();
	}

}
