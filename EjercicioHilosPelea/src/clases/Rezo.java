package clases;

import java.util.Random;

public class Rezo extends Arma {

	@Override
	public void usar() {
		System.out.println("chuuuuuuuuunnnnn");
		Random rm = new Random();
		int da�oVariable = rm.nextInt(10) + 1;
		int da�oTotal = getDa�o() + da�oVariable;
		if (da�oTotal > 13) {
			System.out.println("Se ha curado " + da�oTotal + " puntos");
		}
		setDa�o(da�oTotal);
		System.out.println("Tipo: " + getTipo() + " Da�o: " + da�oTotal);

	}

}
