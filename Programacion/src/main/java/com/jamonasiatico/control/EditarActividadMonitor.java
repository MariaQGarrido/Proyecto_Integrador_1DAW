package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.EditarActividad;

public class EditarActividadMonitor implements ActionListener {
	private EditarActividad vista;
	private BBDD bbdd;

	/**
	 * Constructor de la clase EditarActividadMonitor
	 * @param editarActividad
	 */
	public EditarActividadMonitor(EditarActividad editarActividad) {
		this.vista = editarActividad;
		this.bbdd = new BBDD();
	}

	@Override
	/**
	 * Método que se ejecuta al pulsar el botón de editar actividad
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {

		//Lo que hacemos es recoger los datos de la vista Editarctividad y meternos en una variable para almacenarlo
		int id_actividad = Integer.parseInt(vista.getLblCambioIdentificador().getText());
		String NuevoNombre = vista.getTxtNombre().getText();
		String NuevaFecha = vista.getTxtCambioFecha().getText();
		String NuevaHora = vista.getTxtCambioHora().getText();
		int NumAlumnosMax = (int) vista.getAlumnosCambioMaximos().getValue();
		String Descripcion = vista.getTextAreaCambioDescripcion().getText();

		//Comprobamos que los datos no estén vacíos. Si no se completan todos, enseña el siguiente mensaje
		if (NuevoNombre.isEmpty() || NuevaFecha.isEmpty() || NuevaHora.isEmpty() || Descripcion.isEmpty()) {
			vista.getLblMensaje().setText("Datos insuficientes");
			return;
		} else {

			//Si no están vacíos, le asignamos a la actividad los valores de las variables
			ListenerCrearActividad.actividad.setNombreActividad(NuevoNombre);
			ListenerCrearActividad.actividad.setFechaActividad(NuevaFecha);
			ListenerCrearActividad.actividad.setHoraActividad(NuevaHora);
			ListenerCrearActividad.actividad.setUsuariosMaximos(NumAlumnosMax);
			ListenerCrearActividad.actividad.setDescripcionActividad(Descripcion);

			//Y se enseña el siguiente mensaje.
			vista.getLblMensaje().setText("Actividad editada");
			bbdd.editarActividad();
		}
	}

}
