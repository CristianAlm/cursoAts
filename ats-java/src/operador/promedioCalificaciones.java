package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que calcule e imprima la suma de tres calificaciones 

public class promedioCalificaciones {
	
	public static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 0, nota2 = 0, nota3 = 0;
		int promedio = 0;
		int sumatoria = 0;
		
		nota1 = pedirNota();
		nota2 = pedirNota();
		nota3 = pedirNota();
		
		promedio = calcularPromedio(nota1,nota2,nota3);
		sumatoria = calcularSumatoria(nota1,nota2,nota3);
		imprimirResultado(promedio, sumatoria);
		
		main(args);
		
	}

	
	private static void imprimirResultado(int promedio, int sumatoria) {
		// TODO Auto-generated method stub
		System.out.println("El promedio es: " + promedio + " y la suma es: " + sumatoria);		
	}


	private static int calcularSumatoria(int nota1, int nota2, int nota3) {
		// TODO Auto-generated method stub
		int variableLocal = 0;
				
		variableLocal += nota1;
		variableLocal += nota2;
		variableLocal += nota3;
		
		return variableLocal;
	}


	private static int calcularPromedio(int nota1, int nota2, int nota3) {
		// TODO Auto-generated method stub
		int variableLocal = 0;
		
		variableLocal += nota1;
		variableLocal += nota2;
		variableLocal += nota3;
		
		variableLocal = variableLocal/3;
		
		return variableLocal;
	}


	private static int pedirNota() {
		// TODO Auto-generated method stub
		
		int notaLocal=0;
		boolean variableValida=true;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Introduzca la nota: ");
				notaLocal=Integer.valueOf(entrada.readLine());
			} catch (Exception exc) {
				// TODO: handle exception
				System.out.println(exc);
			}
			if (notaLocal>=0&&notaLocal<=MAX) {
				variableValida=false;
			}
		} while (variableValida);
		
		return notaLocal;
	}

}
