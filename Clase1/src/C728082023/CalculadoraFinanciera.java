package C728082023;

import java.util.ArrayList;

public class CalculadoraFinanciera extends Calculadora {

    //Atributos:
    //cuando declaramos atributos se antepone el modificador de acceso private
    //esto nos permitira resguardar mejor los datos y que no se cambien tan facilmente

    private boolean permiteGraficar;
    ArrayList<String> formatosPermitidos;

    //Constructores:


    public CalculadoraFinanciera() {
    }

    public CalculadoraFinanciera(boolean permiteGraficar, ArrayList<String> formatosPermitidos) {
        this.permiteGraficar = permiteGraficar;
        this.formatosPermitidos = formatosPermitidos;
    }

    //Accesadores y mutadores:
    //son metodos que permiten la lectura y asignacion de un valor a un atributo.
    //getter y setter
    //settter accede a la instancia y permite cambiar un atributo en particylar
    //getter me permite acceder al valor para su lectura
    //el setter para datos muy delicados no se utiiza, sólo el getter para su lectura


//Accesador o getter
    protected boolean isPermiteGraficar() {
        return permiteGraficar;
    }

    //Mutador o setter

    public void setPermiteGraficar(boolean permiteGraficar) {
        this.permiteGraficar = permiteGraficar;
    }

    public ArrayList<String> getFormatosPermitidos() {
        return formatosPermitidos;
    }

    public void setFormatosPermitidos(ArrayList<String> formatosPermitidos) {
        this.formatosPermitidos = formatosPermitidos;
    }

    //Métodos:
    public String linealizar(int num1, int num2) {
        int resultado = (num1 + num2)/2;
        return "El resultado de linealizar es: " + resultado;

    }



}
