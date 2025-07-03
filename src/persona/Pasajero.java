package persona;

public class Pasajero extends Persona{

	public Pasajero(String nombre, int edad) {
		super (nombre, edad);
	}
	
	public void viajar() {
		System.out.println(getNombre() + " esta viajando como pasajero. ");
	}
}
