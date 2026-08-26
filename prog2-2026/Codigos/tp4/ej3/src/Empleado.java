public class Empleado {
    private String nombre;
    private int sueldoFijo;


    public Empleado(String nombre, int sueldoFijo){
        setNombre(nombre);
        setSueldoFijo(sueldoFijo);
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(int sueldoFijo) {
        if(sueldoFijo>0)
            this.sueldoFijo = sueldoFijo;
        else
            this.sueldoFijo = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }
}
