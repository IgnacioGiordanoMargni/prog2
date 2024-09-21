package avicola;
import java.time.LocalDate;

public class Producto {
   private LocalDate fecha_venc;
   private int num_lot;
   public Producto(LocalDate fecha_venc, int num_lot) {
    this.fecha_venc = fecha_venc;
    this.num_lot = num_lot;
}
public LocalDate getFecha_venc() {
    return fecha_venc;
}
public void setFecha_venc(LocalDate fecha_venc) {
    this.fecha_venc = fecha_venc;
}
public int getNum_lot() {
    return num_lot;
}
public void setNum_lot(int num_lot) {
    this.num_lot = num_lot;
}
public String getEtiqueta(){
    return "Fecha de vencimiento: "+this.getFecha_venc()+" numero de lote: "+getNum_lot();
}


}
