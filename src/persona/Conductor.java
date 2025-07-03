package persona;

public class Conductor extends Persona {

		private String licencia; 
		
		public Conductor (String nombre, int edad, String licencia) {
			super (nombre, edad);
			this.licencia = licencia;
		}
		
		public String getLicencia() {
			return licencia;
		}
		
		public void conducir() {
			System.out.println(getNombre() + " está conduciendo con licencia " + licencia);
		}
}
