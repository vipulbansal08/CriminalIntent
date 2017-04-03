package com.example.android.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by banvipul on 4/2/17.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
