package Control;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import vistas.ActividadMonitor;
import vistas.ActividadesUsuario;
import vistas.VistaInicioSesion;

public class ListenerLogin implements ActionListener {
	private VistaInicioSesion Login;
	private ActividadesUsuario ActUsr;
	private ActividadMonitor ActM;
	private BBDD bbdd;
	

	/**
	 * @param login
	 * @param usr
	 * @param actUsr
	 * @param actM
	 * @param matricula
	 * @param contrasena
	 * @param bbdd
	 */
	public ListenerLogin(VistaInicioSesion login) {
		super();
		Login = login;
		this.bbdd = new BBDD();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		matricula = Login.getNombretxt().getText();
//		Contrasena = Login.getTxtpassword().getText();
//		
//		if(Usr.iniciarSesion(matricula, Contrasena) == true){
//			if(Usr.EsMonitor(Contrasena) == true) {
//				ActM = new ActividadMonitor();
//				ActM.setVisible(true);
//				Login.dispose();
//			}else{
//				ActUsr = new ActividadesUsuario();
//					ActUsr.setVisible(true);
//					Login.dispose();
//				}
//		}else {
//			System.out.println("No existe el usuario");
//		}
		if (bbdd.usuarioAutenticado(Login.getNombretxt().getText(), Login.getTxtpassword().getText())) {
			
			Login.dispose();
				if(bbdd.EsMonitor(Login.getNombretxt().getText()) == true) {
					ActM = new ActividadMonitor();
					ActM.setVisible(true);
				}else{
					ActUsr = new ActividadesUsuario();
						ActUsr.setVisible(true);
					}
			
		}else {
			Login.getLblMensaje().setText("Datos inválidos");
		}	
	}
}
