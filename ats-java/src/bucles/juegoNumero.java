package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que adivinar un numero
 * 
 * Generar un numero de 0 a 100, y luego ir pidiendo numeros
 * indicando si es mayor o menor con respecto a N.
 * 
 * Terminar el programa cuando se acierte el numero y mostrar cuantos numeros se ingrso
 * */

public class juegoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, usuario = 0, contador =0; 
		num = generarValor();
		
		System.out.println(num);
		
		adivinar(num, usuario, contador);

	}

	public static void adivinar(int num, int usuario, int contador) {
		// TODO Auto-generated method stub
		
		usuario = pedirValor();
		boolean acierto = false;
		
		while (!acierto) {
			if (num == usuario) {
				acierto = true;
			}else if (usuario > num) {
				System.out.println("El numero ingresado es mayor");
				usuario = pedirValor();
			}else if (usuario < num) {
				System.out.println("El numero ingresado es menor");
				usuario = pedirValor();
			}
			else {
				System.out.println("Hay un error");
			}
			contador++;
		}
		System.out.println("La cantidad de numeros ingresados es: " + contador);
	}

	public static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

	public static int generarValor() {
		// TODO Auto-generated method stub
		
		int numAleatorio=(int)Math.floor(Math.random()*(100-0)+0);
		
		return numAleatorio;
	}

}
