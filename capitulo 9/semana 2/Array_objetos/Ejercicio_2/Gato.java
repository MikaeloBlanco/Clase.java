package Array_objetos.Ejercicio_2;

public class Gato {

    //Atributos de la clase Gato
    private String nombre;
    private String color;
    private String raza;
    //Contructor de la clase Gato
    public Gato(String nombre, String color, String raza){
        this.nombre = nombre;
        this.color= color;
        this.raza = raza;
    }

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

    public void comeSardinas(int x){
        int y = 10;//cantidad de sardinas
        int cont;
        cont = y - x;

        for(int i = 0; i < cont; i++){
            if(cont > 0){
                System.out.print("Niam ");
            } else {
                System.out.print("No quedan sardinas ");
            }
        }
            System.out.print("\n\n");
        }
}

