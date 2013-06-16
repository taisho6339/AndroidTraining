package jp.mixi.assignment.controller.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

/**
 * TODO: 課題1 {@link Toast#makeText(Context, CharSequence, int)} または
 * {@link Toast#makeText(Context, int, int)} を利用して、各ライフサイクルメソッドがどのような順番で
 * 実行されているかを確認してください。 確認したら、assignments/fundamentals/2nd/Report.md
 * にその順番を記述してください。
 * 
 * @author keishin.yokomaku
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onCreate実行", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onRestart(){
		super.onRestart();
		Toast.makeText(this, "onReStart実行", Toast.LENGTH_SHORT).show();
	}
	
	public void onStart() {
		super.onStart();
		Toast.makeText(this, "onStart実行", Toast.LENGTH_SHORT).show();
	}

	public void onResume() {
		super.onResume();
		Toast.makeText(this, "onResume実行", Toast.LENGTH_SHORT).show();
	}

	public void onPause(){
		super.onPause();
		Toast.makeText(this, "onPause実行", Toast.LENGTH_SHORT).show();
	}
	
	public void onStop(){
		super.onStop();
		Toast.makeText(this, "onStop実行", Toast.LENGTH_SHORT).show();
	}
	
	public void onDestroy(){
		super.onDestroy();
		Toast.makeText(this, "onDestroy実行", Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}