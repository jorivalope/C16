package co.com.ps.c12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UltimoTrabajo {

    public static void main(String[] args) {

        int suma = 0;

        ///// CON LISTAS ////
        System.out.println("CON LISTAS");

        List<Integer> numeros = new ArrayList<>();

        numeros.add(40);
        numeros.add(25);
        numeros.add(63);
        numeros.add(8);
        numeros.add(12);
        numeros.add(33);
        numeros.add(5);
        numeros.add(9);
        numeros.add(14);
        numeros.add(61);

        System.out.println("El arreglo ordenado sería:");

        numeros.stream()
                .sorted()
                .forEach(System.out::println);


    for (int i = 0; i < numeros.size(); i++)
    {
        suma = suma + numeros.get(i);
    }

    if (suma > 0){
        MensajeUltimoTrabajo mensaje = MensajeUltimoTrabajo.POSITIVO;
        System.out.println(mensaje.getDescripcion());
        System.out.println(suma);
    }else{
        MensajeUltimoTrabajo mensaje = MensajeUltimoTrabajo.NEGATIVO;
        System.out.println(mensaje.getDescripcion());
        System.out.println(suma);
    }

        ///// CON ARREGLOS ////
        System.out.println("");
        System.out.println("CON ARREGLOS");

        int[] numerosListas = {40,25,63,8,12,33,5,9,14,61};
        Arrays.sort(numerosListas);
        System.out.println("El Arreglo Ordenado es :");
        System.out.println(Arrays.toString(numerosListas));
        Integer numerosListasSumado = Arrays.stream(numerosListas).sorted().sum();

        if (numerosListasSumado> 0){
            MensajeUltimoTrabajo mensaje = MensajeUltimoTrabajo.POSITIVO;
            System.out.println(mensaje.getDescripcion());
            System.out.println(numerosListasSumado);
        }else{
            MensajeUltimoTrabajo mensaje = MensajeUltimoTrabajo.NEGATIVO;
            System.out.println(mensaje.getDescripcion());
            System.out.println(numerosListasSumado);
        }


}
}
