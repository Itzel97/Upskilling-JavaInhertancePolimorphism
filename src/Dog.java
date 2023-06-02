public class Dog extends Animal{

    private int ladridosPorDia;

    public  Dog (String nombre, String sonido, int ladridosPorDia){
        super(nombre, sonido);
        this.ladridosPorDia = ladridosPorDia;
    }

    public int getLadridosPorDia() {
        return ladridosPorDia;
    }

    public void setLadridosPorDia(int ladridosPorDia) {
        this.ladridosPorDia = ladridosPorDia;
    }
}
