public class Impuesto {
    private String nombre;
    private double valor;

    public Impuesto(String nn, double valor){
        setNombre(nn);
        setValor(valor);
    }

    public boolean equals (Object o1){
        Impuesto aux = (Impuesto) o1;
        try {
            return aux.getNombre().equals(this.getNombre());
        } catch (Exception e){
            return false;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
