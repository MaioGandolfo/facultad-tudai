

public class Temporada {

    //Atributos

    private String titulo;
    private Episodio[] episodios;
    private int cantidadDeEpisodios;

    //Globales

    //Constructores

    public Temporada(int cantidadDeEpisodios,String titulo){
        while(titulo==null){
            System.out.println("El titulo no puede esta vacio! ingrese un titulo");
            titulo=Utils.leerString();
        }
        while(cantidadDeEpisodios<=0){
            System.out.println("La cantidad de episodios debe ser mayor que 0");
            cantidadDeEpisodios = Utils.leerInt();
        }
        this.cantidadDeEpisodios=cantidadDeEpisodios;
        episodios = new Episodio[cantidadDeEpisodios];
        for(int i=0;i<cantidadDeEpisodios;i++){
            episodios[i]=new Episodio();
        }
    }

    //Funciones

    public int getEpisodiosVistos(){
        int contador=0;
        for(int i=0;i<cantidadDeEpisodios;i++){
            if(episodios[i].getVisto()){
                contador++;
            }
        }
        return contador;
    }

}
