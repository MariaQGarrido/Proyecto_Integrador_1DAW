package modelo;

public class Sala {
	private int idSala;
	private int capacidad;
	private String tipoSala;
		
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
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		capacidad = capacidad;
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