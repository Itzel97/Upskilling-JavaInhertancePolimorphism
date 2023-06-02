public class Main {
    public static void main(String[] args) {
       Cat botas = new Cat("Botas","Meow",5);
       Animal pelusa = new Cat("Pelusa","Meoww",6);

       System.out.println("---------------------CAT-----------------");
        System.out.println("Cat name: " + botas.getNombre());
        System.out.println( "Cat make sound: " + botas.getSonido());
        System.out.println("Cat captured mouses: " + botas.getRatonesCapturados());
        System.out.println("---------------------------------------------");
        System.out.println("Cat name: " + pelusa.getNombre());
        System.out.println("Cat make sound: " + pelusa.getSonido());
        // System.out.println("Cat captured mouses "+ pelusa.getRatonesCapturados()); --- this exist in the subclass Cat but doesn't in the super class Animal

        System.out.println("---------------------Is-An----------------------");
        System.out.println("Botas Is-An Animal: " +(botas instanceof Animal));
        System.out.println("Botas Is-An Cat: " +(botas instanceof Cat));
        System.out.println("Pelusa Is-An Animal: " +(pelusa instanceof Animal));
        System.out.println("Pelusa Is-A Cat: " +(pelusa instanceof Cat));
        System.out.println("Pelusa Is-An Dog: " +(pelusa instanceof Dog));


        Dog canelo = new Dog("Canelo","woof",45);
        Animal oscar = new Dog("oscar","Grrrrr",0);

        System.out.println("---------------------DOG-----------------");
        System.out.println("Dog name: "+ canelo.getNombre());
        System.out.println("Dog sound: " + canelo.getSonido());
        System.out.println("Dog number of barks per day: " + canelo.getLadridosPorDia());
        System.out.println("---------------------------------------------");
        System.out.println("Dog name: " + oscar.getNombre());
        System.out.println("Dog sound: " + oscar.getSonido());
       // System.out.println("Dog number of barks per day: " + oscar.getLadridosPorDia()); this exist in the subclass Dog but doesn't in the superclass Animal

        System.out.println("---------------------Is-An----------------------");
        System.out.println("Canelo Is-An Animal: " +(canelo instanceof Animal));
        System.out.println("Canelo Is-An Dog: " +(canelo instanceof Dog));
        System.out.println("oscar Is-An Animal: " +(oscar instanceof Animal));
        System.out.println("Oscar Is-An Dog: " +(oscar instanceof Dog));
        System.out.println("Oscar Is-A Cat: " +(oscar instanceof Cat));

     System.out.println("--------------------Cliente-----------------");
     Cliente itzel = new Cliente("Itzel",26,"VIP","IAAG");
     Persona kevin = new Cliente("kevin", 27, "Regular", "KECP");

     System.out.println("Nombre del cliente: " + itzel.getNombre() + " ,edad : " + itzel.getEdad() + " ,tipo de cliente: " +itzel.getCategoria() + " ,su codigo es : " + itzel.getCodigo());
      System.out.println("Nombre del cliente: " + kevin.getNombre() + " ,edad : " + kevin.getEdad() );
     /*System.out.println(" ,tipo de cliente: " + kevin.getCategoria() + " ,su codigo es : " + kevin.getCodigo());
     -This case the superClass Persona doesn't has the functions getCategoria and getCodigo that are in the subClass Cliente */

     System.out.println("---------------------Is-An----------------------");
     System.out.println("Itzel Is-An Client: " + (itzel instanceof Cliente));
     System.out.println("Itzel Is-An Person: " + (itzel instanceof Persona));
     System.out.println("kevin Is-An Client: " + (kevin instanceof Cliente));
     System.out.println("kevin Is-An Person: " + (kevin instanceof Persona));

     System.out.println("--------------------Empleado-----------------");

     Empleado Dante = new Empleado("Dante", 20,"Temporal", 3500);
     Persona Fernanda = new Empleado("Fernanda", 25,"Indefinido", 10000);

     System.out.println("Nombre del empleado: " + Dante.getNombre() + " ,edad : " + Dante.getEdad() + " ,tipo de contrato: " +Dante.getTipoContrato() + " ,su sueldo es : $" + Dante.getSueldo());
      System.out.println("Nombre del empleado: " + Fernanda.getNombre() + " ,edad : " + Fernanda.getEdad() );
     /*System.out.println(" ,tipo de contrato: " +Fernanda.getTipoContrato() + " ,su sueldo es : $" + Fernanda.getSueldo());
      -This case the superclass Persona doesn't has the functions getTipoContrato and getSueldo that are in the subClass Empleado
       */
     System.out.println("---------------------Is-An----------------------");
     System.out.println("Dante Is-An Empleado: " + (Dante instanceof Empleado));
     System.out.println("Dante Is-An Person: " + (Dante instanceof Persona));
     System.out.println("Fernanda Is-An Empleado: " + (Fernanda instanceof Empleado));
     System.out.println("Fernanda Is-An Person: " + (Fernanda instanceof Persona));
    }
}