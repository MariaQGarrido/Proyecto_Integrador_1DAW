package modelo;

public class Sala {
	private int idSala;
	private int Capacidad;
	private String tipoSala;
	
	public Sala(int idSala, int capacidad, String tipoSala) {
		super();
		this.idSala = idSala;
		Capacidad = capacidad;
		this.tipoSala = tipoSala;
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
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return Capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
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
}