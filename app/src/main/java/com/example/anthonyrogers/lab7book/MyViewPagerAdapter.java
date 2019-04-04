package com.example.anthonyrogers.lab7book;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;


import java.util.ArrayList;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Book> array = new ArrayList<>();


    public MyViewPagerAdapter(FragmentManager fm, ArrayList<Book> arrayOfBooks) {
        super(fm);
        array.addAll(arrayOfBooks);

        Log.d("Books", arrayOfBooks.toString());
        notifyDataSetChanged();
        //array = arrayOfBooks;
    }

    //this is for the view pager. This creates a new instance of bookDetailsFragment using the factory
    //method inside of the the fragment
    @Override
    public Fragment getItem(int i) {
        return BookDetailsFragment.newInstance(array.get(i));
    }

    @Override
    public int getCount()
    {
        return array.size();
    }


    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}

