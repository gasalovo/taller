package es.mde.acing.taller;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Reparable extends Comparable<Reparable> {
	
	//devuelve numero horas
	int diagnosticar();
	
	boolean estaAveriado();
	
	ArrayList<Averia> getAverias();
	
	default int compareTo(Reparable o) {
		return getTiempoReparacion().compareTo(o.getTiempoReparacion());
	}

	LocalDateTime getTiempoReparacion();

	
}
