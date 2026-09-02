package oop.lsp;

public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle soars while moving between perches.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies high above the mountains.");
    }
}
