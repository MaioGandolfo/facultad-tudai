import java.util.ArrayList;

public class Lote {
    private static int contadorId;
    private int hectareas;
    private int id;
    protected ArrayList<Cereal> cereales;
    protected ArrayList<String> mineralesLote;

    public Lote(int hectareas){
        setHectareas(hectareas);
        contadorId ++;
        this.id = contadorId;
        cereales = new ArrayList<>();
        mineralesLote = new ArrayList<>();
    }

    public boolean plantarCereal(Cereal cc){
        boolean corto = false;
        int i=0;
        while(i<mineralesLote.size() && !corto){
            if(cc.cumpleCondicion(this, i) {
                i++;
            }
            else{
                corto = true;
            }
        }

        if(corto == false)
            cereales.add(cc);
    }

    public void addCereal(Cereal cc){
        boolean corto= false;
        for(int i=0 ; i< mineralesLote.size(); i++){
            if(!cc.cumpleCondicion(this , i)) {
                corto=true;
                break;
            }
        }
        if(corto = false)
            cereales.add(cc);
    }

    public int getId(){
        return id;
    }

    public void setHectareas(int hectareas){
        if(hectareas > 0)
            this.hectareas = hectareas;
        else
            this.hectareas = 4;
    }

    public int getHectareas(){
        return hectareas;
    }



}
