import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas pero ahora aleatorio y retardo;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi13{
	public static void main(String[] args){
		
		int tamFil;
		int tamCol;
		tamFil = 4;
		tamCol = 10;
		
		int media = 0;
		int suma = 0;
		int min = 210;
		int max = 140;
		
		int [][] num = new int[tamFil][tamCol];//Estaturas seleccionadas
		String[] pais = {"España", "Rusia", "Japón", "Australia"};
		
		for(int fila = 0; fila < 4; fila++){
			
			for(int columna = 0; columna < 10; columna++){
			
				num[fila][columna] = (int)(Math.random() * 71 + 140);
			
			}
		
		}
		System.out.print("							");
		System.out.print("   MED MIN MAX");
		System.out.println("");
		for(int fila = 0; fila < 4; fila++){
		
			System.out.print(pais[fila] + ": ");
		
			for(int columna = 0; columna < 10; columna++){
			
				System.out.print(" " + num[fila][columna] + " ");
				
				if( num[fila][columna] > max ){
				
					max = num[fila][columna];
				
				}
				
				if( num[fila][columna] < min ){
				
					min = num[fila][columna];
				
				}
				suma += num[fila][columna];
			}
			System.out.print("| ");
			
			media = suma / tamCol;
			
			System.out.println(media + " " + min + " " + max);
			
			max = 140;
			min = 210;
			media = 0;
			suma = 0;
		}
	}
}
