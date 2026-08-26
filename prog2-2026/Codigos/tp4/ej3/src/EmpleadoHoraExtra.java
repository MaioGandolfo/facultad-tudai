public class EmpleadoHoraExtra extends Empleado {
    private int extraPorHora;
    private int cantHorasTrabajadas;

    public EmpleadoHoraExtra(String nombre, int cantHorasTrabajadas, int extraPorHora){
        super(nombre);
        setExtraPorHora(extraPorHora);
        setCantHorasTrabajadas(cantHorasTrabajadas);
    }


    public int pagoTotal(){
        return getSueldoFijo() + (getCantHorasTrabajadas() * extraPorHora);
    }

    public String toString(){
        return super.toString() + '\n' + "extra por hora: " + extraPorHora;
    }

    public void setCantHorasTrabajadas(int cantHorasTrabajadas){
        if(cantHorasTrabajadas > 0)
            this.cantHorasTrabajadas = cantHorasTrabajadas;
        else
            this.cantHorasTrabajadas = 48;
    }

    public int getCantHorasTrabajadas(){
        return cantHorasTrabajadas;
    }


    public void setExtraPorHora(int extraPorHora){
        this.extraPorHora=extraPorHora;
    }

    public int getExtraPorHora(){
        return extraPorHora;
    }

}
