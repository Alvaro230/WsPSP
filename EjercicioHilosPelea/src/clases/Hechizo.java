package clases;

import java.util.Random;

public class Hechizo extends Arma {

	@Override
	public void usar() {
		System.out.println("Achhhhsshhshshsshsh");
		Random rm = new Random();
		int da�oVariable = rm.nextInt(10) + 1;
		int da�oTotal = getDa�o() + da�oVariable;
		if (da�oTotal > 27) {
			System.out.println("Golpe Critico");
		}
		setDa�o(da�oTotal);
		System.out.println("Tipo: " + getTipo() + " Da�o: " + da�oTotal);

	}

}
