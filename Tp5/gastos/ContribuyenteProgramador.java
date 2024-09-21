public class ContribuyenteProgramador extends Contribuyente{


    private double montoFacturadoSoftware;
  
    private static double porcentaje=2;
 
    public ContribuyenteProgramador(String nombre, double impuesto, double montoFacturadoSoftware) {
        super(nombre, impuesto);
        this.montoFacturadoSoftware = montoFacturadoSoftware;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public static void setPorcentaje(double p) {
       porcentaje = p;
    }

    @Override
    public double getImpuestos(){
        return super.getImpuestos()*100/20+porcentaje*100/montoFacturadoSoftware;
    }
    public double getMontoFacturadoSoftware() {
        return montoFacturadoSoftware;
    }
    public void setMontoFacturadoSoftware(double montoFacturadoSoftware) {
        this.montoFacturadoSoftware = montoFacturadoSoftware;
    }

}
