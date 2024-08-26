public class PuntoGeometrico{

  private double y;
  private double x;

  PuntoGeometrico(){
    SetCoordenadas(0, 0);
  }
  PuntoGeometrico(double x, double y){
    SetCoordenadas(x, y);
  }

  void SetCoordenadas(double unx, double uny){
    if(unx<0){
      unx=-unx;
    }
    if(uny<0){
      uny=-uny;
    }
    this.x=unx;
    this.y=uny;
  }
  public double getX(){
    return  this.x;
  }
  
  public double getY(){
    return  this.y;
  }
  double DistanciaEuclidea(double unx, double uny){
    return Math.sqrt(Math.pow((this.x-unx), 2)+Math.pow((this.y-uny), 2));
  }

}