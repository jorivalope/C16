//Crear un arreglo con 10 numero y encontrar el menor y el mayor.
package co.com.ps.c6;


public class EjercicioEnClaseC6 {

    public static void main(String[] args) {
        int[] arreglo = {8,6,7,5,16,7,24,35,40,10};
        int mayor, menor;


        mayor = menor = arreglo [0];

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo [i] > mayor) {
                mayor = arreglo[i];
            }
            if(arreglo[i]<menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);

    }
}
