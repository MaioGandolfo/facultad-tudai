public abstract class Item {
    private String ciudadDestino;
    private boolean retiraSucursal;
    private int nroTracking;

    public Item(String ciudadDestino){
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public boolean isRetiraSucursal() {
        return retiraSucursal;
    }

    public void setRetiraSucursal(boolean retiraSucursal) {
        this.retiraSucursal = retiraSucursal;
    }

    public int getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public abstract int getPeso();
}
