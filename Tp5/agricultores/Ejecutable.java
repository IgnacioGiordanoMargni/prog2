package agricultores;

public class Ejecutable {
   public static void main(String[] args) {
    Cooperativa cooperativa= new Cooperativa();
    cooperativa.addCereales(new Cereales("trigo"));
    cooperativa.addCereales(new Cereales("maiz"));
    cooperativa.addCereales(new Cereales("lino"));
    cooperativa.addCereales(new Cereales("girasol"));
    cooperativa.addCereales(new Cereales("tomates"));
    cooperativa.addCereales(new Cereales("alpargatas"));
    Minerales mineral= new Minerales("wdsasdasd");
    Minerales mineral2= new Minerales("asd");
    Lote lote= new Lote(10);
    for (int i = 0; i < cooperativa.getCereales().size(); i++) {
        cooperativa.getCereales().get(i).addMinerales(mineral);
        if(i<1){
            lote.addMinerales(mineral2);
        }
   
        cooperativa.addLotes(lote);
       
    }
     
    cooperativa.lotesCompatiblesConCereal(cooperativa.getCereales().get(0));
    System.out.println(cooperativa.getLotes().get(0).getTipo());

    
   }
}
