package agricultores;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private ArrayList<Cereales> cereales;
    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void addLotes(Lote e) {
        this.lotes.add(e);
    }

    public ArrayList<Cereales> getCereales() {
        return cereales;
    }

    public void addCereales(Cereales e) {
        this.cereales.add(e);
    }

    public Cooperativa(){
        this.lotes= new ArrayList<Lote>();
        this.cereales= new ArrayList<Cereales>();
    }

    public void lotesCompatiblesConCereal(Cereales cereal){
        int i=0;
        while(i<this.lotes.size()){
            if(cereal.esCultivable(lotes.get(i))){
                 System.out.println(lotes.get(i)+" es compatible con el cereal");
            }else {
                System.out.println(lotes.get(i)+ "no es compatible ");
            }
            i++;
        }
    }

}
