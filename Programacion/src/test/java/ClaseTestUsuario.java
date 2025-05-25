import org.junit.Assert;
import org.junit.Test;

import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;

public class ClaseTestUsuario {

	@Test
	public void ComprobarInscripcion() {
		BBDD bbdd = new BBDD();
		Usuario usuario = bbdd.obtenerUsuario("489343L", "1234");
		int id_usr = usuario.getIdUsuario();
		Actividad actividad = new Actividad();
		int id_act = actividad.getIdActividad();
		
		boolean resultado = bbdd.YaInscrito(id_usr, id_act);
		
		Assert.assertTrue(resultado);
		Assert.assertFalse(resultado);
		Assert.assertEquals(1, actividad.getUsuariosInscritos());
	}
}
