package clases;

import java.util.Random;

public class Espada extends Arma {

	@Override
	public void usar() {
		System.out.println("Swannnggggg");
		Random rm = new Random();
		int da�oVariable = rm.nextInt(10) + 1;
		int da�oTotal = getDa�o() + da�oVariable;
		//golpe critico cuando el da�o es mayor de ciertos puntos
		if (da�oTotal > 36) {
			System.out.println("Golpe Critico");
		}
		setDa�o(da�oTotal);
		System.out.println("Tipo: " + getTipo() + " Da�o: " + da�oTotal);

	}

}
