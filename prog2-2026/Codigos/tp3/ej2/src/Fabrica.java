import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList <Mueble> muebles;
    private ArrayList <Mueble> StockMuebles;

    public Fabrica(String nombre) {
        setNombre(nombre);
        muebles= new ArrayList<>();
        StockMuebles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre= "fabrica del estado";
    }

    public void addStockMueble (Mueble mm){
        StockMuebles.add(mm);
    }

    public void mostrarStock(){
        for(int i=0; i<StockMuebles.size(); i++){
            System.out.println(StockMuebles.get(i).toString() + '\n' + "-----------------------");
        }
    }
}
