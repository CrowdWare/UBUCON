package at.crowdware.ubucon.ui.friendlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import at.crowdware.ubucon.databinding.FragmentFriendlistBinding;

public class FriendlistFragment extends Fragment
{

    private FragmentFriendlistBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        FriendlistViewModel friendlistViewModel = new ViewModelProvider(this).get(FriendlistViewModel.class);

        binding = FragmentFriendlistBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFriendlist;
        friendlistViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}