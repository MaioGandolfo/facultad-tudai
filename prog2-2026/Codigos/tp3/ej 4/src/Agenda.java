import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda (){
        contactos = new ArrayList<>();
    }

    public void addContacto (Contacto cc){
        if(!contactos.contains(cc))
            contactos.add(cc);
    }

    public double getEdadPromedio(){
        int suma=0;
        for (Contacto c : contactos)
            suma += c.getEdad();
        return suma /contactos.size();
    }

    public void imprimirContactos(){
        for (Contacto c : contactos)
            System.out.println(c.toString());
    }
}
