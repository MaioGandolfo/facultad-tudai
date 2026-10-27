package filesystem;

public class CondicionAnd extends Condicion {
    private Condicion c1, c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(ElementoSA elemento) {
        return c1.cumple(elemento) && c2.cumple(elemento);
    }
}
