package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que calcule el cuadrado de una suma
 * 
 * (a+b)^2=a^2+2*a*b+b^2
 * */

public class cuadradoDeUnaSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float resultado, a = 0,b = 0;
		
		a = pedirValor(a);
		b = pedirValor(b);
		
		resultado = calcularTerminos(a,b);
		
		System.out.println("El cuadrado de la suma de A: " + a + " y b " + b + " es: " + resultado);

	}
	
	private static float calcularTerminos(float a, float b) {
		// TODO Auto-generated method stub
		
		float primerT = 0, segundoT = 0, tercerT = 0;
		
		primerT = a*a;
		segundoT = 2*a*b;
		tercerT = b*b;
		
		//System.out.println("El primer es: " + primerT + " el segundo es: " + segundoT + " y el tercero es: " + tercerT);
		return primerT+segundoT+tercerT;
		
	}
	private static float pedirValor(float valor) {
		// TODO Auto-generated method stub
		
		float valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			valorLocal = Float.parseFloat(entrada.readLine());
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}
