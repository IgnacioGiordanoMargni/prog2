package avicola;

import java.time.LocalDate;

public class Congelados extends Producto {
 

    private int codigo_area;
    private String origen;
    public double temperatura_mant;
    public int getCodigo_area() {
        return codigo_area;
    }
    public void setCodigo_area(int codigo_area) {
        this.codigo_area = codigo_area;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public double getTemperatura_mant() {
        return temperatura_mant;
    }
    public void setTemperatura_mant(double temperatura_mant) {
        this.temperatura_mant = temperatura_mant;
    }
    public Congelados(int codigo_area, String origen, double temperatura_mant, LocalDate fecha_venc, int num_lot) {
        super(fecha_venc, num_lot);
        this.codigo_area = codigo_area;
        this.origen = origen;
        this.temperatura_mant = temperatura_mant;
    }
    @Override
    public String getEtiqueta(){
        return super.getEtiqueta()+ " codigo de area: "+ getCodigo_area()+ " origen: "+ getOrigen()+" temperatura de mantenimiento: "+ getTemperatura_mant()+" grados celsius";
    }
}

