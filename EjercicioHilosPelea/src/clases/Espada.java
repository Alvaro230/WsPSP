package clases;

import java.util.Random;

public class Espada extends Arma {

	@Override
	public void usar() {
		System.out.println("Swannnggggg");
		Random rm = new Random();
		int dañoVariable = rm.nextInt(10) + 1;
		int dañoTotal = getDaño() + dañoVariable;
		//golpe critico cuando el daño es mayor de ciertos puntos
		if (dañoTotal > 36) {
			System.out.println("Golpe Critico");
		}
		setDaño(dañoTotal);
		System.out.println("Tipo: " + getTipo() + " Daño: " + dañoTotal);

	}

}
