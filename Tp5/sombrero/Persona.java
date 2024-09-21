package sombrero;

public class Persona {
   private Casa casa;
   private String nombre;
   private String apellido;
   private boolean sangrePura;

    public Persona(String apellido, Casa casa, String nombre, boolean sangrePura) {
        this.apellido = apellido;
        this.casa = casa;
        this.nombre = nombre;
        this.sangrePura = sangrePura;
    }
    public Persona(String apellido, String nombre, boolean sangrePura) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.sangrePura = sangrePura;
    }
public Casa getCasa() {
    return casa;
}
public void setCasa(Casa casa) {
    this.casa = casa;
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
public boolean isSangrePura() {
    return sangrePura;
}
public void setSangrePura(boolean sangrePura) {
    this.sangrePura = sangrePura;
}
   
}
