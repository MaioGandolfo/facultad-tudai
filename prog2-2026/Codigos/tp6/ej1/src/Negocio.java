import java.util.ArrayList;

public class Negocio {
    private ArrayList<ObjetoAlquilable> objetosAlquilables;
    private ArrayList<Persona> clientes;
    private String nombre;

    public Negocio (String nombre){
        setNombre(nombre);
        objetosAlquilables = new ArrayList<>();
        clientes = new ArrayList<>();
    }


    public void addObjetoAlquilable(ObjetoAlquilable oo){
        if(!objetosAlquilables.contains(oo))
            objetosAlquilables.add(oo);
    }

    public void AlquileresPorVencer(int dias){
        for(Persona pp : clientes){
            if(pp.getObjetoAlquilado().estaPorVencer(dias))
                pp.getObjetoAlquilado().toString();
        }
    }

    public void addCliente(Persona pp){
        if(!clientes.contains(pp))
            clientes.add(pp);
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "Sin nombre";
    }

    public String getNombre(){
        return nombre;
    }


}
