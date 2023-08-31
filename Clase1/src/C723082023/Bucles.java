package C723082023;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        //BUCLES


        //lo hacemos para ahorrar codigo cuando queremos que un código se ejecute más de 1 vez
        // BUCLE WHILE: es un bucle que se va a ejecutar mientras una condicion resulte true, podríamos utilizarlo de
        //manera infinita. no se usa mucho.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa un número del 1 al 10");
        Integer numEscogido = scanner.nextInt();

       while (numEscogido <= 10) {
          System.out.println("En la " + numEscogido + "vuelta, el número es: " + numEscogido);
            numEscogido++;
        }
        // si es verdadero el bloque de scanner, se imprime el bucle y se le sumará 1 número.


        //BUCLE DO WHILE: se va a ejecutar siempre a lo menos 1 vez. como por ejemplo un menú interactivo para un cliente.
        //se va a ejecutar al menos 1 vez aunque la condición no se cumpla
        Integer opcion = 0;

        do {
            System.out.println("seleccione una opción: 1- Entrar al promedio de notas y 2- El cuadro de honor");
            opcion = scanner.nextInt();
        } while (opcion != 3);


        //BUCLE FOR: es una forma más resumida, con distinta sintaxis, muy similar al bucle while.
        // si es que la condición se especifica para que no se cumpla nunca, el bucle for si puede generar un bucle infinito.
        //Pasos para crear un bucle for:
        //1.- creamos una variable iteradora o acumuladora, que es la que va a ir contando
        //2.- le indicamos la condicion de termino
        //3.- La accion con cada iteración, que va a pasar una vez se cumpla la condicion
        for (int i = 0; i < 100; i++) {
            //         1.-        2.-      3.-
            System.out.println("en esta vuelta i vale: " + i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");

        String nombreUsuario = sc.nextLine();
        for (int i = 0; i < nombreUsuario.length(); i++) {

            System.out.println(nombreUsuario.charAt(i));
        }

        Integer variableAcumuladora = 0;
        while (variableAcumuladora < nombreUsuario.length()) {
            System.out.println(nombreUsuario.charAt(variableAcumuladora));
            variableAcumuladora++;

        }


        //se suele usar el bucle while cuando la cantidad de iteraciones es desconocida y depende de una condición que cambia
        // dentro del bucle, y utiliza el bucle for cuando conoces la cantidad exacta de iteraciones y deseas mantener todas las
        // partes relacionadas en una estructura más compacta.



    }


}

