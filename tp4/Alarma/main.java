public class main {
    public static void main(String[] args) {
        AlarmaLuminosa alarma= new AlarmaLuminosa(new Luz());
        alarma.comprobar();
        alarma.setVidrioRoto(true);
        alarma.comprobar();
    }
}
