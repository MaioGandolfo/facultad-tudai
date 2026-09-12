public class Pastura extends Cereal{
    private int minHectareas;

    public Pastura(String nombre, int minHectareas){
        super(nombre);
        setMinHectareas(minHectareas);
    }

    public void setMinHectareas(int minHectareas){
        if(minHectareas > 50)
            this.minHectareas = minHectareas;
        else
            this.minHectareas = 50;
    }

    public int getMinHectareas(){
        return minHectareas;
    }

    public boolean cumpleCondicion(Lote ll, int pos){
        return super.cumpleCondicion(ll, pos) && ll.getHectareas() >= this.getMinHectareas();
    }


}
