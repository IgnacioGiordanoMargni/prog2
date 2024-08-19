public class Electrodomesticos {

  private String nombre;
  private double preciobase;
  private String color;
  private int consumo;
  private double peso;


  public Electrodomesticos(String unnombre){
    nombre=unnombre;
    color="gris plata";
    consumo=10;
    preciobase=100;
    peso=2;
  }
  Electrodomesticos(double unpreciobase, String unnombre){
    nombre=unnombre;
    color="gris plata";
    consumo=10;
    preciobase=unpreciobase;
    peso=2;

  }

  public void SetNombre(String unnombre){
    this.nombre=unnombre;
  }
  public void SetPrecioBase(double unpreciobase){
    this.preciobase= unpreciobase;
  }
  public void SetColor(String uncolor){
    this.color=uncolor;
  }
  public void SetConsumo(int unconsumo){
    this.consumo=unconsumo;
  }
  public void SetPeso(int unpeso){
    this.peso=unpeso;
  }

  public String GetNombre(){
    return this.nombre;
  }
  public double GetPrecioBase(){
    return this.preciobase;
  }
  public String GetColor(){
    return this.color;
  }
  public int GetConsumo(){
    return this.consumo;
  }
  public double GetPeso(){
    return peso;
  }
    
  boolean ConsumoMenor45(){
   
    return preciobase<45;
  }

  double balance(){
    
    return (preciobase/peso);
  }
   
  boolean AltaGama(){
    return (preciobase/peso)>3;
  }
}