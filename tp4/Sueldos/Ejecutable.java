public class Ejecutable {
   public static void main(String[] args) {
    Empleado empleado= new Empleado();
    empleado= new HorasExtras(2, 40000);
    System.out.println(empleado.getSueldo());
   }
}
