package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerInscribirActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadUSR;

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
		menuBarActividad.setBackground(new Color(255, 255, 255));
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 110, 360);
		getContentPane().add(menuBarActividad);
		
		menuActividad = new JMenu("Actividades");
		menuBarActividad.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadUSR(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesUsuarioListener());

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad:");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 22, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		btnInscribirActividad = new JButton("Inscribir Actividad");
		btnInscribirActividad.addActionListener(new ListenerInscribirActividad(this));
		btnInscribirActividad.setBackground(new Color(255, 255, 255));
		btnInscribirActividad.setAutoscrolls(true);
		btnInscribirActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInscribirActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnInscribirActividad);
		
		JLabel lblNombre = new JLabel("Nombre: "+ ListenerCrearActividad.actividad.getNombreActividad());
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 288, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblMonitor = new JLabel("Monitor: "+ ListenerCrearActividad.actividad.getIdMonitor());
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 288, 30);
		getContentPane().add(lblMonitor);

		JLabel lblDescripcion = new JLabel(
				"<html>" +
						"<body style='width 200px;'> Descripción: " +

						ListenerCrearActividad.actividad.getDescripcionActividad()+
						"</body>" +
						"</html>"
		);
		lblDescripcion.setVerticalAlignment(SwingConstants.NORTH);
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 294, 60);
		getContentPane().add(lblDescripcion);
		
		JLabel lblUsuariosInscritos = new JLabel("Usuarios inscritos: "+ ListenerCrearActividad.actividad.getUsuariosInscritos());
		lblUsuariosInscritos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblUsuariosInscritos.setBounds(436, 96, 235, 38);
		getContentPane().add(lblUsuariosInscritos);
		
		JLabel lblFecha = new JLabel("Fecha: "+ ListenerCrearActividad.actividad.getFechaActividad());
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 168, 235, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: "+ ListenerCrearActividad.actividad.getHoraActividad());
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 235, 235, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: "+ ListenerCrearActividad.actividad.getSala().getTipoSala());
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 287, 235, 30);
		getContentPane().add(lblSala);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: "+ ListenerCrearActividad.actividad.getUsuariosMaximos());
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(132, 287, 235, 30);
		getContentPane().add(lblNMximo);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
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
