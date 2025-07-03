package vehiculo;

public class Coche extends Vehiculo {
	private Motor motor;
	
	public Coche(String marca) {
		super(marca);
		this.motor = new Motor(); 
	}
	
	@Override
	public void arrancar() {
		motor.encender();
		System.out.println("El coche " + marca + " arranca");
	}
}
