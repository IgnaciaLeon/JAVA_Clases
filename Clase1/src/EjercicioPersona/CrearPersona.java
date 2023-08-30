package EjercicioPersona;

public class CrearPersona {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Javi", "hombre", 28);
        System.out.println(persona1);

        String saludo = persona1.saludar();
        String bday = persona1.cumpleanios();
        String presentacion = persona1.describir();


        //Estudiante estudiante1 = new Estudiante("Liz", "mujer", 26, 5.8, 6.7);
        Estudiante estudiante1 = new Estudiante("Liz", "mujer", 26, 5.8, 6.7);
        Double promedioNotas = estudiante1.promedio(estudiante1.nota1, estudiante1.nota2);
        System.out.println("El promedio es: " + promedioNotas);


    }
}
