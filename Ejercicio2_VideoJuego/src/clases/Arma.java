package clases;

public abstract class Arma {
	private String tipo;
	private int daño;

	public abstract void usar();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

}
