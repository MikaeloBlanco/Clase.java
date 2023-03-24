package Array_objetos.Ejercicio_3;

public class Articulo {
    private String codigo ="DISPONIBLE";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public enum codigo{
        DISPONIBLE, NO_DISPONIBLE, EN_PROCESO, REPONIENDO
    }

    public void setCodigo(String c){
        this.codigo = c;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setPrecioVenta(double p){
        this.precioVenta = p;
    }

    public double getPrecioVenta(){
        return precioVenta;
    }

    public void setPrecioCompra(double p){
        this.precioCompra = p;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }

    public void setStock(int s){
        this.stock = s;
    }

    public int getStock(){
        return stock;
    }

    public void setDescripcion(String d){
        this.descripcion = d;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
