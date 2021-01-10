package clases;

public class Mago extends Personaje {

	@Override
	public void atacar(Personaje p) {
		System.out.println("Soy el mago " + getNombre());
		if (getArma() instanceof Hechizo) {
			System.out.println("Dibidivadidibu");
			getArma().usar();
			int da�o = getArma().getDa�o() + getAtributo();
			int vida_contrario = p.getVida() - da�o;
			System.out.println(getNombre() + " ha hecho un da�o: " + da�o);
			System.out.println("La vida de " + p.getNombre() + " ahora es: " + vida_contrario);
			p.setVida(vida_contrario);

		} else if (getArma() instanceof Rezo) {
			System.out.println("Dibidivadidibu");
			getArma().usar();
			int da�o = getArma().getDa�o();
			int vida_contrario = p.getVida() - da�o;
			int vida_personaje = getVida() + da�o;
			System.out.println(getNombre() + " ha hecho un da�o: " + da�o);
			System.out.println("La vida de: " + p.getNombre() + " ahora es: " + vida_contrario);
			System.out.println("El mago regenera: " + da�o + " puntos de vida");
			System.out.println("La vida de " + getNombre() + " ahora es: " + getVida());
			p.setVida(vida_contrario);
			setVida(vida_personaje);

		} else {
			System.out.println("Dibidivadidibu");
			getArma().usar();
			int da�o = getArma().getDa�o();
			int vida_contrario = p.getVida() - da�o;
			System.out.println(getNombre() + " ha hecho un da�o: " + da�o);
			System.out.println("La vida de " + p.getNombre() + " ahora es: " + vida_contrario);
			p.setVida(vida_contrario);
		}
	}
}
