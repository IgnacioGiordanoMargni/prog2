
import java.util.ArrayList;

public class Pila {

    private ArrayList<Object> pila;
    
    public Pila(){
        pila= new ArrayList<Object>();
    }

    public Object get(int n){
     
        return pila.get(this.pila.size());
      
    }

    public Object top(){
        return this.pila.get(this.pila.size());
    }
    public Object copy(){
        return this.pila.clone();
    }
}
