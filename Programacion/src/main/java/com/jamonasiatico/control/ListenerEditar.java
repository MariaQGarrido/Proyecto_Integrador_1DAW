package com.jamonasiatico.control;

import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.EditarActividad;
import com.jamonasiatico.vistas.InformacionActividadMonitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ListenerEditar implements ActionListener {
	ActividadMonitor ActMon;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EditarActividad EditarAct = new EditarActividad();
		
		EditarAct.HacerVisible();
	}

}
