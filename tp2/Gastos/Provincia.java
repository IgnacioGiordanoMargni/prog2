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

    private Ciudad[] ciudades;
    private int cantC;


    
    public Provincia(Ciudad[] ciudades, int cantC) {
        this.ciudades = ciudades;
        this.cantC = cantC;
    }
    public Provincia(int cantC){
        this.cantC= cantC;
        setCiudades();
    }

    public boolean provinciaEnDeficit(){  
        return (this.getCantCiudadesDeficit()<(this.cantC/2));
    }

    public int getCantCiudadesDeficit(){
        int i=0, cant =0;
        while(i<this.cantC){
          
            if(this.ciudades[i].estaEnDeficit()){
                cant++;
            }
            i++;
        }
        return cant;
    }
    public void setCiudades(){
        int i=0;
        this.ciudades= new Ciudad[this.cantC];
        while(i<this.cantC){
            if(i%2==0){
            this.ciudades[i]= new Ciudad(100000, 500, 500, 100, 100, 100, 100);
            } else {    
            this.ciudades[i]= new Ciudad(100000, 500, 100, 100, 100, 0, 0);
            }
            i++;
        }
    }
    public Ciudad[] getCiudades() {
        return this.ciudades;
    }
    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }
    public int getCantC() {
        return this.cantC;
    }
    public void setCantC(int cantC) {
        this.cantC = cantC;
    }

}
