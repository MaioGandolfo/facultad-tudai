public class Electrodomestico {
    private String nombre;
    private int precioBase;
    private String color;
    private int consumoEner;
    private double peso;

    public Electrodomestico(){
        this.color = "gris plata";
        this.consumoEner = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico (String nombre, String color){
        setNombre(nombre);
        setColor(color);
        this.consumoEner = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico (int consumoEner){
        this.color = "gris plata";
        this.consumoEner = consumoEner;
        this.precioBase = 100;
        this.peso = 2;
    }

    public boolean bajoConsumo(){
        return getConsumoEner() < 45;
    }

    public double calcularBalance(){
        return (getPrecioBase() / getPeso());
    }

    public boolean altaGama(){
        return calcularBalance() > 3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "producto sin nombre";
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase > 0 )
            this.precioBase = precioBase;
        else
            this.precioBase = 100;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null)
            this.color = color;
        else
            this.color = "gris plata";
    }

    public int getConsumoEner() {
        return consumoEner;
    }

    public void setConsumoEner(int consumoEner) {
        if (consumoEner > 0)
            this.consumoEner = consumoEner;
        else
            this.consumoEner = 10;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0 )
            this.peso = peso;
        else
            this.peso = 2;
    }
}
