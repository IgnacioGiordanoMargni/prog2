package agricultores;

import java.util.ArrayList;

public class Lote {


private static int id=0;    

    public static int getId() {
        return id;
    }


private double tamaño;
private ArrayList<Minerales> minerales;
private String tipo;

public Lote(double tamaño, ArrayList<Minerales> minerales) {
    this.tamaño = tamaño;
    this.minerales = new ArrayList<Minerales>();
    this.tipo=calcularTipo();
    setId();
}
public static void setId() {
    Lote.id++;
}

    public Lote(double tamaño) {
        this.tamaño = tamaño;
        this.minerales = new ArrayList<Minerales>();
        this.tipo=calcularTipo();
        setId();
    }
public String getTipo() {
    return tipo;
}
public void setTipo() {
    this.tipo = calcularTipo();
}

private static int cantMinDiferencia=5;
 

public static int getCantMinDiferencia() {
    return cantMinDiferencia;
}
public static void setCantMinDiferencia(int cantMinDiferencia) {
    Lote.cantMinDiferencia = cantMinDiferencia;
}
public double getTamaño() {
    return tamaño;
}
public void setTamaño(double tamaño) {
    this.tamaño = tamaño;
}
public ArrayList<Minerales> getMinerales() {
    return (ArrayList<Minerales>) this.minerales.clone();
}
public void addMinerales(Minerales minerales) {
    this.minerales.add(minerales);
}
    private String calcularTipo() {
         if(minerales.size()<cantMinDiferencia){ //en caso de calcularse con tipos de minerales en lugar de cantidad se puede hacer lo mismo con un metodo adicional para comparar arraylist 
            return "Común";
         } else{
            return "Especial";
         }
    }

@Override
    public String toString(){
        return "lote :"+getId();
    }

}
