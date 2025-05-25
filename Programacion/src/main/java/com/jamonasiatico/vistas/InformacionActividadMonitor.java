/**
 * 
 */
package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.jamonasiatico.control.*;
import com.jamonasiatico.modelo.Usuario;

/**
 * 
 */
public class InformacionActividadMonitor extends JFrame{
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JTextField txtIdentificador;
	private JLabel lblMensaje;
	
	public InformacionActividadMonitor(){
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		getContentPane().setBackground(new Color(247, 202, 136));

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ListenerEditar());
		btnEditar.setBounds(141, 326, 89, 30);
		getContentPane().add(btnEditar);
		
		JLabel lblInformacinDeLa = new JLabel("Información de la Actividad");
		lblInformacinDeLa.setForeground(Color.BLACK);
		lblInformacinDeLa.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacinDeLa.setBounds(122, 42, 338, 37);
		getContentPane().add(lblInformacinDeLa);
		
		JLabel lblIdentificador = new JLabel("Identificador: "+ ListenerCrearActividad.actividad.getIdActividad());
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(141, 116, 284, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		
		
		JLabel lblParticipantes = new JLabel("Participantes: "+ListenerCrearActividad.actividad.getUsuariosInscritos()+"/"+ListenerCrearActividad.actividad.getUsuariosMaximos());
		lblParticipantes.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblParticipantes.setBounds(435, 116, 236, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFecha = new JLabel("Fecha: "+ListenerCrearActividad.actividad.getFechaActividad());
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(141, 168, 267, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: "+ListenerCrearActividad.actividad.getHoraActividad());
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(141, 216, 267, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: "+ListenerCrearActividad.actividad.getIdSala());
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(141, 262, 236, 30);
		getContentPane().add(lblSala);
		
		JLabel lblDescripcion = new JLabel(
				"<html>" +
				"<body style='width 200px; '> Descripción: " +
						
				ListenerCrearActividad.actividad.getDescripcionActividad()+
				"</body>" +
		"</html>"
		);
		lblDescripcion.setVerticalAlignment(SwingConstants.NORTH);
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(435, 157, 236, 108);
		getContentPane().add(lblDescripcion);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: "+ ListenerCrearActividad.actividad.getUsuariosMaximos());
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(435, 262, 236, 30);
		getContentPane().add(lblNMximo);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 110, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadMon());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesMonitorListener());
		
		JButton btnBorrarActiviada = new JButton("Borrar");
		btnBorrarActiviada.addActionListener(new ListenerBorrar());
		btnBorrarActiviada.setBounds(582, 326, 89, 30);
		getContentPane().add(btnBorrarActiviada);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(272, 326, 296, 30);
		getContentPane().add(lblMensaje);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
		
	// Getters y Setters

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

	/**
	 * @return the lblMensaje
	 */
	public JLabel getLblMensaje() {
		return lblMensaje;
	}

	/**
	 * @param lblMensaje the lblMensaje to set
	 */
	public void setLblMensaje(JLabel lblMensaje) {
		this.lblMensaje = lblMensaje;
	}
	
	
}
