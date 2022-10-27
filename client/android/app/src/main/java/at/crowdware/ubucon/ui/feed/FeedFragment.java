package at.crowdware.ubucon.ui.feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import at.crowdware.ubucon.Datasource;
import at.crowdware.ubucon.FeedAdapter;
import at.crowdware.ubucon.databinding.FragmentFeedBinding;

public class FeedFragment extends Fragment
{
    private FragmentFeedBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        FeedViewModel feedViewModel = new ViewModelProvider(this).get(FeedViewModel.class);

        binding = FragmentFeedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Datasource ds = new Datasource();
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setAdapter(new FeedAdapter(ds.getFeedList()));

        return root;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}