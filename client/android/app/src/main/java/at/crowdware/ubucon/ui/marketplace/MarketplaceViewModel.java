package at.crowdware.ubucon.ui.marketplace;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MarketplaceViewModel extends ViewModel
{

    private final MutableLiveData<String> mText;

    public MarketplaceViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Marketplace");
    }

    public LiveData<String> getText() {
        return mText;
    }
}