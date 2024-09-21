package sombrero;

import java.util.ArrayList;

public class Arreglos {
    

    public static int encontrarCantIntersecciones(String[] arr, String[] arr2){
        int i=0;
        int cant=0;
        if(arr.length>=arr2.length){
            while(i<arr.length){
                cant=+ encontrarOcurrencias(arr[i], arr2);
            }
            return cant;
        } else{
            while(i<arr2.length){
                cant=+ encontrarOcurrencias(arr2[i], arr);
            }
            return cant;
        }
      
    }

    private static int encontrarOcurrencias(String string, String[] arr) {
         boolean ocurrencia=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==string){
              ocurrencia=true;
            }
        }
        if(ocurrencia){
            return 1;
        } else{
            return 0;
        }
    }

    public static int encontrarCantIntersecciones(ArrayList<Persona> familiares, String nombre) {
        int i=0;
        int cant=0;
      
            while(i<familiares.size()){
                if(familiares.get(i).getCasa().getNombre()==nombre){
                    cant++;
                }
                i++;
            }
            return cant;
       
    }
}
