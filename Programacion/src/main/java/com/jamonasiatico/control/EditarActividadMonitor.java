package com.jamonasiatico.control;

import com.jamonasiatico.modelo.Sala;
import com.jamonasiatico.vistas.ActividadMonitor;
import com.jamonasiatico.vistas.InformacionActividadMonitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jamonasiatico.modelo.Actividad;

public class EditarActividadMonitor implements ActionListener {

	ActividadMonitor vista;
	InformacionActividadMonitor vistaAnterior;
	Actividad Actividad;
	Actividad ActividadEditada;
	Sala SalaActividad;
	Sala SalaEditada;
	
	//Datos originales
	int idActividad;
	int idMonitor;
	String nombreActividad;
	String descripcionActividad;
	int usuariosMaximos;
	int usuariosInscritos;
	String fechaActividad;
	String horaActividad;
	
	// Cambios
	String NuevoNombre;
	String NuevaDescripcion;
	int NuevosUsuariosMax;
	String Nuevafecha;
	String Nuevahora;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		idActividad = Actividad.getIdActividad();
		idMonitor = Actividad.getIdMonitor();
		nombreActividad = Actividad.getNombreActividad();
		descripcionActividad = Actividad.getDescripcionActividad();
		usuariosMaximos = Actividad.getUsuariosMaximos();
		usuariosInscritos = Actividad.getUsuariosInscritos();
		
		Actividad = ActividadEditada;
		SalaActividad = SalaEditada;
		
		vistaAnterior = new InformacionActividadMonitor();
		vistaAnterior.isVisible();
		vista.dispose();
	}

}
