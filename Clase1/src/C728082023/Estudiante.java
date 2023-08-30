package C728082023;

public class Estudiante {

    //Atributos:
    String nombre;
    String apellido;
    Integer edad;
    String sexo;
    Integer contacto;
    String direccion;

    //Constructores:


    public Estudiante(String nombre, String apellido, Integer edad, String sexo, Integer contacto, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    //ToString

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", contacto=" + contacto +
                ", dirección='" + direccion + '\'' +
                '}';
    }

    //Métodos:

        public Double promedioNotas(double matematicas, double lenguaje, double ciencias, double ingles) {
            System.out.println("El estudiante tiene un promedio general de: ");
            return ((matematicas + lenguaje + ciencias + ingles) /4);
        }

            public Boolean pasaDeCurso(Double promedioNotas) {
                if (promedioNotas >= 5.5) {
                    return true;
                } else {
                    return false;
                }
            }



}
