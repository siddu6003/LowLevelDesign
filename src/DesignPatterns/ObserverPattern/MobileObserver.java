package DesignPatterns.ObserverPattern;

class MobileObserver implements Observer {
    private String observerName;

    public MobileObserver(String observerName) {
        this.observerName = observerName;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        System.out.println("notification sent to mobile observer");
    }
}
