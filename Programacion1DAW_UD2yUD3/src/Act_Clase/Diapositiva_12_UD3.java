package Act_Clase;

import java.util.Scanner;

public class Diapositiva_12_UD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int num1 = sc.nextInt();
		
		String numimpar = "Es impar";
		
		if(num1 % 2 == 0) {
			System.out.println("Es par");
		}
		
		System.out.println(numimpar);

	}
	

}
