package Act_Clase;

import java.util.Scanner;

public class Diapositiva_43_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		do {
			System.out.println("Dime dos números: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		while(n1!=n2);
		System.out.println("Números iguales, bucle finalizado");

	}

}
