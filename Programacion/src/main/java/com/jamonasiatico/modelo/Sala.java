package com.jamonasiatico.modelo;

public class Sala {
	private String idSala;
	private int capacidad;
	private String tipoSala;

	/**
	 * Constructor de la clase Sala
	 * @param idSala
	 * @param capacidad
	 * @param tipoSala
	 */
	public Sala() {
		
	}

	//Getters y Setters
	/**
	 * @return the idSala 
	 */
	public String getIdSala() {
		return idSala;
	}
	/**
	 * @param idSala the idSala to set
	 */
	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @return the tipoSala
	 */
	public String getTipoSala() {
		return tipoSala;
	}
	/**
	 * @param tipoSala the tipoSala to set
	 */
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	@Override
	public String toString() {
		return idSala + ", " + capacidad + ", " + tipoSala;
	}
	
	
}