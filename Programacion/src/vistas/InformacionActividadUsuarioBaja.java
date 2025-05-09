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

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacionActividadUsuarioBaja extends JFrame{
	
	private JButton btnDejarActividad;
	private JMenuBar menuBarActividad;
	private JMenu menuDatosPersonales;
	private JMenu menuActividad;
	private JTextField textField;
	
	public InformacionActividadUsuarioBaja() {
		
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
		lblInformacionAct.setBounds(122, 42, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(143, 93, 218, 44);
		getContentPane().add(lblNombre);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(371, 96, 300, 38);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(143, 148, 218, 30);
		getContentPane().add(lblMonitor);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha/Hora/Sala:");
		lblFechaHoraSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFechaHoraSala.setBounds(371, 143, 300, 40);
		getContentPane().add(lblFechaHoraSala);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(143, 195, 218, 40);
		getContentPane().add(lblDescripcion);
		
		JLabel lblNumMax = new JLabel("Nº Máximo:");
		lblNumMax.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNumMax.setBounds(371, 195, 300, 40);
		getContentPane().add(lblNumMax);
		
		JButton btnDejarActividad = new JButton("Dejar Actividad");
		btnDejarActividad.addActionListener(new ListenerDejrActividad(this));
		btnDejarActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDejarActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnDejarActividad);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		textField.setBackground(new Color(253,251,159));
		textField.setText("Descripción de la actividad");
		textField.setColumns(10);
		textField.setBounds(136, 234, 155, 38);
		getContentPane().add(textField);
		
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	} 
}
