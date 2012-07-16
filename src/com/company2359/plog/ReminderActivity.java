package com.company2359.plog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.company2359.plog.fragments.RemindersFragment;

public class ReminderActivity extends BaseTabActivity{

	@Override
	public void setTabIndex() {
		// TODO Auto-generated method stub
		tab_index = TAB_REMINDERS;
	}

	@Override
	public void setInitialFragmentContent() {
		// TODO Auto-generated method stub
		Fragment reminders_fragment = new RemindersFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.fragment_content, reminders_fragment);
		transaction.commit();
	}

}
