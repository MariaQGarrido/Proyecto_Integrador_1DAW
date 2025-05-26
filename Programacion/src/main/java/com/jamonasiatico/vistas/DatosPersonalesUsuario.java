/**
 * 
 */
package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadUSR;



public class DatosPersonalesUsuario extends JFrame{
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;

	
	public DatosPersonalesUsuario() {
		getContentPane().setBackground(new Color(253, 251, 159));
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);
				
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador: "+ ListenerLogin.usuario.getIdUsuario());
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(143, 168, 528, 30);
		getContentPane().add(lblIdentificador);
	
		
		JLabel lblMatrcula = new JLabel("Matrícula: "+ ListenerLogin.usuario.getMatricula());
		lblMatrcula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatrcula.setBounds(143, 223, 528, 30);
		getContentPane().add(lblMatrcula);
		
		
		JLabel lblCiclo = new JLabel("Ciclo: "+ ListenerLogin.usuario.getCiclo());
		lblCiclo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCiclo.setBounds(143, 286, 528, 30);
		getContentPane().add(lblCiclo);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos: "+ ListenerLogin.usuario.getNombre()+" "+ListenerLogin.usuario.getApellidos());
		lblNombreYApellidos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombreYApellidos.setBounds(143, 115, 528, 30);
		getContentPane().add(lblNombreYApellidos);
		
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 110, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadUSR(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		
		
		JLabel lblDatosPersonales = new JLabel("Datos Personales: ");
		lblDatosPersonales.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblDatosPersonales.setBounds(122, 42, 251, 51);
		getContentPane().add(lblDatosPersonales);
		
	}
	
	public void hacerVisible(){
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
}
