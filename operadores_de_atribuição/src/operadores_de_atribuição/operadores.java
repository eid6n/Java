package operadores_de_atribuição;

public class operadores {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("Valor original: " + num);
		num += 3;
		System.out.println("Valor de num na soma: " + num);
		num *= 4;
		System.out.println("Valor de num multiplicado: " + num);
		num /= 2;
		System.out.println("Valor de num na divisão inteira: " + num);
		num %= 2;
		System.out.println("Valor de num no resto da divisão: " + num);
	}
}
