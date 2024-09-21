
import java.util.ArrayList;

public class Provincia {
    
    // Un país tiene que controlar el gasto público de las ciudades con más de 100.000
    //habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
    //cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
    //imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
    //país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
    //que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
    //de déficit.
    //Consejo: Tener en cuenta la información que contienen los distintos impuestos
    //Extra: ¿En que afecta el tamaño de la ciudad?

    private ArrayList<Ciudad> ciudades;
    


    
    public ArrayList<Ciudad> getCiudades() {
        return (ArrayList<Ciudad>) ciudades.clone();
    }


    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }


    public Provincia() {
        
     this.ciudades=new ArrayList<Ciudad>();
    }
    

    public boolean provinciaEnDeficit(){  
        return (this.getCantCiudadesDeficit()<(this.ciudades.size()/2));
    }

    public int getCantCiudadesDeficit(){
        int i=0, cant =0;
        while(i<this.ciudades.size()){
          
            if(this.ciudades.get(i).estaEnDeficit()){
                cant++;
            }
            i++;
        }
        return cant;
    }
    public void addCiudades(Ciudad c){
        this.ciudades.add(c);
    }

}
