import javax.naming.SizeLimitExceededException;
import java.io.ObjectStreamException;
import java.util.ArrayList;

public class PilaElementos {
    private ArrayList<Object> pila;
    private String nombre;

    public PilaElementos(){
        this(null);
    }

    public PilaElementos(String nombre){
        setNombre(nombre);
        pila = new ArrayList<>();
    }

    public void push(Object o){
        pila.add(o);
    }

    public Object pop(){
        Object aux = pila.getLast();
        pila.removeLast();

        return aux;
    }

    public Object top(){
        Object aux = pila.getFirst();
        return aux;
    }

    public int size(){
        int size = 0;
        for(Object o : pila) {
            if (o != null)
                size++;
        }
        return size;
    }

    public PilaElementos copy(){
        PilaElementos aux = new PilaElementos();
        for(int i=0; i< pila.size(); i++)
            aux.push(pila.get(i));

        return aux;
    }

    public PilaElementos reverse(){
        PilaElementos aux = new PilaElementos();
        for(int i = pila.size()-1 ; i>=0 ; i--)
            aux.push(pila.get(i));
        return  aux;
    }



    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "n";
    }

    public String getNombre(){
        return nombre;
    }

}
