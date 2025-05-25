import org.junit.Assert;
import org.junit.Test;

import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;

public class InscribirActividadTest {

	@Test
	public void ComprobarInscripcion() {
		BBDD bbdd = new BBDD();
		Usuario usuario = bbdd.obtenerUsuario("123456H", "1234");
		int id_usr = usuario.getIdUsuario();

		Usuario usuarioM = bbdd.obtenerUsuario("489343L", "1234");
		int id_usrM = usuarioM.getIdUsuario();
		ListenerLogin.usuario = usuarioM;

		// Creo una nueva actividad con todos sus datos
		Actividad actividad = new Actividad();
		actividad.setDescripcionActividad("La final de la liga de futbol sala");
		actividad.setNombreActividad("Futbol Sala");
		actividad.setFechaActividad("2025-10-01");
		actividad.setHoraActividad("10:30");
		actividad.setIdMonitor(id_usrM);
		actividad.setIdSala("PPA2");
		actividad.setUsuariosInscritos(0);
		actividad.setUsuariosMaximos(11);

		bbdd.introducirDatosActividad(actividad);
		Integer id_actividad = bbdd.traerIdActividadePorNombre(actividad.getNombreActividad());

		// Trato de inscribir al usuario en la actividad
		bbdd.InscribirEnActividad(id_usr, id_actividad);

		Assert.assertTrue(bbdd.YaInscrito(id_usr, id_actividad));

		// Primero dejamos la actividad
		bbdd.DarDeBajaActividad( id_actividad, id_usr);

		// Elimino la actividad creada para el test
		bbdd.eliminarActividad(id_actividad);


    }
}
