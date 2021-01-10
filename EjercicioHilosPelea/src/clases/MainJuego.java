package clases;

public class MainJuego {

	public static void main(String[] args) {

		EntradaSalida es = new EntradaSalida();
		Arena arena = new Arena();

		// Elijes personaje
		Personaje p1 = es.escogerPersonaje();
		es.datosPersonaje(p1);
		p1.setArena(arena);

		// Elijes segundo personaje
		Personaje p2 = es.escogerPersonaje();
		es.datosPersonaje(p2);
		p1.setArena(arena);

		// Elijes tercer personaje
		Personaje p3 = es.escogerPersonaje();
		es.datosPersonaje(p3);
		p1.setArena(arena);

		// Elijes boss
		Personaje boss = es.escogerPersonaje();
		es.datosPersonaje(boss);
		arena.setBoss(boss);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
