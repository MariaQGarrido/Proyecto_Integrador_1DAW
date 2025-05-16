package com.jamonasiatico.control;

import com.jamonasiatico.vistas.DatosPersonalesMonitor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MenuDatosPersonalesMonitorListener implements MouseListener {

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

	@Override
	public void mouseClicked(MouseEvent e) {
		DatosPersonalesMonitor vista = new DatosPersonalesMonitor();
		vista.setVisible(true);
		
	}

}
