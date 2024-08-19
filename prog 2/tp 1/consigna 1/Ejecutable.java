import java.time.LocalDate;
public class Ejecutable {
    public static void main(String[] args) {
        Persona p= new Persona();


       p.SetAltura(1.82);
       p.SetApellido("Giordano");
       p.SetFecha(LocalDate.of(2003, 6, 27));
       p.SetNombre("Ignacio");
       p.SetPeso(72);
       p.SetSexo("m");
       p.Mostrar();
       double imc=p.CalcularImc();
       System.out.println(imc);
    }
}
