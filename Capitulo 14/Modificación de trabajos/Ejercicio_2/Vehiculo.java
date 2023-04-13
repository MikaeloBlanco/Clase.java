package Ejercicio_2;

public class Vehiculo {
    
    // atributos de clase
    private static int kilometrosTotales = 0;
    private static int vehiculosCreados = 0;
    // atributos de instancia
    private int kilometrosRecorridos;


    public Vehiculo() {

        this.kilometrosRecorridos = 0;
        
    }
    
    static int getKmTotales(){

        return kilometrosTotales;

    }

    int getVehiculosCreados(){

        return Vehiculo.vehiculosCreados;

    }

    int getKmRecorridos(){

        return this.kilometrosRecorridos;

    }

    public void recorre(int k) {
        
        this.kilometrosRecorridos += k;

        Vehiculo.kilometrosTotales += k;

        }
    
    public static boolean isValid(String s){
        return s != null && s.matches("[0-9]+");
    }

}

