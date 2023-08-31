package C723082023;

public class Operadores {
    public static void main(String[] args) {

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



    }


}
