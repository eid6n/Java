package operadores_incr_e_decr;

public class OperadoresINCReDECR {
	
	public static void main(String[] args) {
		//pós-fixo: 
		
		int num = 10;
		int result = 0;
		
		System.out.println("Valor original: " + result);
		
		result = num++; //primeiro atribui, depois incrementa
		System.out.println("Valor de num após o incremento: " + num);
		System.out.println("Valor de result após o incremento: " + result);
		
		//pré-fixo:
		
		num = 10; result = 0;
		num++; //pega o valor de num sozinho e incrementa
		result = ++num; //primeiro incrementa e depois atribui
		System.out.println("Valor de num após o incremento pós fixo: " + num);
		System.out.println("Valor de result após o incremento pós fixo: " + result);
		
	}
}
