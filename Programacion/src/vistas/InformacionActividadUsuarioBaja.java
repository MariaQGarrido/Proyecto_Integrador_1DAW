package vistas;

import javax.swing.*;

import Control.ListenerDejarActividad;
import Control.ListenerInscribirActividad;
import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacionActividadUsuarioBaja extends JFrame{
	
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JTextField txtNombreUSRB;
	private JTextField txtMonitorUSRB;
	private JTextField txtDescripcionUSRB;
	private JTextField txtIdentificadorUSRB;
	private JTextField txtFechaUSRB;
	private JTextField txtHoraUSRB;
	private JTextField txtSalaUSRB;
	private JTextField txtNumMaxUSRB;
	private JButton btnDejarActividad;

	
	public InformacionActividadUsuarioBaja() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 85, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new menuActividadUSR());
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesUSR());
		
		JLabel lblInformacionAct = new JLabel("Información de la Actividad:");
		lblInformacionAct.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblInformacionAct.setBounds(122, 42, 400, 52);
		getContentPane().add(lblInformacionAct);
		
		JLabel nombreUsuario = new JLabel("UserName");
		nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		nombreUsuario.setBounds(571, 11, 100, 30);
		getContentPane().add(nombreUsuario);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(132, 93, 81, 44);
		getContentPane().add(lblNombre);
		
		txtNombreUSRB = new JTextField();
		txtNombreUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNombreUSRB.setColumns(10);
		txtNombreUSRB.setBounds(218, 105, 186, 25);
		getContentPane().add(txtNombreUSRB);
		
		JLabel lblMonitor = new JLabel("Monitor:");
		lblMonitor.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMonitor.setBounds(132, 148, 81, 30);
		getContentPane().add(lblMonitor);
		
		txtMonitorUSRB = new JTextField();
		txtMonitorUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMonitorUSRB.setColumns(10);
		txtMonitorUSRB.setBounds(212, 154, 192, 25);
		getContentPane().add(txtMonitorUSRB);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblDescripcion.setBounds(132, 195, 218, 40);
		getContentPane().add(lblDescripcion);
		
		txtDescripcionUSRB = new JTextField();
		txtDescripcionUSRB.setText("Descripción de la actividad");
		txtDescripcionUSRB.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
		txtDescripcionUSRB.setColumns(10);
		txtDescripcionUSRB.setBackground(Color.WHITE);
		txtDescripcionUSRB.setBounds(142, 239, 180, 95);
		getContentPane().add(txtDescripcionUSRB);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(436, 93, 127, 38);
		getContentPane().add(lblIdentificador);
		
		txtIdentificadorUSRB = new JTextField();
		txtIdentificadorUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtIdentificadorUSRB.setColumns(10);
		txtIdentificadorUSRB.setBounds(559, 102, 93, 25);
		getContentPane().add(txtIdentificadorUSRB);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblFecha.setBounds(436, 142, 69, 30);
		getContentPane().add(lblFecha);
		
		txtFechaUSRB = new JTextField();
		txtFechaUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtFechaUSRB.setColumns(10);
		txtFechaUSRB.setBounds(497, 147, 155, 25);
		getContentPane().add(txtFechaUSRB);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblHora.setBounds(436, 183, 53, 30);
		getContentPane().add(lblHora);
		
		txtHoraUSRB = new JTextField();
		txtHoraUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtHoraUSRB.setColumns(10);
		txtHoraUSRB.setBounds(491, 187, 161, 25);
		getContentPane().add(txtHoraUSRB);
		
		JLabel lblSala = new JLabel("Sala: ");
		lblSala.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblSala.setBounds(436, 227, 45, 30);
		getContentPane().add(lblSala);
		
		txtSalaUSRB = new JTextField();
		txtSalaUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSalaUSRB.setColumns(10);
		txtSalaUSRB.setBounds(481, 232, 171, 25);
		getContentPane().add(txtSalaUSRB);
		
		JLabel lblNMximo = new JLabel("Nº Máximo:");
		lblNMximo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNMximo.setBounds(436, 268, 112, 30);
		getContentPane().add(lblNMximo);
		
		txtNumMaxUSRB = new JTextField();
		txtNumMaxUSRB.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNumMaxUSRB.setColumns(10);
		txtNumMaxUSRB.setBounds(547, 273, 105, 25);
		getContentPane().add(txtNumMaxUSRB);
		
		btnDejarActividad = new JButton("Dejar Actividad");
		btnDejarActividad.addActionListener(new ListenerDejarActividad(this));
		btnDejarActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDejarActividad.setBackground(Color.WHITE);
		btnDejarActividad.setAutoscrolls(true);
		btnDejarActividad.setBounds(516, 319, 155, 30);
		getContentPane().add(btnDejarActividad);

		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	public void HacerVisible(){
		setVisible(true);
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
	 * @return the txtNombreUSRB
	 */
	public JTextField getTxtNombreUSRB() {
		return txtNombreUSRB;
	}

	/**
	 * @param txtNombreUSRB the txtNombreUSRB to set
	 */
	public void setTxtNombreUSRB(JTextField txtNombreUSRB) {
		this.txtNombreUSRB = txtNombreUSRB;
	}

	/**
	 * @return the txtMonitorUSRB
	 */
	public JTextField getTxtMonitorUSRB() {
		return txtMonitorUSRB;
	}

	/**
	 * @param txtMonitorUSRB the txtMonitorUSRB to set
	 */
	public void setTxtMonitorUSRB(JTextField txtMonitorUSRB) {
		this.txtMonitorUSRB = txtMonitorUSRB;
	}

	/**
	 * @return the txtDescripcionUSRB
	 */
	public JTextField getTxtDescripcionUSRB() {
		return txtDescripcionUSRB;
	}

	/**
	 * @param txtDescripcionUSRB the txtDescripcionUSRB to set
	 */
	public void setTxtDescripcionUSRB(JTextField txtDescripcionUSRB) {
		this.txtDescripcionUSRB = txtDescripcionUSRB;
	}

	/**
	 * @return the txtIdentificadorUSRB
	 */
	public JTextField getTxtIdentificadorUSRB() {
		return txtIdentificadorUSRB;
	}

	/**
	 * @param txtIdentificadorUSRB the txtIdentificadorUSRB to set
	 */
	public void setTxtIdentificadorUSRB(JTextField txtIdentificadorUSRB) {
		this.txtIdentificadorUSRB = txtIdentificadorUSRB;
	}

	/**
	 * @return the txtFechaUSRB
	 */
	public JTextField getTxtFechaUSRB() {
		return txtFechaUSRB;
	}

	/**
	 * @param txtFechaUSRB the txtFechaUSRB to set
	 */
	public void setTxtFechaUSRB(JTextField txtFechaUSRB) {
		this.txtFechaUSRB = txtFechaUSRB;
	}

	/**
	 * @return the txtHoraUSRB
	 */
	public JTextField getTxtHoraUSRB() {
		return txtHoraUSRB;
	}

	/**
	 * @param txtHoraUSRB the txtHoraUSRB to set
	 */
	public void setTxtHoraUSRB(JTextField txtHoraUSRB) {
		this.txtHoraUSRB = txtHoraUSRB;
	}

	/**
	 * @return the txtSalaUSRB
	 */
	public JTextField getTxtSalaUSRB() {
		return txtSalaUSRB;
	}

	/**
	 * @param txtSalaUSRB the txtSalaUSRB to set
	 */
	public void setTxtSalaUSRB(JTextField txtSalaUSRB) {
		this.txtSalaUSRB = txtSalaUSRB;
	}

	/**
	 * @return the txtNumMaxUSRB
	 */
	public JTextField getTxtNumMaxUSRB() {
		return txtNumMaxUSRB;
	}

	/**
	 * @param txtNumMaxUSRB the txtNumMaxUSRB to set
	 */
	public void setTxtNumMaxUSRB(JTextField txtNumMaxUSRB) {
		this.txtNumMaxUSRB = txtNumMaxUSRB;
	}

	/**
	 * @return the btnDejarActividad
	 */
	public JButton getBtnDejarActividad() {
		return btnDejarActividad;
	}

	/**
	 * @param btnDejarActividad the btnDejarActividad to set
	 */
	public void setBtnDejarActividad(JButton btnDejarActividad) {
		this.btnDejarActividad = btnDejarActividad;
	}

	
}
