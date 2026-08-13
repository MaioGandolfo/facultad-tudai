public class PuntoGeometrico {
    private int x;
    private int y;

    public PuntoGeometrico (){
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void desplazar(int x, int y){
        this.x += x;
        this.y += y;
    }

    public int distanciaEuclidea(PuntoGeometrico p2){
        return (int) (Math.sqrt(Math.pow((getX() - p2.getX()), 2 ) + Math.pow((getY() - p2.getY()), 2)));
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
