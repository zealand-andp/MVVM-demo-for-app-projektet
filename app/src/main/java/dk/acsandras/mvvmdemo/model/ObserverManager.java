package dk.acsandras.mvvmdemo.model;

import java.util.Observable;

public class ObserverManager extends Observable {

    /**
     * Overrides the original {@link Observable#notifyObservers}
     * and forces a notification regardless of changed-state.
     *
     * @param object that is being observed
     */
    @Override
    public void notifyObservers(Object object) {
        super.setChanged();
        super.notifyObservers(this);
    }
}
