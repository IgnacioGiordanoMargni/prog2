package ConvertidorDeMedidas;

public  class Convertidor {
     
   private double valor;  

   public Convertidor(double valor) {
    this.valor = valor;
}
    public double ConvertirDeSistInternacionalASistIngles(double valorInternacional){
    return valor/valorInternacional;
   }
   public double ConvertirDeSistInglesASistInternacional(double valorIngles){
    return valorIngles/valor;
   }

}
