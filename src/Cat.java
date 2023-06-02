public class Cat extends Animal{

    private int ratonesCapturados;
    public Cat(String nombre, String sonido, int ratonesCapturados) {
        super(nombre, sonido);
        this.ratonesCapturados = ratonesCapturados;
    }


    public int getRatonesCapturados() {
        return ratonesCapturados;
    }

    public void setRatonesCapturados(int ratonesCapturados) {
        this.ratonesCapturados = ratonesCapturados;
    }


}
