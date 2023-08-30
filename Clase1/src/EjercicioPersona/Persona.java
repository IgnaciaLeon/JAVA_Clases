package EjercicioPersona;

public class Persona {

    //Atributos:
    String nombre;
    String genero;
    Integer edad;

    //Constructores:


    public Persona() {
    }

    public Persona(String nombre, String genero, Integer edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    //ToString:


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }

        //Métodos:
        public String saludar () {
            System.out.println("Hola, ¿cómo estás? soy "+ nombre);
            return null;
        }

        public String cumpleanios () {
            edad++;
            System.out.println("Hoy es mi cumpleaños, ahora tengo " + edad);
            return null;
        }
        public String describir () {
            System.out.println("Mi nombre es " + nombre + ", soy " + genero + " , y tengo " + edad);
            return null;
        }

    }


