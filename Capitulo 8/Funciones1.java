import java.util.Scanner;

/*
*
*Este programa contiene un total de 15 funciones
*
*Miguel Blanco Fernandez
*
*/

public class Funciones1{
	public static void main(String[] args){
		
		
		//Declaración de variables;
			
		int num;
		int aux;
		int posi;
		int posi2;
		int posi3;
		int posi4;
		int digPega;
		int digPega2;
		int rango;
		int rango2;
		int num2;
		int num3; 
		
		//Declaración de variables de volcado.
		
		int contador;
		int volteado;
		boolean esCapicua;
		boolean esPrimo;
		int sigPrimo;
		long potencia;
		int digitoPosi;
		int posiDigito;
		int posiDigito2;
		int pegarDelante;
		int pegarDetras;
		int quitarDetras;
		int quitarDelante;
		int trozos;
		int juntar;
		
		posi = 0;
		
		num = 0;
		
		aux = 0;
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduce un número: ");
		num = s.nextInt();
		
		
		
		contador = digito(num);
		volteado = voltea(num);
		esCapicua = esCapicua(volteado);
		esPrimo = esPrimo(num);
		sigPrimo = siguientePrimo(num);
		
		System.out.print("Introduce un exponente para el número introducido: ");
		aux = s.nextInt();
		
		potencia = potencia(num,aux);
		
		System.out.print("Introduce el número de posición que quieras para contar tu número: ");
		posi = s.nextInt();
		
		digitoPosi = digitoN(num, posi);
		
		System.out.print("Introduce un dígito que desees encontrar en tu número introducido: ");
		posi2 = s.nextInt();
		
		posiDigito = posicionDigito(num, posi2);
		
		System.out.print("Introduce la cantidad dígitos que desees quitar en tu número introducido: ");
		posi3 = s.nextInt();
		
		quitarDetras = quitaDetras(num, posi3);
		
		System.out.print("Introduce la cantidad de digitos que desees quitar delante en tu número introducido: ");
		posi4 = s.nextInt();
		
		quitarDelante = quitarDelane(num, posi4);
		
		System.out.print("Introduce un dígito que desees pegar detrás en tu número introducido: ");
		digPega = s.nextInt();
		
		pegarDetras = pegarDetras(num, digPega);
		
		System.out.print("Introduce un dígito que desees pegar delante en tu número introducido: ");
		digPega2 = s.nextInt();
		
		
	
		pegarDelante = pegarDelante(num, digPega2);

		System.out.print("Introduce el rango que desees obtener tu número de: ");
		rango = s.nextInt();
		rango2 = s.nextInt();
		
		trozos = trozoDeNumero(num, rango, rango2);
		
		System.out.print("Introduce dos números que desees pegar: ");
		num2 = s.nextInt();
		num3 = s.nextInt();
		
		juntar = juntaNumeros(num2,num3);
		
		for(int o = 0; o < 4; o++){
		
			System.out.println("");
		
		}
		
		System.out.println("La cantidad de dígitos del número introducido es de: " + contador);
		System.out.println("El número volteado es de: " + volteado);
		
		if(esCapicua == true){
		
			System.out.println("El número volteado también es capicua");
		
		} else {
			
		
			System.out.println("El número volteado no es capicua");
		
		}
		
		if(esPrimo == true){
		
			System.out.println("El número " + num + " es primo");
		
		} else {
		
			System.out.println("El número " + num + " no es primo");
		
		}
		
		System.out.println("El número primo siguiente a " + num + " es el: " + sigPrimo);
		
		System.out.println("Y el " + num + " elevado a " + aux + " es de valor: " + potencia);
		
		
		System.out.println("El número resultado de quitarle los dígitos es de: " + quitarDetras);
		
		System.out.println("Y el número resultado de quitarle los dígitos por delante es de: " + quitarDelante);
		
		System.out.println("El número resultado de añadirle un dígito detras es de: " + pegarDetras);
		
		System.out.println("Y el resultado de añadirle un dígito delante es de: " + pegarDelante);
		
		System.out.println("El número de ese rango sacado es de: " + trozos);
		
		System.out.println("El número resultante es de: " + juntar);
		
		
		
		
		
	}



	//Funciones.

	//Función de obtención de dígitos de un número introducido por teclado
	public static int digito(int x){

		int cont;
		cont = 0;
	
		while( x > 0 ){
	
			x = x / 10;
			cont++;
		
		}
		return cont;
	}

	//Función de volteo de un número introducido por teclado
	public static int voltea(int x){
		
		int volt;
		int div;
		int cont;
		cont = digito(x);
		
		volt = 0;
		
		
		while(cont > 0){
			
			div = x % 10;
			volt = volt * 10 + div;
			x = x / 10;
			cont--;
			
		}
		return volt;
		// return x == volt(x);
	}
	
	//Función de comprobación de valor capicua de un número introducido por teclado
	public static boolean esCapicua(int x){
	
		boolean bool;
		int y;
		
		y = voltea(x);//Variable usando función voltea con valor x de valor num;
		
		if( x == y ){
			
			bool = true;
		
		} else {
		
			bool = false;
		
		}
		return bool;
	}
	
	//Función de comprovación de valor primo de un número introducido por teclado
	public static boolean esPrimo(int x){
		
		
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Función de localización de un número primo siguiente al introducido por teclado
	public static int siguientePrimo(int x){
		
		x++;
		
		while(!esPrimo(x)){
			
			x++;
			
			}	
		
		return x;	
	}
	
	//Función de aplicación de potencia de un número con tanto su exponente como el número introducidos por teclado
	public static long potencia(int x , int poten){
	
		int result;
		
		
		result = (int)(Math.pow(x,poten));
		
		return result;
	}

	//Adquisición del número de digitos desde una posición n introducida por teclado
	public static int digitoN(int x, int posicion){

		int cont;
		cont = 0;
		
		while( posicion > 0){
			
			x = x / 10;
			posicion--;
			}
		
		
		while( x > 0 ){
	
			x = x / 10;
			cont++;
		
		}
		return cont;

}
	
	//Función de adquisición de posición de un digito x introducido por teclado
	public static int posicionDigito(int x, int posicion){
		
		int div;
		int digito;
		int cont;
		int contDig;
		
		digito = 10;
		cont = digito(x);
		contDig = 0;
		
		while ( contDig <= digito(x) ){
			
			div = x % 10;
			digito = div;
			x = x % 10;
			cont--;
			contDig++;
			
			}
		
		if(contDig == digito(x) || contDig == 0){
				
				cont = -1;
				
				return digito;
			
			}
		
		return cont;
	
	}

	//Función que elimina un número de digitos según una cantidad n introducida por teclado
	public static int quitaDetras(int x, int posicion){
	
		int resultDetras;
		resultDetras = x;
		
		while(posicion > 0){
			
				resultDetras = resultDetras / 10;
				posicion--;
			
			}
		return resultDetras;
	}

	//Similar a la anterior pero con la eliminación siendo desde delante
	public static int quitarDelane(int x, int posicion){
		
		int y;
		int volt;
		y = 0;
		volt = voltea(x);//Variable usando la Función voltea
		int cont;
		cont = digito(volt) - posicion;
		
		while ( posicion > 0 ){
			
				volt = volt / 10;
				posicion--;
			}
			
		int div;
		
		
		while(cont > 0){
			
			div = volt % 10;
			y = y * 10 + div;
			volt = volt / 10;
			cont--;
			
		}
		return y;
	}

	//Función de pegar un dígito nuevo por la parte de atras de un número
	public static int pegarDetras(int x, int digPega){
	
		int numPegado;
	
		numPegado = x * 10 + digPega;
	
		return numPegado;
	}
	
	//Similar al anteriór pero pegando por delante el número introducido por teclado
	public static int pegarDelante(int x, int digPega){
	
		int y;
		int volt;
		y = 0;
		volt = voltea(x);//variable usando la Funcion voltea
		
		volt = volt * 10 + digPega;
		
		int div;
		int cont;
		cont = digito(x) + 1;
		
		while(cont >= 0){
			
			div = volt % 10;
			y = y * 10 + div;
			volt = volt / 10;
			cont--;
			
		}
		y = y / 10;
		return y;
		
	}

	//Función de adquisición de un fragmento del número introducido por teclado
	public static int trozoDeNumero(int x, int y, int z){
		
		int fragmento;
		int cont;
		cont = 0;
		fragmento = 0;
		
		while( cont < digito(x) ){
			
				if ( cont <= y && cont >= z || cont >= y && cont <= z ){
					
						fragmento = (fragmento * 10) + (x % 10);
						x = x / 10;
						cont++;
						
					} else {
						
						x = x / 10;
						cont++;
						
						}
			
			}
		
			return fragmento = voltea(fragmento);
		
		}
	
	//Función que une dos números por teclado
	public static int juntaNumeros (int x, int y){
		
			int cont;
			int suma;
			
			cont = digito(y);//variable usando función digito para aumentar el tamaño del número primero para unirlos
			
			while (cont > 0){
				
				x = x * 10;
				cont--;
				
				}
			
			suma = x + y;
			
			return suma;
		
		}
	
}	
