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

import Control.ListenerBorrar;
import Control.ListenerEditar;
import Control.menuActividadMon;
import Control.menuDatosPersonalesMon;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	
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
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ListenerEditar(this));
		btnEditar.setBounds(141, 326, 89, 30);
		getContentPane().add(btnEditar);
		
		JLabel lblInformacinDeLa = new JLabel("Información de la Actividad");
		lblInformacinDeLa.setForeground(Color.BLACK);
		lblInformacinDeLa.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacinDeLa.setBounds(122, 42, 338, 37);
		getContentPane().add(lblInformacinDeLa);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(141, 109, 282, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblParticipantes.setBounds(435, 109, 133, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFechaHoraSala = new JLabel("Fecha Hora Sala:");
		lblFechaHoraSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFechaHoraSala.setBounds(141, 162, 282, 30);
		getContentPane().add(lblFechaHoraSala);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcin.setBounds(142, 221, 112, 30);
		getContentPane().add(lblDescripcin);
		
		textField = new JTextField();
		textField.setBounds(141, 262, 165, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(434, 221, 237, 30);
		getContentPane().add(lblNMximo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(435, 152, 195, 58);
		getContentPane().add(scrollPane);
		
		txtP = new JTextField();
		txtP.setText("Participantes va a ser una lista");
		scrollPane.setViewportView(txtP);
		txtP.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 95, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new menuActividadMon(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesMon(this));
		
		JButton btnBorrarActiviada = new JButton("Borrar");
		btnBorrarActiviada.addActionListener(new ListenerBorrar(this));
		btnBorrarActiviada.setBounds(582, 326, 89, 30);
		getContentPane().add(btnBorrarActiviada);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
	}
}
