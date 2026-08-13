public class Rectangulo {
    private PuntoGeometrico p1;
    private PuntoGeometrico p2;

    public Rectangulo (PuntoGeometrico p1, PuntoGeometrico p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getBase(){
        return Math.abs(p1.getX() - p2.getX());
    }

    public double getAltura(){
        return Math.abs(p1.getY() - p2.getY());
    }

    public double calcularArea(){
        return getBase() * getAltura();
    }
}
