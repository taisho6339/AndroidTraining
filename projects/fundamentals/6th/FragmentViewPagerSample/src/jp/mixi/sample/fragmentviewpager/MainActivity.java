package jp.mixi.sample.fragmentviewpager;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements TabListener {
    ViewPager pager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pager = (ViewPager) findViewById(R.id.Pager);

		FragmentManager fm = getSupportFragmentManager();
		SampleFragmentPagerAdapter sampleFragmentPagerAdapter = new SampleFragmentPagerAdapter(
				fm);

		pager.setAdapter(sampleFragmentPagerAdapter);

		getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// タブを作成して追加。タブの選択・解除・再選択をハンドリングするコールバックの TabListener
		// をセットしないと実行時例外でクラッシュする
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab1").setTabListener(this));
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab2").setTabListener(this));
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab3").setTabListener(this));

		pager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				getActionBar().selectTab(getActionBar().getTabAt(arg0));

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	// タブナビゲーションの Tab が選択された時のコールバック
	// @Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		pager.setCurrentItem(tab.getPosition());
		ft.commit();
	}

	// タブナビゲーションの Tab が選択解除された時のコールバック
	// @Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}

	// タブナビゲーションの Tab が再度選択された時のコールバック
	// @Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}

}
