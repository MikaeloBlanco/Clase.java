import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array18{
	public static void main(String[] args){
		
		int tam;
		tam = 10;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int[] indice = new int[tam];
		int[] menor = new int[tam];
		int[] mayor = new int[tam];
		int[] reorNum = new int[tam];
		int cont;//Contadores de menores o mayores
		int cont2;
		
		cont = 0;
		cont2 = 0;
		
		for(int i = 0; i < tam; i++){
			
				num[i] = (int)(Math.random() * 201);
				
				indice[i] = i;
				
				if( num[i] <= 100 ){
					
					menor[cont++] = num[i];
				
				} else {
				
					mayor[cont2++] = num[i];
				
				}
				
			}
		System.out.println("");
		System.out.println("Array original: ");
		System.out.println("");
		
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
		
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}	
			
		int menorColocado = 0;
		int mayorColocado = 0;
		
		
		for(int i = 0; i < 10;){
		
			if( menorColocado < cont ){
			
				reorNum[i++] = menor[menorColocado++];
			
			}
		
		
			if( mayorColocado < cont2 ){
			
				reorNum[i++] = mayor[mayorColocado++];
			
			}
		
		}
		
		System.out.println("");
		System.out.println("Array resultado: ");
		System.out.println("");
		
		System.out.print("Indice: ");
		for(int i = 0; i < tam; i++){
		
			System.out.print(indice[i] + "	");
		
		}
		
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
		
		System.out.print("Valor: ");
		
		for(int i = 0; i < tam; i++){
		
			System.out.print(reorNum[i] + "	");
		
		}
		
		for(int o = 0; o < 2; o++){
		
			System.out.println("");
		
		}
	}
}
