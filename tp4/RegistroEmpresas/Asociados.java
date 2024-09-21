package RegistroEmpresas;
import java.time.LocalDate;

public class Asociados {
   private String nombre;
   private String apellido;
   private LocalDate fecha_nac;
   private String cargo;
public Asociados(String nombre, String apellido, LocalDate fecha_nac, String cargo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fecha_nac = fecha_nac;
    this.cargo = cargo;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public LocalDate getFecha_nac() {
    return fecha_nac;
}
public void setFecha_nac(LocalDate fecha_nac) {
    this.fecha_nac = fecha_nac;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
 
public String getLineaLista(){
    return "nombre: "+getNombre()+" apellido: "+ getApellido()+ " cargo: "+ getCargo();
}
}
