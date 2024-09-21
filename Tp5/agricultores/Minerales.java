package agricultores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Minerales {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Minerales(String nombre){
        this.nombre=nombre;
    }

    public boolean contains(Object o){
        try {
        
           return this.nombre.equals(o);


        } catch (Exception e) {
            return false;
        }

    }
    
}
