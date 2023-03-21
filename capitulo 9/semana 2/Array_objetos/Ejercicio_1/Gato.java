package Array_objetos.Ejercicio_1;

public class Gato {

    //Atributos de la clase Gato
    private String nombre;
    private String color;
    private String raza;

    public void setNombre(String nombre){//Setter(Introductor) de un nombre de tipo String en la variable String nombre
        this.nombre = nombre;
    }

    public String getNombre(){//Getter(Obtenedor) de la variable nombre
        return nombre;
    }

    public void setColor(String color){//Setter de un color de gato en la variable color
        this.color = color;
    }

    public String getColor(){//Getter de la variable color
        return color;
    }

    public void setRaza(String raza){//Setter de una raza de gato en la variable raza
        this.raza = raza;
    }

    public String getRaza(){//Getter de la variable raza
        return raza;
    }

}
