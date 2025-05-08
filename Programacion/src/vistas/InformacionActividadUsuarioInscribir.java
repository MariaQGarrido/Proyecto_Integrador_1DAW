package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class InformacionActividadUsuarioInscribir extends JFrame{
	
	private JButton btnInscribirActividad;
	private JMenuBar menuBarActividad;
	private JMenu menuDatosPersonales;
	private JMenu menuActividad;
	private JTextField txtA;
	
	public InformacionActividadUsuarioInscribir () {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBarActividad = new JMenuBar();
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 99, 360);
		getContentPane().add(menuBarActividad);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBarActividad.add(menuActividad);
		
		JMenu menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
		
		JLabel nombreUsuario = new JLabel("UserName");
		nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		nombreUsuario.setBounds(571, 11, 100, 30);
		getContentPane().add(nombreUsuario);
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad:");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(123, 56, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(143, 105, 81, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(381, 108, 132, 38);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(143, 163, 88, 30);
		getContentPane().add(lblMonitor);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha/Hora/Sala:");
		lblFechaHoraSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFechaHoraSala.setBounds(371, 158, 300, 40);
		getContentPane().add(lblFechaHoraSala);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(143, 224, 121, 40);
		getContentPane().add(lblDescripcion);
		
		JLabel lblNumMax = new JLabel("Nº Máximo:");
		lblNumMax.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNumMax.setBounds(382, 224, 115, 40);
		getContentPane().add(lblNumMax);
		
		JButton btnInscribirActividad = new JButton("Inscribir Actividad");
		btnInscribirActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInscribirActividad.setBounds(516, 326, 155, 23);
		getContentPane().add(btnInscribirActividad);
		
		txtA = new JTextField();
		txtA.setText("Descripción de la actividad");
		txtA.setBounds(143, 275, 147, 74);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
}
