package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.ActividadMonitor;
import vistas.InformacionActividadMonitor;

public class ListenerEditar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ActividadMonitor.HacerVisible();
	}

}
