package com.parking.easy.easyparking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private static final int MAP = 0;
    private static final int PARKING_LIST = 1;
    private final int numOfTabs;
    private final MapFragment mapFragment;
    private final ParkingListFragment parkingListFragment;

    PagerAdapter(final FragmentManager fragmentManager, final int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
        mapFragment = new MapFragment();
        parkingListFragment = new ParkingListFragment();
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case MAP:
                return mapFragment;
            case PARKING_LIST:
                return parkingListFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}