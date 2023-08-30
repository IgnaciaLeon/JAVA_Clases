package Sims;

public class juguemos {
    public static void main(String[] args) {

                MinaCaliente personaje1 = new MinaCaliente("Mina", "Joven Adulto", true, false, (byte) 80, true ,
                        "carisma y pilleria", "Gandul", false, 12000 );
                System.out.println(personaje1);

                AgnesCuloprieto personaje2 = new AgnesCuloprieto("Agnes", "adulto", false,
                        true, (byte) 80, true, true, (byte) 60, true, "no me llega");
                System.out.println(personaje2);

                Sims CasandraLapida = new Sims("casandra", "Adolescente", false, true, (byte)60,
                        false);
                System.out.println(CasandraLapida);


                personaje1.comer("Papaya");
                CasandraLapida.comer("Caviar");
                personaje2.chauchera(500000);
                personaje2.comer("Sangre");

              //Sobre Escritura
        personaje1.comer("globulos rojos" + ", y estaban muy rico");

        //Sobrecarga
        personaje1.comer("tallarines");
        personaje1.comer("Manzanas", 10);



    }





}
