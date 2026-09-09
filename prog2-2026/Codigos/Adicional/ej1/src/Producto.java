import java.util.ArrayList;

public class Producto {
    private String nombre;
    private String autor;
    private double precio;
    private int cantPag;
    private String resumen;
    private ArrayList<String> generos;

    public Producto (){
        generos = new ArrayList<>();
    }

    public Producto(String nombre, String autor, double precio, int cantPag, String resumen) {
        setNombre(nombre);
        setAutor(autor);
        setPrecio(precio);
        setCantPag(cantPag);
        setResumen(resumen);
    }

    public void addGeneros(String genero) {
        for(String gg : generos)
            if(!genero.equalsIgnoreCase(gg))
                generos.add(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }



}
