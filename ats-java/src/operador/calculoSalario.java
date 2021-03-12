package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que calcule el salario semanal de un empleado a partir de
 * sus horas semanales trabajadas y de su salario por hora 
 * */

public class calculoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empleado;
		int horasTrabajadas;
		int horaPago = 50;
		int salarioCorrespondiente;
		
		empleado = pedirNombre();
		horasTrabajadas = pedirHoras();
		
		salarioCorrespondiente = culcularPago(empleado, horasTrabajadas, horaPago);
		
		notificacion(empleado, horasTrabajadas, horaPago, salarioCorrespondiente);
		

	}

	

	private static void notificacion(String empleado, int horasTrabajadas,
			int horaPago, int salarioCorrespondiente) {
		// TODO Auto-generated method stub
		System.out.println("El pago semanal de " + empleado + " es: " + salarioCorrespondiente);
		
	}



	private static int culcularPago(String empleado, int horasTrabajadas,
			int horaPago) {
		// TODO Auto-generated method stub
		int pagoLocal =0;
		
		pagoLocal = horasTrabajadas*horaPago;
		
		return pagoLocal;
	}



	private static int pedirHoras() {
		// TODO Auto-generated method stub
		int horaLocal=0;
		boolean variableValida=true;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Introduzca las horas trabajadas en la semana: ");
				horaLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			if (horaLocal>0) {
				variableValida=false;
			}
		} while (variableValida);
		
		return horaLocal;
	}

	private static String pedirNombre() {
		// TODO Auto-generated method stub
		String nombreLocal="";
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduzca el nombre del empleado: ");
			nombreLocal= entrada.readLine();
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return nombreLocal;
	}

}
