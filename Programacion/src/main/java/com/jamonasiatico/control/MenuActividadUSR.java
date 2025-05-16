package com.jamonasiatico.control;

import com.jamonasiatico.vistas.ActividadesUsuario;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MenuActividadUSR implements MouseListener {

	@Override
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
