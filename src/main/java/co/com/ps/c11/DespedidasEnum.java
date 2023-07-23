package co.com.ps.c11;

public enum DespedidasEnum {

    bye("Lo estaremos esperando de nuevo por aca."),
    ByeExtende("Esperamos que le fuera super bien en esta areas vuelva pronto");

    private final String descripcion;

    DespedidasEnum(String descripcion){
        this.descripcion=descripcion;
    }
}
