public class Provincia {
    private Ciudad [] ciudades;
    private double totalRecaudado;

    public Provincia (int cantCiudades){
        this.ciudades = new Ciudad[cantCiudades];
    }

    public void setTotalRecaudado(double totalRecaudado){
        if(totalRecaudado >0)
            this.totalRecaudado=totalRecaudado;
        else
            this.totalRecaudado=1;
    }

    public double getTotalRecaudado(){
        return totalRecaudado;
    }

    public Ciudad [] getCiudadesGrandes(int cantHab){
        Ciudad ciudadTemp []= new  Ciudad[ciudades.length];
        int cantCiudades100k=0;

        for(int i=0; i<ciudades.length; i++){
            if(ciudades[i].getCantHabitantes() > cantHab) {
                ciudadTemp[i] = ciudades[i];
                cantCiudades100k++;
            }
        }
        Ciudad ciudades100k [] = new Ciudad[cantCiudades100k];

        for(int i=0; i<cantCiudades100k; i++)
            ciudades100k[i] = ciudadTemp[i];

        return ciudades100k;
    }

}
