package SOLID.DependencyInversionPrinciple;

public class Macbook {
    private Mouse mouse;

    public Macbook(Mouse mouse) {
        this.mouse = mouse;
    }
}
