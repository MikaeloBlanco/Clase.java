package Tema_10.Ejercicios_ArrayList.Ejercicio_1_ArrayList;
/**
 * Clase producto
 * @author Miguel Blanco Fernández
*/
public class Producto{
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}