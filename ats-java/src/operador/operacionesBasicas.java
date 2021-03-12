package operador;

import java.util.Scanner;

public class operacionesBasicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float numero1, numero2, suma, resta, division, multiplicacion, resto;
		
		System.out.print("Digite dos numero ");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		division = numero1 / numero2;
		multiplicacion = numero1 * numero2;
		resto = numero1 % numero2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La esta es: " + resta);
		System.out.println("La division es: " + division);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("El resto es: " + resto);
		
	}

}
