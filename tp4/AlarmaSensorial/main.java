
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Alarma alarma= new Alarma();
         alarma.addSensor("cocina");
         alarma.addSensor("comedor");
         ArrayList<Sensor> sensores= alarma.getSensores();
         sensores.get(0).setProblema(true);
        alarma.comprobar();
    }
}
