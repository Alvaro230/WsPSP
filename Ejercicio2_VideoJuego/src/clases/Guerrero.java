package clases;

public class Guerrero extends Personaje {

	@Override
	public void atacar(Personaje p) {
		System.out.println("Soy el guerrero " + getNombre());
		if (getArma() instanceof Espada || getArma() instanceof Arco) {
			System.out.println("Al ataqueeeeeerrrrrr");
			getArma().usar();
			int daño = getArma().getDaño() + getAtributo();
			int vida_contrario = p.getVida() - daño;
			System.out.println(getNombre() + " ha hecho un daño: " + daño);
			System.out.println("La vida de " + p.getNombre() + " ahora es: " + vida_contrario);
			p.setVida(vida_contrario);

		} else if (getArma() instanceof Rezo) {
			System.out.println("Al ataqueeeeeerrrrrr");
			getArma().usar();
			int daño = getArma().getDaño();
			int vida_contrario = p.getVida() - daño;
			int vida_personaje = getVida() + daño;
			System.out.println(getNombre() + " ha hecho un daño: " + daño);
			System.out.println("La vida de " + p.getNombre() + " ahora es: " + vida_contrario);
			System.out.println("El guerrero regenera: " + daño + " puntos de vida");
			System.out.println("La vida de " + getNombre() + " ahora es " + getVida());
			p.setVida(vida_contrario);
			setVida(vida_personaje);

		} else {
			System.out.println("Al ataqueeeeeerrrrrr");
			getArma().usar();
			int daño = getArma().getDaño();
			int vida_contrario = p.getVida() - daño;
			System.out.println(getNombre() + " ha hecho un daño: " + daño);
			System.out.println("La vida de " + p.getNombre() + " ahora es: " + vida_contrario);
			p.setVida(vida_contrario);
		}
	}

}
