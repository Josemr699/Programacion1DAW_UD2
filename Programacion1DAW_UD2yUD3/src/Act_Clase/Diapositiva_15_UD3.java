package Act_Clase;

import java.util.Scanner;

public class Diapositiva_15_UD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

	}

}
