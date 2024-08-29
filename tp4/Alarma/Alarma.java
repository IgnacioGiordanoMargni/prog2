public class Alarma{
    //1 - Alarma
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.
//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender().

private boolean vidrioRoto;
private boolean entradaAbierta;
private boolean movimiento;

public Alarma() {
    setMovimiento(false);
    setVidrioRoto(false);
    setEntradaAbierta(false);
}

public void comprobar(){
    if(this.vidrioRoto || this.entradaAbierta || this.movimiento){
        hacerSonar();
    }
}
public void hacerSonar() {  
    System.out.println("ring");
}

public boolean isVidrioRoto() {
    return vidrioRoto;
}
public void setVidrioRoto(boolean vidrioRoto) {
    this.vidrioRoto = vidrioRoto;
}
public boolean isEntradaAbierta() {
    return entradaAbierta;
}
public void setEntradaAbierta(boolean entradaAbierta) {
    this.entradaAbierta = entradaAbierta;
}
public boolean isMovimiento() {
    return movimiento;
}
public void setMovimiento(boolean movimiento) {
    this.movimiento = movimiento;
}





}