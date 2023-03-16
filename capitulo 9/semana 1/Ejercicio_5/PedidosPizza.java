package Ejercicio_5;

import java.util.Scanner;

public class PedidosPizza {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);   
    String tamañoPizza;
    String tipoPizza;
    

    System.out.println("Introduce un tamaño de pizza(mediana o familiar): ");
    
    tamañoPizza = s.next();

    System.out.println("Introduce el tipo de pizza que desea(margarita, cuatro quesos o funghi): ");

    tipoPizza = s.next();
    
    Pizza p1 = new Pizza(tamañoPizza, tipoPizza);

    Pizza p2 = new Pizza("cuatro quesos", "familiar");

    Pizza p3 = new Pizza("funghi" , "mediana");

    p1.sirve();

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    p3.sirve();

    p1.sirve();

    System.out.println("pedidas: " + Pizza.getTotalPedidas());

    System.out.println("servidas: " + Pizza.getTotalServidas());

    }
    
}

