package C723082023;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        Integer num1 = 5;
        Integer num3 = 5;


        //Condicionales
        if (num1 == num3) {
            System.out.println("es verdadero");
        } else {
            System.out.println("es falso");
        }

//Programa para crear notas de estudiantes ejercicio 1

//EJERCICIO

        //  Programa para ingresar notas de estudiantes
        // - Crear un menú para ingresar al programa
        //  - Pedir 3 notas al estudiante
        //- Obtener el promedio
        //  - Según el resultado, imprimir:
        // - Si obtuvo menos de 5 pts:  "Reprueba"
        //     - Si obtuvo 5 pts: "Aprobaste, pero debes seguir estudiando"
        //    - Si obtuvo más de 7: "Felicidades, sigue así"

        Scanner sel = new Scanner(System.in);
        System.out.println("Bienvenido al programa, ingresa los siguientes datos:" + "\n tu primera calificación: ");
        Double nota1 = Double.parseDouble(sel.nextLine()); //se puede ustar este método para pasar la información double a String
        System.out.println("Ahora, ingresa tu segunda calificación: ");
        Double nota2 = Double.parseDouble(sel.nextLine());
        System.out.println("Ingresa tu tercera calificación: ");
        Double nota3 = Double.parseDouble(sel.nextLine());

        Double promedio = ((nota1 + nota2 + nota3) / 3);
        System.out.println("El promedio es: " + promedio);

        if (promedio < 5.0) {
            System.out.println("Reprobaste");
        } else if (promedio >= 5.0 && promedio < 7) {
            System.out.println("Aprobaste, pero debes seguir estudiando");
        } else {
            System.out.println("Felicidades, sigue así");

            sel.close(); //para cerrar el system.in y que no siga andando


            //DecimalFormat: Es una clase de Java que nos permite mostrar los números  con un formato deseado, puede
            // ser limitando los dígitos  decimales, si usaremos punto o coma, etc.
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(5.765432));


            Integer dat1 = 5;
            Integer dat2 = 3;
            Integer dat3 = 5;
            Integer dat4 = 3;

            Integer sumar = dat1 + dat2;

            if (dat1 == dat4) {
                System.out.println("es verdadero");
            } else if (sumar >= 10) {
                System.out.println("lo lograste!");

            } else {
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


            }
        }
    }
}


