package Act_Clase;

import java.util.Scanner;

public class Diapositiva_37_2_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			if(numero%2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
		}while(numero != 0);
		System.out.println("Bucle finalizado");

	}

}
