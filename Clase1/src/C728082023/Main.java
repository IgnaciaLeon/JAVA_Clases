package C728082023;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*

        //Se va a importar un package siempre que, cuando importemos algo, estemos en otra carpeta o directorio,
        //en caso de que la clase o archivo se encunetre en el mismo package, no se
        //importará nada.
        //Por buenas párcticas los nombres de las clases siempre empiezan por una mayúscula

        //Para crear nueva instancia:
        //Indicamos el tipo de dato + el nombre de la variable +

        Calculadora calculator = new Calculadora();
        //arriba, primero estamos llamando a la calculadora  que elaboramos en una clase pasada,
        //estamos poniéndole un nombre nuevo a una variable, luego new y luego
        //vuelvo a colocar la calculadora de la clase pasada.

        //Accedemos a un método de instancia
        System.out.println(calculator.sumar(5,5));

        //Acceder a los atributos
        Calculadora calculadoraCasio = new Calculadora("Plata", 10.00, 5.00, "Casio", true, 10, 15);
        System.out.println(calculadoraCasio.toString());



        ArrayList<Chocolate> cajaDeChocolates = new ArrayList<>();

        System.out.println("Iniciamos la fábrica de chocolate");
        for (int i = 1; i < 10; i++) {
            Chocolate chocolateNuevo = new Chocolate("Grande", "Café", "Amargo",
                    "Rectangular", 50);
            cajaDeChocolates.add(chocolateNuevo);
            System.out.println("El chocolate nº:" + i + " tiene las características: " + chocolateNuevo);
        }



       for (int i = 0; i < 1; i++) {
            Estudiante student = new Estudiante("Alejandra", "Suazo", 27, "mujer",
                    79654098, "San Miguel");
            System.out.println(student);
        }


        Estudiante student = new Estudiante("Alejandra", "Suazo", 27, "mujer",
                79654098, "San Miguel");
        System.out.println(student.promedioNotas(5.6, 6.2, 4.5, 6.9));

        //System.out.println(student.pasaDeCurso(student.promedioNotas()));

*/
      //Herencia Padre-Hijo:

        CalculadoraCientifica calculadoraCasioC = new CalculadoraCientifica();
        System.out.println(calculadoraCasioC.restar(50, 20));
        System.out.println(calculadoraCasioC.datosTrigonometricos("Seno"));
        Calculadora calculadoraNormal = new Calculadora();
        //Ejemplo polimorfismo mediante sobreescritura
        System.out.println("En la clase padre el método da como resultado: " + calculadoraNormal.restar(10,5));
        System.out.println("*************************");
        System.out.println("En la clase hija el método da como resultado: " + calculadoraCasioC.restar(10,5));
        //Ejemplo de polimorfismo mediante sobrecarga
        System.out.println("En la clase padre el método da como resultado: " + calculadoraCasioC.sumar(10.43,5.55));


    }
}
