package Tema_10.Ejercicios_ArrayList.Ejercicio_1_ArrayList;

import java.util.ArrayList;
//import java.util.Iterator;

/**
 * @author Miguel BLanco Fernández
 */
public class Ejercicio_1{
    public static void main(String[] args){
        ArrayList<Producto> producto = new ArrayList<>(9); 

        producto.add(new Producto("sal", 1000));
        producto.add(new Producto("azucar", 2500));
        producto.add(new Producto("pimienta", 3000));
        producto.add(new Producto("oregano", 3000));
        producto.add(new Producto("cacao", 1500));
        for (Producto producto2 : producto) {
            System.out.println(producto2);
        }
        producto.remove(3);
        producto.remove(0);
        producto.add(2, new Producto("queso", 500));
        for (Producto producto2 : producto) {
            System.out.println(producto2);
        }
        producto.removeAll(producto);
    }
}