package com.cecom.caukiosk310;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.util.ArrayList;

public class SearchActivity extends BaseActivity {

    boolean showKeyboard = false;
    InputMethodManager imm;
    EditText input1;
    Button keyboardButton;
    Button searchButton;
    SearchActivity activity;
    TextView no_search_view;
    String org_no_search_view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initialView();
        activity = this;
        imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        input1 = findViewById(R.id.search_editText);



        Typeface typefaceSC = Typeface.createFromAsset(getAssets(), "fonts/SCDreamEB.otf");
        input1.setTypeface(typefaceSC);
        keyboardButton = findViewById(R.id.search_button);
        keyboardButton.setOnClickListener(btnListener);
        searchButton = findViewById(R.id.search_submit_button);
        no_search_view = findViewById(R.id.no_search_view);
        final LinearLayout F1Layout = findViewById(R.id.search_view_1);
        final LinearLayout F2Layout = findViewById(R.id.search_view_2);
        final LinearLayout F3Layout = findViewById(R.id.search_view_3);
        final LinearLayout F4Layout = findViewById(R.id.search_view_4);
        org_no_search_view = no_search_view.getText().toString();

        searchButton.setOnClickListener(new View.OnClickListener() {
            TextView tv;
            @Override
            public void onClick(View v) {
                no_search_view.setVisibility(View.GONE);
                no_search_view.setText(org_no_search_view);
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator, "building_310.db");
                SQLiteDatabase sampleDB =  SQLiteDatabase.openOrCreateDatabase(file,  null);
                Cursor c = sampleDB.rawQuery("SELECT * FROM total_desc",null);
                String input_string = "";
                ArrayList<String> outputString = new ArrayList<>();
                int empty_count = 0;
                F1Layout.removeAllViews();
                F2Layout.removeAllViews();
                F3Layout.removeAllViews();
                F4Layout.removeAllViews();
                input_string = input1.getText().toString().replaceAll(" ","").toLowerCase();
                if(input_string.length() < 2){
                    no_search_view.setVisibility(View.VISIBLE);
                    no_search_view.setText("검색어를 두 글자 이상 입력해주세요.");
                    return;
                }
                if (c != null) {
                    if (c.moveToFirst()) {
                        int num = -1;
                        do {
                            for(int i = 0; i < c.getColumnCount(); i++){
                                String temp = c.getString(i);
                                if(temp != null && temp.contains(input_string.replaceAll(" ","").toLowerCase())){
                                    empty_count = 1;
                                    num++;
                                    tv = new TextView(activity);  // 새로 추가할 textView 생성
                                    final String tempC = c.getString(0);
                                    tv.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getApplicationContext(), FloorActivity.class);
                                            String roomNum = tempC.toLowerCase();
                                            if(roomNum.charAt(0) == 'b'){
                                                switch(roomNum.charAt(1)) {
                                                    case '1':
                                                        intent.putExtra("Floor", "B1");
                                                        break;
                                                    case '2':
                                                        intent.putExtra("Floor", "B2");
                                                        break;
                                                }
                                            }
                                            else{
                                                switch(Integer.parseInt(roomNum.substring(0,1))){
                                                    case 1:
                                                        intent.putExtra("Floor", "1");
                                                        break;
                                                    case 2:
                                                        intent.putExtra("Floor", "2");
                                                        break;
                                                    case 3:
                                                        intent.putExtra("Floor", "3");
                                                        break;
                                                    case 4:
                                                        intent.putExtra("Floor", "4");
                                                        break;
                                                    case 5:
                                                        intent.putExtra("Floor", "5");
                                                        break;
                                                    case 6:
                                                        intent.putExtra("Floor", "6");
                                                        break;
                                                    case 7:
                                                        intent.putExtra("Floor", "7");
                                                        break;
                                                    case 8:
                                                        intent.putExtra("Floor", "8");
                                                        break;
                                                    case 9:
                                                        intent.putExtra("Floor", "9");
                                                        break;
                                                    case 10:
                                                        intent.putExtra("Floor", "10");
                                                        break;
                                                    case 11:
                                                        intent.putExtra("Floor", "11");
                                                        break;
                                                    case 12:
                                                        intent.putExtra("Floor", "12");
                                                        break;
                                                }
                                            }
                                            startActivity(intent);
                                            finish();
                                        }
                                    });
                                    tv.setText(c.getString(c.getColumnIndex("name")));  // textView에 내용 추가
                                    tv.setTextSize(10);
                                    //tv.setMaxLines(1);
                                    //tv.setAutoSizeTextTypeUniformWithConfiguration(10,50,1, TypedValue.COMPLEX_UNIT_SP);
                                    LinearLayout.LayoutParams tempViewParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,0,1);
                                    tempViewParams.setMargins(0,0,0,13);
                                    tv.setLayoutParams(tempViewParams);

                                    //tv.setLayoutParams(textParams);  // textView layout 설정
                                    tv.setGravity(Gravity.CENTER);  // textView layout 설정
                                    outputString.add(c.getString(i));
                                    switch((int)(num%4)){
                                        case 0:
                                            F1Layout.addView(tv);
                                            break;
                                        case 1:
                                            F2Layout.addView(tv);
                                            break;
                                        case 2:
                                            F3Layout.addView(tv);
                                            break;
                                        case 3:
                                            F4Layout.addView(tv);
                                            break;
                                    }
                                    break;
                                }
                            }

                        } while (c.moveToNext());
                    }
                }
                if (empty_count == 0){
                    no_search_view.setVisibility(View.VISIBLE);
                }
                sampleDB.close();
            }
        });

        input1.setOnKeyListener(new View.OnKeyListener() {
            TextView tv;
            @Override
            public boolean onKey(View view, int keycode, KeyEvent keyEvent) {
                if ((keyEvent.getAction()== KeyEvent.ACTION_DOWN) && (keycode == KeyEvent.KEYCODE_ENTER)) {
                    {
                        no_search_view.setVisibility(View.GONE);
                        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator, "building_310.db");
                        SQLiteDatabase sampleDB =  SQLiteDatabase.openOrCreateDatabase(file,  null);
                        Cursor c = sampleDB.rawQuery("SELECT * FROM total_desc",null);
                        String input_string = "";
                        ArrayList<String> outputString = new ArrayList<>();
                        int empty_count = 0;
                        F1Layout.removeAllViews();
                        F2Layout.removeAllViews();
                        F3Layout.removeAllViews();
                        F4Layout.removeAllViews();
                        input_string = input1.getText().toString().replaceAll(" ","").toLowerCase();

                        if(input_string.length() < 2){
                            no_search_view.setVisibility(View.VISIBLE);
                            no_search_view.setText("검색어를 두 글자 이상 입력해주세요.");
                            return false;
                        }
                        if (c != null) {
                            if (c.moveToFirst()) {
                                int num = -1;
                                do {
                                    for(int i = 0; i < c.getColumnCount(); i++){
                                        String temp = c.getString(i);
                                        if(temp != null && temp.contains(input_string.replaceAll(" ","").toLowerCase())){
                                            empty_count = 1;
                                            num++;
                                            tv = new TextView(activity);  // 새로 추가할 textView 생성
                                            final String tempC = c.getString(0);
                                            tv.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent = new Intent(getApplicationContext(), FloorActivity.class);
                                                    String roomNum = tempC.toLowerCase();
                                                    if(roomNum.charAt(0) == 'b'){
                                                        switch(roomNum.charAt(1)) {
                                                            case '1':
                                                                intent.putExtra("Floor", "B1");
                                                                break;
                                                            case '2':
                                                                intent.putExtra("Floor", "B2");
                                                                break;
                                                        }
                                                    }
                                                    else{
                                                        switch(Integer.parseInt(roomNum.substring(0,1))){
                                                            case 1:
                                                                intent.putExtra("Floor", "1");
                                                                break;
                                                            case 2:
                                                                intent.putExtra("Floor", "2");
                                                                break;
                                                            case 3:
                                                                intent.putExtra("Floor", "3");
                                                                break;
                                                            case 4:
                                                                intent.putExtra("Floor", "4");
                                                                break;
                                                            case 5:
                                                                intent.putExtra("Floor", "5");
                                                                break;
                                                            case 6:
                                                                intent.putExtra("Floor", "6");
                                                                break;
                                                            case 7:
                                                                intent.putExtra("Floor", "7");
                                                                break;
                                                            case 8:
                                                                intent.putExtra("Floor", "8");
                                                                break;
                                                            case 9:
                                                                intent.putExtra("Floor", "9");
                                                                break;
                                                            case 10:
                                                                intent.putExtra("Floor", "10");
                                                                break;
                                                            case 11:
                                                                intent.putExtra("Floor", "11");
                                                                break;
                                                            case 12:
                                                                intent.putExtra("Floor", "12");
                                                                break;
                                                        }
                                                    }
                                                    startActivity(intent);
                                                    finish();
                                                }
                                            });
                                            tv.setText(c.getString(c.getColumnIndex("name")));  // textView에 내용 추가
                                            //tv.setTextSize(20);
                                            //tv.setMaxLines(1);
                                            //tv.setAutoSizeTextTypeUniformWithConfiguration(10,60,1, TypedValue.COMPLEX_UNIT_SP);
                                            LinearLayout.LayoutParams tempViewParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,0,1);
                                            tempViewParams.setMargins(0,0,0,13);
                                            tv.setLayoutParams(tempViewParams);

                                            //tv.setLayoutParams(textParams);  // textView layout 설정
                                            tv.setGravity(Gravity.CENTER);  // textView layout 설정
                                            outputString.add(c.getString(i));
                                            switch((int)(num%4)){
                                                case 0:
                                                    F1Layout.addView(tv);
                                                    break;
                                                case 1:
                                                    F2Layout.addView(tv);
                                                    break;
                                                case 2:
                                                    F3Layout.addView(tv);
                                                    break;
                                                case 3:
                                                    F4Layout.addView(tv);
                                                    break;
                                            }
                                            break;
                                        }
                                    }

                                } while (c.moveToNext());
                            }
                        }
                        if (empty_count == 0){
                            no_search_view.setVisibility(View.VISIBLE);
                        }
                        sampleDB.close();
                    }
                }
                return false;
            }
        });
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(showKeyboard == false){
                imm.showSoftInput(input1, 0);
                showKeyboard = true;
            }
            else{
                imm.hideSoftInputFromWindow(input1.getWindowToken(), 0);
                showKeyboard = false;
                getWindow().getDecorView()
                        .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        );
            }

        }
    };



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