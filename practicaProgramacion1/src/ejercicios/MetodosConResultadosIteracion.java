package ejercicios;

import java.util.Scanner;

public class MetodosConResultadosIteracion {

	/*Ejercicios 10 y11
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el número hasta cual realizar la suma: ");
		int numero = teclado.nextInt();
		
		System.out.println("El resultado de la suma es: " + sumatoria(numero));
		
		System.out.println("El resultado de la suma de números pares es: " + sumatoriaPares(numero));
		
	}
	
	public static int sumatoria(int n) {
		
		int acumulador = 0;
		
		for (int i = 0; i <= n; i++) {
			
			acumulador = acumulador + i;
			
		}
		
		return acumulador;
	}
	
	public static int sumatoriaPares(int n) {
		
		int acumuladorPares = 0;
		
		for (int i = 0; i <= n; i++) {
			
			if (i % 2 == 0) {
				
				acumuladorPares = acumuladorPares + i;
				
			}
			
		}
		
		return acumuladorPares;
	}
	
	*/
	
	/*Ejercicio 12
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el número racional cualquiera para la base: ");
		double x = teclado.nextDouble();
		System.out.println("Ingresar un número entero cualquiera para el exponente: ");
		int a = teclado.nextInt();

		System.out.println("El resultado de la potencia es: "+ potencia(x, a));
		
	}	
	
	public static double potencia(double x, int a) {
		
		double resultado = Math.pow(x, a);
		
		return resultado;
	}
	
	*/
	
	/*Ejercicio 13
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);	
		System.out.println("Ingrese un número para calcular el factorial: ");
		int n = teclado.nextInt();
		
		System.out.println("El factorial de " + n + " es: " + factorial(n));
		
	}
	
	public static double factorial(int n) {
		
		int resultado = 0;
		
		for (int i = 0; i <= n; i++) {
			
			if (i == 0) {
				
				resultado = 1;
				
			} else {
			
			resultado = resultado * i;
			
			}
		}
		
		return resultado;
	}
	
	*/

	/*Ejercicio 14
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);	
		System.out.println("Ingrese un número para contar sus cifras: ");
		int n = teclado.nextInt();
		
		System.out.println("La cantidad de cifras del numero ingresado es: " + cantCifras(n));
		
	}
	
	public static int cantCifras(int n) {
		
		int cantidad = n;
		
		if (n > -10 && n < 10) {
			
			cantidad = 1;
			
		} else if (n < -9 && n > -100 || n > 9 && n < 100) {
			
			cantidad = 2;
			
		} else  if (n < -99 && n > -1000 || n > 99 && n < 1000) {
			
			cantidad = 3;

		} else  if (n < -999 && n > -10000 || n > 999 && n < 10000) {
			
			cantidad = 4;			
			
		} else {
			
			cantidad = 5;
			
		}
		
		return cantidad;
	}
	
	*/
	
	/*Ejercicio 15*/
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar el valor del dividendo: ");
		int n = teclado.nextInt();
		System.out.println("Ingresar el valor del divisor: ");
		int m = teclado.nextInt();
		
		System.out.println(esDivisible(n, m));
		
	}
	
	public static boolean esDivisible(int n, int m) {
		
		int dividendo = n;
		
		int divisor = m;
		
		if (n % m == 0) {
			
			return true;
			
		}
		
		return false;
	}
	
}
