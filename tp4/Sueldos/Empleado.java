public class Empleado{


   // 3 - Sueldos
    //Una empresa de informática posee tres tipos de empleados. Los empleados contratados
    //reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
    //por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
    //Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
    //cantidad de ventas realizadas.
    //Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
    //la semana.
   private int sueldoFijo;
   private String nombre;
   private String tipo;
   
   
   public Empleado(){
    setSueldo(1000000);
    setNombre("nacho");
    setTipo("Contratado");
   }
   
  
   public Empleado(int sueldoFijo, String nombre) {
      setSueldo(sueldoFijo);
      setNombre(nombre);
      setTipo("Contratado");
}
public int getSueldo() {
    return sueldoFijo;
}
public void setSueldo(int sueldoFijo) {
    this.sueldoFijo = sueldoFijo;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}

}