package avicola;
import java.time.LocalDate;

public class Cong_nit extends Congelados{
  private int tiempo;
  private String metodo;
public int getTiempo() {
    return tiempo;
}
public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
}
public String getMetodo() {
    return metodo;
}
public void setMetodo(String metodo) {
    this.metodo = metodo;
}
public Cong_nit(int codigo_area, String origen, double temperatura_mant, LocalDate fecha_venc, int num_lot, int tiempo,
        String metodo) {
    super(codigo_area, origen, temperatura_mant, fecha_venc, num_lot);
    this.tiempo = tiempo;
    this.metodo = metodo;
}
@Override
public String getEtiqueta(){
    return super.getEtiqueta()+" el metodo de congelación por nitrogeno fue: "+ getMetodo()+ " el tiempo que tardo fue de: "+ getTiempo()+" segundos";
}

}
