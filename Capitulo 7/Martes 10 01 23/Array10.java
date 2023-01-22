import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array10{
	public static void main(String[] args){
		
		int tam;
		tam = 20;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int[] par = new int[tam];
		int[] impar = new int[tam];
		int cont;
		int cont2;
		cont = 0;
		cont2 = 0;
		
		for(int i = 0; i < tam; i++){
		
			num[i] = (int)(Math.random()* 101);
			
			if( num[i] % 2 == 0 ){
				
				par[cont] = num[i];
				cont++;
			} else {
				
				impar[cont2] = num[i]; 
				cont2++;
			}
		
		}
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		for( int i = 0; i < tam; i++){
		
			System.out.print(num[i] + " ");
		
		}
		
		for(int i = 0; i < cont; i++){
			
			num[i] = par[i];
			
			for(int o = cont; o < tam; o++){
			
				num[o] = impar[o - cont];
			
			}
		
		}
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		for( int i = 0; i < tam; i++){
		
			System.out.print( num[i] + " ");
		
		}
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		
	}
}
		
