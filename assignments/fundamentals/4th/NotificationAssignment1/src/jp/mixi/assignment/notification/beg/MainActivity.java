package jp.mixi.assignment.notification.beg;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// TODO ここで通知を表示する
		Intent intent = new Intent(this, MainActivity.class);
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
				intent, PendingIntent.FLAG_UPDATE_CURRENT);

		/*
		 * NotificationCompat.Builder builder = new NotificationCompat.Builder(
		 * this); Notification notification = builder
		 * .setSmallIcon(R.drawable.ic_launcher).setContentTitle("通知練習")
		 * .setContentText("通知を表示します。").setContentIntent(pendingIntent)
		 * .build();
		 */

		Notification notification = new Notification();
		notification.icon = R.drawable.ic_launcher;
		notification.tickerText = "SampleNotification";
		notification.vibrate = new long[] { 0, 2000, 1000, 2000, 1000, 2000 };
		notification.setLatestEventInfo(getApplicationContext(),
				"NotificationSample", "It calls it.", pendingIntent);

		NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		manager.notify(0, notification);
	}
}