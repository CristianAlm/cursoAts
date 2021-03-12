package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que haga un 20% de descuento en compras mayores a 300
 * */

public class descuento {
	
	public static final int HASTA = 300; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = pedirValor();
		int pago;
		
		if (valor > HASTA) {
			pago = (int) ((valor) * 0.8);
			System.out.println("Tiene que pagar " + pago);
		} else {
			System.out.println("Tiene que pagar " + valor);
		}
		
		main(args);

	}

	private static int pedirValor() {
		// TODO Auto-generated method stub
		int valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			valorLocal = Integer.valueOf(entrada.readLine());
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}
