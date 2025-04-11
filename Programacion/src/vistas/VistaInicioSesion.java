package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class VistaInicioSesion extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	
	public VistaInicioSesion() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(140, 218, 255));

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

		JLabel lblNewLabel = new JLabel("Nombre Usuario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(271, 73, 141, 22);
		// Esto es para alinear el texto al medio
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);

		// Texto para el nombre de usuario
		textField = new JTextField();
		textField.setBounds(273, 103, 141, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		// Boton Iniciar sesión
		JButton btnSesion = new JButton("Iniciar Sesión");
		btnSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSesion.setBounds(273, 240, 139, 23);
		getContentPane().add(btnSesion);

		// Texto contraseña
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblContrasena.setBounds(273, 141, 141, 22);
		// Esto es para alinear el texto al medio
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblContrasena);

		passwordField = new JPasswordField();
		passwordField.setBounds(271, 174, 143, 20);
		getContentPane().add(passwordField);

		// Al pinchar en este texto te envi a otra página
		JLabel lblCrearNuevaCuenta = new JLabel("Crear Nueva Cuenta");
		lblCrearNuevaCuenta.setForeground(new Color(0, 0, 255));
		lblCrearNuevaCuenta.setBounds(271, 303, 141, 22);
		// Esto es para alinear el texto al medio
		lblCrearNuevaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblCrearNuevaCuenta);

		setSize(695, 397);
		setLocationRelativeTo(null);
	}

}
