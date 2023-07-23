package co.com.ps.c10;

import java.util.Arrays;
import java.util.List;

public class StreamP {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Juan", "María","MaUriCio", "Pedro", "Ana", "Luis");

        nombres.stream()
                .filter(nombre -> nombre.startsWith("M"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = Arrays.stream(numeros)
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Suma de los números impares al cuadrado: " + suma);
    }

}