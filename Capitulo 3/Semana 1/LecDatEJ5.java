/*Este programa es de uso de la introduccion de datos para calcular el area de un rectangulo.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ5{
	public static void main(String[] args){
		String area;
		
		int x;
		int y;
		
		System.out.println("Introduce la altura de su rectangulo (Solo los enteros): ");
		area = System.console().readLine();
		x = Integer.parseInt(area);
		
		System.out.println("Introduce la base de su rectangulo (Solo los enteros): ");
		area = System.console().readLine();
		y = Integer.parseInt(area);
		
		int calcArea;
		calcArea = x * y;
		System.out.println("El resultado del area del rectangulo es de: " + calcArea);
	}
}
