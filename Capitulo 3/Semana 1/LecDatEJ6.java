/*Este programa es de uso de la introduccion de datos para calcular el area de un triangulo.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ6{
	public static void main(String[] args){
		String area;
		
		double x;
		double y;
		
		System.out.println("Introduce la altura de su triangulo: ");
		area = System.console().readLine();
		x = Double.parseDouble(area);
		
		System.out.println("Introduce la base de su triangulo: ");
		area = System.console().readLine();
		y = Double.parseDouble(area);
		
		double calcArea;
		calcArea = ( x * y )/2;
		System.out.println("El resultado del area del triangulo es de: " + calcArea);
	}
}
