package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vistas.ActividadMonitor;
import vistas.DatosPersonalesMonitor;

public class MenuActividadMon implements MouseListener {
	private DatosPersonalesMonitor datosPersonalesMonitor;
	
	public MenuActividadMon(DatosPersonalesMonitor datosPersonalesMonitor) {
		this.datosPersonalesMonitor = datosPersonalesMonitor;
	}

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
		ActividadMonitor actividadMonitor  = new ActividadMonitor(datosPersonalesMonitor.getUsuario());
		actividadMonitor.HacerVisible();
	}

}
