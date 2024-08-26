public class Ejecutable {
    public static void main(String[] args) {
        Pais pais= new Pais(5);
        pais.analizarProvinciasYCiudades();
        Provincia[] provincia= pais.getProvincias();


    }
}
