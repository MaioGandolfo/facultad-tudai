import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList <Provincia> provincias;

    public Pais(String nombre){
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia p1){
        if(!provincias.contains(p1))
            provincias.add(p1);
    }

    

}
