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

    public ArrayList<Ciudad> totalCiudadesDeficit (int minimosHabitantes){
        ArrayList<Ciudad> ciudadDeficit= new ArrayList<>();
        for (int i=0; i<provincias.size(); i++) {
            ciudadDeficit.addAll(provincias.get(i).ciudadesDeficit(minimosHabitantes));
        }
        return ciudadDeficit;
    }

    public ArrayList <Provincia> provinciasDeficit(){
        ArrayList<Provincia> aux = new ArrayList<>();
        for(int i=0; i<provincias.size(); i++){
            if(provincias.get(i).estoyDeficit())
                aux.add(provincias.get(i));
        }
        return aux;
    }

}
