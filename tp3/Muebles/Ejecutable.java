public class Ejecutable {
    public static void main(String[] args) {
        Fabrica fabrica= new Fabrica();
        fabrica.agregarMueble(new Mueble("silla", 2.2, 4000, "Roble", "madeera", 5));
        System.out.println(fabrica.costoFabricacion());
        fabrica.agregarMueble(new Mueble("mesa", 10, 5454643, "Madera de barco hundido", "podrido", 1));
        System.out.println(fabrica.costoFabricacion());
        System.out.println(fabrica.costoVenta());
    }
}