import java.time.LocalDate;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaCreacion, fechaModificacion;


    public ElementoSA(String nombre){
        setNombre(nombre);
        this.fechaCreacion = LocalDate.now();
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "-";
    }

    public boolean equals(Object oo){
        try {
            ElementoSA aux = (ElementoSA) oo;
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(){
        this.fechaModificacion = LocalDate.now();
    }

    public String toString(){
        return nombre;
    }

    public final void imprimirArbol() {
        imprimirArbol("", true);
    }

    public abstract double getTamanio();
    public abstract int cantidadElementos();
    protected abstract void imprimirArbol(String prefijo, boolean esUltimo);
}
