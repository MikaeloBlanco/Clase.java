import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array{
	public static void main(String[] args){
	
		int aux; //sirve para preguntar una posición del array
		Scanner s = new Scanner(System.in);
		int[] num = new int[10];//Array de calculo
		int suma;
		suma = 0;
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 2 * 2;
		num[3] = 2 * 2 * 2;
		num[4] = 2 * 2 * 2 * 2;
		num[5] = 2 * 2 * 2 * 2 * 2;
		num[6] = num[2] * 10;
		num[7] = num[2] / 10;
		num[8] = num[0] + num[1] + num[2];
		num[9] = num[8];
	
		System.out.println("En este array hay un total de 10 posiciones del 0 al 9 ");
		System.out.print("Seleccione una posición que desee: ");
		aux = s.nextInt();
		System.out.println(num[aux]);
		
		for(int i = 0; i < 10; i ++){
			
			if ( (i % 2) == 0){
				
				suma = num[i] + suma;
				
				}
			
			System.out.println("Posición del array: " + i + " Valor del array: " + num[i]);
			
		}
		
		for(int o = 0; o < 10; o += 2 ){
			
			System.out.println("Posición par: " + o + " Valor del array par: " + num[o]);
			
		}
		
		System.out.println("La suma de los Valores del array par es de: " + suma);
		
	
	}

}
