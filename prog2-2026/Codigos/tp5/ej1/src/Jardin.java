import java.util.ArrayList;

public class Jardin {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Jardin(String nombre){
        setNombre(nombre);
        plantas = new ArrayList<>();
    }

    public Jardin(){
        this(null);
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "Planta sin nombre";
    }

    public String getNombre(){
        return  nombre;
    }

    public void imprimirPlantas(){
        for (Planta pp : plantas)
            System.out.println(pp.toString());
    }

    public void addPlanta(Planta pp){
        if(pp != null)
            plantas.add(pp);
    }
}
