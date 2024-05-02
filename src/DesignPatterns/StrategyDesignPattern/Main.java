package DesignPatterns.StrategyDesignPattern;

class Main {
    public static void main(String args[]) {
        Car hatchBack = new HatchBack("A1", "RED", "ALLOY", new OneLitreEngine());
        hatchBack.useEngine();
        Car sedan = new Sedan("A2", "WHITE", "STEEL", new OneLitreEngine());
        sedan.useEngine();
        Car suv = new Suv("A5", "BLACK", "ALLOYS", new TwoLitreEngine());
        suv.useEngine();
    }
}
