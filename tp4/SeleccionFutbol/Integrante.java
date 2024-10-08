import java.time.LocalDate;

public class Integrante{
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

private String nombre;
private String apellido;
private int pasaporte;
private LocalDate nacimiento;
private String estado;
public Integrante(String nombre, String apellido, int pasaporte, LocalDate nacimiento, int estado) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.pasaporte = pasaporte;
    this.nacimiento = nacimiento;

    switch (estado) {
        case 0:
            this.estado="Viajando";
            break;
        case 1:
            this.estado="En concentracion";
            break;
        default:
            this.estado="En el pais de origen";
            break;
    }
}

public Integrante() {
    setApellido("apellido");
    setNacimiento(LocalDate.now());
    setNombre("nombre");
    setPasaporte(10000);
    setEstado("En el pais de origen");
    
}
public boolean disponible(){
    if(this.estado== "En el pais de origen"){
        return true;
    } else{
        return false;
    }
}
public String getNombre() {
    return nombre;
}
public String getEstado() {
    return estado;
}
public void setEstado(String estado) {
    this.estado = estado;
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
public int getPasaporte() {
    return pasaporte;
}
public void setPasaporte(int pasaporte) {
    this.pasaporte = pasaporte;
}
public LocalDate getNacimiento() {
    return nacimiento;
}
public void setNacimiento(LocalDate nacimiento) {
    this.nacimiento = nacimiento;
}
public Integrante(String nombre, String apellido, int pasaporte, LocalDate nacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.pasaporte = pasaporte;
    this.nacimiento = nacimiento;
}
}