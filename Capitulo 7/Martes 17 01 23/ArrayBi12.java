import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas pero ahora aleatorio y retardo;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi12{
	public static void main(String[] args)
		throws InterruptedException{
		
			int tamFil;
			int tamCol;
			tamFil = 9;
			tamCol = 9;
		
			Scanner s = new Scanner(System.in);
			int [][] num = new int[tamFil][tamCol];
			int diagonal;
			
			int cont;
			int cont2;
			
			cont = 9;
			cont2 = 0;
			
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
			max = 500;
			min = 900;
			
			int suma = 0;
			int media = 0;
		
			for(int fila = 0; fila < 9; fila++){
		
				for(int columna = 0; columna < 9; columna++){
					cont2++;
					num[fila][columna] = (int)(Math.random() * 401 + 500);
					
					System.out.print(num[fila][columna] + " ");
				
						suma += num[8 - fila][columna];
					}
				cont--;
				cont2 = 0; 
				System.out.println("");
			}
			
			cont = 9;
			cont2 = 0;
			
			System.out.println("La diagonal es:	");
			for(int i = 0; i < 9; i++){
					
				System.out.println(num[8 - i][i]);
					
				diagonal = num[8 - i][i];
				
				if ( diagonal < min){
					
							min = diagonal;
							colMin = i;
							filaMin = 8 - i;
						
						}
					
				if ( diagonal > max){
					
							max = diagonal;
							filaMax = 8 - i;
							colMax = i;
						
						}
						
					
					for(int o = 0; o < i; o++){
							
							System.out.print(" ");
							
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
			
