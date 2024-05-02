package DesignPatterns.StrategyDesignPattern;

class OneLitreEngine implements EngineStratergy {
    @Override
    public void useEngine() {
        System.out.println("Uses 1L Engine");
    }
}
