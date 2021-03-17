package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que pase de kilos a otra unidad de masa, mostrar en menu
 * en pantalla las opciones posibles.
 * */

public class transformadorKilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float medida = pedirValor();
		
		int opcion = pedirOpcion();
		
		if (opcion == -1) {
			System.out.println("Error en la opcion");
			main(args);
		}
		
		switch (opcion) {
			case 1:
				medida *= 10;
				System.out.println("Los Hectagramos son: " + medida);
				break;
			case 2:
				medida *= 100;
				System.out.println("Los Decagramos son: " + medida);
				break;
			case 3:
				medida *= 1000;
				System.out.println("Los Gramos son: " + medida);
				break;
			case 4:
				medida *= 10000;
				System.out.println("Los Decigramos son: " + medida);
				break;
			case 5:
				medida *= 100000;
				System.out.println("Los Centigramos son: " + medida);
				break;
			case 6:
				medida *= 1000000;
				System.out.println("Los Miligramos son: " + medida);
				break;
			default:
				break;
		}
		
		

	}

	private static int pedirOpcion() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean variableValida = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor de medida: ");
			System.out.println("1 - Hectagramo");
			System.out.println("2 - Decagramo");
			System.out.println("3 - Gramo");
			System.out.println("4 - Decigramo");
			System.out.println("5 - Centigramo");
			System.out.println("6 - Miligramo");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		if (variableLocal < 7 && variableLocal > 0) {
			variableValida = true;
		}
		
		if (variableValida) {
			return variableLocal;			
		}else {
			return -1;
		}
		
	}

	private static float pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor de medida: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}
