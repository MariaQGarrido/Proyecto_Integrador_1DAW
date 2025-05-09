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
		lblTitulo.setBounds(95, 0, 349, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);
		
		// identificador
		JLabel lblidentificador = new JLabel("Identificador:");
		lblidentificador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblidentificador.setBounds(95, 48, 124, 29);
		getContentPane().add(lblidentificador);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(175, 52, 124, 20);
		getContentPane().add(txtIdentificador);
		txtIdentificador.setColumns(10);
		
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 85, 358);
		getContentPane().add(menuBar);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(95, 78, 124, 29);
		getContentPane().add(lblDescripcion);
		
		// Descripción de la actividad
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(95, 108, 235, 123);
		getContentPane().add(scrollPaneDescripcion);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(255, 255, 255));
		scrollPaneDescripcion.setViewportView(textAreaDescripcion);
		
		//nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(365, 48, 124, 29);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(432, 52, 124, 20);
		getContentPane().add(txtNombre);
		
		// Descripción de la sala (tipo, numero y nombre de la sala)
		JLabel lblNumeroSala = new JLabel("Número Sala:");
		lblNumeroSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroSala.setBounds(365, 107, 124, 29);
		getContentPane().add(lblNumeroSala);
		
		txtNumeroSala = new JTextField();
		txtNumeroSala.setColumns(10);
		txtNumeroSala.setBounds(455, 111, 124, 20);
		getContentPane().add(txtNumeroSala);
		
		JLabel lblNombreSala = new JLabel("Nombre Sala:");
		lblNombreSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreSala.setBounds(365, 142, 124, 29);
		getContentPane().add(lblNombreSala);
		
		txtNombreSala = new JTextField();
		txtNombreSala.setColumns(10);
		txtNombreSala.setBounds(455, 146, 124, 20);
		getContentPane().add(txtNombreSala);
		
		JLabel lblTipoSala = new JLabel("Tipo Sala:");
		lblTipoSala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoSala.setBounds(365, 182, 124, 29);
		getContentPane().add(lblTipoSala);
		
		txtTipoSala = new JTextField();
		txtTipoSala.setColumns(10);
		txtTipoSala.setBounds(455, 186, 124, 20);
		getContentPane().add(txtTipoSala);
		
		// Label y spinner para el numero máximos de alumnos que hay en una actividad
		JSpinner AlumnosMaximos = new JSpinner();
		AlumnosMaximos.setBounds(210, 246, 101, 20);
		getContentPane().add(AlumnosMaximos);
		
		JLabel lblAlumnosMaximos = new JLabel("Alumnos Máximos:");
		lblAlumnosMaximos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlumnosMaximos.setBounds(95, 242, 124, 29);
		getContentPane().add(lblAlumnosMaximos);
		
		// label y txt para añadir la fecha
		JLabel lblFecha = new JLabel("Fecha Actividad:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFecha.setBounds(95, 277, 124, 29);
		getContentPane().add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(210, 282, 101, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		// label y txt para añadir la hora
		JLabel lblHora = new JLabel("Hora Actividad:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHora.setBounds(95, 313, 124, 29);
		getContentPane().add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(210, 317, 101, 20);
		getContentPane().add(txtHora);
		
		//Boton para crear la actividad
		JButton btnNewButton = new JButton("Crear Actividad");
		btnNewButton.addActionListener(new ListenerCrearActividad(this));
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
}
