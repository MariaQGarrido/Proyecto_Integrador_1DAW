import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;
import com.jamonasiatico.modelo.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class CrearActividadTest {

    @Test
    public void testCrearActividad() {

        BBDD bbdd = new BBDD();

        Usuario monitor = bbdd.obtenerUsuario("489343L", "1234");
        int id_usr = monitor.getIdUsuario();
        ListenerLogin.usuario = monitor;

        //Cremos una actividad con todos sus datos
        Actividad actividad = new Actividad();

        actividad.setIdMonitor(monitor.getIdUsuario());
        actividad.setIdSala("PPA1");
        actividad.setNombreActividad("Actividad de prueba");
        actividad.setDescripcionActividad("Descripción de prueba");
        actividad.setFechaActividad("2025-01-01");
        actividad.setHoraActividad("12:00");
        actividad.setUsuariosInscritos(0);
        actividad.setUsuariosMaximos(0);

        // Introducimos la actividad en la base de datos
        bbdd.introducirDatosActividad(actividad);

        // Obtenemos el ID de la actividad creada
        Integer id_actividad = bbdd.traerIdActividadePorNombre(actividad.getNombreActividad());
        
        // Comprobamos que la actividad se ha creado correctamente
        Assert.assertNotNull(id_actividad);

        bbdd.eliminarActividad(id_actividad);

    }
}
