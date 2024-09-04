
public class Rarosenmalla{
    private String nombre;
    private String apodo;
    private int fuerza;
    private boolean visionNocturna;
    private int velocidad;
    private double altura;
    private int peso;
    private int edad;
    private boolean esHeroe;
   /* Se desea modelar un juego el cual se compone de héroes y villanos. Cada personaje del
juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una
de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.
El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de
ellos es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
de otra característica dada.
Consejo: Identificar las reglas del juego y en dónde deben estar. Ver Jugador.*/
    
    
    public Rarosenmalla(String nombre, String apodo, int fuerza, boolean visionNocturna, int velocidad, double altura,
            int peso, int edad, boolean esHeroe) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.fuerza = fuerza;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.esHeroe = esHeroe;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public boolean isVisionNocturna() {
        return visionNocturna;
    }
    public void setVisionNocturna(boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}