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

    private int habitantes;
    private double mantenimiento;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;

    public Ciudad(int habitantes, double mantenimiento, double imp1, double imp2, double imp3, double imp4,
    double imp5) {
          this.habitantes = habitantes;
          this.mantenimiento = mantenimiento;
          this.imp1 = imp1;
          this.imp2 = imp2;
          this.imp3 = imp3;
          this.imp4 = imp4;
          this.imp5 = imp5;
}
    public boolean estaEnDeficit(){
        double suma= this.imp1+this.imp2+this.imp3+this.imp4+this.imp5;

        if(suma<this.mantenimiento){
            return true;
        } else {
            return false;
        }
    }
    public double getSumaImp(){
        return this.imp1+this.imp2+this.imp3+this.imp4+this.imp5;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        if(habitantes>=100000){
            this.habitantes = habitantes;
        } else {
            System.out.println("El sistema esta hecho para ciudades de mas de cien mil habitantes");
        }
       
    }
    public double getMantenimiento() {
        return mantenimiento;
    }
    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    public double getImp1() {
        return imp1;
    }
    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }
    public double getImp2() {
        return imp2;
    }
    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }
    public double getImp3() {
        return imp3;
    }
    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }
    public double getImp4() {
        return imp4;
    }
    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }
    public double getImp5() {
        return imp5;
    }
    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

}