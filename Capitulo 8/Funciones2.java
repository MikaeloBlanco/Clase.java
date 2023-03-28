import java.util.Scanner;

/*
*
*Este programa contiene un total de 9 funciones
*
*Miguel Blanco Fernandez
*
*/

public class Funciones2{
	public static void main(String[] args){
		
		
		//Declaración de variables;
			
		int num;
		int min;
		int max;
		int auxMin;
		int auxMax;
		
		Scanner s = new Scanner(System.in);
		
		//Declaración de variables de volcado.
		
		int minimoDeArray;
		int maximoDeArray;
		int mediaDeArray;
		
		System.out.print("Introduce el tamaño del array: ");
		num = s.nextInt();
		
		System.out.print("Introduce el rango de su función(primero minimo y luego máximo): ");
		min = s.nextInt();
		max = s.nextInt();
		
		int[] arraySalida = new int[num];
		
		
			
			arraySalida = generaArrayInt(num,max,min);
			
			minimoDeArray = minimoArrayInt(num,max,min);
			
			maximoDeArray = maximoArrayInt(num,max,min);
			
			mediaDeArray = mediaArrayInt(num,max,min);
	
		
		for(int i = 0; i < num; i++){
			
				System.out.printf(" %3s ", arraySalida[i]);
			
			}
			
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
		
			
				System.out.print("El mínimo del array procesado es: " + minimoDeArray);
			
			
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
			
				System.out.print("El maximo del array procesado es: " + maximoDeArray);
			
			
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
			
				System.out.print("La media del array es de: " + mediaDeArray);
			
			
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
		
		
		}
	
	//Funciones
	
	public static int[] generaArrayInt(int num, int max, int min){
	
		int[] arrya = new int[num];
		
		max = max + 1;
		
		for(int i = 0; i < num; i++){
		
			arrya[i] = (int)(Math.random() * (max - min) + min );
		
		}
		
		return arrya;
	
  }
	
	
	public static int minimoArrayInt(int num, int max, int min){
		
		int[] arrya = new int[num];
		int minimo;
		arrya = generaArrayInt(num,max,min);
		
		minimo = Integer.MAX_VALUE;
		
		max = max + 1;
		
		for(int i = 0; i < num; i++){
		
			
			if ( arrya[i] <= minimo){
				
					minimo = arrya[i];
				
				}
			
		}
		
		return minimo;
	
	}
		
	
	
	
	public static int maximoArrayInt(int num, int max, int min){
	
		int[] arrya = new int[num];
		int maximo = Integer.MIN_VALUE;
		arrya = generaArrayInt(num,max,min);
		
		max = max + 1;
		
		for(int i = 0; i < num; i++){
		
			
			if ( arrya[i] >= maximo){
				
					maximo = arrya[i];
				
				}
				
		}
		
		return maximo;
	
	}
	
	public static int mediaArrayInt(int num, int max, int min){
	
		int[] arrya = new int[num];
		
		arrya = generaArrayInt(num,max,min);
		
		int suma;
		
		int media;
		
		suma = 0;
		media = 0;
		
		max = max + 1;
		
		for(int i = 0; i < num; i++){
		
			suma += arrya[i];
		
		}
		
		media = suma / num;
		
		return media;
	
	}

}
