package Act_Clase;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {
	
	
	public static void adivinaNumero() {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int numeroAleatorio = r.nextInt(1,101);
		System.out.println("Adivina el número: ");
		int n1 = sc.nextInt();
		int numeroIntentos = 10;
		
		while (n1 != numeroAleatorio && numeroIntentos>0) {
			numeroIntentos --;
			System.out.println("Has fallado, te quedan "+numeroIntentos+" intentos, vuelve a intentarlo: ");
			if (numeroAleatorio>n1) {
				System.out.println("(Tu número es menor al aleatorio)");
			}else {
				System.out.println("(Tu número es mayor al aleatorio)");
			}
			n1 = sc.nextInt();
			
		}
		if (n1==numeroAleatorio) {
			System.out.println("¡Has acertado!");
		}else {
			System.out.println("Se te han acabado los intento y no has acertado.");
		}
		
	}
	
	public static void numerosAfortunados() {

		 Scanner sc = new Scanner(System.in);

		 System.out.print("Introduce un número entero: ");
		 int numero = sc.nextInt();
		 int suerte = 0;
		 int malaSuerte = 0;
		 int n = numero;
		 
		 while (n > 0) {
			 int digito = n % 10;   
			 n = n / 10;            
			 
			 if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				 suerte++;
			 } else {
				 malaSuerte++;
			 }
		 }
		 if (suerte > malaSuerte) {
			 System.out.println("El número " + numero + " es AFORTUNADO.");
		 } else {
			 System.out.println("El número " + numero + " NO es afortunado.");
		 }
	}
	
	public static void validaPassword() {
		Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.print("Introduce una contraseña: ");
            String contrasena = sc.nextLine();

            int mayus = 0;
            int minus = 0;
            int numeros = 0;
            int especiales = 0;

           
            for (int i = 0; i < contrasena.length(); i++) {
                String c = String.valueOf(contrasena.charAt(i));

                if (c.matches("[A-Z]")) {
                    mayus++;
                } else if (c.matches("[a-z]")) {
                    minus++;
                } else if (c.matches("[0-9]")) {
                    numeros++;
                } else if (c.matches("[@#*%&/]")) {
                    especiales++;
                }
            }

            if (contrasena.length() >= 10 && mayus >= 2 && minus >= 2 && numeros >= 2 && especiales >= 2) {
                System.out.println("CONTRASEÑA VÁLIDA");
                break; // salimos del bucle y termina el método
            } else {
                System.out.println("VUELVE A INTENTARLO");
            }
        }
	}

	
}
