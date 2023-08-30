package C724082023;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        Double num1 = scan.nextDouble();

        System.out.println("Ingresa el segundo número");
        Double num2 = scan.nextDouble();

        System.out.println("Ingresa el operador que deseas realizar (+, -, *, /, %, ^, v, !)");
        System.out.println("\u001B[32mSuma(+) | Resta(-) | Multiplicación(*) | Division(/) | Modulo(%) | Elevado(^)" +
                " | Raiz(v) | Factorial(!)");

        char operador = scan.next().charAt(0);

        Double resultado = calculadora(num1, num2, operador);

        if (resultado != null) {
            System.out.println("\u001B[31mEl resultado de " + num1 + " " + operador + " " + num2 + " da como resultado: "
                    + resultado);
        }

        scan.close();
    }

    public static Double calculadora(double dato1, double dato2, char caracter){
        Double resultado = null;


        switch (caracter) {
            case '+' -> resultado = dato1 + dato2;
            case '-' -> resultado = dato1 - dato2;
            case '/' -> resultado = dato1 / dato2;
            case '*' -> resultado = dato1 * dato2;
            case '%' -> resultado = dato1 % dato2;
            case '^' -> resultado = Math.pow(dato1, dato2);
            case 'v' -> raiz(dato1, dato2);
            case '!' -> factorial(dato1, dato2);
            default -> System.out.println("\u001B[31mOperador ingresado " + caracter + " no es válido.");
        }
        return resultado;
    }

    public static Double raiz(double num1, double num2) {
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);

        System.out.println("\u001B[31mLa raiz de " + num1 + " es de: " + raiz1 + ".");
        System.out.println("\u001B[31mLa raiz de " + num2 + " es de: " + raiz2 + ".");

        return raiz1;
    }

    public static  Double factorial(double fact1, double fact2) {
        double factorial1 = 1;
        double factorial2 = 1;

        // Factorial número 1
        for(int i = 1; i <= fact1; i++) {
            factorial1 *= i;
        }
        System.out.println("\u001B[31mEl factorial de " + fact1 + " es de " + factorial1);

        // Factorial número 2
        for(int i = 1; i <= fact2; i++) {
            factorial2 *= i;
        }
        System.out.println("\u001B[31mEl factorial de " + fact2 + " es de " + factorial2);

        return factorial2;

    }

}
