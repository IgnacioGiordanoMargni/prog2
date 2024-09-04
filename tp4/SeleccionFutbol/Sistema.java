public class Sistema {
    public static void main(String[] args) {
        Integrante futbolista=new Integrante();
        futbolista= new Futbolista(0, false, 0);
        System.out.println(futbolista.disponible());
    }
}
