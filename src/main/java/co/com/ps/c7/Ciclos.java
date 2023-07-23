package co.com.ps.c7;

import java.util.ArrayList;
import java.util.List;
public class Ciclos {

    public static void main(String[] args) {

        List<String> miLista1 = new ArrayList<>();

        miLista1.add("Mauricio");
        miLista1.add("Alan");
        miLista1.add("David");
        miLista1.add("Carlos");
        miLista1.add("Juan");

        System.out.println("- - -Con FOR EACH - - - ");

        for (String nombre : miLista1) {
            System.out.println(nombre);
        }
        System.out.println("- - -Con FOR - - - ");

        for (int i = 0; i < miLista1.size(); i++) {
            System.out.println(miLista1.get(i));
        }
    }

}
