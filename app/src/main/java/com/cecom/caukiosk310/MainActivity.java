package com.cecom.caukiosk310;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends BaseActivity {
    int count = 0;
    ImageView btnUnlock;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();

        videoView = findViewById(R.id.main_video_view);

        btnUnlock = findViewById(R.id.image_view_main_logo);
        btnUnlock.setOnClickListener(view -> {
            if(view.getId() == R.id.image_view_main_logo){
                count++;
            }
            if(count == 35){
                Toast.makeText(getApplicationContext(), "Unlocked!!", Toast.LENGTH_SHORT).show();
                KioskModeApp.setIsInLockMode(!KioskModeApp.isInLockMode);
                enableKioskMode(false);
            }
        });
        setUpAdmin();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(KioskModeApp.isInLockMode){
            ActivityManager activityManager = (ActivityManager) getApplicationContext()
                    .getSystemService(Context.ACTIVITY_SERVICE);
            activityManager.moveTaskToFront(getTaskId(), 0);
        }
    }
}