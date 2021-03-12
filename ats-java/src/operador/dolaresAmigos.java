package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Guillermo tiene N dolares, Luis tiene la mitad de lo que posee Guillermo,
 * Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de dolares que tiene los tres
 * */

public class dolaresAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dolarGuille, dolarLuis, dolarJuan, dolarTotal;
		
		dolarGuille = pedirDolares();
		dolarLuis = dolarGuille/2;
		dolarJuan = ((dolarGuille+dolarLuis)/2);
		dolarTotal = dolarGuille+dolarJuan+dolarLuis;
		
		System.out.println("La cantidad de dolares de los 3 es: " + dolarTotal);

	}

	private static int pedirDolares() {
		// TODO Auto-generated method stub
		int dolarLocal=0;
		boolean variableValida=true;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Introduzca las horas trabajadas en la semana: ");
				dolarLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			if (dolarLocal>0) {
				variableValida=false;
			}
		} while (variableValida);
		
		return dolarLocal;
	}

}
