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
}
