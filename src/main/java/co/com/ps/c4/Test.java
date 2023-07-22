package co.com.ps.c4;

public class Test {

    public static void main(String[] args) {
        Persona persona1 = new Persona("12345678");
        persona1.setNombre("Jorge");
        persona1.setEdad(40);

        Repuesto repuesto1 = new Repuesto();
        repuesto1.setTipo("Amortiguador");
        repuesto1.setPeso(2);
        repuesto1.setMarca("Premium");

        Repuesto repuesto2 = new Repuesto();
        repuesto2.setTipo("Disco de Frenos");
        repuesto2.setPeso(1);
        repuesto2.setMarca("Frenado");

        Repuesto repuesto3 = new Repuesto();
        repuesto3.setTipo("Llanta");
        repuesto3.setPeso(3);
        repuesto3.setMarca("Frenado");

        System.out.println("La marca del repuesto 1 es:" + repuesto1.getMarca());
        System.out.println("El tipo del repuesto 1 es:" + repuesto1.getTipo());
        System.out.println("El peso del repuesto 1 es:" + repuesto1.getPeso());
        System.out.println("");
        System.out.println("La marca del repuesto 2 es:" + repuesto2.getMarca());
        System.out.println("El tipo del repuesto 2 es:" + repuesto2.getTipo());
        System.out.println("El peso del repuesto 2 es:" + repuesto2.getPeso());
        System.out.println("");
        System.out.println("La marca del repuesto 3 es:" + repuesto3.getMarca());
        System.out.println("El tipo del repuesto 3 es:" + repuesto3.getTipo());
        System.out.println("El peso del repuesto 3 es:" + repuesto3.getPeso());

    }
}
