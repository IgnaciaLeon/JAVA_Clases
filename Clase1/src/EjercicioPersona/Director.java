package EjercicioPersona;

public class Director extends Persona {

    //Atributos

    Integer aniosDeExperiencia;
    String postgrado;
    Boolean procrastinar;

    //Constructores

//vacío
    public Director() {
    }
    //lleno


    public Director(String nombre, String genero, Integer edad, Integer aniosDeExperiencia, String postgrado, Boolean procrastinar) {
        super(nombre, genero, edad);
        this.aniosDeExperiencia = aniosDeExperiencia;
        this.postgrado = postgrado;
        this.procrastinar = procrastinar;
    }

    //toString


    @Override
    public String toString() {
        return "Director{" +
                "aniosDeExperiencia=" + aniosDeExperiencia +
                ", postgrado='" + postgrado + '\'' +
                ", procrastinar=" + procrastinar +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }
    // Métodos

    public Integer anios () {
        System.out.println("Los años de experiencia son: " + aniosDeExperiencia);
        return null;
    }
     public Integer caminar (int kilometros) {
         System.out.println("Estoy caminando " + kilometros + "kilometros");
         return null;
     }


    /* @Override
    public String toString() {
        return super.toString() + "Director [aniosDeExperencia=" + aniosDeExperiencia + ", procrastinar=" + procrastinar
                + ", postgrado=" + postgrado + "]";
    }

     */



}
