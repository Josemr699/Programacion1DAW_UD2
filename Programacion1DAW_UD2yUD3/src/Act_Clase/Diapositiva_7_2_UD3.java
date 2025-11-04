package Act_Clase;

import java.util.Scanner;

public class Diapositiva_7_2_UD3 {

	public static void main(String[] args) {
		numeroMultiplo();

	}
	
	public static void numeroMultiplo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		boolean esMultiplo = (num2 != 0) && (num1 % num2 == 0);
		System.out.println("¿Es múltiplo?: " + esMultiplo);
		}

}
