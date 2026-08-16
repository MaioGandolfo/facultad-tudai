public class Temporada {  
    private int cantCapitulos;
    private Capitulo [] capitulos;

    public Temporada(){
        capitulos [0] = new Capitulo();
    }

    public void agregarCapitulos(Capitulo cc){
        for (int i=0; i<getCantCapitulos(); i++)
            capitulos [i] = cc;
    }

    public int capVistos(){
        int capsVistos=0;
        for (int i=0; i<capitulos.length; i++){
            if (capitulos[i].seVio() == true)
                capsVistos++;
        }
        return capsVistos;
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        if(cantCapitulos >0)
            this.cantCapitulos=cantCapitulos;
        else
            this.cantCapitulos=1;
    }
}
