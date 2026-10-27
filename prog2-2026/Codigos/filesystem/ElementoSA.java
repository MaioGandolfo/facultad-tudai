package filesystem;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fCreacion;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    @Override
    public String toString() {
        return getNombre();
    }

    public final void imprimirArbol() {
        imprimirArbol("", true);
    }

    public abstract ArrayList<Archivo> buscar(Condicion condicion);
    public abstract double getTamanio();
    public abstract int cantidadElementos();
    protected abstract void imprimirArbol(String prefijo, boolean esUltimo);
}
