package com.company2359.plog;



import com.company2359.plog.fragments.CalendarFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;


public class CalendarActivity extends BaseTabActivity{
	
	


	@Override
	public void setTabIndex() {
		tab_index= TAB_CALENDAR;
	}

	@Override
	public void setInitialFragmentContent() {
		Fragment calendar_fragment = new CalendarFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, calendar_fragment);
		transaction.commit();
		
		
	}
    
}
