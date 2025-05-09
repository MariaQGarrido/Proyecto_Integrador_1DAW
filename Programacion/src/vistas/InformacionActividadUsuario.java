package vistas;

import javax.swing.*;

import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import java.awt.*;

public class InformacionActividadUsuario extends JFrame{
	
	private JTextField txtIdentificador;
	private JTextField txtParticipantes;
	private JTextField txtIFecha;
	private JTextField txtDescrip;
	private JTextField txtNMax;
	private JTextField textField;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;

	
	public InformacionActividadUsuario() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
						
		JLabel lblTitulo = new JLabel("UserName");
		lblTitulo.setBounds(571, 11, 100, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(142, 146, 119, 30);
		getContentPane().add(lblNombre);
		
		JLabel lblInfoAct = new JLabel("Información de la Actividad");
		lblInfoAct.setForeground(Color.BLACK);
		lblInfoAct.setFont(new Font("Dialog", Font.BOLD, 23));
		lblInfoAct.setBounds(142, 83, 586, 37);
		getContentPane().add(lblInfoAct);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Dialog", Font.BOLD, 13));
		lblIdentificador.setBounds(431, 187, 100, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblParticipantes = new JLabel("Monitor:");
		lblParticipantes.setFont(new Font("Dialog", Font.BOLD, 13));
		lblParticipantes.setBounds(431, 146, 100, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha Hora Sala:");
		lblFechaHoraSala.setFont(new Font("Dialog", Font.BOLD, 13));
		lblFechaHoraSala.setBounds(152, 187, 135, 30);
		getContentPane().add(lblFechaHoraSala);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDescripcin.setBounds(142, 228, 100, 30);
		getContentPane().add(lblDescripcin);
		
		textField = new JTextField();
		textField.setBounds(142, 269, 165, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNMximo.setBounds(431, 228, 100, 30);
		getContentPane().add(lblNMximo);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 85, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new menuActividadUSR(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesUSR(this));
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters
	
	/**
	 * @return the txtIdentificador
	 */
	public JTextField getTxtIdentificador() {
		return txtIdentificador;
	}

	/**
	 * @param txtIdentificador the txtIdentificador to set
	 */
	public void setTxtIdentificador(JTextField txtIdentificador) {
		this.txtIdentificador = txtIdentificador;
	}

	/**
	 * @return the txtParticipantes
	 */
	public JTextField getTxtParticipantes() {
		return txtParticipantes;
	}

	/**
	 * @param txtParticipantes the txtParticipantes to set
	 */
	public void setTxtParticipantes(JTextField txtParticipantes) {
		this.txtParticipantes = txtParticipantes;
	}

	/**
	 * @return the txtIFecha
	 */
	public JTextField getTxtIFecha() {
		return txtIFecha;
	}

	/**
	 * @param txtIFecha the txtIFecha to set
	 */
	public void setTxtIFecha(JTextField txtIFecha) {
		this.txtIFecha = txtIFecha;
	}

	/**
	 * @return the txtDescrip
	 */
	public JTextField getTxtDescrip() {
		return txtDescrip;
	}

	/**
	 * @param txtDescrip the txtDescrip to set
	 */
	public void setTxtDescrip(JTextField txtDescrip) {
		this.txtDescrip = txtDescrip;
	}

	/**
	 * @return the txtNMax
	 */
	public JTextField getTxtNMax() {
		return txtNMax;
	}

	/**
	 * @param txtNMax the txtNMax to set
	 */
	public void setTxtNMax(JTextField txtNMax) {
		this.txtNMax = txtNMax;
	}

	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
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
