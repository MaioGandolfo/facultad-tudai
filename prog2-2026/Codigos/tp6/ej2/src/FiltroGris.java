import java.util.ArrayList;

public class FiltroGris extends Filtro{

    public FiltroGris(){
    }


    @Override
    public void aplicarFiltro(Pixel pixel) {
        int gris = (int) (0.3*pixel.getR() + 0.59*pixel.getG() + 0.11*pixel.getB());

        pixel.setValorR(gris);
        pixel.setValorG(gris);
        pixel.setValorB(gris);
    }

}
