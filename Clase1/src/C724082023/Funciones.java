package C724082023;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {

        //Los métodos en java se declaran primero declarando un modificador de acceso que puede ser público, privado,
        // protegido, etc,
        //eso va a depender de un principio llamado "encapsulación".
        //Público significa que podemos acceder desde cualquier otro package o parte de nuestra aplicacion
        //static: indica si el metodo es accequible al momento de crear una instancia, en otras palabras,
        // si puedo acceder a él al invocar la clase.
        //instancia: es cuando materializamos un objeto, le damos un lugar en la memoria
        //static es una palabra reservada que indica que no es necesaria una instancia de la clase para acceder al método
        //void: esta funcion no va a retornar un valor con el cual yo pueda trabajar, no puede ejecutar nada con esta
        // variable. La lleva el metodo main para permitirme ejecutar el programa.
        //void permite que las otras funciones que escribamos posteriormente tengan un retorno
        //la funcion base inicial como tal tiene parámetros, en este caso el metodo main recibe un array de strings []
        // y se llamará args
        //Parámetro: es el nombre que recibe lo que va dentro de la función cuando la declaramos, los parámetros definen
        // el tipo y el nombre de las variables que la función espera recibir
        //Argumento: cuando uno ya llama la lo que va dentro de la función pasa de llamarse parámetro a argumento.
        //Las funciones son iguales a los métodos, con la única diferencia de que el método le pertenece a una clase.



        //EJ FUNCIÓN 1

        //String miNombre = imprimirNombre("Ignacia");
        //System.out.println(miNombre);
        //en vez de hacer esto cuando queramos imprimir muchos valores, podemos crear una funcion, como a continuacion:

        System.out.println("Estas son las funciones");

        imprimirNombre("Cyberpunk", "Cohorte 7", 7);
        imprimirNombre("Lovelace", "Cohorte 3", 3);
        imprimirNombre("Hamilton", "Cohorte 2", 2);

        //las variables en este caso las estamos llamando antes y declarándolas después, en java se pueden poner
        // las variables imprimirNombre antes o después de mi función.

    }

    public static String imprimirNombre(String nombre, String apellido, Integer edad) {
        System.out.println("********");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
            //charAt es un método de los String que permite ver el carácter en una posición
        }
        return "Tu nombre es " + nombre + ", tu apellido es " + apellido + ", tu edad es " + edad;
    }

    //EJ FUNCiÓN 2
    //Otro ejemplo de función, aquí, a diferencia de la función imprimirNombre, estamos declarando la función primero
    //y llamándola después

    public static int sumar(int num1, int num2) {


       System.out.println("El resultado de la suma es " + sumar(10, 10));

       Integer resultadoSuma = sumar(20, 20);
      System.out.println(resultadoSuma);

        return num1 + num2;



    }

}



