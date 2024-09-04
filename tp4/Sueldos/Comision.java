public class Comision extends Empleado{
       // 3 - Sueldos
    //Una empresa de informática posee tres tipos de empleados. Los empleados contratados
    //reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
    //por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
    //Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
    //cantidad de ventas realizadas.
    //Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
    //la semana.

    private int porcentaje;
    private int cantVentas;

    public Comision(int porcentaje, int cantVentas) {
        this.porcentaje = porcentaje;
        this.cantVentas = cantVentas;
    }
    public Comision(int porcentaje) {
        this.porcentaje = porcentaje;
        this.cantVentas=0;
    }
    public int getSueldo(){
        return (super.getSueldo()+this.porcentaje*this.cantVentas);
    }
    public int getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    public int getCantVentas() {
        return cantVentas;
    }
    public void setCantVentas(int cantVentas) {
        if(cantVentas<0){
            this.cantVentas = -cantVentas;
        } else {
        this.cantVentas = cantVentas;
    }
    }
    public void sumarVentas(){
        this.cantVentas++;
    }

}
