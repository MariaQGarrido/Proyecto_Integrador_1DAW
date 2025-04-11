/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * 
 */
public class CrearCuenta extends JFrame{

	private JTextField txtIdentificador;
	private JTextField txtMatricula;
	private JTextField txtTel;
	private JTextField txtCorreos;
	private JTextField txtNombreApe;
	private JTextField txtDireccion;
	private JTextField textCP;
	private JTextField txtCiudad;
	private JTextField txtProvincia;
	private JTextField txtPais;
	private JButton btnBorrar;
	private JButton btnCuenta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	
	public CrearCuenta() {
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Cuenta Usuario");
		lblTitulo.setBounds(111, 11, 586, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("", Font.BOLD, 20));
		getContentPane().add(lblTitulo);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font(" ", Font.PLAIN, 13));
		lblIdentificador.setBounds(23, 73, 100, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(111, 74, 85, 30);
		getContentPane().add(txtIdentificador);
		
		JLabel lblMatricula = new JLabel("Matrícula:");
		lblMatricula.setFont(new Font("", Font.PLAIN, 13));
		lblMatricula.setBounds(23, 114, 100, 30);
		getContentPane().add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(111, 114, 85, 30);
		getContentPane().add(txtMatricula);
		
		JLabel lbltel = new JLabel("Teléfono:");
		lbltel.setFont(new Font("", Font.PLAIN, 13));
		lbltel.setBounds(23, 151, 100, 30);
		getContentPane().add(lbltel);
		
		txtTel = new JTextField();
		txtTel.setBounds(111, 152, 85, 30);
		getContentPane().add(txtTel);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("", Font.PLAIN, 13));
		lblCorreo.setBounds(23, 189, 100, 30);
		getContentPane().add(lblCorreo);
		
		txtCorreos = new JTextField();
		txtCorreos.setBounds(111, 192, 85, 30);
		getContentPane().add(txtCorreos);
		
		JLabel lblNombre = new JLabel("Nombre y Apellidos:");
		lblNombre.setFont(new Font("", Font.PLAIN, 13));
		lblNombre.setBounds(253, 73, 155, 30);
		getContentPane().add(lblNombre);
		
		txtNombreApe = new JTextField();
		txtNombreApe.setBounds(398, 74, 100, 30);
		getContentPane().add(txtNombreApe);
		
		JLabel lbldir = new JLabel("Dirección:");
		lbldir.setFont(new Font("", Font.PLAIN, 13));
		lbldir.setBounds(253, 115, 155, 30);
		getContentPane().add(lbldir);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(398, 115, 235, 30);
		getContentPane().add(txtDireccion);
		
		JLabel lblcp = new JLabel("CP:");
		lblcp.setFont(new Font("", Font.PLAIN, 13));
		lblcp.setBounds(253, 156, 155, 30);
		getContentPane().add(lblcp);
		
		textCP = new JTextField();
		textCP.setBounds(289, 157, 100, 30);
		getContentPane().add(textCP);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("", Font.PLAIN, 13));
		lblCiudad.setBounds(398, 160, 59, 30);
		getContentPane().add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(456, 157, 100, 30);
		getContentPane().add(txtCiudad);
		
		JLabel lblProvincia = new JLabel("Provincia: ");
		lblProvincia.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblProvincia.setBounds(253, 198, 66, 30);
		getContentPane().add(lblProvincia);
		
		JLabel lblPas = new JLabel("País:");
		lblPas.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblPas.setBounds(439, 198, 59, 30);
		getContentPane().add(lblPas);
		
		txtProvincia = new JTextField();
		txtProvincia.setBounds(316, 195, 100, 30);
		getContentPane().add(txtProvincia);
		
		txtPais = new JTextField();
		txtPais.setBounds(480, 195, 100, 30);
		getContentPane().add(txtPais);
		
	}

	public void HacerVisible(){
		setVisible(true);
	}
}
