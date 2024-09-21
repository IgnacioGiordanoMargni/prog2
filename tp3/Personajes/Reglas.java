
import java.util.ArrayList;

public class Reglas {
    private ArrayList<Rarosenmalla> raros;
   /* Se desea modelar un juego el cual se compone de héroes y villanos. Cada personaje del
juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una
de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.
El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de
ellos es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
de otra característica dada.
Consejo: Identificar las reglas del juego y en dónde deben estar. Ver Jugador.*/

    public Reglas() {
        this.raros= new ArrayList();
    }
    
    public void combate(int j1, int j2){

        System.out.println("Exactas campeon");
        
        if(j1<raros.size() && j2>=0 && j2<raros.size() && j1>=0){
           Rarosenmalla raro1= raros.get(j1);
           Rarosenmalla raro2= raros.get(j2);
           int[] arr={raro1.getFuerza(), raro1.getVelocidad()};
           int[] arr2={raro2.getFuerza(), raro2.getVelocidad()};
           int i=0;
           int resultado =3;
           while(i<2 && resultado==3){
            resultado=mayorMenorIgual(arr[i], arr2[i]);
            i++;
            if(resultado==1){
                System.out.println("j1 gano el combate");
            } else if( resultado== 2){
                System.out.println("j2 gano el combate");
            }
           }
           
        }
     }
    
    
    public int mayorMenorIgual(int valor1, int valor2){
        if(valor1<valor2){
            return 2;
        } else if (valor1>valor2){
            return 1;
        } else {
            return 3;
        
        }
       
    }
    
}
