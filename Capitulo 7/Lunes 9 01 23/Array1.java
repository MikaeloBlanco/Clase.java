import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array1{
	public static void main(String[] args){
	
		int aux; //sirve para preguntar una posición del array
		Scanner s = new Scanner(System.in);
		int[] num = new int[12];//Array de calculo
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for(int i = 0; i < 12; i++){
			
			System.out.println(num[i]);
		
		}
		
		System.out.print("Los valores no introducidos son designados como ceros o nulls");
	}
}
