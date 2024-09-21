package sombrero;

public class CasaSangrePura extends Casa {
   public CasaSangrePura(String nombre, String[] cualidades, int capacidad){
   super(nombre, cualidades, capacidad);
   }
   @Override
   
   public boolean alumnoAceptado(Alumno alumno){
    return  super.alumnoAceptado(alumno) && alumno.isSangrePura();

   }
}
