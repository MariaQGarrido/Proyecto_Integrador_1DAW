package main;

import vistas.VistaInicioSesion;

public class AppMain {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater( new Runnable() {

			@Override
			public void run() {
				VistaInicioSesion vista = new VistaInicioSesion ();
				vista.HacerVisible();
				
			}
			
		});
	}

}
