import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array19{
	public static void main(String[] args){
		
		int tam = 12;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int[] selector = new int [1];
		int aux = 0;
		int[] indice = new int[tam];
		
		System.out.println("");
		System.out.println("Array original: ");
		System.out.println("");
		
		for(int i = 0; i < tam; i++){
			
				num[i] = (int)(Math.random() * 201);
				
				indice[i] = i;
				
			}
		
		System.out.print("Indice: ");
		for(int i = 0; i < tam; i++){
		
			System.out.print(indice[i] + "	");
		
		}
		
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
		
		System.out.print("Valor: ");
		
		for(int i = 0; i < tam; i++){
		
			System.out.print(num[i] + "	");
		
		}
		
		System.out.println("");
		System.out.println("------------");
		
		while(aux > -1 || selector[0] > -1){
		
			System.out.print("Introduce la posición donde desee insertar un valor ( 0 - 11 ): ");
			selector[0] = s.nextInt();
			System.out.println("");
			System.out.print("Introduce el valor que desee insertar(Para salir introduce un valor negativo): ");
			aux = s.nextInt();
			
			for(int o = 0; o < tam; o++){
				
				if( o == selector[0] ){
					
					num[o] = aux;
				
				}
				
			}
			
			System.out.println("");
			System.out.println("Array resultado: ");
			System.out.println("");
		
		
			System.out.print("Indice: ");
				
			for(int o = 0; o < tam; o++){
		
				System.out.print(indice[o] + "	");
		
			}
		
			for(int o = 0; o < 2; o++){
		
				System.out.println("");
		
			}
		
			System.out.print("Valor: ");
		
			for(int o = 0; o < tam; o++){
		
				System.out.print(num[o] + "	");
		
			}
		
				System.out.println("");
				System.out.println("------------");
			
			}
		}
	}

