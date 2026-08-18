public class Temporada {  
    private int cantCapitulos;
    private Capitulo [] capitulos;

    public Temporada(int cantCapitulos) {
        setCantCapitulos(cantCapitulos);
        // 1. Instanciamos el arreglo con el tamaño recibido
        this.capitulos = new Capitulo[this.cantCapitulos];

        // 2. Llenamos el arreglo con objetos Capitulo vacíos
        for (int i = 0; i < this.capitulos.length; i++) {
            this.capitulos[i] = new Capitulo();
        }
    }

    /*
    public Temporada(){
        capitulos [2] = new Capitulo();
    }
    */

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

    public double promedioCalifCap(){
        double promedio=0;
        for (int i=0; i<capitulos.length; i++) {
            if (capitulos[i].seVio())
                promedio += capitulos[i].getCalificacion();
        }
        return promedio / capitulos.length;
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
