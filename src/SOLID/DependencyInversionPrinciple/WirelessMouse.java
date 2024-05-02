package SOLID.DependencyInversionPrinciple;

class WirelessMouse implements Mouse{
    @Override
    public void mouse() {
        System.out.println("wireless mouse");
    }
}
