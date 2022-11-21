import java.util.Scanner;

/*
* Este programa selecciona los meses del año y su temporada.
*
* MiguelBlanco
*/
public class Cap4EJE4 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		String mesAnno;
		String tempo;
		
		System.out.print("Por favor, introduzca un número de día: ");
		a = s.nextInt();
		
		switch(a){
			case 1:
				mesAnno = "Enero";
				break;
			case 2:
				mesAnno = "Febrero";
				break;
			case 3:
				mesAnno = "Marzo";
				break;
			case 4:
				mesAnno = "Abril";
				break;
			case 5:
				mesAnno = "Mayo";
				break;
			case 6:
				mesAnno = "Junio";
				break;
			case 7:
				mesAnno = "Julio";
				break;
			case 8:
				mesAnno = "Agosto";
				break;
			case 9:
				mesAnno = "Septiembre";
				break;
			case 10:
				mesAnno = "Octubre";
				break;
			case 11:
				mesAnno = "Noviembre";
				break;
			case 12:
				mesAnno = "Diciembre";
				break;
			default:
				mesAnno = "no existe ese mes";
			}
		if ( (a <= 2) && ( a > 0 ) || ( a == 12) ){
			tempo = "Invierno";
			System.out.println("Mes " + a + ": " + mesAnno + ". Esta estación es: " + tempo);
			}
		if ( ( a >= 3 ) && ( a <= 5 ) ){
			tempo = "Primavera";
			System.out.println("Mes " + a + ": " + mesAnno + ". Esta estación es: " + tempo);
			}
		if ( ( a >= 6 ) && ( a <= 8 ) ){
			tempo = "Verano";
			System.out.println("Mes " + a + ": " + mesAnno + ". Esta estación es: " + tempo);
			}
		if ( ( a >= 9 ) && ( a <= 11) ){
		  tempo = "Otoño";
			System.out.println("Mes " + a + ": " + mesAnno + ". Esta estación es: " + tempo);
			}
		if ( ( a < 0 ) || ( a > 12 ) ){
			tempo = "Imposible";
			System.out.println("Mes " + a + ": " + mesAnno + ". Esta estación es: " + tempo);
			}
	}
}
