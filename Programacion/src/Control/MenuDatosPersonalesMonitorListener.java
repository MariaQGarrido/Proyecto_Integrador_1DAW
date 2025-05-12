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
		Usuario usuario = null;
		if (actividadMonitor!=null && actividadMonitor.getUsuario()!=null) {
			usuario = actividadMonitor.getUsuario();
		}
		if (datosMon!= null && datosMon.getUsuario()!=null) {
			usuario = datosMon.getUsuario();
		}
		DatosPersonalesMonitor vista = new DatosPersonalesMonitor(usuario);
		vista.setVisible(true);
		
	}

}
