import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int cantHabitantes;
    private ArrayList<Impuesto> impuestos;
    private double gasto;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;


    public Ciudad (String nombre, int cantHabitantes, double gasto, double imp1,  double imp2, double imp3, double imp4){
        setNombre(nombre);
        setCantHabitantes(cantHabitantes);
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        setGasto(gasto);
    }

    public boolean estaDeficit(){
        return this.gasto > totalRecaudado();
    }

    public void agregarImpuesto(Impuesto imp){
        if(!impuestos.contains(imp))
            impuestos.add(imp);
    }


    public double totalRecaudado(){
        return imp1 + imp2 + imp3 + imp4;
    }


    public void setGasto(double gasto){
        if(gasto >=0)
            this.gasto = gasto;
        else
            this.gasto=1;
    }

    public double getGasto(){
        return gasto;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        if(cantHabitantes >0)
            this.cantHabitantes = cantHabitantes;
        else
            this.cantHabitantes = 1;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o1){
        Ciudad aux = (Ciudad) o1;
        try {
            return aux.getNombre().equals(this.getNombre());
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ciudad: " + nombre + '\n' + "cantidad de habitantes: " + cantHabitantes + '\n' + "estoy deficit: " + this.estaDeficit() + '\n' + "-----------" + '\n';
    }
}