package com.jamonasiatico.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.CrearActividad;

import javax.swing.*;


public class MenuActividadMon implements MouseListener {
	private JFrame vista;

    public MenuActividadMon(JFrame vista) {
		this.vista = vista;
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		ActividadMonitor actividadMonitor  = new ActividadMonitor();

		vista.dispose();
	}
    /**
	 * Listener para el menu de Actividad Monitor
	 * @param e the event to be processed
	 */
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
