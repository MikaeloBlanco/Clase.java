import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array7{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[100];
		int[] selector = new int [1];
		int aux = 0;
		
		for(int i = 0; i < 100; i++){
		
			num[i] = (int)(Math.random() * 21);
		
		}
		
		for(int i = 0; i < 100; i++){
		
			System.out.print(num[i] + " ");
		
		}
		System.out.println("");
		System.out.println("------------");
		
		while(aux > -1 || selector[0] > -1){
		
			System.out.print("Introduce un valor de selección de la lista y el valor por el que desee sustituirlo(Para salir introduzca un número negativo): ");
			selector[0] = s.nextInt();
			aux = s.nextInt();
		
			for ( int i = 0; i < 100; i++){
			
				if( num[i] == selector[0] ){
					num[i] = aux;
					System.out.print("\"" + num [i] + "\"" + " ");
					
				} else{
					System.out.print(num[i] + " ");
				}
			
			}
			System.out.println("");
			System.out.println("------------");
		}
	}
}
