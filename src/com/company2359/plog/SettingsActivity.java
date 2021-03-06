package com.company2359.plog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.company2359.plog.fragments.SettingsFragment;

public class SettingsActivity extends BaseTabActivity{

	@Override
	public void setTabIndex() {
		// TODO Auto-generated method stub
		tab_index = TAB_SETTINGS;
	}

	@Override
	public void setInitialFragmentContent() {
		// TODO Auto-generated method stub
		Fragment plog_fragment = new SettingsFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, plog_fragment);
		transaction.commit();
	}

}
