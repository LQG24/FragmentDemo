package com.example.fragmentdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.fragment.Fragment1;
import com.example.fragment.Fragment1.OnButtonClickListener;
import com.example.fragment.Fragment2;
import com.example.fragment.Fragment3;

@SuppressLint("Recycle")
public class MainActivity extends FragmentActivity implements
		OnButtonClickListener {

	private static final String TAG = "FragmentDemo";
	private Fragment1 fragment1;
	private Fragment2 fragment2;
	private Fragment3 fragment3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fragment1 = new Fragment1();
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment1");
		fragment1.setArguments(args);

		addFragment1();
		addFragment2();
	}

	public void onClick(View view){
		addFragment3();
	}

	public void onClickItem1(View view){
		addFragment1();
	}

	private void addFragment1() {
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		transaction.add(R.id.one, fragment1);
		transaction.commit();
	}

	private void addFragment2() {
		fragment2 = new Fragment2();
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment2");
		fragment2.setArguments(args);
		Log.i(TAG, "create Fragment2");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		transaction.replace(R.id.two, fragment2);
		transaction.commit();
	}


	private void addFragment3() {
		fragment3 = new Fragment3();
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment3");
		fragment3.setArguments(args);
		Log.i(TAG, "create Fragment3");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		if(fragment1 != null){
			transaction.remove(fragment1);
		}
		transaction.add(R.id.one, fragment3);
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
