//CORRESPONDE AL EJERCICIO DE LA CLASE 2

package co.com.ps.c2;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Esta es mi calculadora de constantes!!");

        int valor1, valor2, suma, resta, multiplicacion, modulo;
        double division;

        valor1 = 12345;
        valor2 = 2213;

        System.out.println("Los valores de mis constantes son: " + valor1 +" y " + valor2);

        suma = valor1 + valor2;
        System.out.println("El resultado de la suma es : " + suma);

        resta = valor1 - valor2;
        System.out.println("El resultado de la resta es : " + resta);

        multiplicacion = valor1 * valor2;
        System.out.println("El resultado de la multplicacion es : " + multiplicacion);

        division = (double)valor1 / valor2;
        System.out.println("El resultado de la division es : " + division);

        modulo = valor1 % valor2;
        System.out.println("El resultado del modulo es : " + modulo);

    }
}
