package Act_Clase;

import java.util.Scanner;

public class Diapositiva_20_UD3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Dime el segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Dime el tercer número: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num2>num3) {
		System.out.println("El orden es "+num1+", "+num2+", "+num3);
		} else if(num1>num3 && num3>num2) {
			System.out.println("El orden es "+num1+", "+num3+", "+num2);
			}else if(num2>num1 && num1>num3) {
				System.out.println("El orden es "+num2+", "+num1+", "+num3);
				}else if(num2>num3 && num3>num2) {
					System.out.println("El orden es "+num2+", "+num3+", "+num1);
					}else if(num3>num2 && num2>num1) {
						System.out.println("El orden es "+num3+", "+num2+", "+num1);
						}else if(num3>num1 && num1>num2) {
							System.out.println("El orden es "+num3+", "+num1+", "+num2);
							}else {
								System.out.println("Mete tres números diferentes");
							}
		
	}

}
