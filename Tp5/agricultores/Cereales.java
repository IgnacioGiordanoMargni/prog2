package agricultores;

import java.util.ArrayList;

public class Cereales {
    private ArrayList<Minerales> minerales;
    private String nombre;
    public Cereales( String nombre) {
        this.minerales = new ArrayList<Minerales>();
        this.nombre = nombre;
    }
    public void addMinerales(Minerales mineral) {
        this.minerales.add(mineral);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esCultivable(Lote lote){
        int i=0;
        lote.setTipo();//actualizo el valor minimo de diferencia en caso de que se haya cambiado
        while(i<minerales.size() && this.minerales.get(i).contains(lote.getMinerales().get(i))){      
            i++;
        }
        
        return i==minerales.size();
    }
 

}
