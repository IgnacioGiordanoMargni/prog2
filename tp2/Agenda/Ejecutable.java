
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class Ejecutable {
    public static void main(String[] args) {
        Agenda agenda= new Agenda();
       
        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin= LocalDateTime.now().plus(3, ChronoUnit.HOURS);
 
        agenda.setNewReunion("14 de julio 447", "interfaces", inicio, fin, 4);
        int i=0;
        
        Reunion[] reuniones= agenda.getReuniones();
        System.out.println(agenda.getCantR());
        while(i<agenda.getCantR()){
            System.out.println(i+reuniones[i].getDireccion()+" "+reuniones[i].getDuracion()+" "+reuniones[i].getTema());
            i++;
        }
    }
}
