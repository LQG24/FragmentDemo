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

public class Fragment1 extends Fragment {

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
		Log.v(TAG, "Fragment1 onAttach");
		Bundle args = getArguments();
		if (null != args) {
			/*
			 * 在这里我们可以将从Acivity收到的数据保存起来，并且显示到Fragment当中。
			 */
			Log.d(TAG,
					"Fragment1 Get data from activity "
							+ args.getString("hello"));
		}

		try {
			mListener = (OnButtonClickListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnButtonClickListener");
		}
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
		Log.v(TAG, "Fragment1 onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v(TAG, "Fragment1 onDestroy");
		super.onDestroy();
	}

	@Override
	public void onResume() {
		Log.v(TAG, "Fragment1 onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v(TAG, "Fragment1 onStart");
		super.onStart();
	}

	@Override
	public void onDetach() {
		Log.v(TAG, "Fragment1 onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v(TAG, "Fragment1 onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.v(TAG, "Fragment1 onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onCreateView");
		View view = inflater.inflate(R.layout.fragment1, container, false);
		// 为button注册事件，并且调用回调接口，将信息返回给上层
		view.findViewById(R.id.fragment1_btn).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						mListener.onButtonClicked();
					}
				});
		return view;
	}

	@Override
	public void onDestroyView() {
		Log.v(TAG, "Fragment1 onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

}
