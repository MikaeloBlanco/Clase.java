import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array14{
	public static void main(String[] args){
		
		int tam;
		tam = 8;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];
		int cont = 0;
		int cont2 = 0;
		String[] palabras = new String[tam];
		String[] reorPalabras = new String[tam]; //String array el cual sirve de auxiliar
		String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		
		System.out.print("Introduce 8 palabras: ");
		for(int i = 0; i < tam; i++){
		
			palabras[i] = s.next();
			num[i] = cont2;
			cont2++;
			
			for (String c : color) {
			
				if (palabras[i].equals(c)) {
				
					reorPalabras[cont++] = c;
				
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			
			boolean esColor = false;
			
				for (String c : color) {
					
					if (palabras[i].equals(c)) {
						
							esColor = true;
							
						}
					}
					
					
				if (!esColor) {
					
				reorPalabras[cont++] = palabras[i];
				
				}
				
			}
		
		
		
		System.out.println("Array Original: ");
		
		for(int i = 0; i < tam; i++){//Array original;
		
			System.out.print("  " + num[i] + "  ");
			
		}
		
		for(int o = 0; o < 2; o++){
			
				System.out.println("");
			
			}
			
		for(int i = 0; i < tam; i++){
			
				System.out.print(palabras[i] + "  ");
			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Array Resultado: ");
		
		for(int i = 0; i < tam; i++){//Array resultado;
		
			System.out.print("  " + num[i] + "  ");
			
		}
		
		for(int o = 0; o < 2; o++){
			
				System.out.println("");
			
			}
			
		for(int i = 0; i < tam; i++){
			
				System.out.print(reorPalabras[i] + "  ");
			
		}
}
}
