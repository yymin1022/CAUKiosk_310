package com.cecom.caukiosk310;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TotalViewActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        ArrayList<String>[] upperList = new ArrayList[12];
        ArrayList<String>[] lowerList = new ArrayList[6];
        for(int i = 0; i < 12; i++){
            upperList[i] = new ArrayList<String>();
        }
        for(int i = 0; i < 6; i++){
            lowerList[i] = new ArrayList<String>();
        }

        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_view);
        initialView();

        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator, "building_310.db");
        CategoryArrayList<Category> cateList = new CategoryArrayList<>();
        SQLiteDatabase sampleDB =  SQLiteDatabase.openOrCreateDatabase(file,  null);
        Cursor c = sampleDB.rawQuery("SELECT * FROM total_desc",null);
        String cate = "";

        LinearLayout FB1Layout = findViewById(R.id.total_view_B1);
        LinearLayout FB2Layout = findViewById(R.id.total_view_B2);
        LinearLayout FB3Layout = findViewById(R.id.total_view_B3);
        LinearLayout FB4Layout = findViewById(R.id.total_view_B4);
        LinearLayout FB5Layout = findViewById(R.id.total_view_B5);
        LinearLayout FB6Layout = findViewById(R.id.total_view_B6);

        LinearLayout F1Layout = findViewById(R.id.total_view_1);
        LinearLayout F2Layout = findViewById(R.id.total_view_2);
        LinearLayout F3Layout = findViewById(R.id.total_view_3);
        LinearLayout F4Layout = findViewById(R.id.total_view_4);
        LinearLayout F5Layout = findViewById(R.id.total_view_5);
        LinearLayout F6Layout = findViewById(R.id.total_view_6);
        LinearLayout F7Layout = findViewById(R.id.total_view_7);
        LinearLayout F8Layout = findViewById(R.id.total_view_8);
        LinearLayout F9Layout = findViewById(R.id.total_view_9);
        LinearLayout F10Layout = findViewById(R.id.total_view_10);
        LinearLayout F11Layout = findViewById(R.id.total_view_11);
        LinearLayout F12Layout = findViewById(R.id.total_view_12);

        FB1Layout.setOnClickListener(floorListener);
        FB2Layout.setOnClickListener(floorListener);
        FB3Layout.setOnClickListener(floorListener);
        FB4Layout.setOnClickListener(floorListener);
        FB5Layout.setOnClickListener(floorListener);
        FB6Layout.setOnClickListener(floorListener);

        F1Layout.setOnClickListener(floorListener);
        F2Layout.setOnClickListener(floorListener);
        F3Layout.setOnClickListener(floorListener);
        F4Layout.setOnClickListener(floorListener);
        F5Layout.setOnClickListener(floorListener);
        F6Layout.setOnClickListener(floorListener);
        F7Layout.setOnClickListener(floorListener);
        F8Layout.setOnClickListener(floorListener);
        F9Layout.setOnClickListener(floorListener);
        F10Layout.setOnClickListener(floorListener);
        F11Layout.setOnClickListener(floorListener);
        F12Layout.setOnClickListener(floorListener);


        TextView tv;
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    tv = new TextView(this);  // 새로 추가할 textView 생성
                    tv.setTextSize(10);
                    //tv.setMaxLines(1);
                    //tv.setAutoSizeTextTypeUniformWithConfiguration(13,60,1, TypedValue.COMPLEX_UNIT_SP);
                    tv.setText(c.getString(c.getColumnIndex("name")));  // textView에 내용 추가
                    //tv.setTextSize(9.2f);
                    LinearLayout.LayoutParams tempViewParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                    tempViewParams.setMargins(0,0,0,13);
                    tv.setLayoutParams(tempViewParams);

                    //tv.setLayoutParams(textParams);  // textView layout 설정
                    tv.setGravity(Gravity.CENTER);  // textView layout 설정
                    if(!c.getString(c.getColumnIndex("floor")).startsWith("B")) {
                        switch (Integer.parseInt(c.getString(c.getColumnIndex("floor")))) {
                            case 1:
                                if(upperList[0].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[0].add(tv.getText().toString());
                                    F1Layout.addView(tv);
                                }
                                break;
                            case 2:
                                if(upperList[1].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[1].add(tv.getText().toString());
                                    F2Layout.addView(tv);
                                }
                                break;
                            case 3:
                                if(upperList[2].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[2].add(tv.getText().toString());
                                    F3Layout.addView(tv);
                                }
                                break;
                            case 4:
                                if(upperList[3].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[3].add(tv.getText().toString());
                                    F4Layout.addView(tv);
                                }
                                break;
                            case 5:
                                if(upperList[4].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[4].add(tv.getText().toString());
                                    F5Layout.addView(tv);
                                }
                                break;
                            case 6:
                                if(upperList[5].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[5].add(tv.getText().toString());
                                    F6Layout.addView(tv);
                                }
                                break;
                            case 7:
                                if(upperList[6].contains(tv.getText().toString())){
                                    break;
                                }
                                else {
                                    upperList[6].add(tv.getText().toString());
                                    F7Layout.addView(tv);
                                }
                                break;
                            case 8:
                                if(upperList[7].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[7].add(tv.getText().toString());
                                    F8Layout.addView(tv);
                                }
                                break;
                            case 9:
                                if(upperList[8].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[8].add(tv.getText().toString());
                                    F9Layout.addView(tv);
                                }
                                break;
                            case 10:
                                if(upperList[9].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[9].add(tv.getText().toString());
                                    F10Layout.addView(tv);
                                }
                                break;
                            case 11:
                                if(upperList[10].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[10].add(tv.getText().toString());
                                    F11Layout.addView(tv);
                                }
                                break;
                            case 12:
                                if(upperList[11].contains(tv.getText().toString())){
                                    break;
                                }
                                else{
                                    upperList[11].add(tv.getText().toString());
                                    F12Layout.addView(tv);
                                }
                                break;
                        }
                    }
                    else{
                        if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b1")){
                            if(lowerList[0].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[0].add(tv.getText().toString());
                                FB1Layout.addView(tv);
                            }
                        }
                        else if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b2")){
                            if(lowerList[1].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[1].add(tv.getText().toString());
                                FB2Layout.addView(tv);
                            }
                        }
                        else if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b3")){
                            if(lowerList[2].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[2].add(tv.getText().toString());
                                FB3Layout.addView(tv);
                            }
                        }
                        else if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b4")){
                            if(lowerList[3].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[3].add(tv.getText().toString());
                                FB4Layout.addView(tv);
                            }
                        }
                        else if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b5")){
                            if(lowerList[4].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[4].add(tv.getText().toString());
                                FB5Layout.addView(tv);
                            }
                        }
                        else if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals("b6")){
                            if(lowerList[5].contains(tv.getText().toString())){
                                break;
                            }
                            else {
                                lowerList[5].add(tv.getText().toString());
                                FB6Layout.addView(tv);
                            }
                        }
                    }
                } while (c.moveToNext());
            }
        }
        sampleDB.close();
    }
    View.OnClickListener floorListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), FloorActivity.class);
            switch(view.getId()){
                case R.id.total_view_B6:
                    intent.putExtra("Floor", "B6");
                    break;
                case R.id.total_view_B5:
                    intent.putExtra("Floor", "B5");
                    break;
                case R.id.total_view_B4:
                    intent.putExtra("Floor", "B4");
                    break;
                case R.id.total_view_B3:
                    intent.putExtra("Floor", "B3");
                    break;
                case R.id.total_view_B2:
                    intent.putExtra("Floor", "B2");
                    break;
                case R.id.total_view_B1:
                    intent.putExtra("Floor", "B1");
                    break;
                case R.id.total_view_1:
                    intent.putExtra("Floor", "1");
                    break;
                case R.id.total_view_2:
                    intent.putExtra("Floor", "2");
                    break;
                case R.id.total_view_3:
                    intent.putExtra("Floor", "3");
                    break;
                case R.id.total_view_4:
                    intent.putExtra("Floor", "4");
                    break;
                case R.id.total_view_5:
                    intent.putExtra("Floor", "5");
                    break;
                case R.id.total_view_6:
                    intent.putExtra("Floor", "6");
                    break;
                case R.id.total_view_7:
                    intent.putExtra("Floor", "7");
                    break;
                case R.id.total_view_8:
                    intent.putExtra("Floor", "8");
                    break;
                case R.id.total_view_9:
                    intent.putExtra("Floor", "9");
                    break;
                case R.id.total_view_10:
                    intent.putExtra("Floor", "10");
                    break;
                case R.id.total_view_11:
                    intent.putExtra("Floor", "11");
                    break;
                case R.id.total_view_12:
                    intent.putExtra("Floor", "12");
                    break;

            }
            startActivity(intent);
            finish();
        }
    };

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