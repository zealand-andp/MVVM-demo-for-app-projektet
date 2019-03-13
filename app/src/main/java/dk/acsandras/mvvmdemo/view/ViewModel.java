package dk.acsandras.mvvmdemo.view;


import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import dk.acsandras.mvvmdemo.model.Model;

public class ViewModel extends androidx.lifecycle.ViewModel {

    // TODO (4) ViewModel skal også bruge LiveData, som de forskellige activities kan observere
    // ViewModel er også løst koblet på modellen, dvs. modellen har ikke kendskab til ViewModel
    private MutableLiveData<String> currentA = new MutableLiveData<>();
    private Model model = new Model();

    public ViewModel() {
        // TODO (5) Det her illustrerer, at vi får data fra modellen
        currentA.setValue(model.getA()); // Giver "Startdata fra Model"
        // currentA.setValue("Startdata fra ViewModel");
    }

    public MutableLiveData<String> getA() {
        // TODO (6) Hent data fra modellen
        return currentA;
    }

    public void setA(String a) {
        // TODO (7) Skriv data til modellen
        model.setA(a);
        currentA.setValue(model.getA());
    }

    public void observeA(LifecycleOwner lifeCycleOwner, Observer<String> stringObserver) {
        currentA.observe(lifeCycleOwner, stringObserver);
    }
}
