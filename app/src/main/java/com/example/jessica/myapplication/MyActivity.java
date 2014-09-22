package com.example.jessica.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.widget.Button;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button wearButton = (Button)findViewById(R.id.wearButton);
        wearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int notificationId = 001;



                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(MyActivity.this)
                                .setSmallIcon(R.drawable.ic_launcher)
                                .setContentTitle("Title")
                                .setContentText("Android Wear Notification");


                NotificationManagerCompat notificationManager =
                        NotificationManagerCompat.from(MyActivity.this);

                notificationManager.notify(notificationId, notificationBuilder.build());
            }
        });

    }
}