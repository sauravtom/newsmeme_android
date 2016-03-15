package com.newsmeme.www.newsmemeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class PagerActivity extends FragmentActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);

        pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return PagerActivityFragment.newInstance("PagerActivityFragment, Instance 0");
                case 1: return PagerActivityFragment.newInstance("PagerActivityFragment, Instance 1");
                case 2: return PagerActivityFragment.newInstance("PagerActivityFragment, Instance 2");
                case 3: return PagerActivityFragment.newInstance("PagerActivityFragment, Instance 3");
                case 4: return PagerActivityFragment.newInstance("PagerActivityFragment, Instance 4");
                default: return PagerActivityFragment.newInstance("Fragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
