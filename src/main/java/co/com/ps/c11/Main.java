package co.com.ps.c11;

public class Main {
    public static void main(String[] args) {
        DiasDeLaSemana dia= DiasDeLaSemana.SABADO;
        // System.out.println(dia);

        DiaSemana diaLaboral= DiaSemana.LUNES;

        System.out.println(diaLaboral.getDescripcion());
        System.out.println(diaLaboral.esLaborable());
    }
}