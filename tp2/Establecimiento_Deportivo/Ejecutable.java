
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ejecutable {

    public static void main(String[] args) {


        Establecimiento establecimiento= new Establecimiento(2);
        Canchas[] canchas= establecimiento.getCanchas();
        Usuarios usuario= new Usuarios("nacho");
        Turno turno = new Turno(LocalDateTime.now(), usuario, canchas[0] );
        establecimiento.setNewTurno(turno);
  
        Turno[] turnos= establecimiento.getTurnos();
  
        Turno turno2 = new Turno(LocalDateTime.now().plus(30, ChronoUnit.MINUTES ), usuario, canchas[0] );
        establecimiento.setNewTurno(turno2);
        Turno[] turnos2= establecimiento.getTurnos();
        System.out.println(turnos2[0].getHorario());
        
    }
}
