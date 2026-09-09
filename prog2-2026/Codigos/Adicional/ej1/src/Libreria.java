import java.util.ArrayList;

public class Libreria {
    ArrayList<Producto> productos;
    ArrayList<Cliente> clientes;
    private String nombre;

    public Libreria (String nombre){
        setNombre(nombre);
        productos = new ArrayList<>();
    }



    public void addProducto(Producto pp){
        productos.add(pp);
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }


    public String getNombre(){
        return nombre;
    }
}
