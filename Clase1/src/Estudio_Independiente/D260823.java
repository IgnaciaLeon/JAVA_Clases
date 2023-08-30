package Estudio_Independiente;

import java.util.Scanner;

//Crear una función que reciba un solo argumento y retorne el valor multiplicado

public class D260823 {

   //ejercicio 3: detector de pares e impares

   public static String detectorDeImpares ( int num1){
      if (num1 % 2 == 0) {
         return "Es par";
      } else {
         return "Es impar";
      }


   }

   public static void main(String[] args) {

      detectorDeImpares(7);



      /*
      public static Double calculadorDePropinas() {

      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa el monto total: ");
      Double total = sc.nextDouble();
      System.out.println("¿Qué porcentaje de propina desea agregar?");
      Double propina = sc.nextDouble();
      Double totalConPropina = total + (total * (propina / 100));
      return totalConPropina;
   }

    public static void main(String[] args) {


       /*
     int num1 = 10;
        System.out.println(multiplicacion(3));
        System.out.println(multiplicacion(num1));


    }
   public static int multiplicacion (int num1) {
        num1 = num1 * 2;
                return num1;



//
       Scanner sc = new Scanner(System.in);
       System.out.println("Bievenido al generador de nombre para bandas. \n Ingresa el nombre de tu mascota: ");
       String mascota = sc.nextLine();
       System.out.println("Ingresa tu color favorito: ");
       String color = sc.nextLine();
       System.out.println("El nombre de tu banda es:" + mascota + " " + color);



  //Crear una función que reciba el total de una cuenta, te pregunte el porcentaje
       // que deseas agregar e imprima el total a pagar con la propina incluida.

       //función arriba

       System.out.println(calculadorDePropinas());

    */




   }
}



