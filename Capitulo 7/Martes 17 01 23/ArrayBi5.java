import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas pero ahora aleatorio y retardo;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi5{
	public static void main(String[] args)
		throws InterruptedException{
		
			Scanner s = new Scanner(System.in);
			int [][] num = new int[6][10];
		
			int max;
			int min;
			int filaMax;
			int filaMin;
			int colMax;
			int colMin;
			filaMax = 0;
			filaMin = 5;
			colMax = 0;
			colMin = 5;
			max = 0;
			min = 1000;
		
			for(int fila = 0; fila < 6; fila++){
		
				for(int columna = 0; columna < 10; columna++){
			
					num[fila][columna] = (int)(Math.random() * 1001);
					
					if ( num[fila][columna] < min){
					
						min = num[fila][columna];
						colMin = columna;
						filaMin = fila;
						
					}
					
					if ( num[fila][columna] > max){
					
						max = num[fila][columna];
						filaMax = fila;
						colMax = columna;
						
					}
				}
			}
			
			System.out.println("El maximo es: " + max + " y se encuentra en la posición: " + filaMax + " " + colMax);
			System.out.println("El mínimo es: " + min + " y se encuentra en la posición: " + filaMin + " " + colMin); 
			
			
			System.out.println("------------------------------------------------------------------------------");
			for(int fila = 0; fila < 6; fila++){
		
				for(int columna = 0; columna < 10; columna++){
				
					if ( num[fila][columna] == min ){
					
						System.out.print("\"" + min + "\"	");
					
					} else if ( num[fila][columna] == max){
					
						System.out.print("\"" + max + "\"	");
					
					} else {
					
						System.out.print(num[fila][columna] + "	");
						Thread.sleep(250);
					}
				
				}
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------");
				Thread.sleep(1250);
			}
	}
}
			
