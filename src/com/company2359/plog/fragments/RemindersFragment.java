package com.company2359.plog.fragments;

import com.company2359.plog.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class RemindersFragment extends Fragment implements OnClickListener{
	
	private static final String TAG ="RemindersFragment";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG,"onCreate");
	}
    
	
	
	@Override
	public void onClick(View v) {
        switch (v.getId()){

    		
        }
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");
		View root = inflater.inflate(R.layout.calendar, container,false);

		return root;
	}

}
