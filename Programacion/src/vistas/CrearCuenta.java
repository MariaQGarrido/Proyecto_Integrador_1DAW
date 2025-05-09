/**
 * 
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Control.ListenerCrearCuenta;

import javax.swing.JComboBox;

/**
 * 
 */
public class CrearCuenta extends JFrame{

	private JTextField txtIdentificador;
	private JTextField txtMatricula;
	private JTextField txtTel;
	private JTextField txtCorreos;
	private JTextField txtNombreApe;
	private JButton btnBorrar;
	private JButton btnCuentaCuenta;

	
	
	public CrearCuenta() {
		getContentPane().setBackground(new Color(247, 202, 136));
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Cuenta Usuario");
		lblTitulo.setBounds(50, 25, 253, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 24));
		getContentPane().add(lblTitulo);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(60, 73, 132, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIdentificador.setBounds(187, 77, 165, 30);
		getContentPane().add(txtIdentificador);
		
		JLabel lblMatricula = new JLabel("Matrícula:");
		lblMatricula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatricula.setBounds(381, 73, 100, 30);
		getContentPane().add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMatricula.setBounds(476, 77, 198, 30);
		getContentPane().add(txtMatricula);
		
		JLabel lbltel = new JLabel("Teléfono:");
		lbltel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lbltel.setBounds(60, 312, 92, 30);
		getContentPane().add(lbltel);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTel.setBounds(148, 316, 159, 30);
		getContentPane().add(txtTel);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCorreo.setBounds(60, 189, 78, 30);
		getContentPane().add(lblCorreo);
		
		txtCorreos = new JTextField();
		txtCorreos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCorreos.setBounds(129, 193, 247, 30);
		getContentPane().add(txtCorreos);
		
		JLabel lblNombre = new JLabel("Nombre y Apellidos:");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(60, 134, 179, 30);
		getContentPane().add(lblNombre);
		
		txtNombreApe = new JTextField();
		txtNombreApe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombreApe.setBounds(249, 138, 222, 30);
		getContentPane().add(txtNombreApe);
		
		JLabel lblCiclos = new JLabel("Ciclos:");
		lblCiclos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCiclos.setBounds(60, 258, 71, 30);
		getContentPane().add(lblCiclos);
				
		JButton btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.addActionListener(new ListenerCrearCuenta(this) );
		btnCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCrearCuenta.setBackground(new Color(255, 255, 128));
		btnCrearCuenta.setBounds(514, 316, 139, 30);
		getContentPane().add(btnCrearCuenta);
		
		JComboBox<String> comboBoxCiclos = new JComboBox<String>();
		
		String [] ciclos = {"DAW", "DAM", "ASIR", "A3D", "TFG","EI","CI"};
		DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<String>(ciclos);
		comboBoxCiclos.setModel(modeloComboBox);
		comboBoxCiclos.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		comboBoxCiclos.setBounds(130, 258, 173, 37);
		getContentPane().add(comboBoxCiclos);
		
	}

	public void HacerVisible(){
		setVisible(true);
	}
}
