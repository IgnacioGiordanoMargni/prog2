
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class Establecimiento {
    private Turno[] turnos;
    private Canchas[] canchas;
    private Usuarios[] usuarios;
    private int cantT;
    private int cantC;
    private int cantU;
    private int descuento;
    

    public Establecimiento(int cantT) {
        this.cantT = cantT;
        this.cantC=6;
        this.cantU=1;
        this.canchas= new Canchas[this.cantC];
        this.descuento=10;
        int i=0;
        while(i<this.cantC){
            if(i<4){
                this.canchas[i]=new Canchas("Futbol");
            } else if(i>=4){
                this.canchas[i]=new Canchas("Padel");
            }
            i++;
        }
        i=0;
        this.usuarios= new Usuarios[1];
        this.usuarios[0]= new Usuarios("nacho");
        this.turnos= new Turno[this.cantT];
        while(i<this.cantT && i<this.cantC){
            this.turnos[i]=new Turno(LocalDateTime.now().plus(3, ChronoUnit.HOURS), this.usuarios[0], this.canchas[i]);
            i++;
        }
    }

    public Establecimiento(Canchas[] canchas, Usuarios[] usuarios, int cantT, int cantC, int cantU) {
        this.canchas = canchas;
        this.usuarios = usuarios;
        this.cantT = cantT;
        this.cantC = cantC;
        this.cantU = cantU;
    }

    public void setNewUsuario(String nombre){
        this.usuarios[this.cantU].setNombre(nombre);
        this.cantU++;
    }

    public Turno[] getTurnos() {
        return this.turnos;
    }

    public void setNewTurno(Turno turno){
      int i=0;
      boolean ocupada=false;
      LocalDateTime horario=turno.getHorario();
      
      while(i<this.cantT){
      
         if(horario.isAfter(this.turnos[i].getHorario()) && horario.isBefore(this.turnos[i].getHorario().plus(1, ChronoUnit.HOURS))){
            ocupada=true;
         } 
         i++;
      } 
      System.out.println(this.cantT);
      if(!ocupada){
        if(esSocio(turno.getUsuario())){
            agrandarArregloTurnos();
            this.turnos[this.cantT]=turno; 
            int precio= this.turnos[this.cantT].getCancha().getPrecio();
            this.turnos[this.cantT].getCancha().setPrecio(precio-(precio*this.descuento)/100);
             this.cantT++;
        }  else {
            agrandarArregloTurnos();
            this.turnos[this.cantT]=turno;
            this.cantT++;
        }
    
    } else {
        System.out.println("cancha ocupada");
      }
   
      
    }
    private boolean esSocio(Usuarios usuario){
        int i=0, cant=0;
        while(i<this.cantT){
            if((this.turnos[i].getHorario().isAfter(LocalDateTime.now().minus(4, ChronoUnit.MONTHS))) && usuario.getNombre()==this.turnos[i].getUsuario().getNombre()){
                cant++;
            }
           
        }
        return cant>=1;
    }
    private void agrandarArregloTurnos() {
         Turno[] turno= new Turno[this.cantT];
         int i=0;
         while(i<this.cantT){
             turno[i]=this.turnos[i];
            i++;
         }
         this.turnos= new Turno[this.cantT+1];
         i=0;
         while(i<this.cantT){
            this.turnos[i] =turno[i];
           i++;
        }
    }

    public void setTurnos(Turno[] turnos) {
        this.turnos = turnos;
    }


    public Canchas[] getCanchas() {
        return canchas;
    }


    public void setCanchas(Canchas[] canchas) {
        this.canchas = canchas;
    }


    public Usuarios[] getUsuarios() {
        return usuarios;
    }


    public void setUsuarios(Usuarios[] usuarios) {
        this.usuarios = usuarios;
    }


    public int getCantT() {
        return cantT;
    }


    public void setCantT(int cantT) {
        this.cantT = cantT;
    }


    public int getCantC() {
        return cantC;
    }


    public void setCantC(int cantC) {
        this.cantC = cantC;
    }


    public int getCantU() {
        return cantU;
    }


    public void setCantU(int cantU) {
        this.cantU = cantU;
    }



  


}
