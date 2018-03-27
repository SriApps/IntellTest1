package com.test.sri.intelltest1;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.test.sri.intelltest1.fragments.FirstFragment;
import com.test.sri.intelltest1.fragments.ForthFragment;
import com.test.sri.intelltest1.fragments.SecondFragment;
import com.test.sri.intelltest1.fragments.ThirdFragment;


/**
 * Created by Srikanth on 16/08/2017.
 */

public class FragementAdapter extends FragmentPagerAdapter  {

    private int NUM_ITEMS = 4;
    private String[] titles= new String[]{"1", "2","3","4"};

    public FragementAdapter(FragmentManager fm) {
        super(fm);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return  NUM_ITEMS ;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new ForthFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return  titles[position];
    }

}