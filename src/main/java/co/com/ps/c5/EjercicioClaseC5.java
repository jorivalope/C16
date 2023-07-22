package co.com.ps.c5;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class EjercicioClaseC5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int AnioNacimiento;
        System.out.println("Ingrese su edad: ");
        int numero = scanner.nextInt();

        if (numero < 18){
            System.out.println("Ustes es menor de edad.");
        }else{
            AnioNacimiento = 2023 - numero;
            System.out.println("Ustes es mayor de edad y nació en el año " + AnioNacimiento);
        }

    }
}
