//Dado un arreglo {4,2,6,2,3,5} ordenarlos de menor a mayor

package co.com.ps.c7;

public class EjercicioEnClaseC7 {
    public static void main(String[] args) {
        int[] arregloNumeros = {4,2,6,2,3,5};

        for (int i = 0; i < arregloNumeros.length; i++) {
            for (int j = 0; j < arregloNumeros.length-i-1; j++) {
                if(arregloNumeros[j] > arregloNumeros[j+1]){
                    int temporal = arregloNumeros[j+1];
                    arregloNumeros[j+1] = arregloNumeros[j];
                    arregloNumeros[j] = temporal;
                }
            }
        }
        System.out.println("El areglo ordenado es: ");
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println(arregloNumeros[i]);
        }

    }
}
