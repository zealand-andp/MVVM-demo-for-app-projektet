package dk.acsandras.mvvmdemo.model;

import java.util.ArrayList;

public class ObserverManager {
    private Observable observable;
    private ArrayList<Observer> observers = new ArrayList<>();

    public ObserverManager(Observable observable) {
        this.observable = observable;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(observable);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
}
