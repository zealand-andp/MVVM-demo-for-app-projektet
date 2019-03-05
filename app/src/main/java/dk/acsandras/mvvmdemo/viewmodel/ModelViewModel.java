package dk.acsandras.mvvmdemo.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dk.acsandras.mvvmdemo.model.Model;

public class ModelViewModel extends ViewModel {

    // TODO (4) ViewModel skal også bruge LiveData, som de forskellige activities kan observere
    // ViewModel er også løst koblet på modellen, dvs. modellen har ikke kendskab til ViewModel
    private MutableLiveData<String> currentName = new MutableLiveData<>();
    private Model model = new Model();

    public ModelViewModel() {
        // TODO (5) Det her illustrerer, at vi får data fra modellen
        // currentName.setValue("Startdata fra ViewModel");
        currentName.setValue(model.getA().getValue());
    }

    public MutableLiveData<String> getCurrentName() {
        // TODO (6) Hent data fra modellen
        currentName = model.getA();
        return currentName;
    }

    public void setCurrentName(String name) {
        // TODO (7) Skriv data til modellen
        model.setA(name);
    }

}
