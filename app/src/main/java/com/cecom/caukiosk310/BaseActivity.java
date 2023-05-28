package com.cecom.caukiosk310;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    protected Context mContext = this;
    protected View mDecorView;
    protected DevicePolicyManager mDpm;

    protected void setUpAdmin() {
        /*
        if (!KioskModeApp.isInLockMode()) {
            ComponentName deviceAdmin = new ComponentName(this, AdminReceiver.class);
            mDpm = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
            if (!mDpm.isAdminActive(deviceAdmin)) {
                Log.e("Kiosk Mode Error", getString(R.string.not_device_admin));
            }

            if (mDpm.isDeviceOwnerApp(getPackageName())) {
                mDpm.setLockTaskPackages(deviceAdmin, new String[]{getPackageName()});
            } else {
                Log.e("Kiosk Mode Error", getString(R.string.not_device_owner));
            }

            enableKioskMode(true);
            //TODO : for clear device Owner
//        } else {
//            mDpm = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
//            mDpm.clearDeviceOwnerApp(getPackageName());
        }

        mDecorView = getWindow().getDecorView();

        */
    }

    protected void enableKioskMode(boolean enabled) {
        try {
            if (enabled) {
                if (mDpm.isLockTaskPermitted(this.getPackageName())) {
                    KioskModeApp.setIsInLockMode(true);
                    startLockTask();
                } else {
                    KioskModeApp.setIsInLockMode(false);
                    Log.e("Kiosk Mode Error", getString(R.string.kiosk_not_permitted));
                }
            } else {
                KioskModeApp.setIsInLockMode(false);
                stopLockTask();
            }
        } catch (Exception e) {
            KioskModeApp.setIsInLockMode(false);
            // TODO: Log and handle appropriately
            Log.e("Kiosk Mode Error", e.getMessage());
        }
    }

    void initialView(){
        Typeface typefaceBM;
        typefaceBM = Typeface.createFromAsset(getAssets(), "fonts/SCDreamEB.otf");
        getWindow().getDecorView()
                .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                );


        Button btnFloorB6 = findViewById(R.id.main_btn_floor_b6);
        Button btnFloorB5 = findViewById(R.id.main_btn_floor_b5);
        Button btnFloorB4 = findViewById(R.id.main_btn_floor_b4);
        Button btnFloorB3 = findViewById(R.id.main_btn_floor_b3);
        Button btnFloorB2 = findViewById(R.id.main_btn_floor_b2);
        Button btnFloorB1 = findViewById(R.id.main_btn_floor_b1);
        Button btnFloor1 = findViewById(R.id.main_btn_floor_1);
        Button btnFloor2 = findViewById(R.id.main_btn_floor_2);
        Button btnFloor3 = findViewById(R.id.main_btn_floor_3);
        Button btnFloor4 = findViewById(R.id.main_btn_floor_4);
        Button btnFloor5 = findViewById(R.id.main_btn_floor_5);
        Button btnFloor6 = findViewById(R.id.main_btn_floor_6);
        Button btnFloor7 = findViewById(R.id.main_btn_floor_7);
        Button btnFloor8 = findViewById(R.id.main_btn_floor_8);
        Button btnFloor9 = findViewById(R.id.main_btn_floor_9);
        Button btnFloor10 = findViewById(R.id.main_btn_floor_10);
        Button btnFloor11 = findViewById(R.id.main_btn_floor_11);
        Button btnFloor12 = findViewById(R.id.main_btn_floor_12);

        ImageView btnFacility = findViewById(R.id.main_btn_facility);
        ImageView btnHome = findViewById(R.id.main_btn_home);
        ImageView btnSearch = findViewById(R.id.main_btn_search);
        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    /*
                    case R.id.main_btn_chn:
                        break;
                    case R.id.main_btn_eng:
                        break;
                    case R.id.main_btn_kor:
                        break;
                     */
                    case R.id.main_btn_facility:
                        startActivity(new Intent(getApplicationContext(), TotalViewActivity.class));
                        finish();
                        break;
                    case R.id.main_btn_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                        break;
                    case R.id.main_btn_search:
                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                        finish();
                        break;

                }
            }
        };

        View.OnClickListener floorListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FloorActivity.class);

                switch(view.getId()){
                    case R.id.main_btn_floor_b6:
                        intent.putExtra("Floor", "B6");
                        break;
                    case R.id.main_btn_floor_b5:
                        intent.putExtra("Floor", "B5");
                        break;
                    case R.id.main_btn_floor_b4:
                        intent.putExtra("Floor", "B4");
                        break;
                    case R.id.main_btn_floor_b3:
                        intent.putExtra("Floor", "B3");
                        break;
                    case R.id.main_btn_floor_b2:
                        intent.putExtra("Floor", "B2");
                        break;
                    case R.id.main_btn_floor_b1:
                        intent.putExtra("Floor", "B1");
                        break;
                    case R.id.main_btn_floor_1:
                        intent.putExtra("Floor", "1");
                        break;
                    case R.id.main_btn_floor_2:
                        intent.putExtra("Floor", "2");
                        break;
                    case R.id.main_btn_floor_3:
                        intent.putExtra("Floor", "3");
                        break;
                    case R.id.main_btn_floor_4:
                        intent.putExtra("Floor", "4");
                        break;
                    case R.id.main_btn_floor_5:
                        intent.putExtra("Floor", "5");
                        break;
                    case R.id.main_btn_floor_6:
                        intent.putExtra("Floor", "6");
                        break;
                    case R.id.main_btn_floor_7:
                        intent.putExtra("Floor", "7");
                        break;
                    case R.id.main_btn_floor_8:
                        intent.putExtra("Floor", "8");
                        break;
                    case R.id.main_btn_floor_9:
                        intent.putExtra("Floor", "9");
                        break;
                    case R.id.main_btn_floor_10:
                        intent.putExtra("Floor", "10");
                        break;
                    case R.id.main_btn_floor_11:
                        intent.putExtra("Floor", "11");
                        break;
                    case R.id.main_btn_floor_12:
                        intent.putExtra("Floor", "12");
                        break;
                }

                Log.d("floor",intent.getStringExtra("Floor"));
                startActivity(intent);
                finish();
            }
        };


        btnFacility.setOnClickListener(btnListener);
        btnHome.setOnClickListener(btnListener);
        btnSearch.setOnClickListener(btnListener);
        btnHome.setOnClickListener(btnListener);

        btnFloorB6.setOnClickListener(floorListener);
        btnFloorB5.setOnClickListener(floorListener);
        btnFloorB4.setOnClickListener(floorListener);
        btnFloorB3.setOnClickListener(floorListener);
        btnFloorB2.setOnClickListener(floorListener);
        btnFloorB1.setOnClickListener(floorListener);
        btnFloor1.setOnClickListener(floorListener);
        btnFloor2.setOnClickListener(floorListener);
        btnFloor3.setOnClickListener(floorListener);
        btnFloor4.setOnClickListener(floorListener);
        btnFloor5.setOnClickListener(floorListener);
        btnFloor6.setOnClickListener(floorListener);
        btnFloor7.setOnClickListener(floorListener);
        btnFloor8.setOnClickListener(floorListener);
        btnFloor9.setOnClickListener(floorListener);
        btnFloor10.setOnClickListener(floorListener);
        btnFloor11.setOnClickListener(floorListener);
        btnFloor12.setOnClickListener(floorListener);

        Typeface typefaceFloorBtn = Typeface.createFromAsset(getAssets(), "fonts/NanumBarunGothicB.otf");
        btnFloorB6.setTypeface(typefaceFloorBtn);
        btnFloorB5.setTypeface(typefaceFloorBtn);
        btnFloorB4.setTypeface(typefaceFloorBtn);
        btnFloorB3.setTypeface(typefaceFloorBtn);
        btnFloorB2.setTypeface(typefaceFloorBtn);
        btnFloorB1.setTypeface(typefaceFloorBtn);
        btnFloor1.setTypeface(typefaceFloorBtn);
        btnFloor2.setTypeface(typefaceFloorBtn);
        btnFloor3.setTypeface(typefaceFloorBtn);
        btnFloor4.setTypeface(typefaceFloorBtn);
        btnFloor5.setTypeface(typefaceFloorBtn);
        btnFloor6.setTypeface(typefaceFloorBtn);
        btnFloor7.setTypeface(typefaceFloorBtn);
        btnFloor8.setTypeface(typefaceFloorBtn);
        btnFloor9.setTypeface(typefaceFloorBtn);
        btnFloor10.setTypeface(typefaceFloorBtn);
        btnFloor11.setTypeface(typefaceFloorBtn);
        btnFloor12.setTypeface(typefaceFloorBtn);
        resizeFloorButtonText();
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
    public void onBackPressed() {


    }

    public void resizeFloorButtonText() {
        Typeface typefaceSC = Typeface.createFromAsset(getAssets(), "fonts/SCDreamEB.otf");

        LinearLayout floor_button_layout = findViewById(R.id.floor_button_linear_layout);

        for (int i = 0; i <floor_button_layout.getChildCount(); i++) {
            LinearLayout child_list = (LinearLayout) floor_button_layout.getChildAt(i);
            for(int j = 0; j < child_list.getChildCount(); j++){
                Button tempbtn = (Button)child_list.getChildAt(j);
                tempbtn.setTypeface(typefaceSC);
                tempbtn.setTextSize(32);
            }
        }
    }
}