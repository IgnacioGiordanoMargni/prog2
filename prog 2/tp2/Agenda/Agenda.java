import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Agenda {

    private Reuniones[] reuniones;
    private int cant;

    
    
    public Agenda(int cant) {
        setCant(cant);
        ingresarReuniones(cant);
    }
    public Agenda(Reuniones[] reuniones, int cant) {
        setCant(cant);
        setReuniones(reuniones);
    }
    public boolean conflictoHorario(LocalDate fecha, LocalTime horarioInicial, LocalTime horarioFinal){
        int i=0;
        while(i<cant){
            if(this.reuniones[i].getHorarioInicio()==horarioInicial && )
        }
    }
    private void ingresarReuniones(int cant) {
        int i=0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      
        String direccion=" ", tema=" ", fechaString=" ", horarioString=" ";
        int cantParticipantes=0;
        LocalDate fecha;
        LocalTime horarioInicio, horarioFinal;
        DateTimeFormatter formatterF = DateTimeFormatter.ofPattern("dd/MM/yyyy"),   formatterH = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(i<cant){
            try {
                System.out.println("ingrese la fecha en formato dia/mes/año");
                fechaString=buffer.readLine();
                fecha = LocalDate.parse(fechaString, formatterF);        
                System.out.println("ingrese el horario inicial en formato hora/minuto/segundo");
                horarioString=buffer.readLine();
                horarioInicio= LocalTime.parse(horarioString, formatterH);
                System.out.println("ingrese el horario final en formato hora/minuto/segundo");
                horarioString=buffer.readLine();
                horarioFinal= LocalTime.parse(horarioString, formatterH);
                if(conflictoHorario(fecha, horarioInicio, horarioFinal)){
                    System.out.println("ingrese direccion");
                    direccion= buffer.readLine();
                    tema= buffer.readLine();
                    cantParticipantes=Integer.parseInt(buffer.readLine());
                    this.reuniones[i]= new Reuniones(direccion, tema, cantParticipantes);
                }
       
             
              
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
    }
  
    public Reuniones[] getReuniones() {
        return reuniones;
    }
    public void setReuniones(Reuniones[] reuniones) {
        this.reuniones = reuniones;
    }
    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    
}