package oop.lsp;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow hops and flies from branch to branch.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies quickly through the air.");
    }
}
