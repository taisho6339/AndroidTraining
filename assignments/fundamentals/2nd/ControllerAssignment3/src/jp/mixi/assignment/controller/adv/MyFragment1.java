package jp.mixi.assignment.controller.adv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment1 extends Fragment {

	public MyFragment1() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// LayoutInflater を利用して、レイアウトをリソースとして読み込む
		View view = inflater
				.inflate(R.layout.fragment_layout, container, false);
		return view;
	}

	// 初期化専用のメソッド。Fragment に対する初期化用の引数はここで管理する
	public static Fragment createInstance() {
		Fragment fragment = new MyFragment1();
		
		// 新しいインスタンスを返す
		return fragment;
	}
}
