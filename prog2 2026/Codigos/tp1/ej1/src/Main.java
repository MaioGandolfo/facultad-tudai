//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Persona p1 = new Persona(0);



    System.out.println("nombre: " + p1.getNombre() + '\n' + "apellido:" + p1.getApellido() + '\n' + "edad:" + p1.getEdad() + '\n' +
            "fecha de nacimiento: " + p1.getfNac() + '\n' + "dni " +p1.getDni() + '\n' + "peso " +p1.getPeso() + '\n' +
            "altura " +p1.getAltura() + '\n' + "está en forma?: " + p1.estaEnForma() + '\n' +
            "Puede votar?: " + p1.puedeVotar() + '\n' + "cumple años?: " +p1.cumpleAno());

    p1.setNombre("Mariano");
    p1.setApellido("Gandolfo");
    p1.setAltura(1.69);
    p1.setPeso(100);
    p1.setSexo("Masculino");
    p1.setfNac(2004, 8, 11);

    System.out.println("------------------------------------------------------------");

    System.out.println("nombre: " + p1.getNombre() + '\n' + "apellido:" + p1.getApellido() + '\n' + "edad:" + p1.getEdad() + '\n' +
            "fecha de nacimiento: " + p1.getfNac() + '\n' + "dni " +p1.getDni() + '\n' + "peso " +p1.getPeso() + "Kg" + '\n' +
            "altura " +p1.getAltura() + '\n' + "está en forma?: " + p1.estaEnForma() + '\n' +
            "Puede votar?: " + p1.puedeVotar() + '\n' + "cumple años?: " +p1.cumpleAno());
}
