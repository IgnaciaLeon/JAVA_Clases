package C728082023;

public class Chocolate {

    //1.Atributos o características del chocolate
    String tamaño;
    String color;
    String forma;
    String sabor;
    Integer porcentajeCacao;

//2.Constructores:

    public Chocolate(String tamaño, String color, String forma, String sabor, Integer porcentajeCacao) {
        this.tamaño = tamaño;
        this.color = color;
        this.forma = forma;
        this.sabor = sabor;
        this.porcentajeCacao = porcentajeCacao;
    }

    //ToString

    @Override
    public String toString() {
        return "Chocolate{" +
                "tamaño='" + tamaño + '\'' +
                ", color='" + color + '\'' +
                ", forma='" + forma + '\'' +
                ", sabor='" + sabor + '\'' +
                ", porcentajeCacao=" + porcentajeCacao +
                '}';
    }

    //3. Getter y Eter
    //4.Métodos: que cosas puede hacer el chocolate, acciones que puede realizar.
    public String derretirse () {
        return "Estoy derretido";
    }
    public String expira() {
    return "Expira";

}

}
