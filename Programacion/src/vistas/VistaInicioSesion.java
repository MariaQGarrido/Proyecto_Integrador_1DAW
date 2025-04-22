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

public class VistaInicioSesion extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	
	public VistaInicioSesion() {
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

		JLabel lblNewLabel = new JLabel("Nombre Usuario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(271, 137, 141, 22);
		// Esto es para alinear el texto al medio
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);

		// Texto para el nombre de usuario
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(271, 170, 141, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		// Boton Iniciar sesión
		JButton btnSesion = new JButton("Iniciar Sesión");
		btnSesion.setBackground(new Color(255, 255, 128));
		btnSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSesion.setBounds(273, 280, 139, 23);
		getContentPane().add(btnSesion);

		// Texto contraseña
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblContrasena.setBounds(271, 201, 141, 22);
		// Esto es para alinear el texto al medio
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblContrasena);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBounds(269, 234, 143, 20);
		getContentPane().add(passwordField);

		// Al pinchar en este texto te envi a otra página
		JLabel lblCrearNuevaCuenta = new JLabel("Crear Nueva Cuenta");
		lblCrearNuevaCuenta.setForeground(new Color(0, 0, 255));
		lblCrearNuevaCuenta.setBounds(271, 314, 141, 22);
		// Esto es para alinear el texto al medio
		lblCrearNuevaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblCrearNuevaCuenta);
		
		// Logotipo del equipo
		String rutaRaiz = System.getProperty("user.dir");
		Path path = Paths.get(rutaRaiz, "imagenes", "logopng.png");
		ImageIcon originalIcon = new ImageIcon(path.toString());
		Image imagenEscalada = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(imagenEscalada);
		JLabel imageLabel = new JLabel(imageIcon);
		imageLabel.setBounds(291,35,100, 100);
		getContentPane().add(imageLabel);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}
	
	public void HacerVisible(){
		setVisible(true);
	}
}
