import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array4{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[20];
		int[] cuadrad = new int[20];
		int[] cubo = new int[20];
		
		for(int i = 0; i < 20; i++){
		
			num[i] = (int)(Math.random() * 101);
			
		}
		
		for(int o = 0; o < 20; o++){
		
			cuadrad[o] = num[o] * num[o];
		
		}
		
		for(int p = 0; p < 20; p++){
		
			cubo[p] = cuadrad[p] * num[p];
		
		}
		
		int rev;//Revovinador, uso para whiles de repetición
		rev = 0;
		
		while(rev < 20){
		
			System.out.print(num[rev] + " ");
			rev++;
		
		}
		System.out.println("");
		System.out.println("-----------------");
		rev = 0;
		
		while(rev < 20){
		
			System.out.print(cuadrad[rev] + " ");
			rev++;
		
		}
		System.out.println("");
		System.out.println("-----------------");
		rev = 0;
		
		while(rev < 20){
		
			System.out.print(cubo[rev] + " ");
			rev++;
		
		}
	}
}
