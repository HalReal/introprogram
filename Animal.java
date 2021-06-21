package herenciapract;

public class Animal {
	private String nombre;
	private double peso;
	private boolean TienePiernas;
	private boolean TieneOjos;
	public Animal(String nombre, double peso, boolean TienePiernas, boolean TieneOjos) {
		this.nombre = nombre;
		this.peso = peso;
		this.TienePiernas = TienePiernas;
		this.TieneOjos = TieneOjos;
	}
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	public String mostrarNombre() {
		return this.nombre;
	}
	public void comer() {
		System.out.println("¡El animal està comiendo!");
	}
	public void moverse() {
		System.out.println("¡El animal se està moviendo!");
	}
}
