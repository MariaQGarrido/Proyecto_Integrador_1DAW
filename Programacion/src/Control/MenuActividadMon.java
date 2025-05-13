package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vistas.ActividadMonitor;
import vistas.DatosPersonalesMonitor;
import vistas.EditarActividad;

public class MenuActividadMon implements MouseListener {
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ActividadMonitor actividadMonitor  = new ActividadMonitor();
		actividadMonitor.HacerVisible();
	}

}
