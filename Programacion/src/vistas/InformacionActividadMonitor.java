/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JMenu;
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
	
	public InformacionActividadMonitor(){
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
						
		JLabel lblTitulo = new JLabel("monitor@ejem.com");
		lblTitulo.setBounds(142, 25, 586, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("", Font.BOLD, 20));
		getContentPane().add(lblTitulo);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setBounds(-27, 0, 146, 105);
		getContentPane().add(mnInicio);
		
		JMenu mnDatosPersonales = new JMenu("Actividades");
		mnDatosPersonales.setBounds(-24, 127, 143, 105);
		getContentPane().add(mnDatosPersonales);
		
		JMenu mnDatosPersonales_1 = new JMenu("Datos Personales");
		mnDatosPersonales_1.setBounds(-27, 255, 159, 105);
		getContentPane().add(mnDatosPersonales_1);
		
		JLabel lblInformacinDeLa = new JLabel("Información de la Actividad");
		lblInformacinDeLa.setForeground(Color.BLACK);
		lblInformacinDeLa.setFont(new Font("Dialog", Font.BOLD, 23));
		lblInformacinDeLa.setBounds(142, 83, 586, 37);
		getContentPane().add(lblInformacinDeLa);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblIdentificador.setBounds(142, 146, 100, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblParticipantes.setBounds(142, 180, 100, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha Hora Sala:");
		lblFechaHoraSala.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblFechaHoraSala.setBounds(142, 221, 135, 30);
		getContentPane().add(lblFechaHoraSala);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblDescripcin.setBounds(142, 261, 100, 30);
		getContentPane().add(lblDescripcin);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNMximo.setBounds(142, 302, 100, 30);
		getContentPane().add(lblNMximo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(369, 180, 195, 134);
		getContentPane().add(scrollPane);
		
		txtP = new JTextField();
		txtP.setText("Participantes va a ser una lista");
		scrollPane.setViewportView(txtP);
		txtP.setColumns(10);
						
		setSize(695, 397);
		setLocationRelativeTo(null);
		
	}
}
