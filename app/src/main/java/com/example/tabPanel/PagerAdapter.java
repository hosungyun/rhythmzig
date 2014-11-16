package com.example.tabPanel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.common.Constants;
import com.example.fragmentPages.GroupPageFragment;
import com.example.fragmentPages.LogPageFragment;
import com.example.fragmentPages.RemotePageFragment;
import com.example.fragmentPages.SettingPageFragment;

/**
 * Created by kimgilyoung on 14. 11. 15..
 */

// Since this is an object collection, use a FragmentStatePagerAdapter,
// and NOT a FragmentPagerAdapter.
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment returnFragment = null;
        switch (i) {
            case Constants.LOG_PAGE_FRAGMENT_INDEX:
                returnFragment = LogPageFragment.newInstance();
                break;
            case Constants.REMOTE_PAGE_FRAGMENT_INDEX:
                returnFragment = RemotePageFragment.newInstance();
                break;
            case Constants.GROUP_PAGE_FRAGMENT_INDEX:
                returnFragment = GroupPageFragment.newInstance();
                break;
            case Constants.SETTING_PAGE_FRAGMENT_INDEX:
                returnFragment = SettingPageFragment.newInstance();
                break;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return Constants.MAIN_PAGE_TAB_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
