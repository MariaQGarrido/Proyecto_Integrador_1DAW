import org.junit.Assert;
import org.junit.Test;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;

public class ClaseTestUsuario {

	@Test
	public void ComprobarInscripcion() {
		BBDD bbdd = new BBDD();
		Usuario usuario = bbdd.obtenerUsuario("123456H", "1234");
		int id_usr = usuario.getIdUsuario();

		Usuario usuarioM = bbdd.obtenerUsuario("289398I", "1234");
		int id_usrM = usuarioM.getIdUsuario();
		ListenerLogin.usuario = usuarioM;

		// Creo una nueva actividad con todos sus datos
		Actividad actividad = new Actividad();
		actividad.setDescripcionActividad("El gorro no se proporciona");
		actividad.setNombreActividad("Waterpolo");
		actividad.setFechaActividad("2025-04-12");
		actividad.setHoraActividad("9:30");
		actividad.setIdActividad(2);
		actividad.setIdMonitor(id_usrM);
		actividad.setIdSala("2");
		actividad.setUsuariosInscritos(10);
		actividad.setUsuariosMaximos(15);

		bbdd.introducirDatosActividad(actividad);
		ListenerCrearActividad.actividad = actividad;

		int id_act = actividad.getIdActividad();

		// Compruebo a ver si ya está inscrito
		bbdd.YaInscrito(id_usr, id_act);
		
		Assert.assertTrue(bbdd.YaInscrito(id_usr, id_act));
		
		// Trato de inscribir al usuario en la actividad
		bbdd.InscribirEnActividad(id_usr, id_act);

		// Elimino la actividad creada para el test
		bbdd.eliminarActividad();
	}
}
