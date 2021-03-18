package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir numeros hasta que se ingrese uno negativo, mostrar cuantos numeros se han ingresado
 * */

public class contadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, contador =0; 
		num = pedirValor();
		
		contar(num, contador);
		
		
	}

	private static void contar(int num, int contador) {
		// TODO Auto-generated method stub
		while (num >0) {
			contador++;
			num = pedirValor();
		}
		System.out.println("La cantidad de numeros ingresadoses: " + contador);
	}

	private static int pedirValor() {
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

}
