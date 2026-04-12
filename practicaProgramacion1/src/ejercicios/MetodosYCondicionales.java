package ejercicios;

import java.util.Scanner;

public class MetodosYCondicionales {

	/*Ejercicios 6 y 7
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int a = scan.nextInt();
		System.out.println("Ingrese otro número: ");
		int b = scan.nextInt();
		
		//imprimirSuma(a, b);
		
		//imprimirPromedio(a, b);

	}

	public static void imprimirSuma(int a, int b) {
		int suma = a + b;
		System.out.println("El valor de la suma es: " + suma);
	}
	
	public static void imprimirPromedio(int a, int b) {
		
		int promedio = (a + b) / 2;
		System.out.println("El promedio de los números ingresados es: " + promedio);
		
	}
	
	*/
	
	/*Ejercicio 8
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		double a = scan.nextDouble();
		System.out.println("Ingrese otro número: ");
		double b = scan.nextDouble();
		
		ponerNota(a, b);
		
	}	
	
	public static void ponerNota(double x, double y) {
		
		double promedio = (x + y) / 2;
		
		if (promedio >= 7) {
			
			System.out.println("Promocionado");
			
		} else {
			
			if (promedio < 4) {
	
				System.out.println("Debe recuperar");
	
			} else {
				
				System.out.println("Aprobado");
				
			}
			
		}
		
	}
	
	*/
	
	/*Ejercicio 9*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el día: ");
		int dia = scan.nextInt();
		System.out.println("Ingrese el mes: ");
		int mes = scan.nextInt();
		System.out.println("Ingrese el año: ");
		int anio = scan.nextInt();
		
		imprimirFecha(dia, mes, anio);
	}	
	
	public static void imprimirFecha(int dia, int mes, int anio) {
		
		if (dia > 0 && dia <= 31) {
			
			switch (mes) {
			
			case 1: System.out.println("La fecha es: " + dia + " de Enero de " + anio + ".");
			break;
			case 2: System.out.println("La fecha es: " + dia + " de Febrero de " + anio + ".");
			break;
			case 3: System.out.println("La fecha es: " + dia + " de Marzo de " + anio + ".");
			break;
			case 4: System.out.println("La fecha es: " + dia + " de Abril de " + anio + ".");
			break;
			case 5: System.out.println("La fecha es: " + dia + " de Mayo de " + anio + ".");
			break;
			case 6: System.out.println("La fecha es: " + dia + " de Junio de " + anio + ".");
			break;
			case 7: System.out.println("La fecha es: " + dia + " de Julio de " + anio + ".");
			break;
			case 8: System.out.println("La fecha es: " + dia + " de Agosto de " + anio + ".");
			break;
			case 9: System.out.println("La fecha es: " + dia + " de Septiembre de " + anio + ".");
			break;
			case 10: System.out.println("La fecha es: " + dia + " de Octubre de " + anio + ".");
			break;
			case 11: System.out.println("La fecha es: " + dia + " de Noviembre de " + anio + ".");
			break;
			case 12: System.out.println("La fecha es: " + dia + " de Diciembre de " + anio + ".");
			break;
			default: System.out.println("El mes ingresado es incorrecto.");
			}
			
		} else {
			
			System.out.println("El día ingresado es incorrecto.");
			
		}
		
	}
	
}
