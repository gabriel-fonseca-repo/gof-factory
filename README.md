## Factory - Gang of four.

Exemplo de uma aplicação do padrão State para manuseamento de processos com múltiplos estados e passos.

## Implementação

1. Class abstrata Arvore, responsável pela criação de novos produtos Fruta.

```java
public abstract class Arvore {

	public abstract Fruta darFrutos();

}
```

2. Class abstrata Fruta, responsável pelas operações relacionadas a frutas.

```java
public abstract class Fruta {

	public abstract void comer();

}
```

3. Classes concretas de árvores.

```java
public class Maracujazeiro extends Arvore {
	@Override
	public Maracuja darFrutos() {
		return new Maracuja();
	}
}

public class Laranjeira extends Arvore {
	@Override
	public Laranja darFrutos() {
		return new Laranja();
	}
}
```

4. Classes concretas de frutas.

```java
public class Laranja extends Fruta {
	@Override
	public void comer() {
		System.out.println("Mas que laranja deliciosa!");
	}
}

public class Maracuja extends Fruta {
	@Override
	public void comer() {
		System.out.println("Mas que maracujá deliciosa!");
	}
}
```

5. Código para a execução.

```java
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
```

6. Execução do código:

> Console:

```java
->O que fruta você gostaria de comer hoje?
->Maçã
->Não temos essa fruta!
->Banana
->Não temos essa fruta!
->Laranja
->Mas que laranja deliciosa!

->Process finished with exit code 0
```