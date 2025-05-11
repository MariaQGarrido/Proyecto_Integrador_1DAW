/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.sound.midi.VoiceStatus;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Control.menuActividadMon;
import Control.menuDatosPersonalesMon;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 
 */
public class DatosPersonalesMonitor extends JFrame{
	

	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JTextField txtNombreMon;
	private JTextField txtIndetificdorMon;
	private JTextField txtMatriculaMon;
	private JTextField txtCorreoMon;
	private JTextField txtTelMon;

	
	public DatosPersonalesMonitor() {
		getContentPane().setBackground(new Color(247, 202, 136));
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
				
		JLabel lblTitulo = new JLabel("monitor@ejem.com");
		lblTitulo.setBounds(535, 11, 136, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 14));
		getContentPane().add(lblTitulo);
				
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(143, 145, 124, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatrcula.setBounds(143, 191, 87, 30);
		getContentPane().add(lblMatrcula);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCorreo.setBounds(143, 242, 74, 30);
		getContentPane().add(lblCorreo);
		
		JLabel lblNTelfono = new JLabel("Nº Teléfono:");
		lblNTelfono.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNTelfono.setBounds(143, 298, 114, 30);
		getContentPane().add(lblNTelfono);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos:");
		lblNombreYApellidos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombreYApellidos.setBounds(143, 100, 183, 30);
		getContentPane().add(lblNombreYApellidos);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 100, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new menuActividadMon());
		
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesMon());
		
		JLabel lblDatosPersonales = new JLabel("Datos Personales: ");
		lblDatosPersonales.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblDatosPersonales.setBounds(122, 42, 251, 51);
		getContentPane().add(lblDatosPersonales);
		
		txtNombreMon = new JTextField();
		txtNombreMon.setBounds(326, 104, 250, 25);
		getContentPane().add(txtNombreMon);
		
		txtIndetificdorMon = new JTextField();
		txtIndetificdorMon.setBounds(266, 150, 250, 25);
		getContentPane().add(txtIndetificdorMon);
		
		txtMatriculaMon = new JTextField();
		txtMatriculaMon.setBounds(235, 195, 250, 25);
		getContentPane().add(txtMatriculaMon);
		
		txtCorreoMon = new JTextField();
		txtCorreoMon.setBounds(210, 245, 250, 25);
		getContentPane().add(txtCorreoMon);
		
		txtTelMon = new JTextField();
		txtTelMon.setBounds(260, 303, 250, 25);
		getContentPane().add(txtTelMon);
		
	}
	
	public void HacerVisible(){
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
	 * @return the txtNombreMon
	 */
	public JTextField getTxtNombreMon() {
		return txtNombreMon;
	}

	/**
	 * @param txtNombreMon the txtNombreMon to set
	 */
	public void setTxtNombreMon(JTextField txtNombreMon) {
		this.txtNombreMon = txtNombreMon;
	}

	/**
	 * @return the txtIndetificdorMon
	 */
	public JTextField getTxtIndetificdorMon() {
		return txtIndetificdorMon;
	}

	/**
	 * @param txtIndetificdorMon the txtIndetificdorMon to set
	 */
	public void setTxtIndetificdorMon(JTextField txtIndetificdorMon) {
		this.txtIndetificdorMon = txtIndetificdorMon;
	}

	/**
	 * @return the txtMatriculaMon
	 */
	public JTextField getTxtMatriculaMon() {
		return txtMatriculaMon;
	}

	/**
	 * @param txtMatriculaMon the txtMatriculaMon to set
	 */
	public void setTxtMatriculaMon(JTextField txtMatriculaMon) {
		this.txtMatriculaMon = txtMatriculaMon;
	}

	/**
	 * @return the txtCorreoMon
	 */
	public JTextField getTxtCorreoMon() {
		return txtCorreoMon;
	}

	/**
	 * @param txtCorreoMon the txtCorreoMon to set
	 */
	public void setTxtCorreoMon(JTextField txtCorreoMon) {
		this.txtCorreoMon = txtCorreoMon;
	}

	/**
	 * @return the txtTelMon
	 */
	public JTextField getTxtTelMon() {
		return txtTelMon;
	}

	/**
	 * @param txtTelMon the txtTelMon to set
	 */
	public void setTxtTelMon(JTextField txtTelMon) {
		this.txtTelMon = txtTelMon;
	}
	
}