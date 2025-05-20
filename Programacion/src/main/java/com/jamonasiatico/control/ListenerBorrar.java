package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.ActividadMonitor;

public class ListenerBorrar implements ActionListener {
	private BBDD bbdd = new BBDD();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		bbdd.eliminarActividad();
		
		new ActividadMonitor();
	}

}
