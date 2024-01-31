package com.example.mycalculator;


import static com.example.mycalculator.ChannelClass.ChannelId;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.mycalculator.MainActivity;
import com.example.mycalculator.R;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent notiIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notiIntent, PendingIntent.FLAG_IMMUTABLE);
        Notification notification = new NotificationCompat.Builder(this, ChannelId)
                .setContentTitle("My Notification")
                .setContentText("this my notification")
                .setSmallIcon(R.drawable.calculator)
                .setContentIntent(pendingIntent).build();

        startForeground(1, notification);
        Log.d("debug : ", "send niraj");
        return  START_NOT_STICKY;
    }
}
