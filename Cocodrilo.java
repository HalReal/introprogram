package herenciapract;

public class Cocodrilo extends Animal{
	private boolean TieneCola;
	private boolean TieneOrejas;
	public Cocodrilo(String nombre, double peso, boolean TienePiernas, boolean TieneOjos, boolean TieneCola, boolean TieneOrejas) {
		super(nombre, peso, TienePiernas, TieneOjos);
		this.TieneCola = TieneCola;
		this.TieneOrejas = TieneOrejas;
	}
	public void masticar() {
		System.out.println("El cocodrilo està masticando!");
	}
	public void comer() {
		System.out.println("El cocodrilo està comiendo");
	}
}
