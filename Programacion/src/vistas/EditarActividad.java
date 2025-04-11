package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EditarActividad extends JFrame {
	private JTextField txtIdentificador;
	private JTextField txtNombre;
	private JTextField txtNumeroSala;
	private JTextField txtNombreSala;
	private JTextField txtTipoSala;
	private JTextField txtCambioFecha;
	private JTextField txtCambioHora;
	
	public EditarActividad() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(247, 202, 136));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		// Titulo
		JLabel lblTitulo = new JLabel("Editar Actividad");
		lblTitulo.setBounds(95, 0, 349, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);

		// identificador
		JLabel lblCambioIdentificador = new JLabel("Identificador:");
		lblCambioIdentificador.setBounds(95, 48, 124, 29);
		getContentPane().add(lblCambioIdentificador);

		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(162, 52, 124, 20);
		getContentPane().add(txtIdentificador);
		txtIdentificador.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout(new GridLayout(0, 1));
		menuBar.setBounds(0, 0, 85, 358);
		getContentPane().add(menuBar);

		JMenu menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);

		JMenu mnDatosPersonales = new JMenu("Info Personal");
		menuBar.add(mnDatosPersonales);

		JLabel lblCambioDescripcion = new JLabel("Descripción:");
		lblCambioDescripcion.setBounds(95, 78, 124, 29);
		getContentPane().add(lblCambioDescripcion);

		// Descripción de la actividad
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(95, 108, 235, 123);
		getContentPane().add(scrollPaneDescripcion);

		JTextArea textAreaCambioDescripcion = new JTextArea();
		textAreaCambioDescripcion.setBackground(new Color(253, 162, 171));
		scrollPaneDescripcion.setViewportView(textAreaCambioDescripcion);

		// nombre
		JLabel lblCambioNombre = new JLabel("Nombre:");
		lblCambioNombre.setBounds(365, 48, 124, 29);
		getContentPane().add(lblCambioNombre);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(432, 52, 124, 20);
		getContentPane().add(txtNombre);

		// Descripción de la sala (tipo, numero y nombre de la sala)
		JLabel lblNumeroSala = new JLabel("Número Sala:");
		lblNumeroSala.setBounds(365, 107, 124, 29);
		getContentPane().add(lblNumeroSala);

		txtNumeroSala = new JTextField();
		txtNumeroSala.setColumns(10);
		txtNumeroSala.setBounds(432, 111, 124, 20);
		getContentPane().add(txtNumeroSala);

		JLabel lblNombreSala = new JLabel("Nombre Sala:");
		lblNombreSala.setBounds(365, 142, 124, 29);
		getContentPane().add(lblNombreSala);

		txtNombreSala = new JTextField();
		txtNombreSala.setColumns(10);
		txtNombreSala.setBounds(432, 146, 124, 20);
		getContentPane().add(txtNombreSala);

		JLabel lblTipoSala = new JLabel("Tipo Sala:");
		lblTipoSala.setBounds(365, 182, 124, 29);
		getContentPane().add(lblTipoSala);

		txtTipoSala = new JTextField();
		txtTipoSala.setColumns(10);
		txtTipoSala.setBounds(432, 186, 124, 20);
		getContentPane().add(txtTipoSala);

		// Label y spinner para el numero máximos de alumnos que hay en una actividad
		JSpinner AlumnosCambioMaximos = new JSpinner();
		AlumnosCambioMaximos.setBounds(185, 246, 101, 20);
		getContentPane().add(AlumnosCambioMaximos);

		JLabel lblCambioAlumnosMaximos = new JLabel("Alumnos Máximos:");
		lblCambioAlumnosMaximos.setBounds(95, 242, 124, 29);
		getContentPane().add(lblCambioAlumnosMaximos);

		// label y txt para añadir la fecha
		JLabel lblCambioFecha = new JLabel("Fecha Actividad:");
		lblCambioFecha.setBounds(95, 277, 124, 29);
		getContentPane().add(lblCambioFecha);

		txtCambioFecha = new JTextField();
		txtCambioFecha.setBounds(185, 282, 101, 20);
		getContentPane().add(txtCambioFecha);
		txtCambioFecha.setColumns(10);

		// label y txt para añadir la hora
		JLabel lblCambioHora = new JLabel("Hora Actividad:");
		lblCambioHora.setBounds(95, 313, 124, 29);
		getContentPane().add(lblCambioHora);

		txtCambioHora = new JTextField();
		txtCambioHora.setColumns(10);
		txtCambioHora.setBounds(185, 317, 101, 20);
		getContentPane().add(txtCambioHora);

		// Boton para crear la actividad
		JButton btnNewButton = new JButton("Editar Actividad");
		btnNewButton.setBounds(551, 318, 118, 29);
		getContentPane().add(btnNewButton);

		setSize(695, 397);
		setLocationRelativeTo(null);
	}

}
