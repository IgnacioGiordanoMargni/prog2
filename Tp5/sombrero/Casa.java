package sombrero;

import java.util.ArrayList;

public class Casa {
   private String nombre;
   private String[] cualidades;
   private int capacidad;
   private Casa enemigo;
   private ArrayList<Alumno> alumnos;

    public Casa(String nombre, String[] cualidades, int capacidad) {
    this.nombre = nombre;
    this.cualidades = cualidades;
    this.capacidad = capacidad;
}
    public ArrayList<Alumno> getAlumnos() {
    return alumnos;
}
public void AddAlumnos(Alumno alumnos) {
    if(this.alumnos.size()<this.capacidad){
          this.alumnos.add(alumnos);
    }
}
    public Casa(String[] cualidades, String nombre) {
        this.cualidades = cualidades;
        this.nombre = nombre;
    }
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String[] getCualidades() {
    return cualidades;
}
public void setCualidades(String[] cualidades) {
    this.cualidades = cualidades;
}

public boolean alumnoAceptado(Alumno alumno){
    int cant= Arreglos.encontrarCantIntersecciones(alumno.getCualidades(), this.cualidades);
    if(this.enemigo==null){
        return cant== this.cualidades.length;
    } else {
        int cant2= Arreglos.encontrarCantIntersecciones(alumno.getCualidades(), this.enemigo.getCualidades());
        return cant2 != this.enemigo.getCualidades().length && cant== this.cualidades.length;
    }

    
}
public boolean coincidenciaFamiliares(Alumno alumno){
    int cant=0;
    if(alumno.getFamiliares()!=null){
        cant= Arreglos.encontrarCantIntersecciones(alumno.getFamiliares(), this.nombre);
    }
    return cant>=1;

}


}
