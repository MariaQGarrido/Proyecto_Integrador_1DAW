package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.BBDD;
import vistas.ActividadMonitor;

public class ListenerBorrar implements ActionListener {
	private BBDD bbdd = new BBDD();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		bbdd.eliminarActividad();
		
		new ActividadMonitor();
	}

}
