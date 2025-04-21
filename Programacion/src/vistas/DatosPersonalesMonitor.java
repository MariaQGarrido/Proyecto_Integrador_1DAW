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
public class DatosPersonalesMonitor extends JFrame{
	

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
		lblIdentificador.setFont(new Font(" ", Font.PLAIN, 13));
		lblIdentificador.setBounds(167, 75, 100, 30);
		getContentPane().add(lblIdentificador);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblMatrcula.setBounds(167, 116, 100, 30);
		getContentPane().add(lblMatrcula);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblCorreo.setBounds(167, 157, 100, 30);
		getContentPane().add(lblCorreo);
		
		JLabel lblNTelfono = new JLabel("Nº Teléfono");
		lblNTelfono.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNTelfono.setBounds(167, 207, 100, 30);
		getContentPane().add(lblNTelfono);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos:");
		lblNombreYApellidos.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNombreYApellidos.setBounds(340, 75, 136, 30);
		getContentPane().add(lblNombreYApellidos);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblDireccin.setBounds(340, 125, 100, 30);
		getContentPane().add(lblDireccin);
		
		JLabel lblCp = new JLabel("CP:");
		lblCp.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblCp.setBounds(340, 166, 100, 30);
		getContentPane().add(lblCp);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblCiudad.setBounds(427, 166, 100, 30);
		getContentPane().add(lblCiudad);
		
		JLabel lblProvinciaa = new JLabel("Provincia:");
		lblProvinciaa.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblProvinciaa.setBounds(340, 207, 100, 30);
		getContentPane().add(lblProvinciaa);
		
		JLabel lblPas = new JLabel("País");
		lblPas.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblPas.setBounds(456, 207, 100, 30);
		getContentPane().add(lblPas);
		
		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout (new GridLayout(0,1));
		menuBar.setBounds(0, 0, 100, 358);
		getContentPane().add(menuBar);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		
		JMenu mnDatosPersonales = new JMenu("Datos Personales");
		menuBar.add(mnDatosPersonales);
		
	}
}