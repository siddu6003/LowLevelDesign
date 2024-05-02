package DesignPatterns.ObserverPattern;

import java.util.List;

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
