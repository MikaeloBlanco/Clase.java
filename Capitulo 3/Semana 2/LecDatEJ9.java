import java.util.Scanner;


/*Este programa es de calcular el volumen de un cono.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ9{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double altura;
		double radio;
		double pi;
		pi = 3.14;
		
		System.out.print("Por favor introduzca tanto la altura como el radio de su cono: ");
		altura = s.nextDouble();
		radio = s.nextDouble();
		
		double volumen;
		volumen = ( radio * radio * altura * pi ) / 3;
		System.out.printf("El volumen de su cono es de %.3f: ", volumen);
		}
	}
