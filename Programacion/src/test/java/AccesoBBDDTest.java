/**
 * 
 */

import org.junit.Assert;
import org.junit.Test;

import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;

/**
 * 
 */
public class AccesoBBDDTest {

	@Test
	public void deberiaInicirSesion() {
		BBDD bbdd = new BBDD();
		Usuario usuario = bbdd.obtenerUsuario("489343L", "1234");
		Assert.assertNotEquals(usuario, null);
		
	}
	

}
