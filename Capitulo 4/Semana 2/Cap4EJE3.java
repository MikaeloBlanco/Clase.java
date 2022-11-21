import java.util.Scanner;

/*
* Este programa selecciona los dias de la semana.
*
* MiguelBlanco
*/
public class Cap4EJE3 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		String diaSemana;
		
		System.out.print("Por favor, introduzca un número de día: ");
		a = s.nextInt();
		
		switch(a){
			case 1:
				diaSemana = "Lunes";
				break;
			case 2:
				diaSemana = "Martes";
				break;
			case 3:
				diaSemana = "Miercoles";
				break;
			case 4:
				diaSemana = "Jueves";
				break;
			case 5:
				diaSemana = "Viernes";
				break;
			case 6:
				diaSemana = "Sabado";
				break;
			case 7:
				diaSemana = "Domingo";
				break;
			default:
				diaSemana = "no existe ese dia de la semana";
			}
		System.out.println("Día " + a + ": " + diaSemana);
	}
}
