/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 */
public class InformacionActividadMonitor extends JFrame{
	
	private JTextField txtIdentificador;
	private JTextField txtParticipantes;
	private JTextField txtIFecha;
	private JTextField txtDescrip;
	private JTextField txtNMax;
	private JTextField txtP;
	private JTextField textField;
	
	public InformacionActividadMonitor(){
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(247, 202, 136));
						
		JLabel lblNomUsuario = new JLabel("UserName");
		lblNomUsuario.setBounds(571, 11, 100, 37);
		lblNomUsuario.setForeground(new Color(0, 0, 0));
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblNomUsuario);
		
		JLabel lblInformacinDeLa = new JLabel("Información de la Actividad");
		lblInformacinDeLa.setForeground(Color.BLACK);
		lblInformacinDeLa.setFont(new Font("Dialog", Font.BOLD, 23));
		lblInformacinDeLa.setBounds(142, 83, 586, 37);
		getContentPane().add(lblInformacinDeLa);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Dialog", Font.BOLD, 13));
		lblIdentificador.setBounds(142, 146, 100, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setFont(new Font("Dialog", Font.BOLD, 13));
		lblParticipantes.setBounds(434, 146, 100, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha Hora Sala:");
		lblFechaHoraSala.setFont(new Font("Dialog", Font.BOLD, 13));
		lblFechaHoraSala.setBounds(142, 187, 135, 30);
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
		lblNMximo.setBounds(434, 273, 100, 30);
		getContentPane().add(lblNMximo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 187, 195, 58);
		getContentPane().add(scrollPane);
		
		txtP = new JTextField();
		txtP.setText("Participantes va a ser una lista");
		scrollPane.setViewportView(txtP);
		txtP.setColumns(10);
		
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
