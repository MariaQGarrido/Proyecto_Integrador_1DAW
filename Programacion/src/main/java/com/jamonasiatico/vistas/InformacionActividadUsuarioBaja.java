package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

import com.jamonasiatico.control.ListenerDejarActividad;
import com.jamonasiatico.control.MenuActividadUSR;

public class InformacionActividadUsuarioBaja extends JFrame{
	
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JButton btnDejarActividad;

	
	public InformacionActividadUsuarioBaja() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 85, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadUSR());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesUsuarioListener());
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad: ");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 42, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		JLabel nombreUsuario = new JLabel("UserName");
		nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		nombreUsuario.setBounds(571, 11, 100, 30);
		getContentPane().add(nombreUsuario);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 294, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblMonitor = new JLabel("Monitor: ");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 294, 30);
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
		
		btnDejarActividad = new JButton("Dejar Actividad");
		btnDejarActividad.addActionListener(new ListenerDejarActividad(this));
		btnDejarActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDejarActividad.setBackground(Color.WHITE);
		btnDejarActividad.setAutoscrolls(true);
		btnDejarActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnDejarActividad);

		
		setSize(695, 397);
		setLocationRelativeTo(null);
		setVisible(true);
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
	 * @return the btnDejarActividad
	 */
	public JButton getBtnDejarActividad() {
		return btnDejarActividad;
	}

	/**
	 * @param btnDejarActividad the btnDejarActividad to set
	 */
	public void setBtnDejarActividad(JButton btnDejarActividad) {
		this.btnDejarActividad = btnDejarActividad;
	}

	
}
