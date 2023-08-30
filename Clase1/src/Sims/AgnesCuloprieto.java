package Sims;

public class AgnesCuloprieto extends Sims{
    Boolean vampiro;
    Byte sangre;
    Boolean ataud;
    String sol;

    public AgnesCuloprieto() {
    }

    public AgnesCuloprieto(String nombre, String etapa, Boolean hambre, Boolean durmio, Byte higiene, Boolean conversar,
                           Boolean vampiro, Byte sangre, Boolean ataud, String sol) {
        super(nombre, etapa, hambre, durmio, higiene, conversar);
        this.vampiro = vampiro;
        this.sangre = sangre;
        this.ataud = ataud;
        this.sol = sol;
    }

    @Override
    public String toString() {
        return "AgnesCuloprieto{" +
                "vampiro=" + vampiro +
                ", sangre=" + sangre +
                ", ataud=" + ataud +
                ", sol='" + sol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", etapa='" + etapa + '\'' +
                ", hambre=" + hambre +
                ", durmio=" + durmio +
                ", higiene=" + higiene +
                ", conversar=" + conversar +
                '}';
    }

//metodos

    public void comer (String alimento){
        System.out.println("yo no como, chupo " + alimento);
        hambre = false;
    }

    public Integer chauchera (Integer simoleones) {
        System.out.println("Tengo mucho dinero: $" + simoleones + " simoleones.");
        return simoleones;
    }

}
