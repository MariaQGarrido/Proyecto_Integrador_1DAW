package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.ActividadMonitor;
import vistas.CrearActividad;
import vistas.CrearCuenta;
import vistas.VistaInicioSesion;

public class ListenerCrearActividad implements ActionListener {
	CrearCuenta vistaCerrada;
	ActividadMonitor ActMon;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

			vistaCerrada = new CrearCuenta();
			ActMon = new ActividadMonitor();
			
			vistaCerrada.dispose();
			ActMon.HacerVisible();

	}

}
