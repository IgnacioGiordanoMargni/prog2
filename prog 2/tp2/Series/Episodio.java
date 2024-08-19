public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

   
    Episodio(){
        setTitulo(" ");
        setCalificaion(4);
        setDescripcion(" ");
        setFlag(true);
       
    }
    Episodio(String titulo, String descripcion, boolean flag, int calificacion){
     setTitulo(titulo);
     setCalificaion(calificacion);
     setFlag(flag);
     setDescripcion(descripcion);
   }

 void setDescripcion(String descripcion2) {
    
    this.descripcion=descripcion2;
}
 void setFlag(boolean flag2) {
    
    this.flag=flag2;
}
private void setCalificaion(int calificacion2) {
  
    this.calificacion=calificacion2;
}
 void setTitulo(String titulo2) {
   
    this.titulo=titulo2;
}
int getCalificacion(){
    return this.calificacion;
}
boolean getFlag(){
    return this.flag;
}

public void ingresarCalificacion(int c){
    if(c<=5 && c>=1){
        setCalificaion(c);
    } else {
        System.out.println("Calificación invalida");
    }
}



}
