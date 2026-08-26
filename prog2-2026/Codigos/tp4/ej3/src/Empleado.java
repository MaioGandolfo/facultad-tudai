public class Empleado {
    private String nombre;
    private int sueldoFijo;
    private static int contadorId;
    private int id;
    //private int cantHorasTrabajadas;


    public Empleado(String nombre){
        setNombre(nombre);
        setSueldoFijo(0);
        //setCantHorasTrabjadas(cantHorasTrabajadas);
        contadorId++;
        this.id = contadorId;
    }

    public boolean equals(Object o1){
        Empleado aux = (Empleado) o1;
        try {
            return aux.getId()==this.getId();
        }catch (Exception e) {
            return false;
        }
    }

    public String toString(){
        return "-------------------" + '\n' + "nombre: " + nombre + '\n' + "id: " + id + '\n' + "sueldo fijo: " + sueldoFijo + '\n' +
                "total a pagar: " +this.pagoTotal();
    }

    public int pagoTotal(){
        return sueldoFijo;
    }

    /*
    public void setCantHorasTrabjadas(int cantHorasTrabajadas){
        if(cantHorasTrabajadas>0)
            this.cantHorasTrabajadas = cantHorasTrabajadas;
        else
            this.cantHorasTrabajadas = 48;
    }
    */

    /*
    public int getCantHorasTrabajadas(){
        return cantHorasTrabajadas;
    }
     */

    public int getId(){
        return this.id;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(int sueldoFijo) {
        if(sueldoFijo>0)
            this.sueldoFijo = sueldoFijo;
        else
            this.sueldoFijo = 1000000;
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
