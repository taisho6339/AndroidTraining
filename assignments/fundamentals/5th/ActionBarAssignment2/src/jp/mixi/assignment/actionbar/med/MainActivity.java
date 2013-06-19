package jp.mixi.assignment.actionbar.med;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// タブナビゲーションモードに設定
		getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// タブを作成して追加。タブの選択・解除・再選択をハンドリングするコールバックの TabListener
		// をセットしないと実行時例外でクラッシュする
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab1").setTabListener(this));
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab2").setTabListener(this));
		getActionBar().addTab(
				getActionBar().newTab().setText("Tab3").setTabListener(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// 選択されたメニューに対応するイベント処理をここで実行する
		switch (item.getItemId()) {
		case R.id.action_activity:
			startActivity(new Intent(MainActivity.this, SubActivity.class));
			break;
		case R.id.action_finish:
			finish();
			break;
		}
		return super.onOptionsItemSelected(item);
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
