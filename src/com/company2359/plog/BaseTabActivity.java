package com.company2359.plog;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public abstract class BaseTabActivity extends FragmentActivity implements OnClickListener {
	
	public final int TAB_USER_PROFILE = 1;
	public final int TAB_CALENDAR = 2;
	public final int TAB_PLOG = 3;
	public final int TAB_REMINDERS = 4;
	public final int TAB_PROMOS = 5;
	public final int TAB_FAN_PAGE = 6;
	public final int TAB_SETTINGS = 7;	
	
	protected int tab_index = 1;
	View tab_user_profile, tab_calendar, tab_plog, tab_reminders, tab_promos, tab_fan_page, tab_settings;
	
	
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_tab_activity);
        initTabs();
        setTabIndex();
        setTabStates();
        setInitialFragmentContent();
    }
    
    public abstract void setTabIndex();
    public abstract void setInitialFragmentContent();

    private void initTabs(){
    	tab_user_profile = findViewById(R.id.tab_userprofile);
    	tab_calendar =findViewById(R.id.tab_calendar);
    	tab_plog = findViewById(R.id.tab_plog);
    	tab_reminders = findViewById(R.id.tab_reminders);
    	tab_promos = findViewById(R.id.tab_promos);
    	tab_fan_page = findViewById(R.id.tab_fanpage);
    	tab_settings = findViewById(R.id.tab_settings);
    	
    	tab_user_profile.setOnClickListener(this);
    	tab_calendar.setOnClickListener(this);
    	tab_plog.setOnClickListener(this);
    	tab_reminders.setOnClickListener(this);
    	tab_promos.setOnClickListener(this);
    	tab_fan_page.setOnClickListener(this);
    	tab_settings.setOnClickListener(this);
    }
    
    private void setTabStates(){
    	final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
    	View current_tab_view=null;
    	switch(tab_index){
    	case TAB_USER_PROFILE:
    		current_tab_view = tab_user_profile;
    		break;
    	case TAB_CALENDAR:
    		current_tab_view =tab_calendar;
    		break;
    	case TAB_PLOG:
    		current_tab_view =tab_plog;
    		break;
    	case TAB_REMINDERS:
    		current_tab_view = tab_reminders;
    		break;
    	case TAB_PROMOS:
    		current_tab_view = tab_promos;
    		break;
    	case TAB_FAN_PAGE:
    		current_tab_view = tab_fan_page;
    		break;
    	case TAB_SETTINGS:
    		current_tab_view = tab_settings;
    		break;
    	default: 
    		current_tab_view = tab_user_profile;
    		break;
    	}
    	if (current_tab_view!=null){
    		current_tab_view.setSelected(true);
    	}
    	current_tab_view.startAnimation(animTranslate);
    } 
    
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.tab_userprofile:
			onTabChanged(TAB_USER_PROFILE);
			break;
		case R.id.tab_calendar:
			onTabChanged(TAB_CALENDAR);
			break;
		case R.id.tab_plog:
			onTabChanged(TAB_PLOG);
			break;
		case R.id.tab_reminders:
			onTabChanged(TAB_REMINDERS);
			break;
		case R.id.tab_promos:
			onTabChanged(TAB_PROMOS);
			break;
		case R.id.tab_fanpage:
			onTabChanged(TAB_FAN_PAGE);
			break;
		case R.id.tab_settings:
			onTabChanged(TAB_SETTINGS);
			break;
		}
	}
    
	private void onTabChanged(int newTabIndex) {
		if (newTabIndex != tab_index){
			tab_user_profile.setSelected(false);
			tab_calendar.setSelected(false);
			tab_plog.setSelected(false);
			tab_reminders.setSelected(false);
			tab_promos.setSelected(false);
			tab_fan_page.setSelected(false);
			tab_settings.setSelected(false);
			
			Intent intent=null;
			switch (newTabIndex){
			case TAB_USER_PROFILE:
				intent =new Intent(this,CalendarActivity.class);
				break;
			case TAB_CALENDAR:
				intent =new Intent(this,CalendarActivity.class);
				break;
			case TAB_PLOG:
				intent =new Intent(this,PLogActivity.class);
				break;
			case TAB_REMINDERS:
				intent =new Intent(this,CalendarActivity.class);
				break;
			case TAB_PROMOS:
				intent =new Intent(this,CalendarActivity.class);
				break;
			case TAB_FAN_PAGE:
				intent =new Intent(this,CalendarActivity.class);
				break;
			case TAB_SETTINGS:
				intent =new Intent(this,CalendarActivity.class);
				break;
			default:
				intent =new Intent(this,CalendarActivity.class);
				break;
			}
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
	    	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			this.startActivity(intent);
			this.finish();
		}
	}

}