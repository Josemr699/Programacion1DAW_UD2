package Act_Clase;

import java.util.Scanner;

public class Diapositiva_42_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vocal;
		
		do {
			System.out.println("Dime una letra: ");
			vocal = sc.next();
		}
		while(!vocal.equalsIgnoreCase("a") &&
	          !vocal.equalsIgnoreCase("e") &&
	          !vocal.equalsIgnoreCase("i") &&
	          !vocal.equalsIgnoreCase("o") &&
	          !vocal.equalsIgnoreCase("u"));
		System.out.println("Bucle finalizado");
	}

}
