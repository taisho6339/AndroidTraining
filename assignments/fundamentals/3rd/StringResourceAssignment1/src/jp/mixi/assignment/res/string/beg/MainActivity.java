package jp.mixi.assignment.res.string.beg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// TODO 1 個のものと、複数個のものの両方を並べて表示するため、両方用の TextView を取り出し、リソースへアクセスして表示する
		TextView text1 = (TextView) findViewById(R.id.PluralsTextForOne);
		TextView text2 = (TextView) findViewById(R.id.PluralsTextForOther);

		text1.setText(getResources().getQuantityText(R.plurals.hello_world, 1));
		text2.setText(getResources().getQuantityText(R.plurals.hello_world, 2));
	}
}