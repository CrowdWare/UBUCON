package at.crowdware.ubucon;

import java.util.ArrayList;

public class Datasource
{
    private ArrayList<FeedItem> mItems;

    public Datasource()
    {
        mItems = new ArrayList<FeedItem>();
        mItems.add(new FeedItem("Element 1"));
        mItems.add(new FeedItem("Element 2"));
        mItems.add(new FeedItem("Element 3"));
        mItems.add(new FeedItem("Element 4"));
        mItems.add(new FeedItem("Element 5"));
        mItems.add(new FeedItem("Element 6"));
        mItems.add(new FeedItem("Element 7"));
        mItems.add(new FeedItem("Element 8"));
        mItems.add(new FeedItem("Element 9"));
        mItems.add(new FeedItem("Element 10"));
        mItems.add(new FeedItem("Element 11"));
        mItems.add(new FeedItem("Element 12"));
        mItems.add(new FeedItem("Element 13"));
        mItems.add(new FeedItem("Element 14"));
        mItems.add(new FeedItem("Element 15"));
    }

    public ArrayList<FeedItem> getFeedList()
    {
        return mItems;
    }
}
