package misFunciones;

/*
*
*Recopilación de diferentes Funciones varias.
*
*
*
*@author Miguel Blanco
*/

public class Varias{

	public static double multiplicacion(double x,double y){
	
		double multi;
		
		multi = x * y;
	
		return multi;
	}
	
	public static double minimo (double x , double y){
	
		double min;
		
		if ( x > y){
		
			min = y;
		
		} else {
		
			min = x;
		
		}
	
		return min;
	
	}

	public static int dimeSigno(int x){
	
		if(x > 0){
		
			return 1;
		
		} else if (x == 0){
		
			return 0;
		
		} else {
		
			return -1;
		
		}
	
	}

	public static int suma1aN (int x){
		
		int cont;
		int suma = 0;
		
		cont = 1;
		suma = 0;
		
		while ( cont <= x ){
				
				suma += cont;
				cont++;
			}
		return suma;
	}
	
	public static int producto1aN(int x){
		
		int multi;
		int cont;
		
		cont = 1;
		
		multi = 1;
		
		while( cont <= x ){
			
			multi = multi * cont;
			cont++;
			
			}
		
			return multi;
		}
		
		
		public static double intermedio1aN(int x){
			
			double media;
			double suma;
			
			suma = suma1aN(x);
			media = suma / x;
			
			return media;
			}
		
		public static int selector(int x, int y){

			if(x < y){

				return y;

			} else {

				return x;

			}

		}
		
		public static void tablaMultiplica(int n){
			int multi;

			for(int i=1; i <= 10; i++){

				multi = i * n;
				System.out.println(n + " x " + i + " : " + multi); 

			}
		}

		public static int arraySuma(){
			int suma;
			int rango;
			suma = 0;
			rango = 100;
			int[] array = new int[rango];

			for(int i = 0; i < 100; i++){

				array[i] = (int)(Math.random() * 100 + 1);
				suma = array[i] + suma;

			}
			return suma;
		}

		public static double arrayMedia(){
			double media;
			int suma; 
			suma = arraySuma();
			int rango;
			rango = 100;

			media = suma/rango;

			return media;

		}

		public static void Primo(int num){
		int aux2;
		int aux3;
		int aux5;
		int aux7;
		
			aux2 = num % 2;
			aux3 = num % 3;
			aux5 = num % 5;
			aux7 = num % 7;
		
			if ( num == 1 || ( aux2 == 0 || aux3 == 0 || aux5 == 0 || aux7 == 0 ) ){
				System.out.println("No es un número primo");
			} else {
				System.out.println("Es un número primo");
			}
		}

		public static char DNI(int numDNI){

			int restoDNI;
			char letraDNI;

			letraDNI = ' ';

			restoDNI = numDNI % 23;

			switch(restoDNI){

				case 0:
				    letraDNI = 'T';
					break;
				
				case 1:
				    letraDNI = 'R';
					break;
				
				case 2:
				    letraDNI = 'W';
					break;
			
				case 3:
				    letraDNI = 'A';
					break;

				case 4:
				    letraDNI = 'G';
					break;

				case 5:
				    letraDNI = 'M';
					break;
					
				case 6:
				letraDNI = 'Y';
				break;
				
				case 7:
				    letraDNI = 'F';
					break;
					
				case 8:
				letraDNI = 'P';
				break;
				
				case 9:
				    letraDNI = 'D';
					break;
					
				case 10:
				letraDNI = 'X';
				break;
				
				case 11:
				    letraDNI = 'B';
					break;
					
				case 12:
				letraDNI = 'N';
				break;
				
				case 13:
				    letraDNI = 'J';
					break;
					
				case 14:
				letraDNI = 'Z';
				break;
				
				case 15:
				    letraDNI = 'S';
					break;
					
				case 16:
				letraDNI = 'Q';
				break;
				
				case 17:
				    letraDNI = 'V';
					break;
					
				case 18:
				letraDNI = 'H';
				break;
				
				case 19:
				    letraDNI = 'L';
					break;
					
				case 20:
				letraDNI = 'C';
				break;
				
				case 21:
				    letraDNI = 'K';
					break;
					
				case 22:
				letraDNI = 'E';
				break;
			}
			return letraDNI;
		}
}
