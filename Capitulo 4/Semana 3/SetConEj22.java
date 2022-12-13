import java.util.Scanner;

/*
* Este programa calcula el tiempo restante antes del fin de semana.
*
* MiguelBlanco
*/
public class SetConEj22 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int hora;
		int minuto;
		String dia;
		int diaH;
		int minFin;
		
		System.out.print("Introduce el Dia, la hora y minutos actual(Solo dia de diario): ");
		dia = s.next();
		hora = s.nextInt();
		minuto = s.nextInt();
		
		diaH = 24 * 60;
		
		hora = hora * 60;
		
		int total;
		total = hora + minuto;
		
		dia = dia.toLowerCase();
		
		switch(dia){
		
			case "lunes":
				diaH = diaH * 4;
				minFin = 15 * 60;
				total = ( diaH - total ) + minFin;
				System.out.println("El tiempo restante hasta el fin de semana es de: " + total + " minutos");
				break;
						
			case "martes":
				diaH = diaH * 3;
				minFin = 15 * 60;
				total = ( diaH - total ) + minFin;
				System.out.println("El tiempo restante hasta el fin de semana es de: " + total + " minutos");
				break;
		
			case "miercoles":
				diaH = diaH * 2;
				minFin = 15 * 60;
				total = ( diaH - total ) + minFin;
				System.out.println("El tiempo restante hasta el fin de semana es de: " + total + " minutos");
				break;
		
			case "jueves":
				minFin = 15 * 60;
				total = ( diaH - total ) + minFin;
				System.out.println("El tiempo restante hasta el fin de semana es de: " + total + " minutos");
				break;
		
			case "viernes":
				minFin = 15 * 60;
				total = minFin - total;
				if(total > 0){
					System.out.println("El tiempo restante hasta el fin de semana es de: " + total + " minutos");
				} else {
					System.out.println("El tiempo colocado es mayor al del fin de semana");
				}
				break;
			
			default:
				System.out.println("Introducido un dia inexistente. Cerrando");
				System.exit(0);
	}
		
	}
}
