import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona{ // por convención las clases llevan la primera letra en mayuscula

   private String nombre;
   private String apellido;
   private int edad;
   private LocalDate fecha_nacimiento ;
   private int DNI;
   private String sexo;
   private double peso;
   private double altura;
   //los atributos propios de una clase se ponen en privado para seguir con las pautas de encapsulamiento

  public Persona(){
    nombre="n";
    apellido="n";
    edad= 0;
    fecha_nacimiento= LocalDate.of(2000, 1, 1);
    sexo="f";
    peso= 1;
    altura=1;
}

public void Mostrar(){
    System.out.println(nombre +" "+ apellido +" "+ DNI+" "+ fecha_nacimiento +" "+ peso +" "+ altura);
}

public void SetNombre(String unnombre){
    nombre=unnombre;
}

public void SetApellido(String unApellido){
    apellido=unApellido;
}

public void SetFecha(LocalDate unaFecha){
 fecha_nacimiento= unaFecha;
}

public void SetSexo(String unsexo){
    sexo=unsexo;
}

public void SetPeso(double unpeso){
    peso=unpeso;
}

public void SetAltura(double unaaltura){
    altura=unaaltura;
}


public double CalcularImc(){
   
      return    this.peso/(this.altura*this.altura);
}

public boolean EstaEnForma(int imc){
   
    
        return (imc>18.5 && imc<25);
  
}

public boolean Cumpleaños(){
  
        return (fecha_nacimiento.getMonth() == LocalDate.now().getMonth() && fecha_nacimiento.getDayOfMonth() == LocalDate.now().getDayOfMonth());
  
}

public boolean MayorDeEdad(){
    
        return (ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now())>=18 );
   
}

public boolean PuedeVotar(){
    
        return (ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now()) >16);
   
}

public boolean EdadCoherente(){
    
        return (ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now())  == edad);
    

}


}