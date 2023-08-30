package C725082023;

public class Repaso_Funciones {
    public static void main(String[] args) {


        imprimirPokemon("Pikachu");

        String pokemon = pokemonParaGuardar("Bulbasaur");
        System.out.println(pokemon.toUpperCase());
        System.out.println(pokemon.charAt(3));

    }

        //Funciones de tipo void: No retornan nada
        public static void imprimirPokemon(String nombre) {
            System.out.println("Soy un " + nombre);
        }

        //Funciones de retorno
        public static String pokemonParaGuardar(String nombre) {
            return nombre;


    }
}
