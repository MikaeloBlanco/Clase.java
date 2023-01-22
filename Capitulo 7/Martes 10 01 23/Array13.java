import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array13{
	public static void main(String[] args){
		
		int tam;
		tam = 100;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int selector;	//Selector de minimo y maximo
		int max;
		int min;
		
		max = 0;
		min = 500;
		
		for(int i = 0; i < tam; i++){
			
				num[i] = (int)(Math.random() * 501);
				System.out.print(num[i] + " ");
				if( num[i] < min ){
					
					min = num[i];
					
				}
				
				if( num[i] > max ) {
				
						max = num[i];
					
				}

			}
		System.out.println("");
		System.out.println("");
		System.out.print("¿Qué quieres destacar? (1 - minimo, 2 - maximo): ");
		selector = s.nextInt();
		System.out.println("");
		
		switch(selector){
			
			case 1:
				for(int i = 0; i < tam; i++){
			
				
					if( num[i] == min ){
					
						 System.out.print(" **" + min + "** ");
					
					} else {
						
						System.out.print(num[i] + " ");
						
					}
				}
				break;
				
			case 2:
				for(int i = 0; i < tam; i++){
			
				
					if( num[i] == max ){
					
						 System.out.print(" **" + max + "** ");
					
					} else {
						
						System.out.print(num[i] + " ");
						
					}
			}
			break;
			
			
		}
	}	
}

