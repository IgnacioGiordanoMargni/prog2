package sombrero;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String[] cualidades;
    private ArrayList<Persona> familiares;
    private Casa casa;

  
    public Alumno(String[] cualidades, ArrayList<Persona> familiares, Casa casa, String apellido, String nombre, boolean  sangrePura) { 
        super(apellido, nombre, sangrePura);
        this.cualidades = cualidades;
        this.familiares = familiares;
        this.casa = casa;
    }
    
    public Alumno(String[] cualidades,  Casa casa, String apellido, String nombre, boolean  sangrePura) { 
        super(apellido, nombre, sangrePura);
        this.cualidades = cualidades;
        this.familiares = new ArrayList<>();
        this.casa = casa;
    }
    public String[] getCualidades() {
        return cualidades;
    }
    public void setCualidades(String[] cualidades) {
        this.cualidades = cualidades;
    }
    public ArrayList<Persona> getFamiliares() {
        return familiares;
    }
    public void setFamiliares(ArrayList<Persona> familiares) {
        this.familiares = familiares;
    }



}
