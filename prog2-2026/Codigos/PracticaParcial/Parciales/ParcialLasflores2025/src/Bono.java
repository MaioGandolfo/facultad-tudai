public class Bono extends  BonoBursatil{
    //el cual cuenta con un número de emisión, una descripción (por ejemplo, “Bono del
    //Tesoro 2030”), el valor nominal y el CUIT del titular.

    private int nEmicion;
    private String descripcion;
    private double valor;

    public Bono(int nEmicion, int cuitEmisor, String descripcion, double valor){
        super(cuitEmisor);
        this.nEmicion = nEmicion;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public int getNEmicion() {
        return nEmicion;
    }

    public void setnEmicion(int nEmicion) {
        this.nEmicion = nEmicion;
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
