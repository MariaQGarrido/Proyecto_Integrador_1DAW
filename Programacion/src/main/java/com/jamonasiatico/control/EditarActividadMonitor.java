package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.EditarActividad;

public class EditarActividadMonitor implements ActionListener {

	private EditarActividad vista;
	private BBDD bbdd;

	public EditarActividadMonitor(EditarActividad editarActividad) {
		// TODO Auto-generated constructor stub
		this.vista = editarActividad;
		this.bbdd = new BBDD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int id_actividad = Integer.parseInt(vista.getLblCambioIdentificador().getText());
		String NuevoNombre = vista.getTxtNombre().getText();
		String NuevaFecha = vista.getTxtCambioFecha().getText();
		String NuevaHora = vista.getTxtCambioHora().getText();
		String NuevoNumSala = vista.getTxtNumeroSala().getText();
		String NuevoTiposSala = vista.getTxtTipoSala().getText();
		int NumAlumnosMax = (int) vista.getAlumnosCambioMaximos().getValue();
		String Descripcion = vista.getTextAreaCambioDescripcion().getText();

		if (NuevoNombre.isEmpty() || NuevaFecha.isEmpty() || NuevaHora.isEmpty() || NuevoNumSala.isEmpty()
				|| NuevoTiposSala.isEmpty() || Descripcion.isEmpty()) {
			vista.getLblMensaje().setText("Datos insuficientes");
			return;
		} else {
			ListenerCrearActividad.actividad.setNombreActividad(NuevoNombre);
			ListenerCrearActividad.actividad.setFechaActividad(NuevaFecha);
			ListenerCrearActividad.actividad.setHoraActividad(NuevaHora);
			ListenerCrearActividad.actividad.setIdSala(NuevoNumSala);
			ListenerCrearActividad.actividad.getSala().setTipoSala(NuevoTiposSala);
			ListenerCrearActividad.actividad.setUsuariosMaximos(NumAlumnosMax);
			ListenerCrearActividad.actividad.setDescripcionActividad(Descripcion);

			vista.getLblMensaje().setText("Actividad editada");
			bbdd.editarActividad();
		}
	}

}
