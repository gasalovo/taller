package es.mde.acing.taller;

import java.util.Collection;
import java.util.Date;

public class Reparaciones {
	Mecanico mecanico;
	Collection<Averia> averias;
	Reparable vehiculo;
	Date fechaEntrega;
	
	public Mecanico getMecanico() {
		return mecanico;
	}
	
	public Reparaciones(Mecanico mecanico, Reparable vehiculo) {
		this.mecanico = mecanico;
		this.vehiculo = vehiculo;
		averias = vehiculo.getAverias();
		
	}
	
}
