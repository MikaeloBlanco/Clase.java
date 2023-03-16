package Ejercicio_9.Terminal;

public class Terminal {

    private String numero;
    private int timepoDeConversacion;

    public Terminal(String numero){

        this.numero = numero;

        this.timepoDeConversacion = 0;

    }

    public String getNumero(){

        return numero;

    }

    public void setNumero(String numero){

        this.numero = numero;

    }

    public int getTiempoDeConversacion(){

        return timepoDeConversacion;

    }

    public void setTiempoDeConversacion(int timepoDeConversacion){

        this.timepoDeConversacion = timepoDeConversacion;

    }

    @Override
    public String toString(){

        return "Nº " + numero + " - " + this.timepoDeConversacion + "s de conversación";

    }

    public void llama(Terminal t, int segundosDeLlamada){

        this.timepoDeConversacion += segundosDeLlamada;

        t.timepoDeConversacion += segundosDeLlamada;
    }

}
