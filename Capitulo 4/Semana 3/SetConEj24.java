import java.util.Scanner;

/*
* Este programa calcula la nómina de un empleado.
*
* MiguelBlanco
*/
public class SetConEj24 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		double sueldo;
		double bruto;
		double neto;
		double dieta;
		double reten;
		String retenPorc;
		retenPorc = "";
		sueldo = 0;
		reten = 0;
		
		System.out.println("1 - Programador/a junior ");
		System.out.println("2 - Prog. senior ");
		System.out.println("3 - Jefe de Proyecto ");
		
		System.out.print("Introduzca el cargo del empleado ( 1 - 3 ): ");
		a = s.nextInt();
		
		System.out.print("Cuántos días ha estado de viaje visitando clientes?: ");
		b = s.nextInt();
		
		System.out.print("Introduzca su estado civil ( 1 - Soltero/a, 2 - Casado/a ): ");
		c = s.nextInt();
		
		switch(a){
			
			case 1:
				sueldo = 950;
				break;
			case 2:
				sueldo = 1200;
				break;
			case 3:
				sueldo = 1600;
				break;
			}
		
		dieta = b * 30;		
		bruto = sueldo + dieta;
		
		switch(c){
			
			case 1:
				reten = ( bruto * 25 ) /100;
				retenPorc = "25%";
				break;
			case 2:
				reten = ( bruto * 20 ) /100;
				retenPorc = "20%";
				break;
			
			}
			
		neto = bruto - reten;
		
		System.out.print(" Sueldo base 		");
		System.out.printf("%.2f \n",sueldo);
		System.out.print(" Dietas ( " + b + " viajes )	");
		System.out.printf("%.2f \n",dieta);
		System.out.println("---------------");
		System.out.print(" Sueldo Bruto 		");
		System.out.printf("%.2f \n",bruto);
		System.out.print(" Retención (" + retenPorc + ")	");
		System.out.printf("%.2f\n",reten);
		System.out.println("---------------");
		System.out.print(" Sueldo neto		");
		System.out.printf("%.2f \n",neto);
	}
}
