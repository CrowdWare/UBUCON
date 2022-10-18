package at.crowdware.ubucon.ui.friendlist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FriendlistViewModel extends ViewModel
{

    private final MutableLiveData<String> mText;

    public FriendlistViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Friendlist");
    }

    public LiveData<String> getText() {
        return mText;
    }
}