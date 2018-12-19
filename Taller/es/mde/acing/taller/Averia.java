package es.mde.acing.taller;

import java.util.Collection;

public class Averia {
	
	private int horas;
	//private int costeManoObra;
	private int costeTotal;
	private String nombre;
	Collection<Pieza> piezas;
	
	public Averia(String nombre, int horas, Collection<Pieza> piezas) {
		this.nombre = nombre;
		this.horas = horas;
		this.piezas = piezas;
	}

	public int getHoras() {
		return horas;
	}
	
	private void setCoste(int coste) {
		this.costeTotal = coste;
	}
	
	public int getCoste() {
		int coste = 0;
		for (Pieza pieza: piezas) {
			coste += pieza.getCoste();
		}
		setCoste(coste);
		return coste;
	}

	@Override
	public String toString() {
		return "Averia [nombre=" + nombre + "]";
	}
	
	

	

}
