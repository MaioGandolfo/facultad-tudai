public class Rectangulo2 {
    private PuntoGeometrico p1;
    private int base;
    private int altura;

    public Rectangulo2 (){
        p1.setX(0);
        p1.setY(0);
        base=0;
        altura=0;
    }

    public Rectangulo2 (PuntoGeometrico p1){
        this.p1.setX(p1.getX());
        this.p1.setY(p1.getY());
        base=0;
        altura=0;
    }

    public Rectangulo2 (PuntoGeometrico p1, int base, int altura){
        this.p1.setX(p1.getX());
        this.p1.setY(p1.getY());
        this.base=base;
        this.altura=altura;
    }
}
