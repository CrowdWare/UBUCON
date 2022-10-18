package at.crowdware.ubucon.ui.messages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MessagesViewModel extends ViewModel
{

    private final MutableLiveData<String> mText;

    public MessagesViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Messages");
    }

    public LiveData<String> getText() {
        return mText;
    }
}