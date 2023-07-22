package co.com.ps.c5;

public class Main {
    public static void main(String[] args) {
        int num1 = 6;

        if (num1 > 3){
            System.out.println("El número es MAYOR;");
        }else if (num1 ==0){
            System.out.println("El número es CERO");
        }
        else{
            System.out.println("El número es MENOR");
        }

        /////////////////////////////////////////////////////////////

        switch (num1) {
            case 1:
                // secuencia de sentencias.
                System.out.println("El número es 1");
                break;
            case 2:
                // secuencia de sentencias.
                System.out.println("El número es 2");
                break;
            case 3:
                // secuencia de sentencias.
                System.out.println("El número es 3");
                break;
            default:
                // Default secuencia de sentencias.
                System.out.println("El número no se reconoce");
                break;
        }

    }
}
