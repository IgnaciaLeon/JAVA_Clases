package EjercicioPersona;

public class Trabajador extends Persona {

   int sueldo;

   int bonos;

   //
    public Trabajador() {
    }

    public Trabajador(Integer sueldo, Integer bonos) {
        this.sueldo = sueldo;
        this.bonos = bonos;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "sueldo=" + sueldo +
                ", bonos=" + bonos +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Trabajador(String nombre, String genero, Integer edad, Integer sueldo, Integer bonos) {
        super(nombre, genero, edad);
        this.sueldo = sueldo;
        this.bonos = bonos;

        //

      /*
        public Double sueldobruto = double sueldo, double bonos) {
            int resultado = (sueldo + bonos);
            return resultado;
        }


       */







    }
}
