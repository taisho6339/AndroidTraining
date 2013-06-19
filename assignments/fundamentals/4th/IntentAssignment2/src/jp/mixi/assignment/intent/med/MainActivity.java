package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	final int REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View button = findViewById(R.id.CallActivityForResult);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO EditText と ボタンを 1 つずつ持つ新しい Activity
				// を呼び出し、ボタンを押した時に結果を返すように実装する
				// TODO 返ってきた結果を Toast で表示するところも実装すること

				Intent intent = new Intent(MainActivity.this,
						EditActivity.class);
				startActivityForResult(intent, REQUEST_CODE);
			}
		});
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		super.onActivityResult(requestCode, resultCode, intent);
		String answer = intent.getStringExtra("MESSAGE");
		if (resultCode == RESULT_OK) {
			switch (requestCode) {
			case REQUEST_CODE:
				Toast.makeText(MainActivity.this, answer, Toast.LENGTH_SHORT).show();
				break;
			default:
				Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
				break;
			}
		}

	}
}