public class ejecutable {
    
  public static void main(String[] args) {
    PuntoGeometrico v1= new PuntoGeometrico(0, 4);
PuntoGeometrico v2= new PuntoGeometrico(10, 0);
Rectangulo rectangulo= new Rectangulo(v1, v2);
double area=rectangulo.calcularArea();
   
System.out.println(area); 
  }
}
