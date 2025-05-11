package vistas;

import javax.swing.*;

import Control.ListenerDejarActividad;
import Control.ListenerInscribirActividad;
import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacionActividadUsuarioBaja extends JFrame{
	
	private JTextField txtIdentificador;
	private JTextField txtParticipantes;
	private JTextField txtIFecha;
	private JTextField txtDescrip;
	private JTextField txtNMax;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JLabel lblInformacionAct;
	private JLabel nombreUsuario;
	private JLabel lblNombre;
	private JTextField txtNombreUSRB;
	private JLabel lblMonitor;
	private JTextField txtMonitorUSRB;
	private JLabel lblDescripcion;
	private JTextField txtDescripcionUSRB;
	private JLabel lblIdentificador;
	private JTextField txtIdentificadorUSRB;
	private JLabel lblFecha;
	private JTextField txtFechaUSRB;
	private JLabel lblHora;
	private JTextField txtHoraUSRB;
	private JLabel lblSala;
	private JTextField txtSalaUSRB;
	private JLabel lblNMximo;
	private JTextField txtNumMaxUSRB;
	private JButton btnDejarActividad;

	
	public InformacionActividadUsuarioBaja() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
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
		
		lblInformacionAct = new JLabel("Información de la Actividad:");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 42, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		nombreUsuario = new JLabel("UserName");
		nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		nombreUsuario.setBounds(571, 11, 100, 30);
		getContentPane().add(nombreUsuario);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 81, 44);
		getContentPane().add(lblNombre);
		
		txtNombreUSRB = new JTextField();
		txtNombreUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNombreUSRB.setColumns(10);
		txtNombreUSRB.setBounds(218, 105, 186, 25);
		getContentPane().add(txtNombreUSRB);
		
		lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 81, 30);
		getContentPane().add(lblMonitor);
		
		txtMonitorUSRB = new JTextField();
		txtMonitorUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMonitorUSRB.setColumns(10);
		txtMonitorUSRB.setBounds(212, 154, 192, 25);
		getContentPane().add(txtMonitorUSRB);
		
		lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 218, 40);
		getContentPane().add(lblDescripcion);
		
		txtDescripcionUSRB = new JTextField();
		txtDescripcionUSRB.setText("Descripción de la actividad");
		txtDescripcionUSRB.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		txtDescripcionUSRB.setColumns(10);
		txtDescripcionUSRB.setBackground(Color.WHITE);
		txtDescripcionUSRB.setBounds(142, 239, 180, 95);
		getContentPane().add(txtDescripcionUSRB);
		
		lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(436, 93, 127, 38);
		getContentPane().add(lblIdentificador);
		
		txtIdentificadorUSRB = new JTextField();
		txtIdentificadorUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtIdentificadorUSRB.setColumns(10);
		txtIdentificadorUSRB.setBounds(559, 102, 93, 25);
		getContentPane().add(txtIdentificadorUSRB);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 142, 69, 30);
		getContentPane().add(lblFecha);
		
		txtFechaUSRB = new JTextField();
		txtFechaUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtFechaUSRB.setColumns(10);
		txtFechaUSRB.setBounds(497, 147, 155, 25);
		getContentPane().add(txtFechaUSRB);
		
		lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 183, 53, 30);
		getContentPane().add(lblHora);
		
		txtHoraUSRB = new JTextField();
		txtHoraUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtHoraUSRB.setColumns(10);
		txtHoraUSRB.setBounds(491, 187, 161, 25);
		getContentPane().add(txtHoraUSRB);
		
		lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 227, 45, 30);
		getContentPane().add(lblSala);
		
		txtSalaUSRB = new JTextField();
		txtSalaUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSalaUSRB.setColumns(10);
		txtSalaUSRB.setBounds(481, 232, 171, 25);
		getContentPane().add(txtSalaUSRB);
		
		lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(436, 268, 112, 30);
		getContentPane().add(lblNMximo);
		
		txtNumMaxUSRB = new JTextField();
		txtNumMaxUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNumMaxUSRB.setColumns(10);
		txtNumMaxUSRB.setBounds(547, 273, 105, 25);
		getContentPane().add(txtNumMaxUSRB);
		
		btnDejarActividad = new JButton("Dejar Actividad");
		btnDejarActividad.addActionListener(new ListenerDejarActividad(this));
		btnDejarActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDejarActividad.setBackground(Color.WHITE);
		btnDejarActividad.setAutoscrolls(true);
		btnDejarActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnDejarActividad);

		
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
