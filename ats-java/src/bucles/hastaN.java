package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir un numero N, y mostrar todos los numeros de 1 hasta N
 * */

public class hastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numUsuario = pedirValor();
		int indice = 1;
		
		while (indice <= numUsuario) {
			System.out.print(indice + "|");
			indice++;
		}

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
