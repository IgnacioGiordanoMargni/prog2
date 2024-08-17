public class Rectangulo {
    private PuntoGeometrico v1;
    private PuntoGeometrico v2;

   

    Rectangulo(){
        this.v1= new PuntoGeometrico();
        this.v2= new PuntoGeometrico();
      
    }
    Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2){
        this.v1= new PuntoGeometrico();
        this.v2= new PuntoGeometrico();
        this.v1.SetCoordenadas(v1.getX(), v1.getY());
        this.v2.SetCoordenadas(v2.getX(), v2.getY());
    }
    
   

    public void desplazar(double x1, double y1, double x2, double y2){
        
       this.v1.SetCoordenadas(x1, y1);
       this.v2.SetCoordenadas(x2, y2);
    }

    public double calcularArea(){
        double lado1, lado2;
        lado1=this.v1.getX()-this.v2.getX();
        lado2=this.v1.getY()-this.v2.getY();

        if(lado1<0){
            lado1=-lado1;
        }
        if(lado2<0){
            lado2=-lado2;
        }
        
        return lado1*lado2;
    }

    public int mayorOMenor(Rectangulo r1, Rectangulo r2){
        if(r1.calcularArea()>r2.calcularArea()){
            return 1;
        } 
        else if(r1.calcularArea()<r2.calcularArea()){
            return -1;
        } 
        else {
            return 0;
        }
    }                    
    
    public boolean esCuadrado(){
        return (this.v1.getY()-this.v2.getY())==(this.v1.getX()-this.v2.getX());
    }

    public double ladoSuperior(){
        return this.v1.getX()-this.v2.getX();
    }

    public void acostadoOParado(){
        if((this.v1.getX()-this.v2.getX())>(this.v1.getY()-this.v2.getY())){
            System.out.println("Está acostado");
        } else if ((this.v1.getX()-this.v2.getX())<(this.v1.getY()-this.v2.getY())){
            System.out.println("Esta parado");
        } 
    }

} 
