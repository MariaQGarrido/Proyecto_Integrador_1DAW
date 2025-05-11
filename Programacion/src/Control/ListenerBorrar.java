package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Actividad;
import vistas.InformacionActividadMonitor;

public class ListenerBorrar implements ActionListener {
	Actividad Act;
	int idActividad;
	int idMonitor;
	String nombreActividad;
	String descripcionActividad;
	int usuariosMaximos;
	int usuariosInscritos;
	String fechaActividad;
	String HoraActividad;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		idActividad = Act.getIdActividad();
		idMonitor = Act.getIdMonitor();
		nombreActividad = Act.getNombreActividad();
		descripcionActividad = Act.getDescripcionActividad();
		usuariosMaximos = Act.getUsuariosMaximos();
		usuariosInscritos = Act.getUsuariosInscritos();
		fechaActividad = Act.getFechaActividad();
		HoraActividad = Act.getHoraActividad();
		
		Act  = new Actividad(idActividad, idActividad, HoraActividad, HoraActividad, idActividad, idActividad, HoraActividad, 
				HoraActividad); 
		int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Confirmar", JOptionPane.YES_NO_OPTION);
		
		if(Confirmacion == JOptionPane.YES_OPTION){
			Act.eliminarActividad();
		}
	}

}
