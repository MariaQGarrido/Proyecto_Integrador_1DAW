package modelo;

import java.sql.Date;

public class OcurreEn {
	private int CodigoSala;
	private int CodigoActividad;
	private Date diaActividad;
	private String hora;
	private Sala sala;
	
	public OcurreEn(int codigoSala, int codigoActividad, Date diaActividad, String hora, Sala sala) {
		super();
		CodigoSala = codigoSala;
		CodigoActividad = codigoActividad;
		this.diaActividad = diaActividad;
		this.hora = hora;
		this.sala = sala;
	}	
	
}
