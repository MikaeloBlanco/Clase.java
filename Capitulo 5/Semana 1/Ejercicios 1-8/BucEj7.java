import java.util.Scanner;

/*
*
*Este programa trata de verificar el control de acceso de una caja fuerte.
*
*Miguel Blanco Fernandez
*
*/
public class BucEj7 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int cont;
		int repe;
		int cifUno;
		int cifDos;
		int cifTres;
		int cifCuatro;
		repe = 0;
		
		
		System.out.println("Te hallas ante una cafa fuerte cifrada. Dentro se encuentran tus llaves de la cerradura de tu puerta, pero debido a que no te acuerdas de la contraseña deberas intentar averiguarla de nuevo. Son solo 4 los intentos para abrirla o si no deberas llamar al cerrajero");
		System.out.println("------------------------------");
		
		cont = 0;
		
		while( cont < 4 ){
			do{
			
				System.out.print("Introduce el primer dígito de la combinación: ");
				cifUno = s.nextInt();
				
				if ( cifUno == 3 ){
					System.out.println("*TICK*");
					repe++;
				} else {
					System.out.println("*TACK*");
				}
				
				System.out.print("Introduce el segundo dígito de la combinación: ");
				cifDos = s.nextInt();
				
				
				if ( cifDos == 9 ){
					System.out.println("*TICK*");
					repe++;
				} else {
					System.out.println("*TACK*");
				}
				
				System.out.print("Introduce el tercer dígito de la combinación: ");
				cifTres = s.nextInt();
				
				
				if ( cifTres == 5 ){
					System.out.println("*TICK*");
					repe++;
				} else {
					System.out.println("*TACK*");
				}
				
				
				System.out.print("Introduce el cuarto dígito de la combinación: ");
				cifCuatro = s.nextInt();
				
				if ( cifCuatro == 2 ){
					System.out.println("*TICK*");
					repe++;
				} else {
					System.out.println("*TACK*");
				}
				
				if ( repe == 4 ){
					System.out.println("Felicidades, conseguiste de vueltas tus llaves y pudiste salir de tu casa sin preocuparte por ello. Te mereces un descanso");
					System.exit(0);
				} else {
					System.out.println("Parece que no pudo conseguir adivinar esta vez la combinación. ¡Pero no se preocupe! Aun tiene oportunidad para abrirla");
				}
				
				repe = 0;
				cont = cont + 1;
					
				
				}while( cont < 4);
			}
			System.out.println("Pero me temo que no pudo adivinarla después de cuatro intentos. Quiza sea mejor llamar al cerrajero y que la abra o comprar una replica de su llave. Que perdida de tiempo más grande");
		}
	}
				
