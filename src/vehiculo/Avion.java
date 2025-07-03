package vehiculo;

public class Avion extends Vehiculo implements Volador {

	public Avion(String marca) {
		super (marca);
	}

	@Override
	public void arrancar() {
		System.out.println("El avión " + marca + " inicia mtores.");
	}
	
	@Override
	public void volar() {
		System.out.println("El avión " + marca + " está volando.");
	}
}
