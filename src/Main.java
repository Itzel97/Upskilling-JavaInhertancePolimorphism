public class Main {
    public static void main(String[] args) {
       Cat botas = new Cat("Botas","Meow",5);
       Animal pelusa = new Cat("Pelusa","Meoww",6);

        System.out.println("Cat name: " + botas.getNombre());
        System.out.println( "Cat make sound: " + botas.getSonido());
        System.out.println("Cat captured mouses: " + botas.getRatonesCapturados());
        System.out.println("---------------------------------------------");
        System.out.println("Cat name: " + pelusa.getNombre());
        System.out.println("Cat make sound: " + pelusa.getSonido());
        // System.out.println("Cat captured mouses "+ pelusa.getRatonesCapturados()); --- this exist int eh subclass cat bot doesn't in the super class Animal

        System.out.println("---------------------------------------------");
        System.out.println("Botas Is-An Animal: " +(botas instanceof Animal));
        System.out.println("Pelusa Is-An Animal: " +(pelusa instanceof Animal));
        System.out.println("Pelusa Is-A Cat: " +(pelusa instanceof Cat));




    }
}