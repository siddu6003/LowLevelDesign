package DesignPatterns.StrategyDesignPattern;

class Car {
    private String platform;
    private String color;
    private String wheels;
    private EngineStratergy engineStratergy;

    public Car(String platform, String color, String wheels, EngineStratergy engineStratergy) {
        this.platform = platform;
        this.color = color;
        this.wheels = wheels;
        this.engineStratergy = engineStratergy;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public EngineStratergy getEngineStratergy() {
        return engineStratergy;
    }

    public void setEngineStratergy(EngineStratergy engineStratergy) {
        this.engineStratergy = engineStratergy;
    }

    public void useEngine() {
        engineStratergy.useEngine();
    }
}
