import concrete.arvores.Laranjeira;
import concrete.arvores.Maracujazeiro;
import factory.Arvore;
import product.Fruta;

import java.util.Scanner;

public class Fazenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que fruta você gostaria de comer hoje ?");

		while (true) {
			String escolha = sc.next();
			Arvore arvore = null;

			if (escolha.equals("Laranja"))
				arvore = new Laranjeira();
			if (escolha.equals("Maracujá"))
				arvore = new Maracujazeiro();

			if (arvore != null) {
				Fruta frutos = arvore.darFrutos();
				frutos.comer();
				break;
			} else {
				System.out.println("Não temos essa fruta!");
			}
		}
	}
}