package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import Control.ListenerInscribirActividad;
import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacionActividadUsuarioInscribir extends JFrame{
	
	private JButton btnInscribirActividad;
	private JMenu menuDatosPersonales;
	private JMenu menuActividad;
	private JTextField txtNombreUSRI;
	private JTextField txtMonitorUSRI;
	private JTextField textField_2;
	private JTextField txtIdentificadorUSRI;
	private JTextField txtFechaUSRI;
	private JTextField txtHorUSRI;
	private JTextField txtSalaUSRI;
	private JTextField txtNumMaxUSRI;
	
	public InformacionActividadUsuarioInscribir () {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
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
		menuActividad.addMouseListener(new menuActividadUSR(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesUSR(this));
		
		JLabel nombreUsuario = new JLabel("UserName");
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
		lblNombre.setBounds(132, 93, 81, 44);
		getContentPane().add(lblNombre);
		
		txtNombreUSRI = new JTextField();
		txtNombreUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNombreUSRI.setColumns(10);
		txtNombreUSRI.setBounds(218, 105, 186, 25);
		getContentPane().add(txtNombreUSRI);
		
		txtMonitorUSRI = new JTextField();
		txtMonitorUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMonitorUSRI.setColumns(10);
		txtMonitorUSRI.setBounds(212, 145, 192, 25);
		getContentPane().add(txtMonitorUSRI);
		
		JLabel lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 81, 30);
		getContentPane().add(lblMonitor);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 218, 40);
		getContentPane().add(lblDescripcion);
		
		textField_2 = new JTextField();
		textField_2.setText("Descripción de la actividad");
		textField_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(142, 239, 180, 95);
		getContentPane().add(textField_2);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(436, 93, 127, 38);
		getContentPane().add(lblIdentificador);
		
		txtIdentificadorUSRI = new JTextField();
		txtIdentificadorUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtIdentificadorUSRI.setColumns(10);
		txtIdentificadorUSRI.setBounds(559, 106, 93, 25);
		getContentPane().add(txtIdentificadorUSRI);
		
		txtFechaUSRI = new JTextField();
		txtFechaUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtFechaUSRI.setColumns(10);
		txtFechaUSRI.setBounds(497, 147, 155, 25);
		getContentPane().add(txtFechaUSRI);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 142, 69, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 183, 53, 30);
		getContentPane().add(lblHora);
		
		txtHorUSRI = new JTextField();
		txtHorUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtHorUSRI.setColumns(10);
		txtHorUSRI.setBounds(491, 187, 161, 25);
		getContentPane().add(txtHorUSRI);
		
		JLabel lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 227, 45, 30);
		getContentPane().add(lblSala);
		
		txtSalaUSRI = new JTextField();
		txtSalaUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSalaUSRI.setColumns(10);
		txtSalaUSRI.setBounds(481, 232, 171, 25);
		getContentPane().add(txtSalaUSRI);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(436, 268, 112, 30);
		getContentPane().add(lblNMximo);
		
		txtNumMaxUSRI = new JTextField();
		txtNumMaxUSRI.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNumMaxUSRI.setColumns(10);
		txtNumMaxUSRI.setBounds(547, 273, 105, 25);
		getContentPane().add(txtNumMaxUSRI);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
}
