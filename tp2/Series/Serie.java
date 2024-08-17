public class Serie {
    
    private int cantTemp;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporada[] temporadas;


    Serie(int cantTemp, int cantEp){
        setCantTemp(cantTemp);
        setTitulo("Titulo");
        setDescipción("descripcion");
        setCreador("creador");
        setGenero("genero");
        setTemporadas(cantTemp, cantEp);
    }
    
    Serie(int cantTemp, String titulo, String descripcion, String creador, String genero, Episodio[] episodios){
        setCantTemp(cantTemp);
        setTitulo(titulo);
        setDescipción(descripcion);
        setCreador(creador);
        setGenero(genero);
        setTemporadas(episodios, cantTemp);
        
    }

    void setTemporadas(int cantTemp, int cantEp){
        int cant=0;
         this.temporadas= new Temporada[cantTemp];
        while(cant<cantTemp){
            
           this.temporadas[cant]= new Temporada(cantEp, "titulo ejemplo", "descripcion de ejemplo", "yo", "sufrimiento academico");
           cant++;
        }
    }

    void setTemporadas(Episodio[] episodios, int cantTemp){
        int cant=0, cantEp=episodios.length;
        Temporada[] temporadas= new Temporada[cantTemp];
        while(cant<cantTemp){
            
           temporadas[cant]= new Temporada(cantEp, "titulo ejemplo", "descripcion de ejemplo", "yo", "sufrimiento academico", episodios);
           cant++;
        }
        
    }

     void setGenero(String string) {
       this.genero=string;
    }


     void setCreador(String string) {
       this.creador=string;
    }


    void setDescipción(String string) {
       this.descripcion=string;
    }


     void setTitulo(String string) {
        this.titulo=string;
    }


     void setCantTemp(int i) {
    this.cantTemp=i;
    }

    //Obtener el total de episodios vistos de una serie.
    // Obtener el promedio de las calificaciones dadas para una serie.
    //determinar si se vio todos los episodios de la serie.

    int cantEpVistos(){
        int i=0;
        int cant=0; 
        while(i<this.cantTemp){

          cant+=this.temporadas[i].cantEpVistos();
          i++;
             }
      return cant;

    }
        
    int promedioCalificaciones(){
        int i=0, vistos=0;
        int suma=0;
        Episodio[] episodio;
        while(i<this.cantTemp){
          episodio= this.temporadas[i].getEpisodios();
          vistos+=this.temporadas[i].cantEpVistos();
          suma+=sumaDeCalificaciones(episodio, i);
          i++;
        }
      
        return suma/vistos;
    }
    int sumaDeCalificaciones(Episodio[] episodio, int temporada){
        int j=0;
        int suma=0;
        while(j<this.temporadas[temporada].getCantEp()){
            if(episodio[j].getFlag()){
                suma+=episodio[j].getCalificacion();  
            }
            j++;
          }
          return suma;
    }

  

    }

