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
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 
 */
public class DatosPersonalesUsuario extends JFrame{
	

	private JTextField txtIdentificador;
	private JTextField txtNombre;
	private JTextField txtMatricula;
	private JTextField txtCorreo;
	private JTextField txtTel;
	private JTextField txtDireccion;
	private JTextField textCP;
	private JTextField txtCiudad;
	private JTextField txtProvincia;
	private JTextField txtPais;
	

	
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
		lblIdentificador.setBounds(143, 141, 231, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatrcula.setBounds(143, 191, 260, 30);
		getContentPane().add(lblMatrcula);
		
		JLabel lblCorreo = new JLabel("Correo: userNmae@gmail.com");
		lblCorreo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCorreo.setBounds(143, 242, 298, 30);
		getContentPane().add(lblCorreo);
		
		JLabel lblNTelfono = new JLabel("Nº Teléfono: 123456789");
		lblNTelfono.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNTelfono.setBounds(143, 298, 231, 30);
		getContentPane().add(lblNTelfono);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos:");
		lblNombreYApellidos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombreYApellidos.setBounds(143, 100, 525, 30);
		getContentPane().add(lblNombreYApellidos);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 100, 358);
		getContentPane().add(menuBar);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		
		JLabel lblDatosPersonales = new JLabel("Datos Personales: ");
		lblDatosPersonales.setFont(new Font("Microsoft JhengHei", Font.BOLD, 24));
		lblDatosPersonales.setBounds(122, 42, 251, 51);
		getContentPane().add(lblDatosPersonales);
		
	}
}
