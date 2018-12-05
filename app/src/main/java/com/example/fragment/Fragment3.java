package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.example.fragmentdemo.R;

public class Fragment3 extends Fragment {

	private static final String TAG = "FragmentDemo";
	private OnButtonClickListener mListener;

	/**
	 * 这里我们创建一个回调接口
	 *
	 * @author Myp
	 *
	 */
	public interface OnButtonClickListener {
		public void onButtonClicked();
	}

	@Override
	public void onAttach(Activity activity) {
		Log.v(TAG, "Fragment3 onAttach");
		Bundle args = getArguments();
		super.onAttach(activity);
	}

	@Override
	public void onInflate(Activity activity, AttributeSet attrs,
						  Bundle savedInstanceState) {
		Log.d(TAG, "onInflate");
		super.onInflate(activity, attrs, savedInstanceState);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment3 onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v(TAG, "Fragment3 onDestroy");
		super.onDestroy();
	}

	@Override
	public void onResume() {
		Log.v(TAG, "Fragment3 onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v(TAG, "Fragment3 onStart");
		super.onStart();
	}

	@Override
	public void onDetach() {
		Log.v(TAG, "Fragment3 onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v(TAG, "Fragment3 onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.v(TAG, "Fragment3 onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		Log.v(TAG, "Fragment3 onCreateView");
		View view = inflater.inflate(R.layout.fragment3, container, false);
		return view;
	}

	@Override
	public void onDestroyView() {
		Log.v(TAG, "Fragment3 onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment3 onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

}
