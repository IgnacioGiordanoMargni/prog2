public class Participantes {
   
    private String nombre;
    private String apellido;
    public int telefono;
   
    public String mail;

    public Participantes(String nombre, String apellido) {
       setApellido(apellido);
       setNombre(nombre);
       setMail("Sin mail ");
       setTelefono(0);
    }
    public Participantes(String nombre, String apellido, int telefono, String mail) {
        setApellido(apellido);
        setNombre(nombre);
        setMail(mail);
        setTelefono(telefono);
     }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
   
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
