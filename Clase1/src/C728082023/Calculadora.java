package C728082023;

public class Calculadora {

    //no necesitamos un método main, ya que no vamos a ejecutar el programa, sólo vamos a acceder a él.

    //le quitamos el static porque limita de cierta manera el acceso a las funciones y métodos que creamos.
    // el static sirve para que un código le pertenezca a la clase y no a la instancia (algo físico como el
    //objeto, que se materializa). Static es para indicar un método de clase.
    //Cuando no indicamos el static, son métodos de instancia.


    public Calculadora() {}

    //Constructores: método responsable de instanciar un objeto. permiten crear la instancia sin
    // indicar ninguna caracteristica en concreto.
     //Tipos de constructores:
        //Constructor vacío: permite crear la instancia sin indicar ninguna característica en concreto.
       //es decir, se crea el objeto pero sin ningun atributo o característica, con el objetivo por ejemplo, de crear
    //un formulario para rellenar sus datos.
        //Si solo proporcionas un constructor con parámetros, los usuarios de tu clase estarán obligados a proporcionar
    // valores en el momento de la creación. Si solo proporcionas un constructor vacío, los usuarios tendrán que
    // establecer los atributos manualmente después de la creación. Proporcionar ambos tipos de constructores te da
    // más flexibilidad y facilita la creación de objetos en diferentes situaciones.

        //constructor lleno:
        //para generarlo de manera automatica clic derecho-> generate


    //Atributos:
        String color;
        Double alto;
        Double ancho;
        String marca;
        //Boolean esCinetifica;
        // Por ej, aquí la clase padre podría ser calculadora y las hijas calculadora cientifica y calculadora financiera.
        Integer memoria;
        Integer cantidadMaxDeDigitos;


    //Métodos:

    public Integer sumar(int num1, int num2) {
        return num1 + num2;
    }
    public Integer restar(int num1, int num2) {
        return num1 - num2;
    }
    public Integer multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    public Integer division(int num1, int num2) {
        return num1 / num2;
    }
    public Integer resto(int num1, int num2) {
        return num1 % num2;
    }
    public Integer incremento(int num1) {
        return ++num1;
    }
    public Integer decremento(int num1) {
        return --num1;
    }

    //Método toString: permite imprimir el objeto como string en vez de como direccion en memoria.
    // Click derecho-> Generate -> toString.


    //Override:
    @Override
    public String toString() {
        return "Calculadora{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", cantidadMaxDeDigitos=" + cantidadMaxDeDigitos +
                '}';
    }

    //Atributos de una calculadora: color, marca, tamaño, forma.
    public Calculadora(String color, Double alto, Double ancho, String marca, Boolean esCinetifica,
                Integer memoria, Integer cantidadMaxDeDigitos) {
            this.color = color;
            this.alto = alto;
            this.ancho = ancho;
            this.marca = marca;
            this.memoria = memoria;
            this.cantidadMaxDeDigitos = cantidadMaxDeDigitos;
        }


    }
