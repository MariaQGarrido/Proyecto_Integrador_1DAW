package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

import Control.ListenerDejrActividad;
import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacionActividadUsuarioBaja extends JFrame{
	
	private JButton btnDejarActividad;
	private JMenu menuDatosPersonales;
	private JMenu menuActividad;
	private JTextField textField;
	private JTextField txtFechaUSR;
	private JTextField txtHoraUSR;
	private JTextField txtSalaUSR;
	private JTextField txtnumMaxUSR;
	private JTextField txtNombreUSR;
	private JTextField txtMonitor;
	private JTextField txtIdentificadorUSR;
	
	public InformacionActividadUsuarioBaja() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBarActividad = new JMenuBar();
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
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 81, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(436, 93, 127, 38);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 81, 30);
		getContentPane().add(lblMonitor);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 218, 40);
		getContentPane().add(lblDescripcion);
		
		btnDejarActividad = new JButton("Dejar Actividad");
		btnDejarActividad.addActionListener(new ListenerDejrActividad(this));
		btnDejarActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDejarActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnDejarActividad);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		textField.setBackground(new Color(255, 255, 255));
		textField.setText("Descripción de la actividad");
		textField.setColumns(10);
		textField.setBounds(142, 239, 180, 95);
		getContentPane().add(textField);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 142, 69, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 183, 53, 30);
		getContentPane().add(lblHora);
		
		txtFechaUSR = new JTextField();
		txtFechaUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtFechaUSR.setColumns(10);
		txtFechaUSR.setBounds(497, 147, 155, 25);
		getContentPane().add(txtFechaUSR);
		
		txtHoraUSR = new JTextField();
		txtHoraUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtHoraUSR.setColumns(10);
		txtHoraUSR.setBounds(491, 187, 161, 25);
		getContentPane().add(txtHoraUSR);
		
		JLabel lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 227, 45, 30);
		getContentPane().add(lblSala);
		
		txtSalaUSR = new JTextField();
		txtSalaUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSalaUSR.setColumns(10);
		txtSalaUSR.setBounds(481, 232, 171, 25);
		getContentPane().add(txtSalaUSR);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(436, 268, 112, 30);
		getContentPane().add(lblNMximo);
		
		txtnumMaxUSR = new JTextField();
		txtnumMaxUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtnumMaxUSR.setColumns(10);
		txtnumMaxUSR.setBounds(547, 273, 105, 25);
		getContentPane().add(txtnumMaxUSR);
		
		txtNombreUSR = new JTextField();
		txtNombreUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNombreUSR.setColumns(10);
		txtNombreUSR.setBounds(218, 105, 186, 25);
		getContentPane().add(txtNombreUSR);
		
		txtMonitor = new JTextField();
		txtMonitor.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMonitor.setColumns(10);
		txtMonitor.setBounds(212, 145, 192, 25);
		getContentPane().add(txtMonitor);
		
		txtIdentificadorUSR = new JTextField();
		txtIdentificadorUSR.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtIdentificadorUSR.setColumns(10);
		txtIdentificadorUSR.setBounds(559, 106, 93, 25);
		getContentPane().add(txtIdentificadorUSR);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	} 
}
