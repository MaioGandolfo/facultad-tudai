

public class Episodio {

    //Atributos

    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;


    //Parametros globales

    int calificacionMinima=0;
    int calificacionMaxima=5;

    //Constructores

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion){
        this.titulo=setTitulo(titulo);
        this.descripcion=setDescripcion(descripcion);
        this.visto=setVisto(visto);
        this.calificacion=setCalificacion(calificacion);
    }

    public Episodio(){

    }

    //Funciones

    public String setTitulo(String titulo){
        if(titulo!=null){
            return titulo;
        }else{
            return "No hay titulo disponible";
        }
    }

    public String setDescripcion(String descripcion){
        if(descripcion!=null){
            return descripcion;
        }else{
            return "No hay descripcion disponible";
        }
    }

    public boolean setVisto(boolean visto){
        return visto;
    }

    public int setCalificacion(int calificacion){
        while(calificacion<=calificacionMinima&&calificacion>=calificacionMaxima){
            System.out.println("la calificacion no es valida, ingrese un valor entre "+calificacionMinima+" y "+calificacionMaxima);
            calificacion=Utils.leerInt();
        }
        return calificacion;
        }

    public boolean getVisto(){
        return visto;
    }
}



