import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array21{
	public static void main(String[] args){
		
		int tam = 15;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int aux = 0;
		
		System.out.println("");
		System.out.println("Array original: ");
		System.out.println("");
		
		for(int i = 0; i < tam; i++){
			
				num[i] = (int)(Math.random() * 501);
				
			}
			
		for(int i = 0; i < tam; i++){
			
				System.out.print(num[i] + " ");
				
			}
		
		for(int i = 0; i < 15; i++){
			
			if( num[i] % 5 != 0){
			
				while( num[i] % 5 != 0){
					
						num[i]++;
					
					}
			
			}
		
		}
		
		System.out.println("");
		System.out.println("Array resultado: ");
		System.out.println("");
		
		for(int i = 0; i < tam; i++){
			
				System.out.print(num[i] + " ");
				
			}	
		}	
	}
