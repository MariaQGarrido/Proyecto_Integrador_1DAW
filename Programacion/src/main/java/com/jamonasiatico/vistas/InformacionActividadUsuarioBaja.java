package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerDejarActividad;
import com.jamonasiatico.control.ListenerLogin;
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
		menuBar.setBounds(0, 0, 110, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadUSR());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesUsuarioListener());
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad: ");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 22, 400, 52);
		getContentPane().add(lblInformacionAct);

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);
		
		JLabel lblNombre = new JLabel("Nombre: "+ListenerCrearActividad.actividad.getNombreActividad());;
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 294, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblMonitor = new JLabel("Monitor: "+ListenerCrearActividad.actividad.getIdMonitor());
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 294, 30);
		getContentPane().add(lblMonitor);

		// Descripción de la actividad
		JLabel lblDescripcion = new JLabel(
				"<html>" +
						"<body style='width 200px; '> Descripción: " +

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

		JLabel lblFecha = new JLabel("Fecha: "+ListenerCrearActividad.actividad.getFechaActividad());
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 168, 235, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: "+ListenerCrearActividad.actividad.getHoraActividad());
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 235, 235, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: "+ListenerCrearActividad.actividad.getIdSala());
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 287, 235, 30);
		getContentPane().add(lblSala);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: "+ListenerCrearActividad.actividad.getUsuariosMaximos());
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(132, 287, 235, 30);
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
