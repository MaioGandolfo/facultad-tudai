public class Mueble {
    private String nombre;
    private double peso;
    private int costoFabricacion;
    private int porcentajeVenta;
    private int valorVenta;
    private String tipoMadera;
    private String color;


    public Mueble(String nombre, double peso, int costoFabricacion, String tipoMadera, String color) {
        setNombre(nombre);
        setPeso(peso);
        setCostoFabricacion(costoFabricacion);
        setTipoMadera(tipoMadera);
        setColor(color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "Producto sin nombre";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0)
            this.peso = peso;
        else
            this.peso = 4;
    }

    public int getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(int costoFabricacion) {
        if(costoFabricacion > 0)
            this.costoFabricacion = costoFabricacion;
        else
            this.costoFabricacion = 100;
    }

    public int getValorVenta() {
        return (int) (getCostoFabricacion() * (getPorcentajeVenta()/100.0)) + getCostoFabricacion();
    }

    public int getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeventa(int porcentaje) {
        if(porcentaje>0)
            this.porcentajeVenta = porcentaje;
        else
            this.porcentajeVenta = 1;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        if(tipoMadera != null)
            this.tipoMadera = tipoMadera;
        else
            this.tipoMadera = "pino";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != null)
            this.color = color;
        else
            this.color = "madera al natural";
    }
    /*
    private String nombre;
    private double peso;
    private int costoFabricacion;
    private int porcentajeVenta;
    private int valorVenta;
    private String tipoMadera;
    private String color;
    */
    public String toString(){
        return "nombre de mueble: " + nombre + '\n' +  "peso: " + peso + '\n' +  "costo de fabricacion: " + costoFabricacion  + '\n' +
                "porcentaje de venta: " + porcentajeVenta + '\n' + "valor de venta: " + getValorVenta() + '\n' + "tipo de madera: " + tipoMadera + '\n' +
                "color: " + color;
    }
}
