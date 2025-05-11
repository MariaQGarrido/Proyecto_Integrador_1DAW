package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Control.ListenerCrearActividad;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearActividad extends JFrame {
	
	private JTextField txtIdentificador;
	private JTextField txtNombre;
	private JTextField txtNumeroSala;
	private JTextField txtNombreSala;
	private JTextField txtTipoSala;
	private JTextField txtFecha;
	private JTextField txtHora;
	
	public CrearActividad() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(247, 202, 136));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		// Titulo
		JLabel lblTitulo = new JLabel("Crear Actividad");
		lblTitulo.setBounds(111, 10, 349, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);
		
		// identificador
		JLabel lblidentificador = new JLabel("Identificador:");
		lblidentificador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblidentificador.setBounds(151, 48, 124, 29);
		getContentPane().add(lblidentificador);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(231, 52, 124, 20);
		getContentPane().add(txtIdentificador);
		txtIdentificador.setColumns(10);
		
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 101, 358);
		getContentPane().add(menuBar);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(151, 72, 124, 29);
		getContentPane().add(lblDescripcion);
		
		// Descripción de la actividad
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(137, 112, 235, 123);
		getContentPane().add(scrollPaneDescripcion);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(255, 255, 255));
		scrollPaneDescripcion.setViewportView(textAreaDescripcion);
		
		//nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(430, 48, 124, 29);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(497, 52, 124, 20);
		getContentPane().add(txtNombre);
		
		// Descripción de la sala (tipo, numero y nombre de la sala)
		JLabel lblNumeroSala = new JLabel("Número Sala:");
		lblNumeroSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroSala.setBounds(407, 97, 124, 29);
		getContentPane().add(lblNumeroSala);
		
		txtNumeroSala = new JTextField();
		txtNumeroSala.setColumns(10);
		txtNumeroSala.setBounds(497, 101, 124, 20);
		getContentPane().add(txtNumeroSala);
		
		JLabel lblNombreSala = new JLabel("Nombre Sala:");
		lblNombreSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreSala.setBounds(407, 132, 124, 29);
		getContentPane().add(lblNombreSala);
		
		txtNombreSala = new JTextField();
		txtNombreSala.setColumns(10);
		txtNombreSala.setBounds(497, 136, 124, 20);
		getContentPane().add(txtNombreSala);
		
		JLabel lblTipoSala = new JLabel("Tipo Sala:");
		lblTipoSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoSala.setBounds(407, 172, 124, 29);
		getContentPane().add(lblTipoSala);
		
		txtTipoSala = new JTextField();
		txtTipoSala.setColumns(10);
		txtTipoSala.setBounds(497, 176, 124, 20);
		getContentPane().add(txtTipoSala);
		
		// Label y spinner para el numero máximos de alumnos que hay en una actividad
		JSpinner AlumnosMaximos = new JSpinner();
		AlumnosMaximos.setBounds(254, 251, 101, 20);
		getContentPane().add(AlumnosMaximos);
		
		JLabel lblAlumnosMaximos = new JLabel("Alumnos Máximos:");
		lblAlumnosMaximos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlumnosMaximos.setBounds(139, 247, 124, 29);
		getContentPane().add(lblAlumnosMaximos);
		
		// label y txt para añadir la fecha
		JLabel lblFecha = new JLabel("Fecha Actividad:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFecha.setBounds(139, 282, 124, 29);
		getContentPane().add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(254, 287, 101, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		// label y txt para añadir la hora
		JLabel lblHora = new JLabel("Hora Actividad:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHora.setBounds(139, 318, 124, 29);
		getContentPane().add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(254, 322, 101, 20);
		getContentPane().add(txtHora);
		
		//Boton para crear la actividad
		JButton btnNewButton = new JButton("Crear Actividad");
		btnNewButton.addActionListener(new ListenerCrearActividad());
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(551, 318, 118, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNomUsuario = new JLabel("UserName");
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomUsuario.setBounds(597, 11, 74, 29);
		getContentPane().add(lblNomUsuario);
		
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
	 * @return the txtNumeroSala
	 */
	public JTextField getTxtNumeroSala() {
		return txtNumeroSala;
	}

	/**
	 * @param txtNumeroSala the txtNumeroSala to set
	 */
	public void setTxtNumeroSala(JTextField txtNumeroSala) {
		this.txtNumeroSala = txtNumeroSala;
	}

	/**
	 * @return the txtNombreSala
	 */
	public JTextField getTxtNombreSala() {
		return txtNombreSala;
	}

	/**
	 * @param txtNombreSala the txtNombreSala to set
	 */
	public void setTxtNombreSala(JTextField txtNombreSala) {
		this.txtNombreSala = txtNombreSala;
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
}
