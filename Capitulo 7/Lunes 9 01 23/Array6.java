import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array6{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[15];
		int[] numRot = new int[15];//Numeros rotados;
		int u = 0;
		System.out.print("Introduce 15 números: ");
		
		for(int i = 0; i < 15; i++){
			
			num[i] = s.nextInt();
			
		}
		
		numRot[0] = num[14];
		
		for(int o = 1; o < 15; o++){
			
			numRot[o] = num[u];
			u++;
			
		}
		
		for(int p = 0; p < 15; p++){
			
			System.out.print(numRot[p] + " ");
			
		}
	}
}
