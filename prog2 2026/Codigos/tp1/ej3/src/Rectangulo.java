public class Rectangulo {
    private PuntoGeometrico p1;
    private PuntoGeometrico p2;

    public Rectangulo (PuntoGeometrico p1, PuntoGeometrico p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void desplazarRectangulo(int dX, int dY){
        p1.desplazar(dX, dY);
        p2.desplazar(dX, dY);
    }

    public double calcularArea(){
        return getBase() * getAltura();
    }

    public int comprarRectangulo(Rectangulo r2){
        if (this.calcularArea() > r2.calcularArea())
            return 1;
        else if (this.calcularArea() == r2.calcularArea())
            return 0;
        else
            return -1;
    }

    public boolean esCuadrado(){
        return getBase() == getAltura();
    }

    public int largoSuperior (){
        return getBase();
    }

    public boolean estaParado(){
        return getAltura() > getBase();
    }

    public int getBase(){
        return Math.abs(p1.getX() - p2.getX());
    }

    public int getAltura(){
        return Math.abs(p1.getY() - p2.getY());
    }

}
