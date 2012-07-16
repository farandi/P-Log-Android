package com.company2359.plog;

import com.company2359.plog.fragments.FanPageFragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class FanPageActivity extends BaseTabActivity{

	@Override
	public void setTabIndex() {
		// TODO Auto-generated method stub
		tab_index = TAB_FAN_PAGE;
	}

	@Override
	public void setInitialFragmentContent() {
		// TODO Auto-generated method stub
		Fragment plog_fragment = new FanPageFragments();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, plog_fragment);
		transaction.commit();
	}

}
