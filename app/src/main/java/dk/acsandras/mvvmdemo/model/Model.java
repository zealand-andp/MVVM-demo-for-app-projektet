package dk.acsandras.mvvmdemo.model;


import androidx.lifecycle.MutableLiveData;
import dk.acsandras.mvvmdemo.Observable.Observable;

public class Model extends Observable {

    // TODO (2) Konverter dine datafelter fra primitive variable som f.eks. double til LiveData
    // Det vil gøre, at denne data member vil sende nootifikationer til alle de klasser, som observerer
    // dette felt, og de klasser vil så kunne opdatere data automatiskt.
    // Se dette forklaret i https://developer.android.com/topic/libraries/architecture/livedata
    private String a = new String(); // Før var det "private String a;"

    // TODO (3) Lav getters og setters og evt. en constructor for din data
    public Model() {
        this.setA("Startdata fra modellen");
    }

    public String getA() {
        if (a == null) {
            a = new String();
        }
        return a;

            }

    public void setA(String a) {
        this.a = a;
        setChanged();
        notifyObservers(this.a);
    }

}
