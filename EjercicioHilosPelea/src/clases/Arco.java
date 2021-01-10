package clases;

import java.util.Random;

public class Arco extends Arma {

	@Override
	public void usar() {
		System.out.println("chiuuuuuuu");
		Random rm = new Random();
		int dañoVariable = rm.nextInt(10) + 1;
		int dañoTotal = getDaño() + dañoVariable;
		if (dañoTotal > 46) {
			System.out.println("Golpe Critico");
		}
		setDaño(dañoTotal);
		System.out.println("Tipo: " + getTipo() + " Daño: " + dañoTotal);

	}

}
