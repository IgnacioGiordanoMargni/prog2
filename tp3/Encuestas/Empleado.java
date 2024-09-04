
public class Empleado {
   private int numeroDeEmpleado;
   private int cantEncuestas;
public Empleado(int numeroDeEmpleado, int cantEncuestas) {
    this.numeroDeEmpleado = numeroDeEmpleado;
    this.cantEncuestas = cantEncuestas;
}
public int getNumeroDeEmpleado() {
    return numeroDeEmpleado;
}
public void setNumeroDeEmpleado(int numeroDeEmpleado) {
    this.numeroDeEmpleado = numeroDeEmpleado;
}
public int getCantEncuestas() {
    return cantEncuestas;
}
public void setCantEncuestas(int cantEncuestas) {
    this.cantEncuestas = cantEncuestas;
}

public void sumarEncuesta() {
        this.cantEncuestas++;
    }
}
