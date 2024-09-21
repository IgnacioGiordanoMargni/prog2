
import java.util.ArrayList;



public class Pais {
        // Un país tiene que controlar el gasto público de las ciudades con más de 100.000
    //habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
    //cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
    //imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
    //país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
    //que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
    //de déficit.
    //Consejo: Tener en cuenta la información que contienen los distintos impuestos
    //Extra: ¿En que afecta el tamaño de la ciudad?

    private Provincia[] provincias;
    private int cantP;
 

    public Pais(Provincia[] provincias, int cantP) {
        this.provincias = provincias;
        this.cantP = cantP;
    }
    public void setProvincias(){
        int i=0;
        this.provincias= new Provincia[this.cantP];
        while(i<this.cantP){
            this.provincias[i]= new Provincia();
            i++;
        }
    }
    public Provincia[] getProvincias() {
        return provincias;
    }
    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }
    public int getCantP() {
        return cantP;
    }
    public void setCantP(int cantP) {
        this.cantP = cantP;
    }
   
    public void analizarProvinciasYCiudades(){
        int i=0, j=0;
        
        while(i<this.cantP){
         
            if(this.provincias[i].provinciaEnDeficit()){
                System.out.println("La provincia numero "+i+1+" esta en deficit");

            }
             
             ArrayList<Ciudad> ciudades=this.provincias[i].getCiudades();
          
             j=0;
            while(j<=this.provincias[i].getCiudades().size()){
                 if(ciudades.get(i).estaEnDeficit()){
                    System.out.println("La ciudad numero "+(j+1)+" de la provincia numero "+(i+1)+" esta en deficit");
                 }
                 j++;
            }
            i++;
        }
    }
}
