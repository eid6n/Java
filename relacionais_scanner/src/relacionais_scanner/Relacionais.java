package relacionais_scanner;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		//atribuição de valores
		Scanner number = new Scanner(System.in);
		int escolha;
		System.out.printf("Digite um número: ");
		escolha = number.nextInt();
		
		int valor;
		System.out.printf("Digiter outro número: ");
		valor = number.nextInt();
		
		//teste lógico
		System.out.printf("O valor %d é maior que %d? %b\n", escolha, valor, escolha > valor);
		System.out.printf("O valor %d é maior ou igual a %d? %b\n", escolha, valor, escolha >= valor);
		System.out.printf("O valor %d é menor que %d? %b\n", escolha, valor, escolha < valor);
		System.out.printf("O valor %d é menor ou igual a %d? %b\n", escolha, valor, escolha <= valor);
		System.out.printf("O valor %d é igual a %d? %b\n", escolha, valor, escolha == valor);
		System.out.printf("O valor %d é diferente de %d? %b\n", escolha, valor, escolha != valor);
	}

}
