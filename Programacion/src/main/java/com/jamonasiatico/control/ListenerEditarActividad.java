package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.EditarActividad;



public class ListenerEditarActividad implements ActionListener {
	ActividadMonitor ActMon;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EditarActividad EditarAct = new EditarActividad();
		
		EditarAct.HacerVisible();
	}

}
