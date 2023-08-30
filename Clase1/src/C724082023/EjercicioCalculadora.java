
/* package C724082023;

import java.util.Scanner;

public class EjercicioCalculadora {
public static void main(String[] args) {
    EjercicioCalculadora calculadoraNueva = new EjercicioCalculadora;


    //EJERCICIO CLASE CREA UNA CALCULADORA

    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa el primer número");
    double numone = scan.nextDouble();

    System.out.println("Ingresa el segundo número");
    double numtwo = scan.nextDouble();

    System.out.println("Ingresa el operador que deseas realizar (+, -, *, /, %)");
    char operador = scan.next().charAt(0);

    double resultado = calculadora(numone, numtwo, operador);
    System.out.println("El resultado de " + numone + " " + operador + " " + numtwo + " da como resultado: " + resultado);

    scan.close();
}
//En el bloque de arriba estamos realizando primero el menú de lo que vamos a pedir


public static Double calculadora(double dato1, double dato2, char caracter) {
    double resultado = 0;

    switch (caracter) {
        case '+':
            resultado = dato1 + dato2;
            break;
        case '-':
            resultado = dato1 - dato2;
            break;
        case '/':
            resultado = dato1 / dato2;
            break;
        case '*':
            resultado = dato1 * dato2;
            break;
        case '%':
            resultado = dato1 % dato2;
            break;
    }
    return resultado;


    }
}
*/
