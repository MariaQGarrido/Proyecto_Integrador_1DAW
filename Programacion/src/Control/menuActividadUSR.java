package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vistas.ActividadesUsuario;
import vistas.DatosPersonalesUsuario;
import vistas.InformacionActividadUsuario;
import vistas.InformacionActividadUsuarioBaja;
import vistas.InformacionActividadUsuarioInscribir;

public class menuActividadUSR implements MouseListener {
	ActividadesUsuario ActividadUsr;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ActividadUsr = new ActividadesUsuario();
		ActividadUsr.HacerVisible();
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
