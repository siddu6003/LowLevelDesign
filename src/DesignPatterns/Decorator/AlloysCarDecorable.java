package DesignPatterns.Decorator;

class AlloysCarDecorable extends CarDecorable {
    BaseCar baseCar;

    public AlloysCarDecorable(BaseCar baseCar) {
        this.baseCar = baseCar;
    }

    @Override
    public int price() {
        return baseCar.price() + 100;
    }
}
