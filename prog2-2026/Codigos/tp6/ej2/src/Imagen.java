import java.util.ArrayList;

public class Imagen {
    private ArrayList<Pixel> pixeles;

    private Imagen(){
        pixeles = new ArrayList<>();
    }

    public void addPixeles(Pixel pp){
        pixeles.add(pp);
    }

    protected ArrayList<Pixel> devolverPixel(){
        return  pixeles;
    }

    public void aplicarFiltro(Filtro filtro){
        for(Pixel pp : pixeles){
            filtro.aplicarFiltro(pp);
        }
    }





}
