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

import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 
 */
public class DatosPersonalesUsuario extends JFrame{
	

	private JTextField txtIdentificadorUSR;
	private JTextField txtNombreUSR;
	private JTextField txtMatriculaUSR;
	private JTextField txtCorreoUSR;
	private JTextField txtTelUSR;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;

	
	public DatosPersonalesUsuario() {
		getContentPane().setBackground(new Color(253, 251, 159));
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
				
		JLabel lblTitulo = new JLabel("UserName");
		lblTitulo.setBounds(566, 11, 105, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblTitulo);
				
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(143, 145, 121, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificadorUSR = new JTextField();
		txtIdentificadorUSR.setSize(250, 25);
		txtIdentificadorUSR.setLocation(268, 150);
		getContentPane().add(txtIdentificadorUSR);
	
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatrcula.setBounds(143, 191, 100, 30);
		getContentPane().add(lblMatrcula);
		
		txtMatriculaUSR = new JTextField();
		txtMatriculaUSR.setSize(250, 25);
		txtMatriculaUSR.setLocation(237, 195);
		getContentPane().add(txtMatriculaUSR);
		
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCorreo.setBounds(143, 242, 72, 30);
		getContentPane().add(lblCorreo);
		
		txtCorreoUSR = new JTextField();
		txtCorreoUSR.setSize(250, 25);
		txtCorreoUSR.setLocation(212, 245);
		getContentPane().add(txtCorreoUSR);
		
		JLabel lblNTelfono = new JLabel("Nº Teléfono:");
		lblNTelfono.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNTelfono.setBounds(143, 298, 121, 30);
		getContentPane().add(lblNTelfono);
		
		txtTelUSR = new JTextField();
		txtTelUSR.setSize(250, 25);
		txtTelUSR.setLocation(260, 303);
		getContentPane().add(txtTelUSR);		
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos:");
		lblNombreYApellidos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombreYApellidos.setBounds(143, 100, 189, 30);
		getContentPane().add(lblNombreYApellidos);
		
		txtNombreUSR = new JTextField();
		txtNombreUSR.setSize(250, 25);
		txtNombreUSR.setLocation(328, 104);
		getContentPane().add(txtNombreUSR);
		
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 100, 358);
		getContentPane().add(menuBar);
		
		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new menuActividadUSR(this));
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesUSR(this));
		
		
		JLabel lblDatosPersonales = new JLabel("Datos Personales: ");
		lblDatosPersonales.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblDatosPersonales.setBounds(122, 42, 251, 51);
		getContentPane().add(lblDatosPersonales);
		
	}
	
	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters
	
	/**
	 * @return the txtIdentificadorUSR
	 */
	public JTextField getTxtIdentificadorUSR() {
		return txtIdentificadorUSR;
	}

	/**
	 * @param txtIdentificadorUSR the txtIdentificadorUSR to set
	 */
	public void setTxtIdentificadorUSR(JTextField txtIdentificadorUSR) {
		this.txtIdentificadorUSR = txtIdentificadorUSR;
	}

	/**
	 * @return the txtNombreUSR
	 */
	public JTextField getTxtNombreUSR() {
		return txtNombreUSR;
	}

	/**
	 * @param txtNombreUSR the txtNombreUSR to set
	 */
	public void setTxtNombreUSR(JTextField txtNombreUSR) {
		this.txtNombreUSR = txtNombreUSR;
	}

	/**
	 * @return the txtMatriculaUSR
	 */
	public JTextField getTxtMatriculaUSR() {
		return txtMatriculaUSR;
	}

	/**
	 * @param txtMatriculaUSR the txtMatriculaUSR to set
	 */
	public void setTxtMatriculaUSR(JTextField txtMatriculaUSR) {
		this.txtMatriculaUSR = txtMatriculaUSR;
	}

	/**
	 * @return the txtCorreoUSR
	 */
	public JTextField getTxtCorreoUSR() {
		return txtCorreoUSR;
	}

	/**
	 * @param txtCorreoUSR the txtCorreoUSR to set
	 */
	public void setTxtCorreoUSR(JTextField txtCorreoUSR) {
		this.txtCorreoUSR = txtCorreoUSR;
	}

	/**
	 * @return the txtTelUSR
	 */
	public JTextField getTxtTelUSR() {
		return txtTelUSR;
	}

	/**
	 * @param txtTelUSR the txtTelUSR to set
	 */
	public void setTxtTelUSR(JTextField txtTelUSR) {
		this.txtTelUSR = txtTelUSR;
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
}
