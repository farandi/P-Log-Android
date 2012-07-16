package com.company2359.plog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.company2359.plog.fragments.PromosFragment;

public class PromosActivity extends BaseTabActivity{

	@Override
	public void setTabIndex() {
		// TODO Auto-generated method stub
		tab_index = TAB_PROMOS;
	}

	@Override
	public void setInitialFragmentContent() {
		// TODO Auto-generated method stub
		Fragment plog_fragment = new PromosFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, plog_fragment);
		transaction.commit();
	}

}
