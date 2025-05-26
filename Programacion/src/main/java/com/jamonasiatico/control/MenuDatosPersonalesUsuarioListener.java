package com.jamonasiatico.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jamonasiatico.vistas.ActividadesUsuario;
import com.jamonasiatico.vistas.DatosPersonalesUsuario;

import javax.swing.*;


public class MenuDatosPersonalesUsuarioListener implements MouseListener {
	private JFrame vista;
	/**
	 * Constructor de la clase MenuDatosPersonalesUsuarioListener
	 */
	public MenuDatosPersonalesUsuarioListener(JFrame vista) {
		this.vista=vista;
	}

	/**
	 * Listener para el menu de Datos Personales Usuario
	 * @param e the event to be processed
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		DatosPersonalesUsuario datosPersonalesUsuario = new DatosPersonalesUsuario();
		datosPersonalesUsuario.hacerVisible();
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
