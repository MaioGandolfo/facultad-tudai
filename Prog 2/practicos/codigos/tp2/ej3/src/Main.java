import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Tandil", 2890151, 1522000, 50000, 60000, 55000, 52000);
        Ciudad c2 = new Ciudad("Mar del Plata", 1391000, 70000, 30000, 28000, 31000, 29000);
        Ciudad c3 = new Ciudad("La Plata", 948312, 52220000, 25000, 27000, 26000, 24000);
        Ciudad c4 = new Ciudad("Rauch", 1150400, 2500000, 15000, 14000, 16000, 15500);
        Ciudad c5 = new Ciudad("Olavarria", 772618, 4000, 20000, 19000, 21000, 19500);
        Ciudad c6 = new Ciudad("Rosario", 593337, 32000000, 18000, 17500, 18500, 19000);
        Ciudad c7 = new Ciudad("Salta", 620000, 28000, 14000, 15000, 14500, 13500);
        Ciudad c8 = new Ciudad("San Miguel de Tucumán", 830000, 35000000, 17000, 16500, 16000, 17500);
        Ciudad c9 = new Ciudad("San Juan", 471389, 2200, 12000, 11000, 13000, 12500);
        Ciudad c10 = new Ciudad("Neuquén", 340000, 26000000, 15000, 14800, 15200, 14900);

        Provincia p1 = new Provincia("Buenos Aires");
        Provincia p2 = new Provincia("Santa fe");

        Pais pa1 = new Pais("Argentina");

        p1.addCiudad(c1);
        p1.addCiudad(c2);
        p1.addCiudad(c3);
        p1.addCiudad(c4);

        p2.addCiudad(c5);
        p2.addCiudad(c6);
        p2.addCiudad(c7);
        p2.addCiudad(c8);
        p2.addCiudad(c9);
        p2.addCiudad(c10);

        pa1.addProvincia(p1);
        pa1.addProvincia(p2);

        ArrayList<Ciudad> ciudades = pa1.ciudadesDeficit();
        ArrayList<Provincia> provincias = pa1.provinciasDeficit();

        System.out.println(ciudades.toString());
        System.out.println(provincias.toString());

    }
}