package jp.mixi.assignment.actionbar.med;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class SubActivity extends Activity implements TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}

	// タブナビゲーションの Tab が選択された時のコールバック
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {

	}

	// タブナビゲーションの Tab が選択解除された時のコールバック
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}

	// タブナビゲーションの Tab が再度選択された時のコールバック
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}
}
