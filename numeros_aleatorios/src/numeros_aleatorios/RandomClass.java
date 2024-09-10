package numeros_aleatorios;

import java.util.Random;
public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		float valor = aleatorio.nextFloat() * 100;
		System.out.println("Número gerado: " + valor);
	}

}
