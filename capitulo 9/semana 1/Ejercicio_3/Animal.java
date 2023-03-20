package Ejercicio_3;



public abstract class Animal {//Raiz clase animal
    
    private Sexo sexo;//Variable privada sexo que guarda dentro de sí el seño del animal
    
    public Animal () {//constructor basico de animal
    
        this.sexo = Sexo.MACHO;
    
    }
    
    public Animal (Sexo s) {//Segundo contructor de animal con la variable privada sexo
    
        this.sexo = s;
    
    }
    
    public Sexo getSexo() {//Getter(Obtenedor) de la variable sexo
    
        return this.sexo;
    
    }
    
    //Acciones que realizan los animales

    public void duerme() {//Función duerme invoca la salida de dormir que son un conjunto de cetas
    
        System.out.println("Zzzzzzz");
    
    }
    
    public void come(String comida) {//Función come invoca la salida de comer que es un texto concatenado a una variable de cadena de caracteres denominada comida
    
        System.out.println("Estoy comiendo " + comida);
    
    }
    
    public enum Sexo {//Función Sexo que restringe loos posibles sexos de 

        MACHO, HEMBRA
    
    }
    
}