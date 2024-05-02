package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

class ProductObservable implements Observable {

    private List<Observer> observerList;

    public ProductObservable() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
