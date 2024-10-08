
import java.util.ArrayList;

public class AlarmaLuminosa extends Alarma {
       //1 - Alarma
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.
//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender()
 private Luz luz;

    public AlarmaLuminosa(Luz luz) {
        super();
        this.luz = new Luz();
}

public void comprobar(){

    ArrayList<Sensor> sensores= this.getSensores();
    for(int i=0; i<sensores.size(); i++){
      
      if(sensores.get(i).isProblema()){
        System.out.println(sensores.get(i).getNombre());
        this.hacerSonar();
        this.luz.encender();
        
    }
    }
}

    public Luz getLuz() {
    return luz;
}

public void setLuz(Luz luz) {
    this.luz = luz;
}

}
