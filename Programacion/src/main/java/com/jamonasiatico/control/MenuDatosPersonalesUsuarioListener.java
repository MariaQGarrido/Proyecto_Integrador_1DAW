package com.jamonasiatico.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jamonasiatico.vistas.ActividadesUsuario;
import com.jamonasiatico.vistas.DatosPersonalesUsuario;



public class MenuDatosPersonalesUsuarioListener implements MouseListener {
	private ActividadesUsuario actividadesUsuario;

	/**
	 * @param actividadesUsuario
	 */
	public MenuDatosPersonalesUsuarioListener(ActividadesUsuario actividadesUsuario) {
		this.actividadesUsuario = actividadesUsuario;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		DatosPersonalesUsuario datosPersonalesUsuario = new DatosPersonalesUsuario();
		datosPersonalesUsuario.hacerVisible();
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
