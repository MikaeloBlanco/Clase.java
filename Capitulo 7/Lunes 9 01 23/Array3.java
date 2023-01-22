import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array3{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		System.out.println("Introduce 10 números: ");
		
		for(int i = 0; i < 10; i++){
			
			n[i] = s.nextInt();
			
		}
		
		for(int i = 9; i >= 0; i--){
			
			System.out.println(n[i]);
			
		}
	}
}		
		
		
		
