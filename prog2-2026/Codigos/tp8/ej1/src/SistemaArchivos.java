import java.util.ArrayList;

public class SistemaArchivos {
    private ArrayList<ElementoSA> elementos;

    public SistemaArchivos(){
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA ee){
        if(!elementos.contains(ee))
            this.elementos.add(ee);
    }

    public ArrayList<ElementoSA> buscarElmentos(Condicion cc){
        ArrayList<ElementoSA> salida = new ArrayList<>();
        for(ElementoSA ee : elementos) {
            if (cc.cumple(ee))
                salida.add(ee);
        }
        return salida;
    }
}
