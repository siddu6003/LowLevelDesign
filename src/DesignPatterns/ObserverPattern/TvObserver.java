package DesignPatterns.ObserverPattern;

class TvObserver implements Observer {
    private String observerName;

    public TvObserver(String observerName) {
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
        System.out.println("notification sent to TVObserver");
    }
}
