package vehiculo;

public abstract class Vehiculo {
	protected String marca;

	public Vehiculo(String marca) {
		this.marca = marca;
	}
	
	public abstract void arrancar();
	
	public void frenar() {
		System.out.println("El vehiculo frena.");
	}
	
}
