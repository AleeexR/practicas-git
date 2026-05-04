		package ejercicios;

public class Recursividad {

	/* Ejercicio 30 
	
	public static void main(String[] args) {
		
		int n = 5;
		
		double x = 2.0;
		
		System.out.println("La sumatoria de todos los numeros es : " + (sumatoriaRec(n)));
		
		System.out.println("La sumatoria de numeros pares es: " + sumatoriaParesRec(n));
		
		System.out.println("La potencia de x elevado a la n es: " + potenciaRec(x, n));
		
		System.out.println("El factorial de n es: " + factorialRec(n));
		
	}

	public static int sumatoriaRec(int n) {
		
		if (n == 0) {
			
			return 0;
			
		} else {
			
			return n + sumatoriaRec(n -1);		// con n=5 ___ 1) 5 + 2) 4 + 3) 3 + 4) 2 + 5) 1 + 6) 0
			
		}
		
	}
	
	public static int sumatoriaParesRec(int n) {
		
		if (n < 2) {
			
			return 0;
			
		}
		
		if (n % 2 == 0) {
			
			return n + sumatoriaParesRec(n - 1);
			
		} else {
			
			return 0 + sumatoriaParesRec(n - 1);
			
		}
	
	}
	
	public static double potenciaRec(double x, int n) {
		
		if (n == 0) {
			
			return 1;
			
		}
											//----> x=2 n=5
													
		return x * potenciaRec(x, n-1);		//----> 1) 2 * 2) 2 * 3) 2 * 4) 2 * 5) 2 * 6) 1
											//        n=5    n=4   n=3    n=2    n=1    n=0
	}
	
	public static int factorialRec(int n) {
		
		if (n == 0) {
			
			return 1;
			
		}
		
		return n * factorialRec(n - 1);
		
	}
	
	*/
	
	/* Ejercicio 31 
	
	public static void main(String[] args) {
		
		int n = 46;
		
		System.out.println("La sucesión de Fibonacci de " + n + " utilizando recursion es: " + fibrec(n));
		
		System.out.println("La sucesión de Fibonacci de " + n + " utilizando iteracion es: " + fibiter(n));
		
	}
	
	public static int fibrec(int n) {
		
		if (n == 0) {
			
			return 0;
			
		}
		
		if (n == 1) {
			
			return 1;
			
		}
		
		return fibrec(n-2) + fibrec(n-1) ;
	}
	
	public static int fibiter(int n) {
		
		int resultado = 0;
		
		int auxiliar = 0;
		
		for (int i = 0; i < n + 1 ; i ++) {		
		
			if (i == 0) {
				
				resultado = 0;
				
			}
			
			if (i == 1) {
				
				resultado = 1;
				
			}
			
			if (i == 2) {
				
				auxiliar = 1;
				
			}
		
			if (i > 2) {
				
				resultado = resultado + auxiliar;
				
				auxiliar = resultado - auxiliar;
				
			}
			
		}
			
		return resultado;
		
	}
	
	*/
	
	/* Ejercicio 32 
	
	public static void main(String[] args) {
		
		int n = 7;
		
		collatz(n);
		
		collatz1(n);
		
	}
	
	
	public static void collatz(int n) {
		
		while(n != 1) {
			
			if (n % 2 == 0) {
				
				n = n/2;
				
				System.out.println(n);
				
			} else {
				
				n = (n * 3) + 1;
				
				System.out.println(n);
				
			}
			
		}
		
	}

	//Ejercicio resuleto con recursividad:
	
	public static void collatz1(int n) {
		
		if (n % 2 == 0) {
		
			n = n/2;
			System.out.println(n);
		
		} else {
			
			n = n*3 +1;
			System.out.println(n);
			
		}
		
		if (n != 1) {

			collatz1(n);
			
		}
	}
	
	*/
	
	/*Ejercicio 33
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 36;
		
		System.out.println(mcd(a, b));

		System.out.println(mcdV2(a, b));
		
	}
	
	// METODO VALIDO, EXPLICATIVO PERO CON LINEAS EXTRAS QUE SE PODRIAN SACAR:
	
	public static int mcd(int a, int b) {
		
		if (a == 0) {
			
			return b;
			
		} 
		
		if (b == 0) {
			
			return a;
			
		}
		
		if (a > b) {
			
			a = a % b;
			
		} else {
			
			b = b % a;
		} 
		
		return mcd(a, b);
	}
	
	// METODO DIRECTO EN EL CUAL SE ACOMODAN AUTOMÁTICAMENTE EL DIVIDENDO/RESTO Y EL DIVISOR 
	
	public static int mcdV2(int a, int b) {
		
		if (b == 0) {
			
			return a;
			
		}
		
		return mcdV2(b, a % b);
		
	}

	*/
	
	/* EJERCICIO 34
	
	public static void main(String[] args) {
		
		String s = "hola";
		
		System.out.println(cadConAsteriscos(s));
		
	}
	
	*/
	
	public static String resto(String s) {
		
		String resto = "";
		
		for (int i = 1; i < s.length(); i++) {
			
			resto = resto + s.charAt(i);
			
		}
		
		return resto;
	}
	
	/*
	
	public static String cadConAsteriscos(String s) {
		
		if (s.length() == 1) {
			
			return s;
			
		}
		
		return s.charAt(0) + "*" + cadConAsteriscos(resto(s));
	}
	
	*/
	
	/* EJERCICIO 35 */
	
	public static void main(String[] args) {
		
		String s = "peeeerooooo";
		
		System.out.println(sinRepetidas(s));
		
	}
	
	public static String sinRepetidas(String s) {
		
		if (s.length() == 1) {
			
			return s;
			
		}

		if (s.charAt(0) == s.charAt(1)) {
			
			return "" + sinRepetidas(resto(s));
			
		} 
			
			return s.charAt(0) + sinRepetidas(resto(s));			
				
	}
	
}













































