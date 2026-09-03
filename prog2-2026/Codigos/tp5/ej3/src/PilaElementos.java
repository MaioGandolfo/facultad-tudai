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

    public Object[] copy(){
        Object [] aux = new Object[pila.size()];
        for(int i=0; i< pila.size(); i++)
            aux[i] = pila.get(i);

        return aux;
    }

    public Object[] reverse(){
        Object [] aux = copy();
        for(int i=0; i< pila.size() /2; i++)
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
