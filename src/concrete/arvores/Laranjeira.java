package concrete.arvores;

import concrete.frutas.Laranja;
import factory.Arvore;

public class Laranjeira extends Arvore {
	@Override
	public Laranja darFrutos() {
		return new Laranja();
	}
}
