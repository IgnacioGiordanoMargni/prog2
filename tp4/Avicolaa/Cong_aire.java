package Avicolaa;
import java.time.LocalDate;

public class Cong_aire extends Congelados{
    private String info_cong;

    public String getInfo_cong() {
        return info_cong;
    }

    public void setInfo_cong(String info_cong) {
        this.info_cong = info_cong;
    }

    public Cong_aire(int codigo_area, String origen, double temperatura_mant, LocalDate fecha_venc, int num_lot,
            String info_cong) {
        super(codigo_area, origen, temperatura_mant, fecha_venc, num_lot);
        this.info_cong = info_cong;
    }
    @Override
    public String getEtiqueta(){
        return super.getEtiqueta()+" informacion de congelación por aire: "+ getInfo_cong();
    }

}
