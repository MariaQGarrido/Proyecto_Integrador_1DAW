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
	
	private JTextField txtP;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JTextField txtIdentificador;
	
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
		btnEditar.addActionListener(new ListenerEditar());
		btnEditar.setBounds(141, 326, 89, 30);
		getContentPane().add(btnEditar);
		
		JLabel lblInformacinDeLa = new JLabel("Información de la Actividad");
		lblInformacinDeLa.setForeground(Color.BLACK);
		lblInformacinDeLa.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacinDeLa.setBounds(122, 42, 338, 37);
		getContentPane().add(lblInformacinDeLa);
		
		JLabel lblIdentificador = new JLabel("Identificador: ");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(141, 90, 284, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		
		
		JLabel lblParticipantes = new JLabel("Participantes: ");
		lblParticipantes.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblParticipantes.setBounds(435, 90, 133, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(141, 131, 267, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(141, 172, 267, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(435, 221, 236, 30);
		getContentPane().add(lblSala);
		
		JLabel lblDescripcin = new JLabel("Descripción: ");
		lblDescripcin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcin.setBounds(142, 221, 283, 30);
		getContentPane().add(lblDescripcin);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: ");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(435, 262, 236, 30);
		getContentPane().add(lblNMximo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(433, 131, 197, 71);
		getContentPane().add(scrollPane);
		
		txtP = new JTextField();
		txtP.setFont(new Font("Dialog", Font.PLAIN, 14));
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
		menuActividad.addMouseListener(new menuActividadMon());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesMon());
		
		JButton btnBorrarActiviada = new JButton("Borrar");
		btnBorrarActiviada.addActionListener(new ListenerBorrar());
		btnBorrarActiviada.setBounds(582, 326, 89, 30);
		getContentPane().add(btnBorrarActiviada);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
	}
	
	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters

	/**
	 * @return the txtP
	 */
	public JTextField getTxtP() {
		return txtP;
	}

	/**
	 * @param txtP the txtP to set
	 */
	public void setTxtP(JTextField txtP) {
		this.txtP = txtP;
	}

	/**
	 * @return the menuActividad
	 */
	public JMenu getMenuActividad() {
		return menuActividad;
	}

	/**
	 * @param menuActividad the menuActividad to set
	 */
	public void setMenuActividad(JMenu menuActividad) {
		this.menuActividad = menuActividad;
	}

	/**
	 * @return the menuDatosPersonales
	 */
	public JMenu getMenuDatosPersonales() {
		return menuDatosPersonales;
	}

	/**
	 * @param menuDatosPersonales the menuDatosPersonales to set
	 */
	public void setMenuDatosPersonales(JMenu menuDatosPersonales) {
		this.menuDatosPersonales = menuDatosPersonales;
	}

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
}
