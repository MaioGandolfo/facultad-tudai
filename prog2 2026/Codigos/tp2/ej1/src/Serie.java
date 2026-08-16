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

    public int vistosTotal(){
        int totalVisto=0;
        for(int i=0; i<temporada.length; i++){
            totalVisto +=temporada[i].capVistos();
        }
         return totalVisto;
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

    public void agrearTemporada(int nTemporada) {
        for (int i=0; i<nTemporada; i++)
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
