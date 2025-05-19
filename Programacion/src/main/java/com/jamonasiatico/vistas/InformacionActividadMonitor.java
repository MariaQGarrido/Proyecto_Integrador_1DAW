/**
 * 
 */
package com.jamonasiatico.vistas;

import com.jamonasiatico.control.ListenerBorrar;
import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerEditar;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadMon;
import com.jamonasiatico.modelo.Usuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JList;

/**
 * 
 */
public class InformacionActividadMonitor extends JFrame{
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JTextField txtIdentificador;
	private JList<Usuario> listParticipantes;
	private JLabel lblMensaje;
	
	public InformacionActividadMonitor(){
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		getContentPane().setBackground(new Color(247, 202, 136));
						
		JLabel lblNomUsuario = new JLabel(ListenerLogin.usuario.getMatricula());
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
		
		JLabel lblIdentificador = new JLabel("Identificador: "+ ListenerCrearActividad.actividad.getIdActividad());
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(141, 90, 284, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		
		
		JLabel lblParticipantes = new JLabel("Participantes: ");
		lblParticipantes.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblParticipantes.setBounds(435, 90, 133, 30);
		getContentPane().add(lblParticipantes);
		
		JLabel lblFecha = new JLabel("Fecha: "+ListenerCrearActividad.actividad.getFechaActividad());
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(141, 131, 267, 30);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora: "+ListenerCrearActividad.actividad.getHoraActividad());
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(141, 172, 267, 30);
		getContentPane().add(lblHora);
		
		JLabel lblSala = new JLabel("Sala: "+ListenerCrearActividad.actividad.getSala().getTipoSala());
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(141, 262, 236, 30);
		getContentPane().add(lblSala);
		
		JLabel lblDescripcin = new JLabel("Descripción: "+ ListenerCrearActividad.actividad.getDescripcionActividad());
		lblDescripcin.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		lblDescripcin.setBounds(142, 221, 488, 30);
		getContentPane().add(lblDescripcin);
		
		JLabel lblNMximo = new JLabel("Nº Máximo: "+ ListenerCrearActividad.actividad.getUsuariosMaximos());
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(435, 262, 236, 30);
		getContentPane().add(lblNMximo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(433, 131, 197, 71);
		getContentPane().add(scrollPane);
		
		listParticipantes = new JList();
		scrollPane.setViewportView(listParticipantes);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 95, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadMon());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesMonitorListener());
		
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
	 * @return the listParticipantes
	 */
	public JList<Usuario> getListParticipantes() {
		return listParticipantes;
	}

	/**
	 * @param listParticipantes the listParticipantes to set
	 */
	public void setListParticipantes(JList<Usuario> listParticipantes) {
		this.listParticipantes = listParticipantes;
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
