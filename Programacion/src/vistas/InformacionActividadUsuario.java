package vistas;

import javax.swing.*;
import java.awt.*;

public class InformacionActividadUsuario extends JFrame{
	
	private JTextField txtIdentificador;
	private JTextField txtParticipantes;
	private JTextField txtIFecha;
	private JTextField txtDescrip;
	private JTextField txtNMax;
	private JTextField textField;
	
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
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
}
