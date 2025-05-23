package com.jamonasiatico.modelo;

public class Actividad {
	private Integer idActividad;
	private int idMonitor;
	private String nombreActividad;
	private String descripcionActividad;
	private Integer usuariosMaximos;
	private int usuariosInscritos;
	private String fechaActividad;
	private String HoraActividad;
	private String idSala;
	private Sala sala;

	/**
	 * Constructor de la clase Actividad
	 *
	 * @param idActividad
	 * @param idMonitor
	 * @param nombreActividad
	 * @param descripcionActividad
	 * @param usuariosMaximos
	 * @param usuariosInscritos
	 * @param fechaActividad
	 * @param horaActividad
	 */
	public Actividad() {
	}

	//Getters y Setters
	/**
	 * @return the idActividad
	 */
	public Integer getIdActividad() {
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
	public Integer getUsuariosMaximos() {
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
	public String getIdSala() {
		return idSala;
	}

	/**
	 * @param idSala2 the idSala to set
	 */
	public void setIdSala(String idSala2) {
		this.idSala = idSala2;
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
	/**
	 * Método toString para mostrar la información de la actividad
	 */
	public String toString() {
		return idActividad+", "+idMonitor+", "+idSala+", "+ nombreActividad+", "+descripcionActividad+", "+usuariosMaximos+", "+ usuariosInscritos+", "+fechaActividad+", "+HoraActividad;
	}
	
	
	
}
