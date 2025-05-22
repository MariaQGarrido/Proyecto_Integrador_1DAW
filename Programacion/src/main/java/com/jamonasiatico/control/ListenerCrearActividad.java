package com.jamonasiatico.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.CrearActividad;



public class ListenerCrearActividad implements ActionListener {
	private CrearActividad vista;
	private BBDD bbdd;
	public static ArrayList<Actividad> actividades= new ArrayList<Actividad>();
	public static Actividad actividad;
	
	public ListenerCrearActividad(CrearActividad crearActividad) {
		this.vista =  crearActividad;
		this.bbdd = new BBDD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// vista.get
		
		String cogerNombre = vista.getTxtNombre().getText();
		String cogerFecha = vista.getTxtFecha().getText();
		String cogerHora = vista.getTxtHora().getText();
		int cogerAlumnosMaximos = (int) vista.getAlumnosMaximos().getValue();
		String cogerDescripcion = vista.getTextAreaDescripcion().getText();
		String cogerIdSala = vista.getSalaBox().getSelectedItem().toString();
		
		
		if (cogerDescripcion.isEmpty() || cogerFecha.isEmpty() || cogerHora.isEmpty() || 
				cogerNombre.isEmpty()) {
			vista.getLblMensaje().setText("Datos insuficientes");
			return;
		}else {
			vista.getLblMensaje().setText("Actividad creada");
		}
		
		
		Actividad actividad = new Actividad();
		actividad.setNombreActividad(cogerNombre);
		actividad.setFechaActividad(cogerFecha);
		actividad.setHoraActividad(cogerHora);
		actividad.setUsuariosMaximos(cogerAlumnosMaximos);
		actividad.setDescripcionActividad(cogerDescripcion);
		actividad.setIdSala(cogerIdSala);
		
		
		bbdd.introducirDatosActividad(actividad);
	
		
		new ActividadMonitor();
		
	}

	public BBDD getBbdd() {
		return bbdd;
	}

	public void setBbdd(BBDD bbdd) {
		this.bbdd = bbdd;
	}
	
	

}
