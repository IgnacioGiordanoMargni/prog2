public class ContribuyenteComerciante extends Contribuyente {
    private double montoFacturado;
    private static double porcentaje=3.5;
    public double getMontoFacturado() {
        return montoFacturado;
    }
    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public static void setPorcentaje(double p) {
       porcentaje = p;
    }
    public ContribuyenteComerciante(String nombre, double impuesto, double montoFacturado, double porcentaje) {
        super(nombre, impuesto);
        this.montoFacturado = montoFacturado;
       setPorcentaje(impuesto);
    }
    public double getImpuestos(){
        return super.getImpuestos()/2+porcentaje*100/montoFacturado;
    }

}
