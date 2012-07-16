package com.company2359.plog;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.company2359.plog.fragments.PLogFragment;


public class PLogActivity extends BaseTabActivity{
	
	


	@Override
	public void setTabIndex() {
		tab_index= TAB_PLOG;
	}

	@Override
	public void setInitialFragmentContent() {
		Fragment plog_fragment = new PLogFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, plog_fragment);
		transaction.commit();
		
		
	}
    
}
