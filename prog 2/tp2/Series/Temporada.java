
public class Temporada {
 private int cantEp;
 private String titulo;
 private String descripcion;
 private String creador;
 private String genero;
 private Episodio[] episodios;   


 public Temporada(int cantEp, String titulo, String descripcion, String creador, String genero, Episodio[] episodios){
    setCantEp(cantEp);
    setCreador(creador);
    setDescripcion(descripcion);
    for(int i=0; i<cantEp; i++){
      setEpisodio(episodios[i], cantEp);
    }
    setGenero(genero);
    setTitulo(titulo);
 }
 public Temporada(int cantEp, String titulo, String descripcion, String creador, String genero){
   setCantEp(cantEp);
   setCreador(creador);
   setDescripcion(descripcion);
  
   for(int i=0; i<cantEp; i++){
     setEpisodio(new Episodio(), cantEp);
     
   }
   setGenero(genero);
   setTitulo(titulo);
}

 void setTitulo(String t){
   this.titulo=t;
 }
 void setGenero(String g){
    this.genero=g;
 }
 void setDescripcion(String d){
    this.descripcion=d;
 }
 void setCreador(String c){
    this.creador=c;
 }
 void setEpisodio(Episodio e, int n){
   this.episodios=new Episodio[n];
   int i=0;
   while(i<n){
      this.episodios[i]=e;
      i++;
   }
   
 }
 void setCantEp(int cant){
    this.cantEp=cant;
 }
 int getCantEp(){
    return this.cantEp;
 }
 String getTitulo(){
    return this.titulo;
 }
 String getDescripcion(){
    return this.descripcion;
 }
 String getCreador(){
    return this.creador;
 }
 String getGenero(){
    return this.genero;
 }
 Episodio[] getEpisodios(){
    return this.episodios;
 }

 int cantEpVistos(){
    int i=0;
    int vistos=0;
    while(i<this.cantEp){
     if(this.episodios[i].getFlag()){
        vistos++;
      
     }
     i++;
    }
    return vistos;
 }

 int promedioCalificaciones(){
    int i=0;
    int suma=0;
    int cant=0;
    while(i<this.cantEp){
      if(this.episodios[i].getFlag()){
        suma+= this.episodios[i].getCalificacion();
        cant++;
      }
    }
    return suma/cant;
 }

}

