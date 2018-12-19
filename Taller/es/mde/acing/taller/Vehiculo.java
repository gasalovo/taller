package es.mde.acing.taller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Vehiculo implements Reparable {
	
	private String matricula;
	private String color;
	private String modelo;
	private int estimacionHoras;
	private int coste;
	private ArrayList<Averia> averias;
	private LocalDateTime fechaEntrada;


	public void setAveria(ArrayList<Averia> averias) {
		for (Averia averia: averias) {
			System.out.println(averia);
			this.averias.add(averia);
		}
	}
	
	public ArrayList<Averia> getAverias(){
		return this.averias;
	}
	
	public Vehiculo(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.averias = new ArrayList<>();
	}

	@Override
	public int diagnosticar() {
		int estimacionHoras = 0;
		int coste = 0;
		System.out.println(estaAveriado());
		if (estaAveriado()) {
			for (Averia item: getAverias()) {
				estimacionHoras += item.getHoras();
				coste += item.getCoste();
			}
			
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		setFechaEntrada(now);
	
		setEstimacionHoras(estimacionHoras);
		setCoste(coste);	
			
		} else {
			return 0; //no esta averiado
		}
			
		return estimacionHoras;
	}
	
	private void setFechaEntrada(LocalDateTime now) {
		this.fechaEntrada = now;
		
	}

	private void setCoste(int coste) {
		this.coste = coste;
	}

	private void setEstimacionHoras(int estimacionHoras) {
		this.estimacionHoras = estimacionHoras;
	}

	@Override
	public boolean estaAveriado() {
		return !getAverias().isEmpty();
	}

	@Override
	public LocalDateTime getTiempoReparacion() {
		return fechaEntrada;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", averias=" + averias
				+ "]";
	}
	
	
	
}
