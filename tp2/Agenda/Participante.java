public class Participante {
    
//Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
//tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
//tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
//contactos telefónicos y mail de los asistentes.
//Consejo: No todos los objetos son “palpables”
//Extra: ¿Quién detecta un conflicto de horarios?


private String nombre;
private String mail;
private int telefono;

 Participante(){
    setNombre("nombre1");
    setMail("mail");
    setTelefono(telefono);
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
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




}
