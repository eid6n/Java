package operações_aritmeticas;

import java.util.Scanner;
public class aritmeticos {
	
	public static void main(String[] args) {
		int x  = 9;
		int y = 2;
		System.out.printf("x + y = %d\n", x + y);
		System.out.printf("x - y = %d\n", x - y);
		System.out.printf("x * y = %d\n", x * y);
		System.out.printf("x / y = %d\n", x / y); //divisão inteira
		System.out.printf("x / y = %2.2f\n",x  / (double)y);
		System.out.printf("x %% y = %d\n", x % y);
	}
}
