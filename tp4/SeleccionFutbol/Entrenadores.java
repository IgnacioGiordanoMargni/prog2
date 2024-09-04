import java.time.LocalDate;

public class Entrenadores extends Integrante{
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

private int identificacionFederacion;

public Entrenadores(String nombre, String apellido, int pasaporte, LocalDate nacimiento, int identificacionFederacion) {
    super(nombre, apellido, pasaporte, nacimiento);
    this.identificacionFederacion = identificacionFederacion;
}

public Entrenadores(int identificacionFederacion) {
    this.identificacionFederacion = identificacionFederacion;
}

public int getIdentificacionFederacion() {
    return identificacionFederacion;
}

public void setIdentificacionFederacion(int identificacionFederacion) {
    this.identificacionFederacion = identificacionFederacion;
}


}
