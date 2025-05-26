package com.jamonasiatico.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jamonasiatico.vistas.CrearActividad;
import com.jamonasiatico.vistas.DatosPersonalesMonitor;

import javax.swing.*;


public class MenuDatosPersonalesMonitorListener implements MouseListener {
	private JFrame vista;


	public MenuDatosPersonalesMonitorListener(JFrame vista) {
		this.vista= vista;
	}

	/**
	 * Listener para el menu de Datos Personales Monitor
	 * @param e the event to be processed
	 */
	@Override
	public void mouseClicked(MouseEvent e) {

		DatosPersonalesMonitor vistaDM = new DatosPersonalesMonitor();
		vistaDM.setVisible(true);
		vista.dispose();

	}

	@Override

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
