package co.com.ps.c12;

public enum MensajeUltimoTrabajo {

    POSITIVO ("El resultado de la suma es positivo y es igual a:"),
    NEGATIVO ("El resultado de la suma es negativo y es igual a:");

    private final String descripcion;

    MensajeUltimoTrabajo(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
