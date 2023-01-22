import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla y después las sumas de las filas y columnas pero ahora aleatorio y retardo;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi4{
	public static void main(String[] args)
		throws InterruptedException{
		
			Scanner s = new Scanner(System.in);
			int [][] num = new int[4][5];
		
			int suma;
			int aux;
			int total;//Total de las sumatorias
		
			suma = 0;
			aux = 0;
			total = 0;
		
			for(int fila = 0; fila < 4; fila++){
		
				for(int columna = 0; columna < 5; columna++){
			
					num[fila][columna] = (int)((Math.random() * 900) + 100); 
			
				}
		
			}
		
			System.out.println("---------------------------------------------------------------------------------");
			for(int fila = 0; fila < 4; fila++){
		
				for(int columna = 0; columna < 5; columna++){
			
					System.out.print(num[fila][columna] + "		");
					suma += num[fila][columna]; 
			
				}
				Thread.sleep(1500);
				System.out.println("Fila " + fila + ": " + suma);
				aux += suma;
				suma = 0;
			
				System.out.println(" ");
				System.out.println("---------------------------------------------------------------------------------");	
			}
		
		
			for(int columna = 0; columna < 5; columna++){
		
				for(int fila = 0; fila < 4; fila++){
		
					suma += num[fila][columna];
				
				}
				Thread.sleep(1500);
				System.out.print("Col " + columna + ": " + suma + "	");
				aux += suma;
				suma = 0;
			}
		
			total = aux;
			Thread.sleep(1500);
			System.out.print("Total: " + total);
	}
}
