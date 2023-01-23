import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas pero ahora aleatorio y retardo;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi11{
	public static void main(String[] args)
		throws InterruptedException{
		
			int tamFil;
			int tamCol;
			tamFil = 10;
			tamCol = 10;
		
			Scanner s = new Scanner(System.in);
			int [][] num = new int[tamFil][tamCol];
			int [][] diagonal = new int[tamFil][tamCol];
			
			int max;
			int min;
			int filaMax;
			int filaMin;
			int colMax;
			int colMin;
			filaMax = 0;
			filaMin = 9;
			colMax = 0;
			colMin = 9;
			max = 200;
			min = 300;
			
			int suma = 0;
			int media = 0;
		
			for(int fila = 0; fila < 10; fila++){
		
				for(int columna = 0; columna < 10; columna++){
			
					num[fila][columna] = (int)(Math.random() * 101 + 200);
					
					System.out.print(num[fila][columna] + " ");
				
					if(columna == fila){
						
						diagonal[fila][columna] = num[fila][columna];
						
						suma += diagonal[fila][columna];
					
					if ( num[fila][columna] < min){
					
						min = diagonal[fila][columna];
						colMin = columna;
						filaMin = fila;
						
					}
					
					if ( num[fila][columna] > max){
					
						max = diagonal[fila][columna];
						filaMax = fila;
						colMax = columna;
						
					}
					
					}
				
				}
				System.out.println("");
			}
			System.out.println("La diagonal es:	");
			for(int fila = 0; fila < 10; fila++){
		
				for(int columna = 0; columna < 10; columna++){
				
					if( fila == columna ){
					
						System.out.println(diagonal[fila][columna]);
						
					}
					for(int i = 0; i < fila; i++){
							
							System.out.print(" ");
							
						}
				}
			}
			media = suma / tamFil; 
			
			System.out.println(" ");
			System.out.println(" Y su mínimo, máximo y media son: ");
			System.out.print(min + " " + max + " " + media);
			System.out.println("");
			System.out.print("Las posiciones del máximo y minimo son: " + filaMax + " " + colMax + " y " + filaMin + " " + colMin + " respectivamente");
			
			
		}
	}
