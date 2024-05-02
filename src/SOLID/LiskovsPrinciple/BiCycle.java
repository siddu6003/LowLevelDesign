package SOLID.LiskovsPrinciple;

class BiCycle implements Bike {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("no engine");
    }

    @Override
    public void accelerate() {

    }
}
