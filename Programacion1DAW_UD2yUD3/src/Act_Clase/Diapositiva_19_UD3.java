package Act_Clase;

import java.util.Scanner;

public class Diapositiva_19_UD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número del 0 al 99999: ");
		int num1 = sc.nextInt();
		
		if(num1>=0 && num1<=9) {
			System.out.println("Tu número tiene una cifra");
		}else if(num1>=10 && num1<=99){
			System.out.println("Tu número tiene dos cifras cifra");
		}else if(num1>=100 && num1<=999) {
			System.out.println("Tu número tiene tres cifra");
		}else if(num1>=1000 && num1<=9999){
			System.out.println("Tu número tiene cuatro cifras cifra");
		}else if(num1>=10000 && num1<=99999){
			System.out.println("Tu número tiene cinco cifras cifra");
		}
	}

}
