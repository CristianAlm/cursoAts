package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir numeros hasta que ingresen un numero negativo y calcular su media 
 * */

public class verMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int usuario = 0, sumatoria = 0,contador = 0, media = 0;
		
		calcularMedia(usuario, sumatoria,contador, media);

	}

	public static void calcularMedia(int usuario, int sumatoria, int contador, int media) {
		// TODO Auto-generated method stub
		usuario = pedirValor();
		
		while (usuario > 0) {
			sumatoria += usuario;
			contador++;
			usuario = pedirValor();
		}
		
		media = sumatoria/contador;
		System.out.println("La media de los numeros ingresados es: " + media);
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
