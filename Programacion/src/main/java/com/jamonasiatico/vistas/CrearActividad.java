package com.jamonasiatico.vistas;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadMon;
import com.jamonasiatico.control.MenuDatosPersonalesMonitorListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;



public class CrearActividad extends JFrame {
	private JTextField txtNombre;
	private JTextField txtTipoSala;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JSpinner alumnosMaximos;
	private JTextArea textAreaDescripcion;
	private JSpinner capacidadSala;
	private JLabel lblMensaje;
	
	public CrearActividad() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(247, 202, 136));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);

		// Titulo
		JLabel lblTitulo = new JLabel("Crear Actividad");
		lblTitulo.setBounds(111, 10, 349, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);
		
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 101, 358);
		getContentPane().add(menuBar);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadMon());
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		mnDatosPersonales.addMouseListener(new MenuDatosPersonalesMonitorListener());

		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(149, 113, 124, 29);
		getContentPane().add(lblDescripcion);
		
		// Descripción de la actividad
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(135, 153, 235, 123);
		getContentPane().add(scrollPaneDescripcion);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(255, 255, 255));
		scrollPaneDescripcion.setViewportView(textAreaDescripcion);
		
		//nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(149, 78, 124, 29);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(216, 82, 124, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblTipoSala = new JLabel("Tipo Sala:");
		lblTipoSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoSala.setBounds(407, 139, 101, 29);
		getContentPane().add(lblTipoSala);
		
		txtTipoSala = new JTextField();
		txtTipoSala.setColumns(10);
		txtTipoSala.setBounds(502, 145, 121, 20);
		getContentPane().add(txtTipoSala);
		
		// Label y spinner para el numero máximos de alumnos que hay en una actividad
		SpinnerNumberModel modeloSpinnerAlumnosMaximos = new SpinnerNumberModel(1, 1, 50, 1);
		alumnosMaximos = new JSpinner(modeloSpinnerAlumnosMaximos);
		alumnosMaximos.setBounds(264, 304, 101, 20);
		
		getContentPane().add(alumnosMaximos);
		
		JLabel lblAlumnosMaximos = new JLabel("Alumnos Máximos:");
		lblAlumnosMaximos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlumnosMaximos.setBounds(149, 300, 124, 29);
		getContentPane().add(lblAlumnosMaximos);
		
		// label y txt para añadir la fecha
		JLabel lblFecha = new JLabel("Fecha Actividad:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFecha.setBounds(407, 191, 124, 29);
		getContentPane().add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(522, 197, 101, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		// label y txt para añadir la hora
		JLabel lblHora = new JLabel("Hora Actividad:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHora.setBounds(405, 248, 124, 29);
		getContentPane().add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(520, 252, 101, 20);
		getContentPane().add(txtHora);
		
		//Boton para crear la actividad
		JButton btnNewButton = new JButton("Crear Actividad");
		btnNewButton.addActionListener(new ListenerCrearActividad(this));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(551, 318, 118, 30);
		getContentPane().add(btnNewButton);
		
		JLabel lblNomUsuario = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomUsuario.setBounds(597, 11, 74, 29);
		getContentPane().add(lblNomUsuario);
		
		JLabel lblCapcidadSala = new JLabel("Capacidad de la sala: ");
		lblCapcidadSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCapcidadSala.setBounds(405, 78, 143, 29);
		getContentPane().add(lblCapcidadSala);
		
		SpinnerNumberModel modeloSpinnerCapacidadSala = new SpinnerNumberModel(1, 1, 100, 1);
		capacidadSala = new JSpinner(modeloSpinnerCapacidadSala);
		capacidadSala.setBounds(530, 82, 91, 20);
		getContentPane().add(capacidadSala);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(255, 0, 0));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensaje.setBounds(375, 318, 159, 25);
		getContentPane().add(lblMensaje);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	/**
	 * @return the capacidadSala
	 */
	public JSpinner getCapacidadSala() {
		return capacidadSala;
	}

	/**
	 * @param capacidadSala the capacidadSala to set
	 */
	public void setCapacidadSala(JSpinner capacidadSala) {
		this.capacidadSala = capacidadSala;
	}

	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters
	
	/**
	 * @return the txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * @param txtNombre the txtNombre to set
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * @return the txtTipoSala
	 */
	public JTextField getTxtTipoSala() {
		return txtTipoSala;
	}

	/**
	 * @param txtTipoSala the txtTipoSala to set
	 */
	public void setTxtTipoSala(JTextField txtTipoSala) {
		this.txtTipoSala = txtTipoSala;
	}

	/**
	 * @return the txtFecha
	 */
	public JTextField getTxtFecha() {
		return txtFecha;
	}

	/**
	 * @param txtFecha the txtFecha to set
	 */
	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	/**
	 * @return the txtHora
	 */
	public JTextField getTxtHora() {
		return txtHora;
	}

	/**
	 * @param txtHora the txtHora to set
	 */
	public void setTxtHora(JTextField txtHora) {
		this.txtHora = txtHora;
	}

	/**
	 * @return the alumnosMaximos
	 */
	public JSpinner getAlumnosMaximos() {
		return alumnosMaximos;
	}

	/**
	 * @param alumnosMaximos the alumnosMaximos to set
	 */
	public void setAlumnosMaximos(JSpinner alumnosMaximos) {
		this.alumnosMaximos = alumnosMaximos;
	}

	/**
	 * @return the textAreaDescripcion
	 */
	public JTextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}

	/**
	 * @param textAreaDescripcion the textAreaDescripcion to set
	 */
	public void setTextAreaDescripcion(JTextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}

	/**
	 * @return the lblMensaje
	 */
	public JLabel getLblMensaje() {
		return lblMensaje;
	}

	/**
	 * @param lblMensaje the lblMensaje to set
	 */
	public void setLblMensaje(JLabel lblMensaje) {
		this.lblMensaje = lblMensaje;
	}
}
