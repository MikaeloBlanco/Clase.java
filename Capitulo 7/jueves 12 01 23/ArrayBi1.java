import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga y muestre una tabla;
*
*Miguel Blanco Fernandez
*
*/
public class ArrayBi1{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int [][] num = new int[3][6];
		
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for(int fila = 0; fila < 3; fila++){
			
			for(int columna = 0; columna < 6; columna++){
				
				System.out.print(num[fila][columna] + "		");
			}
			System.out.println("-------------------------------------------------------------------------------------------");
			
			}
}
}
