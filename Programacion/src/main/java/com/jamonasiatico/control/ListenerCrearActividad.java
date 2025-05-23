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

	//clases estáticas para poder ser llamadas desde cualquier clase
	public static ArrayList<Actividad> actividades= new ArrayList<Actividad>();
	public static ArrayList<Actividad> actividadesInscritas= new ArrayList<Actividad>();
	public static Actividad actividad;

	/**
	 * Constructor de la clase ListenerCrearActividad
	 * @param crearActividad
	 */
	public ListenerCrearActividad(CrearActividad crearActividad) {
		this.vista =  crearActividad;
		this.bbdd = new BBDD();
	}

	@Override
	/**
	 * Metodo que se ejecuta al pulsar el boton de crear actividad
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {

		//Cogemos los datos de la vista CrearActividad y los metemos en variables para almacenar los datos
		String cogerNombre = vista.getTxtNombre().getText();
		String cogerFecha = vista.getTxtFecha().getText();
		String cogerHora = vista.getTxtHora().getText();
		int cogerAlumnosMaximos = (int) vista.getAlumnosMaximos().getValue();
		String cogerDescripcion = vista.getTextAreaDescripcion().getText();
		String cogerIdSala = vista.getSalaBox().getSelectedItem().toString();
		
		//Comprobamos que los datos no esten vacios
		if (cogerDescripcion.isEmpty() || cogerFecha.isEmpty() || cogerHora.isEmpty() || 
				cogerNombre.isEmpty()) {
			vista.getLblMensaje().setText("Datos insuficientes");
			return;
		}else {
			vista.getLblMensaje().setText("Actividad creada");
		}

		//Creamos un objeto de la clase Actividad y le asignamos los valores de las variables
		Actividad actividad = new Actividad();
		actividad.setNombreActividad(cogerNombre);
		actividad.setFechaActividad(cogerFecha);
		actividad.setHoraActividad(cogerHora);
		actividad.setUsuariosMaximos(cogerAlumnosMaximos);
		actividad.setDescripcionActividad(cogerDescripcion);
		actividad.setIdSala(cogerIdSala);
		
		//Añadimos los datos de la actividad a la base de datos
		bbdd.introducirDatosActividad(actividad);

		new ActividadMonitor();
		
	}

	/**
	 *  Getters y Setters
	 * @return bbdd
	 */
	public BBDD getBbdd() {
		return bbdd;
	}

	public void setBbdd(BBDD bbdd) {
		this.bbdd = bbdd;
	}
	
	

}
