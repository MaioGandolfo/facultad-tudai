//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //vehiculos

    Vehiculo taxi1 = new Taxi("AA 192 TT", 70000, 2019, 5, 2010, 2000, 500);
    Vehiculo taxi2 = new Taxi("AA 454 TR", 10000, 2010, 5, 2010, 2000, 700);
    Vehiculo taxi3 = new Taxi("AB 192 YT", 24000, 2007, 5, 2010, 2000, 1000);
    Vehiculo taxi4 = new Taxi("AH 192 OT", 1000, 2026, 5, 2026, 2000, 20000);

    Vehiculo colectivo1 = new Colectivo("AA 193 RT", 124578, 2025, 32, 5000);
    Vehiculo colectivo2 = new Colectivo("AE 929 PA", 500000, 2020, 32, 5000);
    Vehiculo colectivo3 = new Colectivo("AA 732 SS", 92452, 2012, 32, 5000);
    Vehiculo colectivo4 = new Colectivo("AA 000 RT", 303324, 2015, 32, 5000);

    Vehiculo maquina1 = new MaquinaVial("AA 203 XD", 25000, 2020, 2, 400);
    Vehiculo maquina2 = new MaquinaVial("AC 213 II", 30000, 2000, 2, 349);
    Vehiculo maquina3 = new MaquinaVial("AG 061 XT", 100000, 2025, 2, 800);
    Vehiculo maquina4 = new MaquinaVial("AE 093 PP", 2000, 2026, 2, 1000);

    Flota flota1 = new Flota();
    Flota flota2 = new Flota();
    Flota flota3 =new Flota();
    Flota flota4 = new Flota();

    FlotaLimitada flotaLimitada1 = new FlotaLimitada(new CondicionModelo(2023));
    FlotaLimitada flotaLimitada2 = new FlotaLimitada(new CondicionCaracteristica("blanco"));
    FlotaLimitada flotaLimitada3 =


}
