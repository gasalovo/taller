package es.mde.acing.taller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Taller {

	public static void main(String[] args) {
		
		Collection<Averia> averiasConocidas = new ArrayList<>();
		ArrayList<Reparable> turno = new ArrayList<>();
		
		Averia falloMotor = new Averia("motor", 80, new ArrayList<Pieza>(Arrays.asList(new Pieza("motor",3000))));
		Averia falloEmbrague = new Averia("embrague", 30, new ArrayList<Pieza>(Arrays.asList(new Pieza("embrague",500))));
		Averia falloHumos = new Averia("humos", 20, new ArrayList<Pieza>(Arrays.asList(new Pieza("catalizador",200),new Pieza("filtro",300))));
		averiasConocidas.addAll((Arrays.asList(falloMotor, falloEmbrague, falloHumos)));
		
		Vehiculo miVehiculo = new Vehiculo("2343HBC", "blanco", "Audi");
		Vehiculo miVehiculo2 = new Vehiculo("4567JHF", "negro", "Mercedes");
		Vehiculo miVehiculo3 = new Vehiculo("2332FFT", "rojo", "Seat");
		
		miVehiculo.setAveria(new ArrayList<Averia>(Arrays.asList(falloHumos)));
		miVehiculo2.setAveria(new ArrayList<Averia>(Arrays.asList(falloEmbrague)));
		miVehiculo3.setAveria(new ArrayList<Averia>(Arrays.asList(falloMotor)));
		
		turno = ingresarVehiculo(miVehiculo, turno);
		turno = ingresarVehiculo(miVehiculo2, turno);
		turno = ingresarVehiculo(miVehiculo3, turno);
		
		System.out.println(turno.toString());

	}
	
	public static ArrayList<Reparable> ingresarVehiculo(Reparable reparable, ArrayList<Reparable> turno) {
		if (reparable.diagnosticar() != 0) {
			turno.add(reparable);
		}
		return turno;

	}
}
