package concrete.arvores;

import concrete.frutas.Maracuja;
import factory.Arvore;

public class Maracujazeiro extends Arvore {
	@Override
	public Maracuja darFrutos() {
		return new Maracuja();
	}
}
