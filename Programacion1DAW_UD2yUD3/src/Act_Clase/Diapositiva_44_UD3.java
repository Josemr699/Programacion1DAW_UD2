package Act_Clase;

import java.util.Scanner;

public class Diapositiva_44_UD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros;
		int contador = 0;
		int suma = 0;
		double promedio;
		System.out.println("Introduce 10 números enteros: ");
		do {
			System.out.println("Introduce otro número, llevas "+contador+": ");
			numeros = sc.nextInt();
			contador ++;
			suma+=numeros;
		}
		while(contador<10);
		promedio = suma/contador;
		System.out.println("La suma de todo es: "+suma);
		System.out.println("El promedio de todo es: "+promedio);

	}

}
