package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import Control.ListenerCrearCuenta;
import Control.ListenerLogin;

import java.awt.SystemColor;

public class VistaInicioSesion extends JFrame {
	private JTextField Nombretxt;
	private JPasswordField txtpassword;
	private JButton btnInicioSesion;
	private JButton btnCrearCuenta;
	private ListenerLogin ListenerLI;
	
	public VistaInicioSesion() {
		componentes();
	}
	
	public void componentes() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(255, 104, 104));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		// Titulo
		JLabel lblTitulo = new JLabel("Inicio de sesión");
		lblTitulo.setBounds(0, 0, 697, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);

		JLabel lblNombre = new JLabel("Nombre Usuario");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNombre.setBounds(271, 137, 141, 22);
		// Esto es para alinear el texto al medio
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNombre);

		// Texto para el nombre de usuario
		Nombretxt = new JTextField();
		Nombretxt.setBackground(new Color(255, 255, 255));
		Nombretxt.setBounds(271, 170, 141, 20);
		getContentPane().add(Nombretxt);
		Nombretxt.setColumns(10);

		// Boton Iniciar sesión
		btnInicioSesion = new JButton("Iniciar Sesión");
		btnInicioSesion.setBackground(new Color(255, 255, 255));
		btnInicioSesion.addActionListener(ListenerLI);
		btnInicioSesion.setBounds(273, 280, 139, 23);
		getContentPane().add(btnInicioSesion);

		// Texto contraseña
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblContrasena.setBounds(271, 201, 141, 22);
		// Esto es para alinear el texto al medio
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblContrasena);

		txtpassword = new JPasswordField();
		txtpassword.setBackground(new Color(255, 255, 255));
		txtpassword.setBounds(269, 234, 143, 20);
		getContentPane().add(txtpassword);
		
		// Logotipo del equipo
		String rutaRaiz = System.getProperty("user.dir");
		Path path = Paths.get(rutaRaiz, "imagenes", "logopng.png");
		ImageIcon originalIcon = new ImageIcon(path.toString());
		Image imagenEscalada = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(imagenEscalada);
		
		btnCrearCuenta = new JButton("Crear Nueva Cuenta");
		btnCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCrearCuenta.setForeground(new Color(0, 0, 160));
		btnCrearCuenta.setBackground(new Color(255,104,104));
		btnCrearCuenta.setBorderPainted(false);
		btnCrearCuenta.addActionListener(new ListenerCrearCuenta());
		btnCrearCuenta.setBounds(271, 314, 141, 23);
		getContentPane().add(btnCrearCuenta);
		
		
		JLabel imageLabel = new JLabel(imageIcon);
		imageLabel.setBounds(291,35,100, 100);
		getContentPane().add(imageLabel);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	public void HacerVisible(){
		setVisible(true);
	}

	/**
	 * @return the nombretxt
	 */
	public JTextField getNombretxt() {
		return Nombretxt;
	}

	/**
	 * @param nombretxt the nombretxt to set
	 */
	public void setNombretxt(JTextField nombretxt) {
		Nombretxt = nombretxt;
	}

	/**
	 * @return the txtpassword
	 */
	public JPasswordField getTxtpassword() {
		return txtpassword;
	}

	/**
	 * @param txtpassword the txtpassword to set
	 */
	public void setTxtpassword(JPasswordField txtpassword) {
		this.txtpassword = txtpassword;
	}

	/**
	 * @return the btnInicioSesion
	 */
	public JButton getBtnInicioSesion() {
		return btnInicioSesion;
	}

	/**
	 * @param btnInicioSesion the btnInicioSesion to set
	 */
	public void setBtnInicioSesion(JButton btnInicioSesion) {
		this.btnInicioSesion = btnInicioSesion;
	}

	/**
	 * @return the btnCrearCuenta
	 */
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}

	/**
	 * @param btnCrearCuenta the btnCrearCuenta to set
	 */
	public void setBtnCrearCuenta(JButton btnCrearCuenta) {
		this.btnCrearCuenta = btnCrearCuenta;
	}
}
