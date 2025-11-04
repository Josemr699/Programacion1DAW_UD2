package Act_Clase;

import java.util.Scanner;

public class Diapositiva_7_UD3 {

	public static void main(String[] args) {
		  pedirNumero();

	}
	
	public static void pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		boolean resultado = (num1 != num2) || (num1 == 0 || num2 == 0);
		System.out.println("Resultado: " + resultado);
	}
	
}

