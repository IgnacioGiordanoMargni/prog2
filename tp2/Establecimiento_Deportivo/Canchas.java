public class Canchas {
       // Un establecimiento deportivo quiere un sistema que le permita organizar los turnos de
//las canchas de fútbol y de paddle. El establecimiento posee dos canchas de fútbol 5, y 4
//de paddle. Las canchas de paddle cuestan 100 pesos la hora y las de fútbol 400. Los
//turnos se registran a nombres de usuarios, los cuales si son socios del establecimiento
//tienen un descuento de 10%. El establecimiento tiene un registro de socios. Los socios
//son gratuitos y para serlo es necesario haber reservado un turno al menos 4 veces en los
//últimos dos meses. Si no se cumple dicha condición no se considera socio.
//Consejo: Primero identificar los objetos, y luego definir la funcionalidad que debe tener
//cada uno.
//Extra: ¿Es diferente un turno de paddle de un turno de fútbol?

private String tipo;
private int precio;


public Canchas(String tipo) {
    this.tipo = tipo;
    if(this.tipo=="Futbol"){
        this.precio=400;
    } else if(this.tipo=="Padel"){
        this.precio=100;
    }

}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public int getPrecio() {
    return precio;
}
public void setPrecio(int precio) {
    this.precio = precio;
}
public Canchas(String tipo, int precio) {
    this.tipo = tipo;
    this.precio = precio;
}


}
