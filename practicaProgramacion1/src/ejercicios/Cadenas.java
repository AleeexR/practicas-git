package ejercicios;

import java.util.Scanner;

public class Cadenas {

	/*Ejercicio 16
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena: ");
		String cadena = scan.nextLine();
		
		imprimirReversa(reversa(cadena));
		
	}

	public static void imprimirReversa(String cadReversa) {
		
		System.out.println(cadReversa);		
		
	}
	
	public static String reversa(String cadena) {
		
		String cadReversa = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			
			cadReversa = cadReversa + cadena.charAt(i);
			
		}
		
		return cadReversa;
	}
	
	*/
	
	/*Ejercicio 17 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena: ");
		String cadena = scan.nextLine();
		System.out.println("Ingrese una letra: ");
		String letra = scan.nextLine();	
		
		System.out.println("La cantidad de veces que aparece la letra '" + letra.charAt(0) + "' es: " + cantidadApariciones(cadena, letra.charAt(0)));
		
	}	
	
	*/
	
	/*
	
	public static int cantidadApariciones(String s, char c) {
		
		int contador = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == c) {
				
				contador += 1;
				
			}
			
		}
		
		return contador;
	}
	
	*/
	
	/*Ejercicio 18
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena: ");
		String cadena = scan.nextLine();

		System.out.println("La cantidad de vocales que aparecen en la cadena son: " + cantidadVocales(cadena));
		
	}
	
	public static int cantidadVocales(String s) {
		
		String vocales = "aeiou";
		
		int contador = 0;
		
		for (int i = 0; i < vocales.length(); i++) {
			
			contador = contador + cantidadApariciones(s, vocales.charAt(i));
			
		}
		
		return contador; 
	}
	
	*/
	
	/*Ejercicio 19
	
	public static void main(String[] args) {
		
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(esAbecedaria(abc));
		
	}
	
	public static boolean esAbecedaria(String s) {
		
		String abc = s;

		for (int i = 0; i < abc.length() - 1; i++) {
			
			char letra = abc.charAt(i);
			
			if (contadorLetrasRepetidas(abc, letra) > 1) {
				
				return false;
				
			}
			
			if (abc.charAt(i) > abc.charAt(i+1)) {
				
				return false;
				
			}
			
		}			
		
		return true;
	}
	
	public static int contadorLetrasRepetidas(String cadena, char letra) {
		
		int cantidad = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) == letra) {
				
				cantidad += 1;
					
				}
				
			}
		
		if (letra == 'r' && cantidad == 2) {
		
			return cantidad = 0;
			
		}
		
		if (letra == 'l' && cantidad == 2) {
			
			return cantidad = 0;
			
		}
		
		return cantidad;
	}

	*/
	
	/*Ejercicio 20
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar una paralabra para verificar si es capicua: ");
		String palabra = scan.next();
		System.out.println(esCapicua(palabra));
		
	}
	
	public static boolean esCapicua(String s) {
		
		String palabraInvertida = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			
			palabraInvertida = palabraInvertida + s.charAt(i);
			
		}
		
		if (s.equals(palabraInvertida)) {
			
			return true;
		}
		
		return false;
	}
	
	*/
	
	/*Ejercicio 21
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar una paralabra para verificar si es sin letras repetidas: ");
		String palabra = scan.next();
		System.out.println(esSinRepetidos(palabra));
		
	}

	public static boolean esSinRepetidos(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			
			int cont = 0;
			
			for(int j = 0; j < s.length(); j++) {
				
				if (s.charAt(i) == s.charAt(j)) {
					
					cont = cont + 1;
					
				}
				
			}
			
			if (cont > 1) {
				
				return false;
				
			}
			
		}
		
		return true;
	}
	
	*/
	
	/* Ejercicio 22
	
	public static void main(String[] args) {
		
		String cadena = "casos";
		System.out.println(sinRepetidos(cadena));
	}
	
	public static String sinRepetidos(String s) {
		
		String nvaCadena = "";
		
		int cont = 0;
		
		for (int i = 0; i < s.length(); i++){
			
			if (!tieneRepetidos(s, s.charAt(i))) {
				
				nvaCadena = nvaCadena + s.charAt(i);
				
			} else {
				
				cont += 1;
				
			}
			
			// PARA EVITAR ESCRIBIR LA SEGUNDA LETRA REPETIDA
			
			if (cont == 1 && !tieneRepetidos(nvaCadena + s.charAt(i), s.charAt(i))) {
				
				nvaCadena = nvaCadena + s.charAt(i);
				
				cont = 0;
				
			}

			
			
/*			// PARA EVITAR ESCRIBIR LA PRIMERA LETRA REPETIDA
			
			if (cont == 2 && !tieneRepetidos(nvaCadena, s.charAt(i))) {
				
				nvaCadena = nvaCadena + s.charAt(i);
				
				cont = 0;
				
			}
		
*/			

/*	
	
		}	
		
		return nvaCadena;
	}
	
	public static boolean tieneRepetidos(String palabra, char letra) {
		
		int cont = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			
			if (palabra.charAt(i) == letra) {
				
				cont = cont + 1;
				
			}
			
		}
		
		if (cont > 1) {
			
			return true;
			
		}
		
		return false;
	}
	
	*/
	
	/* Ejercicio 23
	
	public static void main(String[] args) {
		
		String a = "JUGO";
		String b = "BUENO";
		String c = "ANANA";
		
		System.out.println(puedenColocarse(a, b, c));

		
	}
	
	public static boolean puedenColocarse(String a, String b, String c) {

		if (b.length() < 3) {
			
			return false;
			
		}

		if (!(coincideAlMenosUna(b, a) && coincideAlMenosUna(b, c))) {
			
			return false;
			
		}
			
		if (posicionQueCoinciden(b, a) + 1 == posicionQueCoinciden(b, c) || posicionQueCoinciden(b, a) >= posicionQueCoinciden(b, c)) {
				
			return false;
			
		}
		
		return true;
	}
	
	public static boolean coincideAlMenosUna(String s, String z) {
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j < z.length(); j++) {
				
				if (s.charAt(i) == z.charAt(j)) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
	}
	
	public static int posicionQueCoinciden(String s, String z) {
		
		int posicion = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j < z.length(); j++) {
				
				if (s.charAt(i) == z.charAt(j)) {
					
					posicion = s.indexOf(s.charAt(i));
					
					return posicion;
					
				}
				
			}
			
		}
		
		return 0;
	}
	
	*/
	
	/*Ejercicio 24*/
	
	public static void main(String[] args) {
		
		String palabra = "neuquenoro";
		
		System.out.println(esDoblete(palabra));
		
	}
	
	static boolean esDoblete(String s) {
		
		
		
		return false;
	}
	
}





























