package agricultores;

public class CerealesPasturas extends Cereales{
  
    private double tamMinimo;

    public double getTamMinimo() {
        return tamMinimo;
    }

    public void setTamMinimo(double tamMinimo) {
        this.tamMinimo = tamMinimo;
    }

    public CerealesPasturas(String nombre, double tamMinimo) {
        super(nombre);
        this.tamMinimo = tamMinimo;
    }
    public boolean esCultivable(Lote lote){
        return super.esCultivable(lote) && this.tamMinimo<=lote.getTamaño();
    }
    
}

 
