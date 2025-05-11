package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import vistas.ActividadMonitor;
import vistas.ActividadesUsuario;
import vistas.VistaInicioSesion;

public class ListenerLogin implements ActionListener {
	private VistaInicioSesion Login;
	private Usuario Usr;
	private ActividadesUsuario ActUsr;
	private ActividadMonitor ActM;
	private String nombre;
	private String Contrasena;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		nombre = Login.getNombretxt().getText();
		Contrasena = Login.getTxtpassword().getText();
		
		if(Usr.iniciarSesion(nombre, Contrasena) == true){
			if(Usr.EsMonitor(Contrasena) == true) {
				ActM = new ActividadMonitor();
				ActM.setVisible(true);
				Login.dispose();
			}else{
				ActUsr = new ActividadesUsuario();
					ActUsr.setVisible(true);
					Login.dispose();
				}
		}else {
			System.out.println("No existe el usuario");
		}
	}
}
