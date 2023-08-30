package C723082023;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

    /*

       System.out.println("Está funcionando");

      //OPERADORES:
        //1.Aritméticos (+ , - , * , / , % , ++ , --)(para hacer operaciones)

        Integer num1 = 5;
        Integer num2 = 3;
        Integer num3 = 5;
        Integer num4 = 3;

        Integer suma = num1 + num2;

        System.out.println("El resultado de la operación es: " + (num1 % num2));

        //2. Comparación (= , < , > , != , == , <= , >=) (nos dan como resultado un boolean)
        //el = es un caracter reservado para darle un valor a una variable

        System.out.println(num1 == num3);
        System.out.println(num1 != num2);


        //3. Lógicos     (&& [and], || [or] , ![negación])

        System.out.println("El resultado es: " + ((num1 == num3) && (num2 == num4)));
        // si una de las dos expresiones es falsa, el resultado será falso
        //si las dos expresiones son verdaderas, el resultado será verdadero
        //https://es.wikipedia.org/wiki/Tabla_de_verdad

        System.out.println("El resultado de las comparaciones es: " + ((num1 == num3) || (num1 == num4)));
        //si una de las expresiones es verdadera, el resultado será verdadero

        System.out.println("El resultado de las comparaciones es: " + (((num1 == num4) || (num1 == num3)) && (num4 == num1)));
        //se pueden concatenar múltiples operaciones, en este caso, primero se calcula num1 == num4 con num1 == num3,
        //y el resultado de eso luego se compara con num4 == num1

        System.out.println(!(num1 == num3));
        // ! invierte el resultado

        //Condicionales
        if (num1 == num3) {
            System.out.println("es verdadero");
        }else{
            System.out.println("es falso");
        }

//Programa para crear notas de estudiantes ejercicio 1

//EJERCICIO

      //  *****Programa para ingresar notas de estudiantes******
       // - Crear un menú para ingresar al programa
      //  - Pedir 3 notas al estudiante
        //- Obtener el promedio
      //  - Según el resultado, imprimir:
       // - Si obtuvo menos de 5 pts:  "Reprueba"
           //     - Si obtuvo 5 pts: "Aprobaste, pero debes seguir estudiando"
            //    - Si obtuvo más de 7: "Felicidades, sigue así"


        Scanner sc = new Scanner (System.in);
        System.out.println("Pon tu primera calificación");
        double nota1 = Double.parseDouble(sc.nextLine());

        System.out.println("Pon tu segunda calificación");
        double nota2 = Double.parseDouble(sc.nextLine());

        System.out.println("Pon tu tercera calificación");
        double nota3 = Double.parseDouble(sc.nextLine());


      Double promedio = ((nota1 + nota2 + nota3)/3);
        System.out.println(promedio);

        if(promedio < 5.0) {
            System.out.println("Reprobaste");
        } else if (promedio >= 5.0 && promedio < 7) {
            System.out.println("Aprobaste, pero debes seguir estudiando");
        } else if (promedio >= 7) {
            System.out.println("Felicidades, sigue así");

        }

        sc.close();



      //import java.text.DecimalFormat;
      //DecimalFormat df = new DecimalFormat("#.##");
      //df.format(promedio);
      //para poner decimales con sólo 2 dígitos



        Integer dat1 = 5;
        Integer dat2 = 3;
        Integer dat3 = 5;
        Integer dat4 = 3;

        Integer sumar = dat1 + dat2;

        if (dat1 == dat4) {
            System.out.println("es verdadero");
        } else if (sumar >= 10) {
            System.out.println("lo lograste!");

    }else{
            System.out.println("es falso");
        // cuando sabemos que tenemos muchos casos, podemos achicar el código con el switch case. Lo usamos en vez de
            // poner muchos else if
       //primero vamos a poner la varible que esperamos que se cumpla
        //Math.round() se usa para redondear, redondea al número más cercano
        //Math.floor(): redondea hacia el numero más bajo
        //Math.random: nos genera un numero al azar entre el 0 y el 1



       Integer numRandom = (int) Math.round(Math.random() * 10);
        //lo multiplicamos por 10 para que sea un numero entero y no sea decimal
        // break permite cerrar el código y hacer un exit del codigo
    //default: indica una condicion por defecto, cuando ninguna de las condiciones se cumple, sale esa
        //switch: te ahorra código en los casos en donde todas las condiciones podrían cumplirse

      switch (numRandom) {
            case 1:
                System.out.println("Esta es la primera puerta");
                break;
            case 2:
                System.out.println("Esta es la segunda puerta");
                break;
            case 3:
                System.out.println("Esta es la tercera puerta");
                break;
            case 4:
                System.out.println("Esta es la cuarta puerta");
            case 5:
                System.out.println("Esta es la quinta puerta");
                break;
            case 6:
                System.out.println("Esta es la sexta puerta");
                break;
            case 7:
                System.out.println("Esta es la septima puerta");
            case 8:
                System.out.println("Esta es la octava puerta");
                break;
            case 9:
                System.out.println("Esta es la novena puerta");
                break;
            case 10:
                System.out.println("Esta es la décima puerta");
                break;
                default:
                    System.out.println("Esta no es una puerta");
                    break;
        }




        //BUCLES


        //lo hacemos para ahorrar codigo cuando queremos que un código se ejecute más de 1 vez
        // BUCLE WHILE: es un bucle que se va a ejecutar mientras una condicion resulte true, podríamos utilizarlo de
        //manera infinita. no se usa mucho.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa un número del 1 al 10");
        Integer numEscogido = scanner.nextInt();

        while (numEscogido <= 10){
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
              for (int i = 0; i < 100; i++ ) {
        //         1.-        2.-      3.-
            System.out.println("en esta vuelta i vale: " + i);
        }

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu nombre");

        String nombreUsuario = sc.nextLine();
        for (int i = 0; i < nombreUsuario.length(); i++ ) {

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

     */



    }

}
