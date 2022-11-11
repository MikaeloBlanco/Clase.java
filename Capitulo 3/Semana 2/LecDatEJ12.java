import java.util.Scanner;


/*Este programa es de calcular la nota necesaria para aprobar el trimestre con la nota que deseas.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ12{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double notExamUno;
		double notTrimes;
		double notExamDos;
		
		System.out.print("Introduce la nota del primer examen: ");
		notExamUno = s.nextDouble();
		
		System.out.print("¿Cual es la nota que quieres sacar este trimestre?: ");
		notTrimes = s.nextDouble();
		
		notExamDos = ( 2 * notTrimes  -  notExamUno * 0.º4 ) * 0.6;
		System.out.printf("Si deseas sacar un %.2f en el trimestre debes sacar un %.2f en el segundo examen", notTrimes, notExamDos);
		}
	}
