package clases;

import java.util.Random;

public class Rezo extends Arma {

	@Override
	public void usar() {
		System.out.println("chuuuuuuuuunnnnn");
		Random rm = new Random();
		int dañoVariable = rm.nextInt(10) + 1;
		int dañoTotal = getDaño() + dañoVariable;
		if (dañoTotal > 13) {
			System.out.println("Se ha curado " + dañoTotal + " puntos");
		}
		setDaño(dañoTotal);
		System.out.println("Tipo: " + getTipo() + " Daño: " + dañoTotal);

	}

}
