package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.CrearCuenta;
import vistas.VistaInicioSesion;

public class ListenerCrearCuentaNueva implements ActionListener {
	CrearCuenta vistaCerrada;
	VistaInicioSesion Login;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		vistaCerrada = new CrearCuenta();
		Login = new VistaInicioSesion();
		
		Login.dispose();
		vistaCerrada.HacerVisible();
	}

}
