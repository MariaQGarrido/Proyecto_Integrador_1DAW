package com.jamonasiatico.vistas;

import com.jamonasiatico.control.ListenerInscribirActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadUSR;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class InformacionActividadUsuarioInscribir extends JFrame{
	
	private JButton btnInscribirActividad;
	private JMenu menuDatosPersonales;
	private JMenu menuActividad;
	
	public InformacionActividadUsuarioInscribir () {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBarActividad = new JMenuBar();
		menuBarActividad.setBorderPainted(false);
		menuBarActividad.setBackground(new Color(255, 255, 128));
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 99, 360);
		getContentPane().add(menuBarActividad);
		
		menuActividad = new JMenu("Actividades");
		menuBarActividad.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadUSR());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesUsuarioListener());
		
		JLabel nombreUsuario = new JLabel(ListenerLogin.usuario.getMatricula());
		nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		nombreUsuario.setBounds(571, 11, 100, 30);
		getContentPane().add(nombreUsuario);
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad:");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 42, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		btnInscribirActividad = new JButton("Inscribir Actividad");
		btnInscribirActividad.addActionListener(new ListenerInscribirActividad(this));
		btnInscribirActividad.setBackground(new Color(255, 255, 255));
		btnInscribirActividad.setAutoscrolls(true);
		btnInscribirActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInscribirActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnInscribirActividad);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 294, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblMonitor = new JLabel("Monitor: ");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 288, 30);
		getContentPane().add(lblMonitor);
		
		JLabel lblDescripcion = new JLabel("Descripción: ");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 294, 40);
		getContentPane().add(lblDescripcion);
		
		JLabel lblIdentificador = new JLabel("Identificador: ");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(436, 93, 235, 38);
		getContentPane().add(lblIdentificador);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 142, 235, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 183, 235, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 227, 235, 30);
		getContentPane().add(lblSala);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: ");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(436, 268, 235, 30);
		getContentPane().add(lblNMximo);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters
	
	/**
	 * @return the btnInscribirActividad
	 */
	public JButton getBtnInscribirActividad() {
		return btnInscribirActividad;
	}

	/**
	 * @param btnInscribirActividad the btnInscribirActividad to set
	 */
	public void setBtnInscribirActividad(JButton btnInscribirActividad) {
		this.btnInscribirActividad = btnInscribirActividad;
	}

	/**
	 * @return the menuDatosPersonales
	 */
	public JMenu getMenuDatosPersonales() {
		return menuDatosPersonales;
	}

	/**
	 * @param menuDatosPersonales the menuDatosPersonales to set
	 */
	public void setMenuDatosPersonales(JMenu menuDatosPersonales) {
		this.menuDatosPersonales = menuDatosPersonales;
	}

	/**
	 * @return the menuActividad
	 */
	public JMenu getMenuActividad() {
		return menuActividad;
	}

	/**
	 * @param menuActividad the menuActividad to set
	 */
	public void setMenuActividad(JMenu menuActividad) {
		this.menuActividad = menuActividad;
	}

}
