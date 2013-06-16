package jp.mixi.assignment.controller.adv;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager manager = getSupportFragmentManager();
		// FragmentTransaction を開始
		FragmentTransaction transaction = manager.beginTransaction();

		// FragmentContainer のレイアウトに、MyFragment を割当てる
		transaction.add(R.id.FragmentContainer, MyFragment1.createInstance());


		// 変更を確定して FragmentTransaction を終える
		transaction.commit();
	}

}
