public class Planta {


    private String nombre_cientifico;
    private String nombre_comun;
    private String origen;
    private static int cant=0;
    private int id;
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    public String getNombre_comun() {
        return nombre_comun;
    }
    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public static int getCant() {
        return cant;
    }
    public static void setCant(int cant) {
        Planta.cant = cant;
    }
    public static void incrementarCantidad(){
        cant++;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Planta(String nombre_cientifico, String nombre_comun, String origen) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.origen = origen;
        incrementarCantidad();
        setId(getCant());

    }


}
