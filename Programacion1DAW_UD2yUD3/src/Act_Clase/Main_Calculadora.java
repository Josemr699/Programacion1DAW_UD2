package Act_Clase;

import java.util.Scanner;

public class Main_Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Introduce un operador: ");
		String operador = sc.next();
		
		Calculadora cal1 = new Calculadora(n1, n2, operador);
		cal1.calcularSwitch();
		cal1.calcularIfElse();
			
	}

}
