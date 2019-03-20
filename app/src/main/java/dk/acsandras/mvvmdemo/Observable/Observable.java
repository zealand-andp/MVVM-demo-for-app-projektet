package dk.acsandras.mvvmdemo.Observable;

import java.util.ArrayList;

public class Observable {

    private boolean hasChanged = false;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Observable(){

    }

    public void setChanged(){
        hasChanged = true;
    }

    public void notifyObservers(Object o){
        for (Observer obs: observers) {
            obs.onUpdate(o);
        }
        hasChanged = false;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }


}
