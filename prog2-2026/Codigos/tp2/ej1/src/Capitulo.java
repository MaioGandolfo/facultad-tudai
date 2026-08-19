public class Capitulo {
    private String nombre;
    private String descripcion;
    private double calificacion;

    public Capitulo (){
        setNombre(null);
        setCalificacion(-1);
        setDescripcion(null);
    }

    public Capitulo(String nombre, String descripcion){
        setNombre(nombre);
        setCalificacion(-1);
        setDescripcion(descripcion);
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

    public double getCalificacion() {
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

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


}
