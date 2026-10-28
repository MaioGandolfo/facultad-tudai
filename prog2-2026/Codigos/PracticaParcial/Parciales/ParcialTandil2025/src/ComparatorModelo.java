import java.util.Comparator;

public class ComparatorModelo implements Comparator<Vehiculo> {


    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return  Integer.compare(o1.getModelo(), o2.getModelo());
    }
}
