package C728082023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashMap_Hashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



  //Hashset y Hashmap se permite ordenar valores. Se define como una colección.
        //Los hashset no funcionan en base a indices, entonces no se pueden buscar por indices,
        //tampoco se pueden duplicar los valores. No se suele usar mucho.
        //A diferencia de un array común, estos son más dinámicos, puedo remover, agregar datos, etc.

    HashSet<String> paises = new HashSet<String>();
    System.out.println(paises);

    //for para ingresar datos de manera dinamica al hashset
    for (int i = 0; i < 3; i++) {
        System.out.println("Ingresa un nuevo país");
        String pais = sc.nextLine();
        paises.add(pais);
    }

        //Métodos del hashset
        System.out.println(paises);
        System.out.println(paises.add("Francia"));
        System.out.println(paises);
        paises.remove("Francia");
        //los métodos remove y add retornan además de su función un boolean.
        System.out.println("Así quedaría después de la remoción: " + paises);
        //para verificar si está un elemento
        //System.out.println(paises.contains("Chile"));


        //solución Para buscar un valor cuando no hay índice, pero es muy engorroso
        String paisSeleccionado = "Chile";
        if (paises.contains(paisSeleccionado)) {
            System.out.println(paisSeleccionado);
        } else {
            System.out.println("No está presente");
        }

     //Buscar.valueOf

     //Hashset imprime ente [] es un array, el hashmap entre {} es un objeto.




        //HashMap, a difencia de hashset que sólo tiene un valor, éste tiene par llave-valor
        HashMap<String, String> paisCapital = new HashMap<>();
        System.out.println(paisCapital);
        paisCapital.put("Chile", "Santiago");
        paisCapital.put("Perú", "Lima");
        paisCapital.put("Colombia", "Bogotá");
        paisCapital.put("Argentina", "Buenos Aires");
        paisCapital.put("Jamaica", "Kingston");

        //el valor de "Santiago" está dentro de "Chile", es deci, el valor está dentro de la llave.
        System.out.println(paisCapital);
        //En este caso se va a reemplazar el valor dentro de la llave "Chile"
        paisCapital.put("Chile", "RM");
        System.out.println(paisCapital);
        //este método .get sirve para obtener el valor de una llave
        System.out.println(paisCapital.get("Chile"));
        //este método . sirve para obtener la llave de un valor


        //ForEach: me permite iterar para cada item que esté en un conjunto de datos, es otra sintaxis
        // que me permite iterar sobre colecciones.
        //.keySet me permite obtener una lista de las llaves que hay.
        for (String pais : paisCapital.keySet()) {
            System.out.println("El país es: " + pais);
            System.out.println("El valor sería " + paisCapital.get(pais));
        }


     //Los Hash se pueden utilizar para reestablecer contraseñas.

     //Las estructuras hash en general se usan porque son eficientes en cuanto a obtener
        // y buscar elementos, ese es como su uso principal.


}
}