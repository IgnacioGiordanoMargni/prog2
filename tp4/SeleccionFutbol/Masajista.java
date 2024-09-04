import java.time.LocalDate;

public class Masajista extends Integrante {
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

private String titulo;
private int añosExp;
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public int getAñosExp() {
    return añosExp;
}
public void setAñosExp(int añosExp) {
    this.añosExp = añosExp;
}
public Masajista(String nombre, String apellido, int pasaporte, LocalDate nacimiento, String titulo, int añosExp) {
    super(nombre, apellido, pasaporte, nacimiento);
    this.titulo = titulo;
    this.añosExp = añosExp;
}
public Masajista(String titulo, int añosExp) {
    this.titulo = titulo;
    this.añosExp = añosExp;
}
}
