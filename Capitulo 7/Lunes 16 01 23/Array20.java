import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array20{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int tam;

		
		System.out.print("Introduce el número total de nombres de reyes: ");
		tam = s.nextInt();
		
		String[] nombres = new String[tam];//Nombres de reyes según variable;
		String[] numNombres = new String[tam];
		
		System.out.println("Introduce los nombres de los reyes que desee almacenar: ");
		
		for(int i = 0; i < tam; i++){
			
			nombres[i] = s.next();
			
		}
		System.out.println("-----------------------------------------------");
		System.out.print("Los reyes introducidos son: ");
		
		for(int i = 0; i < tam; i++){
			int cont;
			cont = 1;
			
			for(int o = 0; o < i; o++){
				
				if(nombres[i].equals(nombres[o])){
					
					cont++;

				}
			}
		System.out.println(nombres[i] + " " + cont + "º");
	}

}
}

