//CORRESPONDE AL EJERCICIO DE LA CLASE 3

package co.com.ps.c3;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esta es mi primera calculadora en JAVA!!");
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);

        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);

        int multiplica = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + multiplica);

        double division = (double)num1 / num2;
        System.out.println("El resultado de la división es: " + division);


    }

}
