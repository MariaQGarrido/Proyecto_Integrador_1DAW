package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Actividad;
import vistas.ActividadMonitor;

public class EditarActividadMonitor implements ActionListener {

	ActividadMonitor vista;
	Actividad ActividadEditada;
	
	//Datos originales
	int idActividad;
	int idMonitor;
	String nombreActividad;
	String descripcionActividad;
	int usuariosMaximos;
	int usuariosInscritos;
	
	// Cambios
	String NuevoNombre;
	String NuevaDescripcion;
	int NuevosUsuariosMax;

	@Override
	public void actionPerformed(ActionEvent e) {
		idActividad = ActividadEditada.getIdActividad();
		idMonitor = ActividadEditada.getIdMonitor();
		nombreActividad = ActividadEditada.getNombreActividad();
		descripcionActividad = ActividadEditada.getDescripcionActividad();
		usuariosMaximos = ActividadEditada.getUsuariosMaximos();
		usuariosInscritos = ActividadEditada.getUsuariosInscritos();
		
		ActividadEditada = new Actividad(idActividad, idMonitor, nombreActividad, descripcionActividad, usuariosMaximos, usuariosInscritos);

	}

}
