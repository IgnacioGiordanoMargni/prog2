
import java.util.ArrayList;

public class Alarma{
    //1 - Alarma
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.
//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender().
//2- Alarma Sensorial
//Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
//cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
//la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
//nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
//pantalla el nombre de la zona en conflicto (pueden ser más de una

private ArrayList<Sensor> sensores;


public ArrayList<Sensor> getSensores() {
    return this.sensores;
}

public void setSensores(ArrayList<Sensor> sensores) {
    this.sensores = sensores;
}
public void addSensor(String nombre) {
    this.sensores.add(new Sensor(nombre));
}
public Alarma() {
   this.sensores= new ArrayList<Sensor>(10);

}

public void comprobar(){
 
    ArrayList<Sensor> sensores= this.getSensores();
    for(int i=0; i<sensores.size(); i++){
      
      if(sensores.get(i).isProblema()){
        System.out.println(sensores.get(i).getNombre());
        this.hacerSonar();
        
        
    }
    }
}
public void hacerSonar() {  
    System.out.println("ring");
}







}