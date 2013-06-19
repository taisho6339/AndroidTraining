package jp.mixi.assignment.interaction.beg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	int s_flg = 1;
	int r_flg = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onPrepareOptionsMenu(Menu menu) {
		MenuItem r_item = menu.findItem(R.id.action_settings);
		r_item.setEnabled(s_flg==1);

		MenuItem r_item2 = menu.findItem(R.id.action_refresh);
		r_item2.setEnabled(r_flg==1);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// 選択されたメニューに対応するイベント処理をここで実行する
		switch (item.getItemId()) {
		case R.id.action_settings:
			r_flg = r_flg^1; 
			break;
		case R.id.action_refresh:
			s_flg = s_flg^1; 
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
