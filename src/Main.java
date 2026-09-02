import oop.lsp.*;

public class Main {
    public static void main(String[] args) {
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        System.out.println("All birds moving:");
        penguin.move();
        ostrich.move();
        sparrow.move();
        eagle.move();

        System.out.println("\nFlying birds flying:");
        sparrow.fly();
        eagle.fly();


        Moveable eagleAsMoveable = new Eagle();
        System.out.println("\nUsing a Flyable as a Moveable:");
        eagleAsMoveable.move();
    }
}
