package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentdemo.R;

public class Fragment2 extends Fragment {

	private static final String TAG = "FragmentDemo";

	@Override
	public void onAttach(Activity activity) {
		Log.v(TAG, "Fragment2 onAttach");
		Bundle args = getArguments();
		if (null != args) {
			/*
			 * 在这里我们可以将从Acivity收到的数据保存起来，并且显示到Fragment当中。
			 */
			Log.d(TAG,
					"Fragment2 Get data from activity "
							+ args.getString("hello"));
		}
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment2 onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v(TAG, "Fragment2 onDestroy");
		super.onDestroy();
	}

	@Override
	public void onResume() {
		Log.v(TAG, "Fragment2 onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v(TAG, "Fragment2 onStart");
		super.onStart();
	}

	@Override
	public void onDetach() {
		Log.v(TAG, "Fragment2 onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v(TAG, "Fragment2 onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.v(TAG, "Fragment2 onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		Log.v(TAG, "Fragment2 onCreateView");
		return inflater.inflate(R.layout.fragment2, container, false);
	}

	@Override
	public void onDestroyView() {
		Log.v(TAG, "Fragment2 onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment2 onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}
}
