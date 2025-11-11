package Act_Clase;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva_45_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int contador = 0;
		int respuesta;
		int sumanumeros;
		
		do {
			int n1 = r.nextInt(0,101);
			int n2 = r.nextInt(0,101);
			sumanumeros = n1+n2;
			System.out.println("¿Cuanto es la suma de "+n1+" + "+n2+" ?");
			respuesta = sc.nextInt();
			if (respuesta == sumanumeros) {
				contador++;
			}
		}
		while(respuesta == sumanumeros);
		System.out.println("Has realizado "+contador+" sumas correctas.");
	}

}
