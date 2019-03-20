package dk.acsandras.mvvmdemo.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dk.acsandras.mvvmdemo.model.Model;

public class ModelViewModel extends ViewModel {

    // TODO (4) ViewModel skal også bruge LiveData, som de forskellige activities kan observere
    // ViewModel er også løst koblet på modellen, dvs. modellen har ikke kendskab til ViewModel
    private MutableLiveData<String> currentA = new MutableLiveData<>();
    private Model model = new Model();

    public ModelViewModel() {
        // TODO (5) Det her illustrerer, at vi får data fra modellen
        currentA.setValue(model.getA()); // Giver "Startdata fra Model"
        // currentA.setValue("Startdata fra ViewModel");

        ModelObserver modelObserver = new ModelObserver();
        model.addObserver(modelObserver);

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

    class ModelObserver implements dk.acsandras.mvvmdemo.Observable.Observer {

        @Override
        public void onUpdate(Object o) {
            currentA.setValue(model.getA());
        }
    }

}
