import java.util.Scanner;


/*Este programa es de calcular el salario semanal de una persona.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ8{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int horas;
		int salario;
		int salarioSemanal;
		salario = 12;
		
		System.out.print("Introduzca las horas que trabaja al dia: ");
		horas = s.nextInt();
		
		salarioSemanal = (salario * horas) * 7;
		System.out.print("Usted gana a la semana un total de: " + salarioSemanal + " Euros");
		}
	}
