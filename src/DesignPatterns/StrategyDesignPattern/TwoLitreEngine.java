package DesignPatterns.StrategyDesignPattern;

class TwoLitreEngine implements EngineStratergy {
    @Override
    public void useEngine() {
        System.out.println("Uses 2L engine");
    }
}
