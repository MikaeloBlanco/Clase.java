public class PruebaCodigo{
	public static void main(String[] args){
		int x = 2;
int y = 9;
double division;
int total;
division = (double) y / (double) x;
// Descomenta la siguiente línea y observa cómo cambia el resultado.
// division = y / x;
System.out.println("El resultado de la división es " + division);
division = y / x;
total = (int)division;
System.out.println("El resultado de la división sin double es " + total);
division = (double)y/x;
total = (int)division;
System.out.println("El resultado si solo y es double es " + division + " pero si se usa total que es un int " + total);
division = (double) (y/x);
total = (int)division;
System.out.println("El resultado si usamos double en ambos es " + division + " pero en el total es " + total);
System.out.print("La perdida de decimal es de 0.5, hay que tener en cuenta que si queremos ser precisos debemos evitar usar ints para las operaciones en decimales");
}
}
