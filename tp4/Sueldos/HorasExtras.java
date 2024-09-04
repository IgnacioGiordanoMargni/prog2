public class HorasExtras extends Empleado {
   // 3 - Sueldos
    //Una empresa de informática posee tres tipos de empleados. Los empleados contratados
    //reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
    //por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
    //Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
    //cantidad de ventas realizadas.
    //Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
    //la semana.

    private int montoExtra;
    private int cantHTrabajadas;

    public HorasExtras(int cantHTrabajadas, int montoExtra){
        this.setNombre("nacho");
        this.setSueldo(100000);
        this.setTipo("Por horas extra");
        setCantHTrabajadas(cantHTrabajadas);
        setMontoExtra(montoExtra);
        
    }

    public int getSueldo(){
        return (super.getSueldo()+this.montoExtra*this.cantHTrabajadas);
    }

    public int getMontoExtra() {
        return montoExtra;
    }

    public void setMontoExtra(int montoExtra) {
        this.montoExtra = montoExtra;
    }

    public int getCantHTrabajadas() {
        return cantHTrabajadas;
    }

    public void setCantHTrabajadas(int cantHTrabajadas) {
        this.cantHTrabajadas = cantHTrabajadas;
    }

  
    
}
