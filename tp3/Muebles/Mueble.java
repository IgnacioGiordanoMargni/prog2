public class Mueble {
    private String nombre;
    private double peso;
    private double costoFabrica;
    private String tipoMadera;
    private String color;
    private int stock;
    public Mueble(String nombre, double peso, double costoFabrica, String tipoMadera, String color, int stock) {
        this.nombre = nombre;
        this.peso = peso;
        this.costoFabrica = costoFabrica;
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.stock = stock;
    }
    public Mueble(String nombre, double peso, double costoFabrica, String tipoMadera, String color) {
        this.nombre = nombre;
        this.peso = peso;
        this.costoFabrica = costoFabrica;
        this.tipoMadera = tipoMadera;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCostoFabrica() {
        return costoFabrica;
    }
    public void setCostoFabrica(double costoFabrica) {
        this.costoFabrica = costoFabrica;
    }
    public String getTipoMadera() {
        return tipoMadera;
    }
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double getPrecioVenta(){
        return this.costoFabrica+(this.costoFabrica*35)/100;
    }
}   //cambiar constante en codigo por variable que diga que costo queres calcular xd
