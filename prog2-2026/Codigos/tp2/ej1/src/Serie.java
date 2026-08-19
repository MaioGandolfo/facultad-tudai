public class Serie {
    private String nombre;
    private Temporada [] temporada;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie (){
        setNombre(null);
        //agrearTemporada();
        setDescripcion(null);
        setCreador(null);
        setGenero(null);
    }

    public Serie(String nombre, String descripcion, String creador, String genero){
        setNombre(nombre);
        setDescripcion(descripcion);
        setCreador(creador);
        setGenero(genero);
    }


    public int vistosTotal(){
        int totalVisto=0;
        for(int i=0; i<temporada.length; i++)
            totalVisto +=temporada[i].capVistos();
         return totalVisto;
    }

    public int vistosTemporada(int tt){
        return temporada[tt].capVistos();
    }

    public double promedioTemp(int tt){
        return temporada[tt].promedioCalifCap();
    }

    public double promedioTemp(){
        double promedio=0;
        for (int i=0; i<temporada.length; i++)
            promedio += temporada[i].promedioCalifCap();
        return promedio / temporada.length;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "N";
    }

    public int getTemporada() {
        return temporada.length;
    }

    public void agregarTemporada(Temporada tt) {
        // 1. Instanciamos el arreglo de temporadas de la serie
        this.temporada = new Temporada[tt.getCantCapitulos()];

        // 2. Instanciamos cada temporada (suponiendo 2 capítulos por temporada como ejemplo)
        for (int i = 0; i < tt.getCantCapitulos(); i++) {
            this.temporada[i] = new Temporada(2); // 2 capítulos por temporada
        }
    }


    public void agregarTemporada(int cantTemporada) {
        for (int i=0; i<cantTemporada; i++)
            temporada[i] = new Temporada();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null)
            this.descripcion = descripcion;
        else
            this.descripcion = "sin descripción";
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        if (creador != null)
            this.creador = creador;
        else
            this.creador = "desconocido";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null)
            this.genero = genero;
        else
            this.genero = "-";
    }

    public String getNombre() {
        return nombre;
    }
}
