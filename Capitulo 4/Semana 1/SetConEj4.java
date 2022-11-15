import java.util.Scanner;

/*
* Este programa da la cantidad de dinero que uno genera durante su semana con horas y sin horas extra.
*
* MiguelBlanco
*/
public class SetConEj4 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sueldo;
		int hora;
		
		System.out.print("Por favor, introduzca el número de horas que trabaja durante la semana: ");
		hora = s.nextInt();
		
		sueldo = 12;
		int total;
		total = sueldo * hora;
		
		if ( hora < 40 ){
			System.out.println("El sueldo semanal que le corresponde es de " + total + " euros");
		} else {
			hora = hora - 40;
			int extra;
			int sueldoExtra;
			sueldoExtra = 16;
			extra = hora * sueldoExtra;
			total = total + extra;
			
			
			System.out.println("el sueldo semanal con sus horas extra que le corresponde es de " + total + " euros");
			}
		}
	}
