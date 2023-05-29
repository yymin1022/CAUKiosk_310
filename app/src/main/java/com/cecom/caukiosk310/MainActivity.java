package com.cecom.caukiosk310;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    ImageView EasterEgg;
    boolean lockCount = true;

    DevicePolicyManager devicePolicyManager = null; // devicePolicyManager used to activate device admin
    ComponentName adminCompName = null;             // adminCompName

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();

        EasterEgg = findViewById(R.id.image_view_main_logo);


        EasterEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.image_view_main_logo){
                    count++;
                }
                if(count > 10){
                    Toast.makeText(getApplicationContext(),String.valueOf(count),Toast.LENGTH_SHORT).show();
                }
                if(count == 35){
                    KioskModeApp.setIsInLockMode(!KioskModeApp.isInLockMode);
                    enableKioskMode(false);
                }
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
        if(KioskModeApp.isInLockMode == true){
            ActivityManager activityManager = (ActivityManager) getApplicationContext()
                    .getSystemService(Context.ACTIVITY_SERVICE);
            activityManager.moveTaskToFront(getTaskId(), 0);
        }
    }
}


//TODO:B1,B2,B3,11,12 -> XML하고 버튼없음(픽셀도 안찍음) 만들어야함,
// TODO: 8층
// TODO: 디테일액티비티에서 글자크기 안맞음,
//  B4,B5,B6 에니메이션 손봐야함,
//  홈버튼,검색버튼 크기 안맞음
// TODO: 애니메이션 4,7,9 이상함. 405호(겁나큰 대형 연습실) detail 수정해야함.
// TODO: 10층 detail 연결 안됨
// TODO: 통과: 1,5,6,10
// TODO: 애매함: 2(왼쪽으로 1~2픽셀),3(왼쪽으로 1픽셀),5(왼쪽으로 1픽셀),
// TODO: 미통과: 7(왼쪽으로 2~3픽셀, 맵이미지 자체도 왼쪽으로 이동해야함),8(왼쪽으로 1픽셀, 위로 1픽셀),9(왼쪽으로 2~3픽셀)
