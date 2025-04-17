/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;

import javax.sound.midi.VoiceStatus;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JMenu;

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
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
				
		JLabel lblTitulo = new JLabel("sara@ejem.com");
		lblTitulo.setBounds(136, 11, 586, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("", Font.BOLD, 20));
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
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setBounds(-20, 0, 146, 105);
		getContentPane().add(mnInicio);
		
		JMenu mnDatosPersonales = new JMenu("Actividades");
		mnDatosPersonales.setBounds(-20, 125, 143, 105);
		getContentPane().add(mnDatosPersonales);
		
		JMenu mnDatosPersonales_1 = new JMenu("Datos Personales");
		mnDatosPersonales_1.setBounds(-20, 255, 159, 105);
		getContentPane().add(mnDatosPersonales_1);
		
	}
}
