package Ejercicio_11;

import java.text.DecimalFormat;

public class TarjetaRegalo {

    private double cantidadTarjeta;
    String numero;
    

    TarjetaRegalo(double n){

        cantidadTarjeta = n;

        this.numero = "";
        for(int i = 0; i < 5; i++){

            this.numero += (int) (Math.random() * 10);

        }

    }

    public void gasta(double n){

        this.cantidadTarjeta =  cantidadTarjeta - n;

        if(this.cantidadTarjeta <= 0){

            System.out.println("No se puede gastar más de lo que tiene la tarjeta");

            this.cantidadTarjeta = cantidadTarjeta + n;

        }

    }

    public double getCantidadTarjeta(){

        return cantidadTarjeta;

    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t){

        double nuevoSaldo = this.getCantidadTarjeta() + t.getCantidadTarjeta();

        this.setCantidadTarjeta(0);
        t.setCantidadTarjeta(0);

        return new TarjetaRegalo(nuevoSaldo);

    }   

    public void setCantidadTarjeta(double cantidadTarjeta){

        this.cantidadTarjeta = cantidadTarjeta;

    }

    @Override
    public String toString(){

        DecimalFormat centimos = new DecimalFormat("0.00");
        
        return "Tarjeta nº " + numero + " - Saldo " + centimos.format(cantidadTarjeta) + " $"; 

    }
    
}
