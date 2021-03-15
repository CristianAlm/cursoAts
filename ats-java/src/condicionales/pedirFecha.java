package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir fecha e imprimir si es una fecha valida
 * */

public class pedirFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia = 0, mes = 0, año;
		
		dia = pedirDia();
		mes = pedirMes();
		año = pedirAño();
		
		verifyFecha(dia, mes,año);
		
	}

	private static void verifyFecha(int dia, int mes, int año) {
		// TODO Auto-generated method stub
		if(mes == 2 && dia > 0 && dia <= 28){
			System.out.println("Es febrero");
			System.out.println(dia+"/"+mes+"/"+año);
		}else if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)) {
			System.out.println("Es un mes de 30 dias");
			System.out.println(dia+"/"+mes+"/"+año);
		}else {
			System.out.println("Es un mes de 31 dias");
			System.out.println(dia+"/"+mes+"/"+año);
		}
		
	}

	private static int pedirAño() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean variableValida = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Ingrese el año: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			
			if (variableLocal >0 && variableLocal <=2021) {
				variableValida = true;
			}
		}while(variableValida == false);
		
		return variableLocal;
	}

	private static int pedirMes() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean variableValida = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Ingrese el mes: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			
			if (variableLocal >=1 && variableLocal <=12) {
				variableValida = true;
			}
		}while(variableValida == false);
		
		return variableLocal;
	}

	private static int pedirDia() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		boolean variableValida = false;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Ingrese el dia: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			
			if (variableLocal >=0 && variableLocal <=31) {
				variableValida = true;
			}
		}while(variableValida == false);
		
		return variableLocal;
	}
	

}
