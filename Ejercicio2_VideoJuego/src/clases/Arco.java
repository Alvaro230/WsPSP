package clases;

import java.util.Random;

public class Arco extends Arma {

	@Override
	public void usar() {
		System.out.println("chiuuuuuuu");
		Random rm = new Random();
		int da�oVariable = rm.nextInt(10) + 1;
		int da�oTotal = getDa�o() + da�oVariable;
		if (da�oTotal > 46) {
			System.out.println("Golpe Critico");
		}
		setDa�o(da�oTotal);
		System.out.println("Tipo: " + getTipo() + " Da�o: " + da�oTotal);

	}

}
