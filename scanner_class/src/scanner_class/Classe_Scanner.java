package scanner_class;

import java.util.Scanner;
public class Classe_Scanner {

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		String str;
		System.out.println("Entre com o seu nome: ");
		str = escan.nextLine();
		System.out.println("Bem-Vindo " + str);
		
		System.out.println("Digite sua idade: ");
		int idade = escan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		escan.close();
	}

}
