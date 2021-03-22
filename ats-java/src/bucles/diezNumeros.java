package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir diez numeros y escribir la suma total
 * */

public class diezNumeros {
	
	public static final int HASTA = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numUsuario = 0, sumatoria = 0;
		
		pedirNumeros(numUsuario, sumatoria);
		
	}

	private static void pedirNumeros(int numUsuario, int sumatoria) {
		// TODO Auto-generated method stub
		for (int i = 0; i < HASTA; i++) {
			System.out.println("Ingrese el numero "+ (i+1) + " de 10.");
			numUsuario = pedirValor();
			sumatoria += numUsuario;
		}
		
		System.out.println("La sumatoria de los 10 numeros ingresados es: " + sumatoria);
		
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
