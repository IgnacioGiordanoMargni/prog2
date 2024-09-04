public class ejecutable {
 public static void main(String[] args) {
    Encuesta[] encuestas= new Encuesta[1];
    String[] preguntas= {"Hola", "ashffu+"};
    String[] preguntas2= {"Hla", "asffu+"};
    Persona persona= new Persona(44837556);
    Empleado empleado= new Empleado(10, 1);
    encuestas[0]= new Encuesta(pregun
    tas, persona, empleado );
    Compania cualquiera = new Compania(encuestas);
    System.out.println(cualquiera.buscarRepetidos(preguntas2, persona));
    System.out.println(empleado.getCantEncuestas());
 }
}
