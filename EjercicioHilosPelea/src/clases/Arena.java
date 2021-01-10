package clases;

public class Arena {
	private static Personaje boss;

	public static synchronized void entrarFortaleza(Personaje p) {
		EntradaSalida es = new EntradaSalida();

		es.comenzarCombate(p, boss);

	}

	public Personaje getBoss() {
		return boss;
	}

	public void setBoss(Personaje boss) {
		this.boss = boss;
	}

}
