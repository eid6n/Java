package somando_valores;

import java.util.Scanner;
public class Somando_Valores {
	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = soma.nextInt();
		
		System.out.println("Digite um segundo valor: ");
		int valor2 = soma.nextInt();
		
		int resultado = valor1 + valor2;
		System.out.println("O resultado da soma é: " + resultado);
		
		int multiplicacao = valor1 * valor2;
		System.out.println("O valor da multiplicação é: " + multiplicacao);
		
		int divisao = valor1 / valor2;
		System.out.println("O valor da divisão é: " + divisao);
		
		int subtração = valor1 - valor2;
		System.out.println("O valor da subtração é: " + subtração);
	}
}
