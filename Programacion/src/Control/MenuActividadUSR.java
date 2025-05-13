package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Usuario;
import vistas.ActividadesUsuario;

public class MenuActividadUSR implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		ActividadesUsuario actividadUsr = new ActividadesUsuario();
		actividadUsr.HacerVisible();
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
