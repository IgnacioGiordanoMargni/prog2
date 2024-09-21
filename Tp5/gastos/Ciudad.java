
import java.util.ArrayList;

public class Ciudad{

    // Un país tiene que controlar el gasto público de las ciudades con más de 100.000
    //habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
    //cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
    //imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
    //país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
    //que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
    //de déficit.
    //Consejo: Tener en cuenta la información que contienen los distintos impuestos
    //Extra: ¿En que afecta el tamaño de la ciudad?

    private ArrayList<Contribuyente> contribuyente;
    private double mantenimiento;



    public Ciudad (double mantenimiento) {
        this.contribuyente = new ArrayList<Contribuyente>();
        this.mantenimiento = mantenimiento;
    }
 
    public void addContribuyente(Contribuyente e) {
        this.contribuyente.add(e);
    }
    public boolean estaEnDeficit(){
        return getSumaImp()<this.mantenimiento;
    }
    public double getSumaImp(){
         double cant=0;
        for(int i=0; i<=this.contribuyente.size(); i++){
               cant=+this.contribuyente.get(i).getImpuestos();
        }
        return cant;
    }
 
  
    public double getMantenimiento() {
        return mantenimiento;
    }
    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }


}