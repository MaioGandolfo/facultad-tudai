public class Capitulo {
    private String nombre;
    private String descripcion;
    private int calificacion;

    public Capitulo (){
        setNombre(null);
        setCalificacion(-1);
        setDescripcion(null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "n";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null)
            this.descripcion = descripcion;
        else
            this.descripcion = "sin descricion";
    }

    public boolean seVio() {
        return getCalificacion() >=0;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void ingresarCalificacion(int calificacion){
        if (calificacion >=0 && calificacion <=5)
            setCalificacion(calificacion);
        else{
            System.out.println("valor invalido");
            this.calificacion= -1;
        }
    }

    public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
    }


}
