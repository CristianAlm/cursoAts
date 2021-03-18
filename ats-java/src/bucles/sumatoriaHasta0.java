package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Pedir numeros hasta que se ingrese 0, sumar los numeros ingresados cuando ingresen 0
 * */

public class sumatoriaHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usuario = 0, sumatoria = 0;
		
		caulcular(usuario, sumatoria);
	}

	private static void caulcular(int usuario, int sumatoria) {
		// TODO Auto-generated method stub
		
		usuario = pedirValor();
		
		while (usuario !=0) {
			sumatoria += usuario;
			usuario = pedirValor();
		}
		System.out.println("La sumatoria d elos numeros ingresados es: " + sumatoria);
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

}
