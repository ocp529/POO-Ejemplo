import banco.CuentaBancaria;
import persona.Conductor;
import persona.Pasajero;
import vehiculo.Avion;
import vehiculo.Coche;
import vehiculo.Moto;

public class Main {

	public static void main(String[] args) {
		Conductor conductor = new Conductor("Lucia", 30, "B1234XYZ");
		Pasajero pasajero = new Pasajero ("Carlos", 25);
		
		Coche coche = new Coche("Toyota");
		Moto moto = new Moto("Honda");
		Avion avion = new Avion("Boeing");
		
		conductor.saludar();
		conductor.conducir();
		pasajero.saludar();
		pasajero.viajar();
		
		coche.arrancar();
		coche.frenar();
		moto.arrancar();
		avion.arrancar();
		avion.volar();
		
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(1000);
		System.out.println("Saldo actual $" + cuenta.getSaldo());
	}

}
