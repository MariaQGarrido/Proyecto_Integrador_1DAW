package com.jamonasiatico.vistas;

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

import com.jamonasiatico.control.EditarActividadMonitor;
import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.MenuActividadMon;
import com.jamonasiatico.modelo.Usuario;

public class EditarActividad extends JFrame {
	private JTextField txtNombre;
	private JTextField txtCambioFecha;
	private JTextField txtCambioHora;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private Usuario usuario;
	private JLabel lblMensaje;
	private JTextArea textAreaCambioDescripcion;
	private JSpinner AlumnosCambioMaximos;
	private JLabel lblCambioIdentificador;

	public EditarActividad() {
		this.setUsuario(usuario);
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(247, 202, 136));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);

		// Titulo
		JLabel lblTitulo = new JLabel("Editar Actividad");
		lblTitulo.setBounds(120, 11, 349, 37);
		// cambio de color la letra
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		getContentPane().add(lblTitulo);

		// identificador
		JLabel lblIdentificador = new JLabel("Identificador: ");
		lblIdentificador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdentificador.setBounds(130, 68, 118, 29);
		getContentPane().add(lblIdentificador);
		
		lblCambioIdentificador = new JLabel(ListenerCrearActividad.actividad.getIdActividad().toString());
		lblCambioIdentificador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioIdentificador.setBounds(242, 68, 200, 29);
		getContentPane().add(lblCambioIdentificador);

		JMenuBar menuBar = new JMenuBar();
		// Poner el menú el filas
		menuBar.setLayout(new GridLayout(0, 1));
		menuBar.setBounds(0, 0, 110, 358);
		getContentPane().add(menuBar);

		menuActividad = new JMenu("Actividades");
		menuBar.add(menuActividad);
		menuActividad.addMouseListener(new MenuActividadMon(this));

		menuDatosPersonales = new JMenu("DatosPersonales");
		menuBar.add(menuDatosPersonales);
//		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesMonitorListener());

		JLabel lblCambioDescripcion = new JLabel("Descripción:");
		lblCambioDescripcion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioDescripcion.setBounds(130, 108, 124, 29);
		getContentPane().add(lblCambioDescripcion);

		// Descripción de la actividad
		JScrollPane scrollPaneDescripcion = new JScrollPane();
		scrollPaneDescripcion.setBounds(150, 148, 180, 101);
		getContentPane().add(scrollPaneDescripcion);

		textAreaCambioDescripcion = new JTextArea();
		textAreaCambioDescripcion.setBackground(new Color(255, 255, 255));
		scrollPaneDescripcion.setViewportView(textAreaCambioDescripcion);

		// nombre
		JLabel lblCambioNombre = new JLabel("Nombre:");
		lblCambioNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioNombre.setBounds(365, 119, 124, 29);
		getContentPane().add(lblCambioNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(545, 123, 124, 20);
		getContentPane().add(txtNombre);

		// Descripción de la sala (tipo, numero y nombre de la sala)
		JLabel lblNumeroSala = new JLabel("Sala:"+ListenerCrearActividad.actividad.getSala().getTipoSala());
		lblNumeroSala.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumeroSala.setBounds(365, 68, 304, 29);
		getContentPane().add(lblNumeroSala);

		// Label y spinner para el numero máximos de alumnos que hay en una actividad
		AlumnosCambioMaximos = new JSpinner();
		AlumnosCambioMaximos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AlumnosCambioMaximos.setBounds(534, 204, 139, 20);
		getContentPane().add(AlumnosCambioMaximos);

		JLabel lblCambioAlumnosMaximos = new JLabel("Alumnos Máximos:");
		lblCambioAlumnosMaximos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioAlumnosMaximos.setBounds(365, 200, 159, 29);
		getContentPane().add(lblCambioAlumnosMaximos);

		// label y txt para añadir la fecha
		JLabel lblCambioFecha = new JLabel("Fecha Actividad:");
		lblCambioFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioFecha.setBounds(365, 269, 139, 29);
		getContentPane().add(lblCambioFecha);

		txtCambioFecha = new JTextField();
		txtCambioFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCambioFecha.setBounds(570, 273, 101, 20);
		getContentPane().add(txtCambioFecha);
		txtCambioFecha.setColumns(10);

		// label y txt para añadir la hora
		JLabel lblCambioHora = new JLabel("Hora Actividad:");
		lblCambioHora.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCambioHora.setBounds(130, 274, 124, 29);
		getContentPane().add(lblCambioHora);

		txtCambioHora = new JTextField();
		txtCambioHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCambioHora.setColumns(10);
		txtCambioHora.setBounds(259, 278, 71, 20);
		getContentPane().add(txtCambioHora);

		// Boton para crear la actividad
		JButton btnEditar = new JButton("Editar Actividad");
		btnEditar.addActionListener(new EditarActividadMonitor(this));
		btnEditar.setBounds(551, 318, 118, 30);
		getContentPane().add(btnEditar);

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);

		lblMensaje = new JLabel("");
		lblMensaje.setForeground(Color.RED);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensaje.setBounds(382, 321, 159, 25);
		getContentPane().add(lblMensaje);

		setSize(695, 397);
		setLocationRelativeTo(null);
	}

	public void HacerVisible() {
		setVisible(true);
	}

	// Getters y Setters

	/**
	 * @return the txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * @param txtNombre the txtNombre to set
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * @return the txtCambioFecha
	 */
	public JTextField getTxtCambioFecha() {
		return txtCambioFecha;
	}

	/**
	 * @param txtCambioFecha the txtCambioFecha to set
	 */
	public void setTxtCambioFecha(JTextField txtCambioFecha) {
		this.txtCambioFecha = txtCambioFecha;
	}

	/**
	 * @return the txtCambioHora
	 */
	public JTextField getTxtCambioHora() {
		return txtCambioHora;
	}

	/**
	 * @param txtCambioHora the txtCambioHora to set
	 */
	public void setTxtCambioHora(JTextField txtCambioHora) {
		this.txtCambioHora = txtCambioHora;
	}

	/**
	 * @return the menuActividad
	 */
	public JMenu getMenuActividad() {
		return menuActividad;
	}

	/**
	 * @param menuActividad the menuActividad to set
	 */
	public void setMenuActividad(JMenu menuActividad) {
		this.menuActividad = menuActividad;
	}

	/**
	 * @return the menuDatosPersonales
	 */
	public JMenu getMenuDatosPersonales() {
		return menuDatosPersonales;
	}

	/**
	 * @param menuDatosPersonales the menuDatosPersonales to set
	 */
	public void setMenuDatosPersonales(JMenu menuDatosPersonales) {
		this.menuDatosPersonales = menuDatosPersonales;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the lblMensaje
	 */
	public JLabel getLblMensaje() {
		return lblMensaje;
	}

	/**
	 * @param lblMensaje the lblMensaje to set
	 */
	public void setLblMensaje(JLabel lblMensaje) {
		this.lblMensaje = lblMensaje;
	}

	/**
	 * @return the textAreaCambioDescripcion
	 */
	public JTextArea getTextAreaCambioDescripcion() {
		return textAreaCambioDescripcion;
	}

	/**
	 * @param textAreaCambioDescripcion the textAreaCambioDescripcion to set
	 */
	public void setTextAreaCambioDescripcion(JTextArea textAreaCambioDescripcion) {
		this.textAreaCambioDescripcion = textAreaCambioDescripcion;
	}

	/**
	 * @return the alumnosCambioMaximos
	 */
	public JSpinner getAlumnosCambioMaximos() {
		return AlumnosCambioMaximos;
	}

	/**
	 * @param alumnosCambioMaximos the alumnosCambioMaximos to set
	 */
	public void setAlumnosCambioMaximos(JSpinner alumnosCambioMaximos) {
		AlumnosCambioMaximos = alumnosCambioMaximos;
	}

	/**
	 * @return the lblCambioIdentificador
	 */
	public JLabel getLblCambioIdentificador() {
		return lblCambioIdentificador;
	}
}
