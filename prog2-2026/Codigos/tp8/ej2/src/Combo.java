import java.util.ArrayList;

public class Combo extends Item{
    private ArrayList<Item> envios;

    public Combo(String ciudadDestino){
        super(ciudadDestino);
        this.envios = new ArrayList<>();
    }

    @Override
    public int getPeso() {
        int total=0;
        for(Item item : envios)
            total += item.getPeso();

        return total;
    }

    public void addItem(Item item){
        if(this.getCiudadDestino().equalsIgnoreCase(item.getCiudadDestino())) {
            envios.add(item);
            item.setNroTracking(this.getNroTracking());
        }
    }

    public void setNroTracking(int nroTracking){
        for(Item item : envios)
            item.setNroTracking(nroTracking);
    }


}
