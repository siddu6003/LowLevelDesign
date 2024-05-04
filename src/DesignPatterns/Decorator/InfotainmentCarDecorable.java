package DesignPatterns.Decorator;

class InfotainmentCarDecorable extends CarDecorable {
    BaseCar baseCar;

    public InfotainmentCarDecorable(BaseCar baseCar) {
        this.baseCar = baseCar;
    }

    @Override
    public int price() {
        return baseCar.price() + 100;
    }
}
