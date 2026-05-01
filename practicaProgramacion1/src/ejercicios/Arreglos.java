package ejercicios;

public class Arreglos {
	
	// EJERCICIOS DEL 25 AL 29 JUNTOS 

	public static void main(String[] args) {
		
		int[] arreglo = new int[5];
		
		double[] decimales = new double[5];

		arreglo[0] = 2; 
		arreglo[1] = 2; 
		arreglo[2] = 35; 
		arreglo[3] = 47; 
		arreglo[4] = 53; 
		
		System.out.println("El valor mas alto dentro del arreglo es: " + maximo(arreglo));
		
		System.out.println("El indice del valor mas alto dentro del arreglo es: " + maximoIndice(arreglo));
		
		System.out.println("La suma de los elementos del arreglo es: " + suma(arreglo));
		
		System.out.println("¿Arreglo ordenado crecientemente? " + estaOrdenado(arreglo));
		
		decimales[0] = 1.5;
		decimales[1] = 2.5;
		decimales[2] = 3.5;
		decimales[3] = 4.5;
		decimales[4] = 5.5;
		
		System.out.println("El promedio de los valores que contiene el arreglo decimales es: " + promedio(decimales));
		
	}
	
	public static int maximo(int[] arreglo) {
		
		int max = 0;
		
		for (int i = 0; i < arreglo.length; i ++) {
			
			if (arreglo [i] >= max) {
				
				max = arreglo [i];
				
			}
			
		}
		
		return max;
	}
	
	public static int maximoIndice(int[] arreglo) {
		
		int max = 0;
		
		int maxIndice = 0;
		
		for (int i = 0; i < arreglo.length; i ++) {
			
			if (arreglo[i] >= max) {
				
				max = arreglo[i];
				
				maxIndice = i;
				
			}
			
		}
		
		return maxIndice;
	}

	public static int suma(int[] arreglo) {
		
		int sumatoria = 0;
		
		for (int i = 0; i < arreglo.length; i ++) {
			
			sumatoria = sumatoria + arreglo[i];
			
		}
		
		return sumatoria;
	}
	
	public static boolean estaOrdenado(int[] arreglo) {
		
		for (int i = 0; i < arreglo.length - 1; i++) {
			
			if (arreglo[i] >= arreglo[i+1]) {
				
				return false;
				
			}
			
		}	
		
		return true;
	}
	
	public static double promedio(double[] decimales) {
		
		double suma = 0;
		
		for (int i = 0; i < decimales.length; i ++) {
			
			suma = suma + decimales[i];
			
		}
		
		double promedio = suma / decimales.length;
		
		return promedio;
	}
	
}















