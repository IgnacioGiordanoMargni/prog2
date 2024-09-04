
import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Mueble> muebles;

    public Fabrica(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public Fabrica() {
        this.muebles= new ArrayList();
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
        //hacer array aux para devolver, estamos rompiendo el encapsulamiento xdd
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public void agregarMueble(Mueble mueble){
        this.muebles.add(mueble);
    }
    
    public double costoFabricacion (){
        double suma=0;
        for (int i=0; i<this.muebles.size(); i++){
            suma+=this.muebles.get(i).getCostoFabrica()*this.muebles.get(i).getStock();
        }
        return suma;
    }
    public double costoVenta (){
        double suma=0;
        for (int i=0; i<this.muebles.size(); i++){
            suma+=this.muebles.get(i).getPrecioVenta()*this.muebles.get(i).getStock();
        }
        return suma;
    }
}
