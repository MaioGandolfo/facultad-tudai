public class Cancha {
    private String tipo;
    private int precioHora;
    private boolean tieneTurno = false;

    public Cancha(String tipo, int precioHora) {
        this.tipo = tipo;
        this.precioHora = precioHora;
        this.tieneTurno = true;
    }

    public boolean getTieneTurno() {
        return tieneTurno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
