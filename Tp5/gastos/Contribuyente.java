public abstract class Contribuyente {
   private String nombre;
   private static int id=0;
   private double impuestos;
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public static int getId() {
    return id;
}
public static void setId() {
    Contribuyente.id++;
}
public Contribuyente(String nombre, double impuesto) {
    this.nombre = nombre;
    this.impuestos=impuesto;
    setId();
}
public  double getImpuestos(){
    return this.impuestos;
};
   

}
