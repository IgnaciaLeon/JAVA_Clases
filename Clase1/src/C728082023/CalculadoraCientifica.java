package C728082023;

import java.util.ArrayList;

//Herencia: permite heredar atributos y métodos, y en Java se utiliza mediante la palabra extends.
//Polimorfismo: permite indicar un comportamiento propio para los métodos de una clase que hereda.

public class CalculadoraCientifica extends Calculadora {

    //Para indicar que la calculadora cientifica esta relacionada con calculadora ponemos extends.

//Atributos
    Boolean permitirCaracteresASCII;
    String tipoDePantalla;


    //Constructores
    //constructor vacío:
    public CalculadoraCientifica() {
    }

    //constructor lleno:
    public CalculadoraCientifica(String color, Double alto, Double ancho, String marca, Boolean esCinetifica,
                                 Integer memoria, Integer cantidadMaxDeDigitos, Boolean permitirCaracteresASCII, String
                                         tipoDePantalla) {
        super(color, alto, ancho, marca, esCinetifica, memoria, cantidadMaxDeDigitos);
        this.permitirCaracteresASCII = permitirCaracteresASCII;
        this.tipoDePantalla = tipoDePantalla;
        //super hace referencia a la clase padre calculadora en este caso y sus atributos
        //this hace referencia a los atributos de la clase hija, en este caso calculadora cientifica.

    }

    //Métodos
    public String datosTrigonometricos(String dato) {
        return "Estamos usando: " + dato;
    }

    //Para aplicar polimorfismos
    //Sobreescritura de métodos: le doy un nuevo comportamiento al método, modifico la función en sí.
    public  Integer restar(int num1, int num2) {
        System.out.println("Hola estoy sobreescribiendo");
        return num1 - num2;
    }
    //Sobrecarga de métodos: declarar la función pero agregando más argumentos y estos pueden tener distintos
    //tipos de datos:ej Double, String, etc.
    public Double sumar(double num1, double num2) {
        System.out.println("El resultado es: ");
        return num1 + num2 ;
    }
}
