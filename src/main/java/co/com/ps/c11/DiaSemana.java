package co.com.ps.c11;


public enum DiaSemana {
    LUNES("Primer día de la semana", true),
    MARTES("Segundo día de la semana", true),
    MIERCOLES("Tercer día de la semana", true),
    JUEVES("Cuarto día de la semana", true),
    VIERNES("Quinto día de la semana", true),
    SABADO("Sexto día de la semana", false),
    DOMINGO("Séptimo día de la semana", false);

    private final String descripcion;
    private final boolean laborable;

    DiaSemana(String descripcion, boolean laborable) {
        this.descripcion = descripcion;
        this.laborable = laborable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esLaborable() {
        return laborable;
    }

}