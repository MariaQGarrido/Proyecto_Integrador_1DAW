package modelo;

public class Actividad {
	private int idActividad;
	private int idMonitor;
	private String nombreActividad;
	private String descripcionActividad;
	private int usuariosMaximos;
	private int usuariosInscritos;
	private String fechaActividad;
	private String HoraActividad;
	private int idSala;
	private Sala sala;


	public Actividad(int idActividad2, int idActividad3, String horaActividad2, String horaActividad3, int idActividad4,
			int idActividad5, String horaActividad4, String horaActividad5,  int sala) {
	}

	public Actividad() {
	}

	/**
	 * @return the idActividad
	 */
	public int getIdActividad() {
		return idActividad;
	}

	/**
	 * @param idActividad the idActividad to set
	 */
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	/**
	 * @return the idMonitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}

	/**
	 * @param idMonitor the idMonitor to set
	 */
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}

	/**
	 * @return the nombreActividad
	 */
	public String getNombreActividad() {
		return nombreActividad;
	}

	/**
	 * @param nombreActividad the nombreActividad to set
	 */
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	/**
	 * @return the descripcionActividad
	 */
	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	/**
	 * @param descripcionActividad the descripcionActividad to set
	 */
	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

	/**
	 * @return the usuariosMaximos
	 */
	public int getUsuariosMaximos() {
		return usuariosMaximos;
	}

	/**
	 * @param usuariosMaximos the usuariosMaximos to set
	 */
	public void setUsuariosMaximos(int usuariosMaximos) {
		this.usuariosMaximos = usuariosMaximos;
	}

	/**
	 * @return the usuariosInscritos
	 */
	public int getUsuariosInscritos() {
		return usuariosInscritos;
	}

	/**
	 * @param usuariosInscritos the usuariosInscritos to set
	 */
	public void setUsuariosInscritos(int usuariosInscritos) {
		this.usuariosInscritos = usuariosInscritos;
	}

	/**
	 * @return the fechaActividad
	 */
	public String getFechaActividad() {
		return fechaActividad;
	}

	/**
	 * @param fechaActividad the fechaActividad to set
	 */
	public void setFechaActividad(String fechaActividad) {
		this.fechaActividad = fechaActividad;
	}

	/**
	 * @return the horaActividad
	 */
	public String getHoraActividad() {
		return HoraActividad;
	}

	/**
	 * @param horaActividad the horaActividad to set
	 */
	public void setHoraActividad(String horaActividad) {
		HoraActividad = horaActividad;
	}

	/**
	 * @return the idSala
	 */
	public int getIdSala() {
		return idSala;
	}

	/**
	 * @param idSala the idSala to set
	 */
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	/**
	 * @return the sala
	 */
	public Sala getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return idActividad+", "+idMonitor+", "+idSala+", "+ nombreActividad+", "+descripcionActividad+", "+usuariosMaximos+", "+ usuariosInscritos+", "+fechaActividad+", "+HoraActividad;
		
//		return "Actividad [idActividad=" + idActividad + ", idMonitor=" + idMonitor + ", nombreActividad="
//				+ nombreActividad + ", descripcionActividad=" + descripcionActividad + ", usuariosMaximos="
//				+ usuariosMaximos + ", usuariosInscritos=" + usuariosInscritos + ", fechaActividad=" + fechaActividad
//				+ ", HoraActividad=" + HoraActividad + ", idSala=" + idSala + ", sala=" + sala + "]";
	}
	
	
	
}
