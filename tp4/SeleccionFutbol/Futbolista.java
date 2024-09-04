import java.time.LocalDate;

public class Futbolista extends Integrante {
       // 4 - Selección de fútbol
//El contingente de la selección de fútbol de un país está formado tanto por futbolistas como
//por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de
//pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o
//derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la
//federación a la que pertenecen y los masajistas el título que poseen y la cantidad de años de
//experiencia.
//El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”,
//“En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
//o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
//el país de origen y no está concentrando para un partido.
//Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede
//ser futbolista, ni masajista.

private int posicion;
private boolean diestro;
private int cantGoles;
public int getPosicion() {
    return posicion;
}
public void setPosicion(int posicion) {
    this.posicion = posicion;
}
public boolean isDiestro() {
    return diestro;
}
public void setDiestro(boolean diestro) {
    this.diestro = diestro;
}
public int getCantGoles() {
    return cantGoles;
}
public void setCantGoles(int cantGoles) {
    this.cantGoles = cantGoles;
}
public Futbolista(String nombre, String apellido, int pasaporte, LocalDate nacimiento, int posicion, boolean diestro,
        int cantGoles) {
    super(nombre, apellido, pasaporte, nacimiento);
    this.posicion = posicion;
    this.diestro = diestro;
    this.cantGoles = cantGoles;
}
public Futbolista(int posicion, boolean diestro, int cantGoles) {
    this.posicion = posicion;
    this.diestro = diestro;
    this.cantGoles = cantGoles;
}


}
