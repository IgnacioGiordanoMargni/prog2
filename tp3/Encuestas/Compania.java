public class Compania {
    private Encuesta[] encuestas;
    public Compania(Encuesta[] encuestas) {
        this.encuestas = encuestas;
    }
    public Encuesta[] getEncuestas() {
        return encuestas;
    }
    public void setEncuestas(Encuesta[] encuestas) {
        this.encuestas = encuestas;
    }
    public boolean buscarRepetidos(String[] preguntas, Persona persona){
        for(int i=0; i<this.encuestas.length; i++){
            if(this.encuestas[i].compararString(preguntas)){
                   if(this.encuestas[i].getPersona().getDni()== persona.getDni()){
                    return true;
                   }
            }
        }
        return false;
    }
}