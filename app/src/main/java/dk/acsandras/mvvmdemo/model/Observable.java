package dk.acsandras.mvvmdemo.model;

public interface Observable {

    void observe(Observer observer);

    void unobserve(Observer observer);
}
