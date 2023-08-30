package EjercicioPersona;

public class Estudiante extends Persona {

Double nota1;
Double nota2;

    public Estudiante() {
    }

    public Estudiante(String nombre, String genero, Integer edad, Double nota1, Double nota2) {
        super(nombre, genero, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Double promedio (double nota1, double nota2){
        double resultado = (nota1 + nota2) / 2;
        return resultado;
    }




}


