package dk.acsandras.mvvmdemo.model;

import androidx.lifecycle.MutableLiveData;

public class Model {

    // TODO (2) Konverter dine datafelter fra primitive variable som f.eks. double til LiveData
    // Det vil gøre, at denne data member vil sende nootifikationer til alle de klasser, som observerer
    // dette felt, og de klasser vil så kunne opdatere data automatiskt.
    // Se dette forklaret i https://developer.android.com/topic/libraries/architecture/livedata
    private MutableLiveData<String> a = new MutableLiveData<>(); // Før var det "private String a;"

    // TODO (3) Lav getters og setters og evt. en constructor for din data
    public Model() {
        this.setA("Startdata fra modellen");
    }

    public MutableLiveData<String> getA() {
        if (a == null) {
            a = new MutableLiveData<String>();
        }
        return a;
    }

    public void setA(String a) {
        this.a.setValue(a);
    }

}
