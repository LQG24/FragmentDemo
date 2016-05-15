package com.example.fragmentdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.TextView;

import com.example.fragment.Fragment1;
import com.example.fragment.Fragment1.OnButtonClickListener;
import com.example.fragment.Fragment2;

@SuppressLint("Recycle")
public class MainActivity extends FragmentActivity implements
		OnButtonClickListener {

	private static final String TAG = "FragmentDemo";
	private Fragment1 fragment1;
	private Fragment2 fragment2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fragment1 = new Fragment1();
		fragment2 = new Fragment2();
		addFragment1();
		addFragment2();
	}

	private void addFragment1() {
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment1");
		fragment1.setArguments(args);
		Log.i(TAG, "create Fragment1");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		transaction.add(R.id.one, fragment1);
		transaction.addToBackStack(null);
		transaction.commit();
	}

	private void addFragment2() {
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment2");
		fragment2.setArguments(args);
		Log.i(TAG, "create Fragment2");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		transaction.replace(R.id.two, fragment2);
		transaction.addToBackStack(null);
		transaction.commit();
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Log.i(TAG, "onAttachFragment");
		super.onAttachFragment(fragment);
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, "onPause");
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, "onRestart");
		super.onRestart();
	}

	@Override
	public void onButtonClicked() {
		Log.i(TAG, "onButtonClicked");
		TextView tv = (TextView) fragment1.getActivity().findViewById(
				R.id.fragment2_tv);
		tv.setText(tv.getText() + "\n从Fragment1收到数据！");
	}
}
