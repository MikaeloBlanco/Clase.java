import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array5{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[10];
		int min;
		int max;
		System.out.print("Introduce 10 números: ");
		num[0] = s.nextInt();
		min = num[0];
		max = num[0];
		
		for(int i = 1; i < 10; i++){
		
			num[i] = s.nextInt();
			
			if ( max < num[i]  ){
			
				max = num[i];
				
			}
			
			if ( min > num[i]  ){
			
				min = num[i];
			
			}
		}
		
		for(int i = 0; i < 10; i++){
			
			System.out.print(num[i] + " ");
			
			if( num[i] == max ){
			
				System.out.print(" MAXIMO ");
			
			}
			
			if( num[i] == min ){
			
				System.out.print(" MINIMO ");
			
			}
			
		}
		
	}
}
