package ejercicio2;

public class Hervivoro extends Animal{
    public Hervivoro(String nombre) {
        super(nombre);
    }

    //Sobrescribo el metodo eat()
    @Override
    public void eat(){
        System.out.println("El herviboro esta comiendo plantas.");
    }

    @Override
    public void eat(String food) {

        if (food.equalsIgnoreCase("hierba") || food.equalsIgnoreCase("plantas"))
            System.out.println("El herviboro esta comiendo "+food);
        else
            System.out.println("El herviboro no puede comer "+food);
    }
}
