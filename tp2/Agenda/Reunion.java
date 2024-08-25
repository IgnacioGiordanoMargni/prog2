
import java.time.Duration;
import java.time.LocalDateTime;

public class Reunion {
    
//Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
//tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
//tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
//contactos telefónicos y mail de los asistentes.
//Consejo: No todos los objetos son “palpables”
//Extra: ¿Quién detecta un conflicto de horarios?



private String direccion;

private String tema;
private LocalDateTime inicio;
private LocalDateTime fin;
private Duration duracion;
private Participante[] participantes;

public Participante[] getParticipantes() {
    return participantes;
}

public Reunion(String direccion, String tema, LocalDateTime inicio, LocalDateTime fin, int cantP) {
    this.direccion = direccion;
    this.tema = tema;
    this.inicio = inicio;
    this.fin = fin;
    this.duracion= Duration.between(inicio, fin);
    this.participantes=setParticipantes(cantP);
}

private Participante[] setParticipantes(int cantP){
    Participante[] participantes= new Participante[cantP];
    int i=0;
    while(i<cantP){
    participantes[i]= new Participante();
    i++;
    }
    
   return participantes;
}










public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getTema() {
    return tema;
}
public void setTema(String tema) {
    this.tema = tema;
}
public LocalDateTime getInicio() {
    return inicio;
}
public void setInicio(LocalDateTime inicio) {
    this.inicio = inicio;
}
public LocalDateTime getFin() {
    return fin;
}
public void setFin(LocalDateTime fin) {
    this.fin = fin;
}
public Duration getDuracion() {
    return duracion;
}
public void setDuracion(Duration duracion) {
    this.duracion = duracion;
}
}
