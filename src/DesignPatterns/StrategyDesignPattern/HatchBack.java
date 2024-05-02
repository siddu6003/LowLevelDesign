package DesignPatterns.StrategyDesignPattern;

class HatchBack extends Car {

    public HatchBack(String platform, String color, String wheels, EngineStratergy engineStratergy) {
        super(platform, color, wheels, new OneLitreEngine());
    }
}
