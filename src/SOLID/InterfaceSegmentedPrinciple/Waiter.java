package SOLID.InterfaceSegmentedPrinciple;

class Waiter implements WaiterInterface {

    @Override
    public void serveFood() {
        System.out.println("serving");
    }
}
