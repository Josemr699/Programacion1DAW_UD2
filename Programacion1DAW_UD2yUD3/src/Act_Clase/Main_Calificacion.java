package Act_Clase;

import java.util.Scanner;

public class Main_Calificacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nota: ");
		int nota = sc.nextInt();
		
		Calificacion cal1 = new Calificacion(nota);
		cal1.mostrarResultadoSwitch();
		cal1.mostrarResultadoIfElse();
		

	}

}
