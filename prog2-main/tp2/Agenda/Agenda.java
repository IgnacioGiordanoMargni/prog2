
import java.time.LocalDateTime;


public class Agenda {
    

//Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
//tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
//tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
//contactos telefónicos y mail de los asistentes.
//Consejo: No todos los objetos son “palpables”
//Extra: ¿Quién detecta un conflicto de horarios?


private Reunion[] reuniones;
private int cantR=0;

public int getCantR() {
    return this.cantR;
}
public void setCantR(int cantR) {
    this.cantR = cantR;
}
public Agenda(Reunion[] reuniones, int cantR) {
    this.reuniones = reuniones;
    this.cantR= cantR;
}
public Agenda() {
    this.reuniones = setReunionesAu(3);
    this.cantR=3;
}

public void setNewReunion(String direccion, String tema, LocalDateTime inicio, LocalDateTime fin, int cantP){
    this.cantR++;
     Reunion[] reuniones= new Reunion[this.cantR];
     int i=0;
     while(i<this.cantR-1){
        reuniones[i]=this.reuniones[i];
        i++;
     }
     reuniones[cantR-1]=new Reunion(direccion, tema, inicio, fin, cantP);
     this.reuniones= new Reunion[this.cantR];
    this.reuniones=reuniones;

}

private Reunion[] setReunionesAu(int cantR){
    int i=0;
    this.reuniones= new Reunion[cantR];
    while(i<cantR){
        this.reuniones[i]= new Reunion("direccion de ejemplo "+ (i+1), " tema eje "+(i+1), LocalDateTime.now(), LocalDateTime.now().plusMinutes(30), cantR);
        i++;
    }
    return reuniones;
}
public Reunion[] getReuniones() {
    return reuniones;
}

public void setReuniones(Reunion[] reuniones) {
    this.reuniones = reuniones;
}


}
