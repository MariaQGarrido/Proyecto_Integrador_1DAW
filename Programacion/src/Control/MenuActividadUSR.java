package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Usuario;
import vistas.ActividadesUsuario;

public class MenuActividadUSR implements MouseListener {
	private ActividadesUsuario actividadUsr;
	private Usuario usuario;
	
	public MenuActividadUSR(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		actividadUsr = new ActividadesUsuario(usuario);
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
