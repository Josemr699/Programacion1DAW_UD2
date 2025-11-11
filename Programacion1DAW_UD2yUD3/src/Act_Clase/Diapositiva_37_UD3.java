package Act_Clase;

import java.util.Scanner;

public class Diapositiva_37_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		while(numero != 0) {
			if(numero%2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
			System.out.println("Introduce otro número");
			numero = sc.nextInt();
			
		}
		System.out.println("Bucle finalizado");
	}

}
