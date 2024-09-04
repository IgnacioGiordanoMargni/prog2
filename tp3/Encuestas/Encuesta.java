public class Encuesta{
    private String[] preguntas;
    private Persona persona;
    private Empleado empleado;

    public Encuesta(String[] preguntas, Persona persona, Empleado empleado) {
        this.preguntas = preguntas;
        this.persona = persona;
        this.empleado = empleado;
        this.empleado.sumarEncuesta();
    }

    public boolean compararString(String[] preguntas){
        if(preguntas.length==this.preguntas.length){
            int i=0;
            while(i<preguntas.length && preguntas[i]==this.preguntas[i]){
                i++;
            }
            return i==preguntas.length;
        }
        return false;
    }
    public String[] getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
  
}