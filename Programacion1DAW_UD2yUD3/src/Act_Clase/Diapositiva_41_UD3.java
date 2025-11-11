package Act_Clase;

import java.util.Scanner;

public class Diapositiva_41_UD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do{
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
		}
		while(numero<1 || numero>10);
		System.out.println("Bucle finalizado");
	}

}
