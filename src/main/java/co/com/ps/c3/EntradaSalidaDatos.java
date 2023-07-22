package co.com.ps.c3;

import java.util.Scanner;

public class EntradaSalidaDatos {

    public static void main(String[] args) {
        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.println("Ingresa un número entero: ");
        int numero = scanner.nextInt();


        // Leer una cadena de caracteres desde eI teclado
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.next();


        // Mostrar La salida en la consola
        System.out.println("El número ingresado es: " + numero);
        System.out.println("Hola, " + nombre + "!");

        // Cerrar el- objeto
        scanner.close();
    }
}
