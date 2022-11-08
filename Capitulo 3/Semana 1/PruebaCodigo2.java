//Era hora de ir introduciendo nuevo codigo. Hora de introducir datos por teclado. MiguelBlanco//
public class PruebaCodigo2{
  public static void main(String[] args){
	String nombre;
	String apellido;
	System.out.println("Por favor, dime tu nombre: ");
	nombre = System.console().readLine();
	System.out.println("Por favor, tambien di tu apellido primero: ");
	apellido = System.console().readLine();
	System.out.println("Hola " + nombre + " " + apellido + ", es un placer conocerle"); 	
  }
}
