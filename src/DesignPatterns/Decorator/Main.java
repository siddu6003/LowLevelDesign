package DesignPatterns.Decorator;

class Main {
    public static void main(String args[]) {
        BaseCar baseCar = new AlloysCarDecorable(new InfotainmentCarDecorable(new Suv()));
        System.out.println(baseCar.price());
    }
}
