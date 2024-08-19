import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reuniones{
    private String direccion;  
    private Participantes[] participantes;
    private String tema;
    private LocalTime duracion;
    private LocalDateTime fecha;
    private int cantParticipantes;
    
  //  Una agenda personal permite registrar reuniones en las que el usuario va a participar. En 
//tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el 
//tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo 
//contactos telefónicos y mail de los asistentes.
//Consejo: No todos los objetos son “palpables”
//Extra: ¿Quién detecta un conflicto de horarios?






public Reuniones(String direccion, Participantes[] participantes, String tema, LocalDateTime fecha, int cantParticipantes) {
setDireccion(direccion);
setDuracion();
setFecha(fecha);
setParticipantes(participantes,cantParticipantes);
setTema(tema);
}

public Reuniones(String direccion,  String tema, int cantParticipantes) {
setDireccion(direccion);
setDuracion();
ingresarFecha();
setTema(tema);
ingresarParticipantes(cantParticipantes);
}
 

public void ingresarFecha(){
    try {
        String fechaString;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese una fecha y hora (yyyy-MM-dd HH:mm:ss): ");
        fechaString = buffer.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fecha = LocalDateTime.parse(fechaString, formatter);
    } catch (Exception e) {
        // TODO: handle exception
    }
}

public void ingresarParticipantes(int cantParticipantes){
    try {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i=0, telefono=0;
        String nombre=" ", apellido=" ", mail=" ";
        
        while(i<cantParticipantes){
          
          System.out.println("ingrese datos de participante numero "+ (i+1));
          System.out.println("ingrese su nombre");
          nombre=buffer.readLine();
          System.out.println("ingrese su apellido");
          apellido=buffer.readLine();
          System.out.println("ingrese su mail");
          mail=buffer.readLine();
          System.out.println("ingrese su telefono");
          telefono = Integer.parseInt(buffer.readLine());

          this.participantes[i]=new Participantes(nombre, apellido, telefono, mail);
        }
    } catch (Exception e) {
        // TODO: handle exception
    }
}
public void setNewParticipante(Participantes participante, int cantParticipantes){
    this.participantes[cantParticipantes-1]=participante;
}

public LocalDateTime getFecha() {
    return this.fecha;
}
public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
}
public void setParticipantes(Participantes[] participantes, int cantParticipantes) {
  
        this.participantes = participantes;
    
}
public int getCantParticipantes() {
    return cantParticipantes;
}

public void setCantParticipantes(int cantParticipantes) {
    this.cantParticipantes = cantParticipantes;
}
public Participantes[] getParticipantes() {
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
public LocalTime getDuracion() {
    return this.duracion;
}
public void setDuracion() {
    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        System.out.print("Ingrese una hora (HH:mm:ss): ");
        String horaString = br.readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime hora = LocalTime.parse(horaString, formatter);
} catch(Exception e){

}

}
}