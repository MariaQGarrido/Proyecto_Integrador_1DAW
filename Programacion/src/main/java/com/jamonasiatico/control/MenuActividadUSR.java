package com.jamonasiatico.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jamonasiatico.vistas.ActividadesUsuario;



public class MenuActividadUSR implements MouseListener {

	@Override
	/**
	 * Listener para el menu de Actividad Usuario
	 * @param e the event to be processed
	 */
	public void mouseClicked(MouseEvent e) {
		ActividadesUsuario actividadUsr = new ActividadesUsuario();
		actividadUsr.HacerVisible();
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
