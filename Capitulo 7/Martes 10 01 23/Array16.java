import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array16{
	public static void main(String[] args){
		
		int tam;
		tam = 20;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int selector;	//Selector de multiplo 5 y o multiplo 7

		
		for(int i = 0; i < tam; i++){
			
				num[i] = (int)(Math.random() * 401);
				System.out.print(num[i] + " ");

			}
		System.out.println("");
		System.out.println("");
		System.out.print("¿Qué números quieres destacar? (1 - multiplos de 5, 2 - multiplos de 7): ");
		selector = s.nextInt();
		System.out.println("");
		
		switch(selector){
			
			case 1:
				for(int i = 0; i < tam; i++){
			
				
					if( num[i] % 5 == 0 ){
					
						 System.out.print(" [" + num[i] + "] ");
					
					} else {
						
						System.out.print(num[i] + " ");
						
					}
				}
				break;
				
			case 2:
				for(int i = 0; i < tam; i++){
			
				
					if( num[i] % 7 == 0 ){
					
						 System.out.print(" [" + num[i] + "] ");
					
					} else {
						
						System.out.print(num[i] + " ");
						
					}
			}
			break;
			
		}
	}	
}
