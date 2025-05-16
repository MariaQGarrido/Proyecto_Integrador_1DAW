package com.jamonasiatico.control;

import com.jamonasiatico.vistas.CrearActividad;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;



public class ListenerNuevaActividad implements ActionListener {
	CrearActividad NuevAct;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NuevAct = new CrearActividad();
		NuevAct.HacerVisible();
	}

}
