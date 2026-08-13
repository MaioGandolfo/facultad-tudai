//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Persona p1 = new Persona(45578289);


    p1.setNombre("Mariano");
    p1.setApellido("Gandolfo");
    p1.setFNac(LocalDate.of(2004, 06, 17));
    p1.setAltura(1.69);
    p1.setPeso(100);
    p1.setSexo("Masculino");

    System.out.println("Nombre: " + p1.getNombre() + '\n' + "Apellido: " + p1.getApellido() + '\n' +
            "Fecha de nacimiento: " + p1.getfNac() + '\n' + "Edad: " + p1.getEdad() + '\n' + "Puede votar?: " + p1.puedeVotar() + '\n' +
            "Tiene edad coherente?: " + p1.edadCoherente() + '\n' + "Es su cumple años?: " + p1.cumpleAno() + '\n' + "Está en forma?: " +p1.estaEnForma() +
            '\n' + "DNI: " + p1.getDni());



}
