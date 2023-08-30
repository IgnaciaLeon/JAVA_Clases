package Sims;

public class MinaCaliente extends Sims {
        String habilidades;
        String trabajo;
        Boolean casada;
        Integer simoleones;

        public MinaCaliente() {
        }

    public MinaCaliente(String nombre, String etapa, Boolean hambre, Boolean durmio, Byte higiene, Boolean conversar,
                        String habilidades, String trabajo, Boolean casada, Integer simoleones) {
        super(nombre, etapa, hambre, durmio, higiene, conversar);
        this.habilidades = habilidades;
        this.trabajo = trabajo;
        this.casada = casada;
        this.simoleones = simoleones;
    }

    @Override
    public String toString() {
        return "MinaCaliente{" +
                "habilidades='" + habilidades + '\'' +
                ", trabajo='" + trabajo + '\'' +
                ", casada=" + casada +
                ", simoleones=" + simoleones +
                ", nombre='" + nombre + '\'' +
                ", etapa='" + etapa + '\'' +
                ", hambre=" + hambre +
                ", durmio=" + durmio +
                ", higiene=" + higiene +
                ", conversar=" + conversar +
                '}';
    }


        //metodos
        public void coquetea (){
            System.out.println("¡Me he casado!");
            casada = true;
            simoleones = simoleones + 100000;
        }

        public void comer (String alimento) {
            System.out.println("ñami ñami. Muy ricx el/la " + alimento);
             hambre = false;
        }

             //Sobreescribir:
           public void comer (String alimento, Integer cantidad) {
               System.out.println("ñami ñami. Son " + cantidad + " " + alimento);
            }


        }



