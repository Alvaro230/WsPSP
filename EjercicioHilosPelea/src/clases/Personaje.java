package clases;

public abstract class Personaje extends Thread {
	private String nombre;
	private int vida;
	private int atributo;
	private Arma arma;
	private Arena arena;

	public abstract void atacar(Personaje p);

	@Override
	public void run() {
		Arena.entrarFortaleza(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtributo() {
		return atributo;
	}

	public void setAtributo(int atributo) {
		this.atributo = atributo;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

}
