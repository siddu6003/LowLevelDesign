package SOLID.DependencyInversionPrinciple;

class WiredMouse implements Mouse {
    @Override
    public void mouse() {
        System.out.println("wired mouse");
    }
}
