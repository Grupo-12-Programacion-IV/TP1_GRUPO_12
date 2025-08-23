package ejercicio1;

public class Empleado extends Persona{
	private final int legajo;
	private String puesto;
	
	//Getters y setters
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}

	//Constructors
	public Empleado () {
		super();
		this.legajo = 0; //Provisorio para permitir compilacion, cambiar por el metodo que genere el legajo automaticamente
	}
		
}
