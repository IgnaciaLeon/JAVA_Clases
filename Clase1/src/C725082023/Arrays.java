package C725082023;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Arrays son contenedores de datos pero de un sólo tipo, en JS podemos hacer arrays con varios tipos de datos,
        // number, string, etc, en Java sólo acepta un tipo de dato

        ArrayList<String> estudiantesCyberpunk = new ArrayList<>();
        //Sintaxis para crear un nuevo arreglo
        //La clase arraylist con el tipo de dato, luego el nombre de la variable y para iniciarla creamos la nueva instancia.


        //el array list se va a importar igual que el scanner
        //entre<> vamos a poner el tipo de dato
        //una buena práctica es no agregar los elementos de inmediato, y a medida que vamos construyendo una
        //instancia lo vamos rellenando

        int[] numeros = {1, 2, 4, 5, 7, 8};
        //System.out.println(Arrays.toString(numeros));??
        //este arreglo va a ser fijo y no modificable, no se recomienda usar mucho. Además, a veces imprime mal,
        //en vez del contenido imprime la dirección en la memoria de la variable.
        System.out.println(numeros);

        //Imprimiendo indicando el índice
        System.out.println(numeros[3]);

        //Agregar al ArrayList
        //.add me permite ingresar nuevos datos strings
        estudiantesCyberpunk.add("Angel");
        estudiantesCyberpunk.add("Matías");
        estudiantesCyberpunk.add("Lizette");



        //Arraylist que vamos a utilizar la mayoría de las veces:
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ingresa a un nuevo estudiante");
            String estudiante = sc.nextLine();
            estudiantesCyberpunk.add(estudiante);
        }

        System.out.println(estudiantesCyberpunk);
        System.out.println(estudiantesCyberpunk.size());
        //.size método funciona como la propiedad lenght
        //la diferencia es que el .lenght es una propiedad y el .size es un método
        //.get retorna algo según el índicee indicado, recordar que parte desde el 0

        String estudianteExpulsado = estudiantesCyberpunk.remove(estudiantesCyberpunk.size() - 2 );
        System.out.println(estudianteExpulsado);
        //El set permite cambiar el valor que esté alojado en un índice
        estudiantesCyberpunk.set(0, "Alba");
        System.out.println(estudiantesCyberpunk);
        //El índice en Java también parte desde 0
        System.out.println("El estudiante en la tercera posición es: " + estudiantesCyberpunk.get(2));



      /*
       //Para agregar el índice antes de cada estudiante; similar al console.table (Will)
        for (int i = 0; i < estudiantesCyberpunk.size() - 1; i ++) {
            System.out.print("[" + i + "]" + " ");
            System.out.println(estudiantesCyberpunk.get(i));
        }

       */

    }
}
