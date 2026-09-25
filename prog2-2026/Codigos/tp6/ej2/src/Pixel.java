public class Pixel {
    private int r, g, b;

    public Pixel (int r ,int g ,int b){
        setValorR(r);
        setValorG(g);
        setValorB(b);
    }

    public int cumpleValor(int pp){
        if(pp >= 0 && pp<=255)
            return pp;
        else
            return 0;
    }

    public void setValorR(int r){
        this.r = cumpleValor(r);
    }

    public void setValorG(int g){
        this.b = cumpleValor(g);
    }

    public void setValorB(int b){
        this.b = cumpleValor(b);
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
