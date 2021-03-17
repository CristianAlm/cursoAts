package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Programa que simule un cajero automatico con un Sinicial de 1000 dolares con las siguientes opciones:
 * 
 * Ingresar dinero a la cuenta
 * Retirar dinero de la cuenta
 * Salir
 * */

public class cajeroAutomatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cuenta = 1000;
		
		char ingresar = 'i', retirar = 'r', salir = 's';
		
		cajero(cuenta, ingresar, retirar, salir);

	}

	private static void cajero(int cuenta, char ingresar, char retirar,
			char salir) {
		// TODO Auto-generated method stub
		char local = pedirOpcion();
		
		if(local == ingresar){
			ingresarDinero(cuenta);
		}else if (local == retirar) {
			retirarDinero(cuenta);
		}else {
			System.out.println("Salir.");
		}
		
	}

	private static void retirarDinero(int cuenta) {
		// TODO Auto-generated method stub
		int retiro = cuantoRetira(cuenta);
		
		if (retiro == -1) {
			System.out.println("El retiro no es posible");
		}else {
			cuenta -= retiro;
			
			System.out.println("La cuenta tiene un saldo de: " + cuenta);			
		}
		
	}

	private static int cuantoRetira(int cuenta) {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean retiroValido = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("El retiro de su cuenta: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		if (cuenta > variableLocal) {
			retiroValido = true;
		}
		
		if (retiroValido) {
			return variableLocal;			
		}
		else {
			return -1;
		}
	}

	private static void ingresarDinero(int cuenta) {
		// TODO Auto-generated method stub
		int ingreso = cuantoIngresa();
		
		cuenta += ingreso;
		
		System.out.println("La cuenta tiene un saldo de: " + cuenta);
		
	}

	private static int cuantoIngresa() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor a su cuenta: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

	private static char pedirOpcion() {
		// TODO Auto-generated method stub
		char valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese la opcion entre i, r y s: ");
			valorLocal = entrada.readLine().charAt(0);
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}
