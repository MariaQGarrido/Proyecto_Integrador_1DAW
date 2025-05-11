package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vistas.ActividadesUsuario;
import vistas.DatosPersonalesUsuario;
import vistas.InformacionActividadUsuario;
import vistas.InformacionActividadUsuarioBaja;
import vistas.InformacionActividadUsuarioInscribir;

public class menuDatosPersonalesUSR implements MouseListener {
	DatosPersonalesUsuario DatosUsr;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		DatosUsr = new DatosPersonalesUsuario();
		DatosUsr.HacerVisible();
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
}
