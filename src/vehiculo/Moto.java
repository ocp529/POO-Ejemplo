package vehiculo;

public class Moto extends Vehiculo {
	
	public Moto(String marca) {
		super(marca);
	}

	@Override
	public void arrancar() {
		
		System.out.println("La moto "+ marca + " arranca con un sonido fuerte.");
	}
}
