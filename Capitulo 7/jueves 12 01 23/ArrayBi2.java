import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi2{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int [][] num = new int[4][5];
		
		int suma;
		int aux;
		int total;//Total de las sumatorias
		
		suma = 0;
		aux = 0;
		total = 0;
		
		System.out.print("Introduce 20 números: ");
		
		for(int fila = 0; fila < 4; fila++){
		
			for(int columna = 0; columna < 5; columna++){
			
				num[fila][columna] = s.nextInt(); 
			
			}
		
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		for(int fila = 0; fila < 4; fila++){
		
			for(int columna = 0; columna < 5; columna++){
			
				System.out.print(num[fila][columna] + "		");
				suma += num[fila][columna]; 
			
			}
			System.out.println("Fila " + fila + ": " + suma);
			aux += suma;
			suma = 0;
			
			System.out.println(" ");
			System.out.println("------------------------------------------------------------------------------");	
		}
		
		
		for(int columna = 0; columna < 5; columna++){
		
			for(int fila = 0; fila < 4; fila++){
		
				suma += num[fila][columna];
				
			}
			System.out.print("Col " + columna + ": " + suma + "	");
			aux += suma;
			suma = 0;
		}
		
		total = aux;
		
		System.out.print("Total: " + total);
	}
}
		
