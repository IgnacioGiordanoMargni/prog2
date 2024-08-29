public class Sensor {
    private boolean problema;
    private String nombre;
    public boolean isProblema() {
        return problema;
    }
    public void setProblema(boolean problema) {
        this.problema = problema;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Sensor( String nombre) {
       setNombre(nombre);
       setProblema(false);
    }
}
