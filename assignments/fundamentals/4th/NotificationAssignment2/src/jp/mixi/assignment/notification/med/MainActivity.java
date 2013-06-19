package jp.mixi.assignment.notification.med;


import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	public static final String ACITON_VIEW_MY_OWN = "jp.mixi.assignment.notification.med.android.intent.action.VIEW_MY_OWN";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Intent intent = new Intent(ACITON_VIEW_MY_OWN);
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
				intent, PendingIntent.FLAG_UPDATE_CURRENT);


		Notification notification = new Notification();
		notification.icon = R.drawable.ic_launcher;
		notification.tickerText = "SampleNotification";
		notification.vibrate = new long[] { 0, 2000, 1000, 2000, 1000, 2000 };
		notification.setLatestEventInfo(getApplicationContext(),
				"NotificationSample", "It calls it.", pendingIntent);

		NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		manager.notify(0, notification);
		// TODO ここで通知を表示する
		// TODO intent には、ACTION_VIEW_MY_OWN の action をセットするだけにしておく
		// TODO 通知をタップした時に、複数の選択肢が表示されるが、どれがどの Activity
		// に対応しているかがわかりづらくなっているので、AndroidManifest を編集して表示をわかりやすくする
	}
}