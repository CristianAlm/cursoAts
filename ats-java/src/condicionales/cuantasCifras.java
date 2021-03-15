package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
 * */

public class cuantasCifras {
	
	public static final int Min = 0;
	public static final int Max = 99999;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = pedirValor();
		
		determinarCifras(num);
		
	}

	private static void determinarCifras(int num) {
		// TODO Auto-generated method stub
		int cantCifras =1;
		if (num >= 10) {
			cantCifras++;
		}if (num >= 100) {
			cantCifras++;
		}if (num >= 1000) {
			cantCifras++;
		}if (num >= 10000) {
			cantCifras++;
		}if (num >= 100000) {
			cantCifras++;
		}
		
		System.out.println("La cantidad de cifras del numero " + num + " es: " + cantCifras);
		
	}

	private static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean variableValida = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Introduzca el valor entre 0 y 99999: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			
			if (variableLocal >=Min && variableLocal <=Max) {
				variableValida = true;
			}
		}while(variableValida == false);
		
		return variableLocal;
		
		
	}
}
