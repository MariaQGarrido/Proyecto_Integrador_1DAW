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
	
	public Actividad(int idActividad, int idMonitor, String nombreActividad, String descripcionActividad,
			int usuariosMaximos, int usuariosInscritos, String fechaActividad, String horaActividad) {
		super();
		this.idActividad = idActividad;
		this.idMonitor = idMonitor;
		this.nombreActividad = nombreActividad;
		this.descripcionActividad = descripcionActividad;
		this.usuariosMaximos = usuariosMaximos;
		this.usuariosInscritos = usuariosInscritos;
		this.fechaActividad = fechaActividad;
		HoraActividad = horaActividad;
	}

	public void CrearActividad() {

	}

	public void eliminarActividad() {

	}

	public void editarActividad() {

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
	
}
