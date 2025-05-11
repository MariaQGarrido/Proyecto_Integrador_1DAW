package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.ActividadMonitor;
import vistas.CrearActividad;
import vistas.CrearCuenta;

public class ListenerNuevaActividad implements ActionListener {
	CrearActividad NuevAct;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NuevAct = new CrearActividad();
		
		NuevAct.HacerVisible();
	}

}
