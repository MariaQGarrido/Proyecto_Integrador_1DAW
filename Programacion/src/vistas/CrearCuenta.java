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

import Control.ListenerCrearCuentaNueva;
import Control.ListenerCuentaNueva;

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
		lblTitulo.setBounds(10, 11, 253, 37);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 24));
		getContentPane().add(lblTitulo);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblIdentificador.setBounds(39, 59, 132, 30);
		getContentPane().add(lblIdentificador);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIdentificador.setBounds(166, 60, 165, 30);
		getContentPane().add(txtIdentificador);
		
		JLabel lblMatricula = new JLabel("Matrícula:");
		lblMatricula.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblMatricula.setBounds(360, 59, 100, 30);
		getContentPane().add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMatricula.setBounds(455, 63, 198, 30);
		getContentPane().add(txtMatricula);
		
		JLabel lbltel = new JLabel("Teléfono:");
		lbltel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lbltel.setBounds(39, 292, 92, 30);
		getContentPane().add(lbltel);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTel.setBounds(127, 296, 159, 30);
		getContentPane().add(txtTel);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCorreo.setBounds(39, 175, 78, 30);
		getContentPane().add(lblCorreo);
		
		txtCorreos = new JTextField();
		txtCorreos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCorreos.setBounds(108, 179, 247, 30);
		getContentPane().add(txtCorreos);
		
		JLabel lblNombre = new JLabel("Nombre y Apellidos:");
		lblNombre.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblNombre.setBounds(39, 120, 179, 30);
		getContentPane().add(lblNombre);
		
		txtNombreApe = new JTextField();
		txtNombreApe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombreApe.setBounds(226, 122, 222, 30);
		getContentPane().add(txtNombreApe);
		
		JLabel lblCiclos = new JLabel("Ciclos:");
		lblCiclos.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblCiclos.setBounds(39, 232, 71, 30);
		getContentPane().add(lblCiclos);
				
		JButton btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.addActionListener(new ListenerCuentaNueva() );
		btnCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCrearCuenta.setBackground(new Color(255, 255, 128));
		btnCrearCuenta.setBounds(514, 316, 139, 30);
		getContentPane().add(btnCrearCuenta);
		
		
		JComboBox<String> comboBoxCiclos = new JComboBox<String>();
		String [] ciclos = {"DAW", "DAM", "ASIR", "A3D", "TFG","EI","CI"};
		DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<String>(ciclos);
		comboBoxCiclos.setModel(modeloComboBox);
		comboBoxCiclos.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		comboBoxCiclos.setBounds(109, 232, 173, 37);
		getContentPane().add(comboBoxCiclos);
		
	}

	public void HacerVisible(){
		setVisible(true);
	}
	
	// Getters y Setters
	
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
	 * @return the txtMatricula
	 */
	public JTextField getTxtMatricula() {
		return txtMatricula;
	}

	/**
	 * @param txtMatricula the txtMatricula to set
	 */
	public void setTxtMatricula(JTextField txtMatricula) {
		this.txtMatricula = txtMatricula;
	}

	/**
	 * @return the txtTel
	 */
	public JTextField getTxtTel() {
		return txtTel;
	}

	/**
	 * @param txtTel the txtTel to set
	 */
	public void setTxtTel(JTextField txtTel) {
		this.txtTel = txtTel;
	}

	/**
	 * @return the txtCorreos
	 */
	public JTextField getTxtCorreos() {
		return txtCorreos;
	}

	/**
	 * @param txtCorreos the txtCorreos to set
	 */
	public void setTxtCorreos(JTextField txtCorreos) {
		this.txtCorreos = txtCorreos;
	}

	/**
	 * @return the txtNombreApe
	 */
	public JTextField getTxtNombreApe() {
		return txtNombreApe;
	}

	/**
	 * @param txtNombreApe the txtNombreApe to set
	 */
	public void setTxtNombreApe(JTextField txtNombreApe) {
		this.txtNombreApe = txtNombreApe;
	}

	/**
	 * @return the btnBorrar
	 */
	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	/**
	 * @param btnBorrar the btnBorrar to set
	 */
	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}

	/**
	 * @return the btnCuentaCuenta
	 */
	public JButton getBtnCuentaCuenta() {
		return btnCuentaCuenta;
	}

	/**
	 * @param btnCuentaCuenta the btnCuentaCuenta to set
	 */
	public void setBtnCuentaCuenta(JButton btnCuentaCuenta) {
		this.btnCuentaCuenta = btnCuentaCuenta;
	}
}
