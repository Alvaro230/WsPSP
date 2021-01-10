package clases;

import java.util.Scanner;

public class EntradaSalida {
	static Scanner sc;

	// Metodo para elejir el tipo de personaje
	public Personaje escogerPersonaje() {
		sc = new Scanner(System.in);
		System.out.println("Elija un Personaje: Guerrero, Mago, Curandero");
		String pe = sc.nextLine().toLowerCase();
		Personaje p = null;
		if (pe.equals("guerrero")) {
			p = new Guerrero();
		} else if (pe.equals("mago")) {
			p = new Mago();
		} else if (pe.equals("curandero")) {
			p = new Curanderos();
		} else {
			System.out.println(p + " Este no es un personaje del juego");
		}
		return p;
	}

	// Metodo para elejir el tipo de arma
	public Arma escogerArma() {
		sc = new Scanner(System.in);
		Arma a1 = null;
		System.out.println("Que arma portará?");
		String arma = sc.nextLine().toLowerCase();
		if (arma.equals("espada")) {
			a1 = new Espada();
			a1.setDaño(30);
			a1.setTipo("Bastarda");
		} else if (arma.equals("hechizo")) {
			a1 = new Hechizo();
			a1.setDaño(20);
			a1.setTipo("Fuego");
		} else if (arma.equals("arco")) {
			a1 = new Arco();
			a1.setDaño(40);
			a1.setTipo("Electrico");
		} else if (arma.equals("rezo")) {
			a1 = new Rezo();
			a1.setDaño(10);
			a1.setTipo("curaxion");
		} else {
			System.out.println(a1 + " Este no es un arma del juego");
		}
		return a1;

	}

	// Pedir datos personaje
	public void datosPersonaje(Personaje p) {
		sc = new Scanner(System.in);
		System.out.println("Que nombre tendrá?");
		String nombre = sc.nextLine();
		p.setNombre(nombre);
		System.out.println("Cuanta vida tiene?");
		int vida = sc.nextInt();
		p.setVida(vida);
		System.out.println("Cuantos puntos de atributo?");
		int atributo = sc.nextInt();
		p.setAtributo(atributo);
		Arma a1 = escogerArma();
		p.setArma(a1);

	}

	// El combate del siglo
	public void comenzarCombate(Personaje p1, Personaje boss) {
		int cont = 1;
		while (cont != 0) {
			if (cont == 1) {
				System.out.println("Empieza el combate entre " + p1.getNombre() + " con una vida de " + p1.getVida()
						+ " vs " + boss.getNombre() + " con una vida de " + boss.getVida());
				System.out.println("Round " + cont);
				System.out.println();
				p1.atacar(boss);
				System.out.println();
				boss.atacar(p1);
				cont++;
			} else {
				System.out.println();
				System.out.println("Elija nuevo arma para " + p1.getNombre());
				Arma a3 = escogerArma();
				p1.setArma(a3);
				System.out.println("Elija nuevo arma para " + boss.getNombre());
				Arma a4 = escogerArma();
				boss.setArma(a4);
				System.out.println();
				System.out.println("La vida de " + p1.getNombre() + " es: " + p1.getVida());
				System.out.println("La vida de " + boss.getNombre() + " es: " + boss.getVida());
				System.out.println("Round " + cont);
				System.out.println();
				p1.atacar(boss);
				System.out.println();
				boss.atacar(p1);
				cont++;
			}
			if (p1.getVida() <= 0) {
				System.out.println();
				System.out
						.println("El vencedor es: " + boss.getNombre() + " con " + boss.getVida() + " puntos de vida");
				cont = 0;
			} else if (boss.getVida() <= 0) {
				System.out.println();
				System.out.println("El vencedor es: " + p1.getNombre() + " con " + p1.getVida() + " puntos de vida");
				cont = 0;
			}
		}

	}

}
