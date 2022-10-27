package at.crowdware.ubucon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder>
{
    private ArrayList mItems;

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView textView;

        public ViewHolder(View view)
        {
            super(view);
            textView = (TextView) view.findViewById(R.id.item_text);
        }

        public TextView getTextView()
        {
            return textView;
        }
    }

    public FeedAdapter(ArrayList items)
    {
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position)
    {
        FeedItem item = (FeedItem) mItems.get(position);
        viewHolder.getTextView().setText(item.getText());
    }

    @Override
    public int getItemCount()
    {
        return mItems.size();
    }
}
