package clases;

public class MainJuego {

	public static void main(String[] args) {

		EntradaSalida es = new EntradaSalida();

		int cont = 1;

		// Elijes personaje
		Personaje p1 = es.escogerPersonaje();
		es.datosPersonaje(p1);

		// Elijes segundo personaje
		Personaje p2 = es.escogerPersonaje();
		es.datosPersonaje(p2);

		// Combate
		es.comenzarCombate(p1, p2, cont);
	}

}
