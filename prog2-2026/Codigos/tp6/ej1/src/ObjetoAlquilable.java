import java.time.LocalDate;

public abstract class ObjetoAlquilable {
    private LocalDate fechaAlquiler, fechaVencimientoAlquiler;

    public ObjetoAlquilable(LocalDate fechaVencimientoAlquiler){
        this.fechaAlquiler = LocalDate.now();
        this.fechaVencimientoAlquiler = fechaVencimientoAlquiler;
    }

    public LocalDate getFechaAlquiler(){
        return fechaAlquiler;
    }

    public LocalDate getFechaVencimientoAlquiler(){
        return fechaVencimientoAlquiler;
    }

    protected boolean estaPorVencer(int dias){
        return (getFechaVencimientoAlquiler().getDayOfYear() - getFechaAlquiler().getDayOfYear()) <= dias;
    }

    public abstract boolean esAlquilable();

    public abstract void alquilado();

    public abstract boolean equals(Object o);

    public abstract String toString();
}
