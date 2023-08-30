package Sims;

public class Sims {

        String nombre;
        String etapa;
        Boolean hambre;
        Boolean durmio;
        Byte higiene;
        Boolean conversar;

        public Sims() {
        }

        public Sims(String nombre, String etapa, Boolean hambre, Boolean durmio, Byte higiene, Boolean conversar) {
            this.nombre = nombre;
            this.etapa = etapa;
            this.hambre = hambre;
            this.durmio = durmio;
            this.higiene = higiene;
            this.conversar = conversar;
        }

        @Override
        public String toString() {
            return "sims{" +
                    "nombre='" + nombre + '\'' +
                    ", etapa='" + etapa + '\'' +
                    ", hambre=" + hambre +
                    ", durmio=" + durmio +
                    ", higiene=" + higiene +
                    ", conversar=" + conversar +
                    '}';
        }

        public void comer (String alimento){
            System.out.println("He comido " + alimento);
            hambre = false;
        }
    }






