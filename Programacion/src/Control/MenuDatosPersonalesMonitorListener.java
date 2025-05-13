package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Usuario;
import vistas.ActividadMonitor;
import vistas.DatosPersonalesMonitor;
import vistas.DatosPersonalesUsuario;

public class MenuDatosPersonalesMonitorListener implements MouseListener {
	private DatosPersonalesMonitor datosMon;	
	private ActividadMonitor actividadMonitor;	
	
	/**
	 * @param datosMon
	 */
	public MenuDatosPersonalesMonitorListener(DatosPersonalesMonitor datosMon) {
		this.datosMon = datosMon;
	}

	public MenuDatosPersonalesMonitorListener(ActividadMonitor actividadMonitor) {
		this.actividadMonitor = actividadMonitor;
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
		DatosPersonalesMonitor vista = new DatosPersonalesMonitor();
		vista.setVisible(true);
		
	}

}
