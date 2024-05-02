package DesignPatterns.ObserverPattern;

class Main {
    public static void main(String args[]){
        Observable productObservable = new ProductObservable();
        Observer mobileObserver = new MobileObserver("mobile1");
        Observer tvObserver = new TvObserver("TV1");
        productObservable.addObserver(mobileObserver);
        productObservable.addObserver(tvObserver);
        productObservable.notifyObservers();
    }
}
