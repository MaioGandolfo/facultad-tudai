public class FiltroSepia extends  Filtro{

    public FiltroSepia(){
    }

    /*
    newR = 0.393*R + 0.769*G + 0.189*B
    newG = 0.349*R + 0.686*G + 0.168*B
    newB = 0.272*R + 0.534*G + 0.131*B
     */
    public void aplicarFiltro(Pixel pixel) {
        int r = (int) (0.393* pixel.getR() + 0.769* pixel.getG() + 0.189* pixel.getB());
        int g = (int) (0.349* pixel.getR() + 0.686* pixel.getG() + 0.168*pixel.getB());
        int b = (int) (0.272* pixel.getR() + 0.534* pixel.getG() + 0.131* pixel.getB());

        pixel.setValorR(r);
        pixel.setValorG(g);
        pixel.setValorB(b);
    }
}
