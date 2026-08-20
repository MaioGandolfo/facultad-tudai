import java.util.ArrayList;

public class Ciudad {
    private int cantHabitantes;
    private ArrayList<Impuesto> impuestos;
    private double gasto;


    public Ciudad (int cantHabitantes, Impuesto imp, double gasto){
        setCantHabitantes(cantHabitantes);
        agregarImpuesto(imp);
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
        double recaudado=0;
        for(int i=0; i<impuestos.size(); i++)
            recaudado+= impuestos.get(i).getValor();
        return recaudado;
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

}