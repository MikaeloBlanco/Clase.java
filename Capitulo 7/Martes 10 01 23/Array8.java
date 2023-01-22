import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array8{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] temperatura = new int[13];//Temperatura en cada mes
		int cont;
		cont = 1;
		
		System.out.print("Introduzca la temperatura media de cada mes del año que usted desee: ");
		
		for(int i = 1; i < 13; i++){
		
			temperatura[i] = s.nextInt();
		
		}
		
		System.out.print("Enero	Febrero	Marzo	Abril	Mayo	Junio");
		System.out.print("	Julio	Agosto Septiembre Octubre Noviembre Diciembre	");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------");
		while( cont < 13 ){
			
			System.out.print(" " + temperatura[cont] + "|" + "	");
			cont++;
			}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------");
		}
}
