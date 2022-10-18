package at.crowdware.ubucon.ui.marketplace;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import at.crowdware.ubucon.databinding.FragmentMarketplaceBinding;
import at.crowdware.ubucon.databinding.FragmentMarketplaceBinding;

public class MarketplaceFragment extends Fragment
{

    private FragmentMarketplaceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        MarketplaceViewModel marketplaceViewModel = new ViewModelProvider(this).get(MarketplaceViewModel.class);

        binding = FragmentMarketplaceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMarketplace;
        marketplaceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}