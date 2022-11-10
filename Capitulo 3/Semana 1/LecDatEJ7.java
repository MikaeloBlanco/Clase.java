/*Este programa es de uso de la introduccion de datos para calcular el area de un triangulo.
*
* 
* Miguel Blanco Fernandez
*/
public class LecDatEJ7{
	public static void main(String[] args){
		String precio;
		
		double x;
		double iva;
		iva = 1.21;
		
		System.out.println("Introduce el predio del producto que desea comprobar: ");
		precio = System.console().readLine();
		x = Double.parseDouble(precio);
		
		
		double calcPrecio;
		calcPrecio = x * iva;
		System.out.printf("El resultado del precio con IVA es de: %.2f Euros", calcPrecio);
	}
}
