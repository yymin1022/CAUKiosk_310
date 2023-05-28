package com.cecom.caukiosk310;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cecom.caukiosk310.buttons.*;

import java.io.File;
import java.util.Locale;

public class FloorActivity extends BaseActivity {
    String curFloor = "1";
    FrameLayout btn_frameLayout;
    FrameLayout textView_frameLayout;
    Typeface typefaceNG;
    Typeface typefaceSC;
    TextView tempView;
    Button tempButton;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();

        if(event.getAction() == MotionEvent.ACTION_DOWN){
            Log.d("POINT", String.format(Locale.getDefault(), "%d %d", x, y));
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        typefaceNG = Typeface.createFromAsset(getAssets(), "fonts/NanumBarunGothicR.otf");
        typefaceSC = Typeface.createFromAsset(getAssets(), "fonts/SCDreamEB.otf");
        Intent intent = getIntent();
        curFloor = intent.getStringExtra("Floor");
        Log.d("curFloor", curFloor);
        LinearLayout[] categoryLayout = new LinearLayout[3];

        switch(curFloor){
            case "B6":
                setContentView(R.layout.activity_floor_b6);
                FloorB6Button buttonB6Class = new FloorB6Button();
                buttonB6Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[1];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                //categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B6",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b6);
                makeTextViewGroup();
                break;
            case "B5":
                setContentView(R.layout.activity_floor_b5);
                FloorB5Button buttonB5Class = new FloorB5Button();
                buttonB5Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[1];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                //categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B5",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b5);
                makeTextViewGroup();
                break;
            case "B4":
                Log.d("floor it is B4", "True");
                setContentView(R.layout.activity_floor_b4);
                FloorB4Button buttonB4Class = new FloorB4Button();
                buttonB4Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[1];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                //categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B4",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b4);
                makeTextViewGroup();
                break;
            case "B3":
                Log.d("floor it is B3", "True");
                setContentView(R.layout.activity_floor_b3);
                FloorB3Button buttonB3Class = new FloorB3Button();
                buttonB3Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[1];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                //categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B3",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b3);
                makeTextViewGroup();
                break;
            case "B2":
                Log.d("floor it is B2", "True");
                setContentView(R.layout.activity_floor_b2);
                FloorB2Button buttonB2Class = new FloorB2Button();
                buttonB2Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[2];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B2",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b2);
                makeTextViewGroup();
                break;
            case "B1":
                Log.d("floor it is B1", "True");
                setContentView(R.layout.activity_floor_b1);
                FloorB1Button buttonB1Class = new FloorB1Button();
                buttonB1Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[2];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                //categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("B1",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_b1);
                makeTextViewGroup();
                break;
            case "1":
                setContentView(R.layout.activity_floor_1);
                Floor1Button button1Class = new Floor1Button();
                button1Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("1",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_1);
                makeTextViewGroup();
                break;
            case "2":
                setContentView(R.layout.activity_floor_2);
                Floor2Button button2Class = new Floor2Button();
                button2Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("2",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_2);
                makeTextViewGroup();
                break;
            case "3":
                setContentView(R.layout.activity_floor_3);
                Floor3Button button3Class = new Floor3Button();
                button3Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("3",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_3);
                makeTextViewGroup();
                break;
            case "4":
                setContentView(R.layout.activity_floor_4);
                Floor4Button button4Class = new Floor4Button();
                button4Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("4",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_4);
                makeTextViewGroup();
                break;
            case "5":
                setContentView(R.layout.activity_floor_5);
                Floor5Button button5Class = new Floor5Button();
                button5Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("5",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_5);
                makeTextViewGroup();
                break;
            case "6":
                setContentView(R.layout.activity_floor_6);
                Floor6Button button6Class = new Floor6Button();
                button6Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("6",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_6);
                makeTextViewGroup();
                break;
            case "7":
                setContentView(R.layout.activity_floor_7);
                Floor7Button button7Class = new Floor7Button();
                button7Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("7",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_7);
                makeTextViewGroup();
                break;
            case "8":
                setContentView(R.layout.activity_floor_8);
                Floor8Button button8Class = new Floor8Button();
                button8Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("8",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_8);
                makeTextViewGroup();
                break;
            case "9":
                setContentView(R.layout.activity_floor_9);
                Floor9Button button9Class = new Floor9Button();
                button9Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                setCategory("9",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_9);
                makeTextViewGroup();
                break;
            case "10":
                setContentView(R.layout.activity_floor_10);
                Floor10Button button10Class = new Floor10Button();
                button10Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[4];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                categoryLayout[3] = findViewById(R.id.floor_4_layout_category);
                setCategory("10",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_10);
                makeTextViewGroup();
                break;
            case "11":
                setContentView(R.layout.activity_floor_11);
                Floor11Button button11Class = new Floor11Button();
                button11Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[4];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                categoryLayout[3] = findViewById(R.id.floor_4_layout_category);
                setCategory("11",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_11);
                makeTextViewGroup();
                break;
            case "12":
                setContentView(R.layout.activity_floor_12);
                Floor12Button button12Class = new Floor12Button();
                button12Class.initializeButton(this, getWindow().getDecorView());
                btn_frameLayout = findViewById(R.id.frameLayout_btn);
                categoryLayout = new LinearLayout[4];
                categoryLayout[0] = findViewById(R.id.floor_1_layout_category);
                categoryLayout[1] = findViewById(R.id.floor_2_layout_category);
                categoryLayout[2] = findViewById(R.id.floor_3_layout_category);
                categoryLayout[3] = findViewById(R.id.floor_4_layout_category);
                setCategory("12",categoryLayout);
                textView_frameLayout = findViewById(R.id.frameLayout_textview_12);
                makeTextViewGroup();
                break;
//                setContentView(R.layout.activity_floor_12);
//                Floor12Button button12Class = new Floor12Button();
//                button12Class.initializeButton(this, getWindow().getDecorView());
//                break;
        }

        initialView();
        setUpAdmin();

    }

    private void setCategory(String floor, LinearLayout[] categoryLayout) {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator, "building_310.db");
        CategoryArrayList<Category> cateList = new CategoryArrayList<>();
        SQLiteDatabase sampleDB =  SQLiteDatabase.openOrCreateDatabase(file,  null);
        Cursor c = sampleDB.rawQuery("SELECT * FROM total_desc",null);
        //String cate = "";
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    Log.d("db_data",c.getString(c.getColumnIndex("floor")));
                    if(c.getString(c.getColumnIndex("floor")).toLowerCase().equals(floor.toLowerCase())){
                        String cate = c.getString(c.getColumnIndex("name"));
                        Log.d("db_data_cate",cate);
                        if(cate.equals("")){
                            continue;
                        }
                        else{
                            int index = cateList.contains(cate);
                            if(index != -1){
                                String temp = cateList.get(index).room;
                                temp += ",";
                                if(temp.split(",").length %4 == 0){
                                    temp+="\n";
                                }
                                temp += c.getString(c.getColumnIndex("id"));
                                cateList.get(index).room = temp;
                            }
                            else{
                                cateList.add(new Category(cate,c.getString(c.getColumnIndex("id"))));
                            }
                        }
                    }
                } while (c.moveToNext());
            }
        }

        for(int i = 0; i < cateList.size(); i++){
            final CategoryTextView tempView = new CategoryTextView(getApplicationContext(), cateList.get(i).room, cateList.get(i).cate);
            LinearLayout.LayoutParams tempViewParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT,1);
            tempViewParams.setMargins(0,0,0,5);
            tempView.setLayoutParams(tempViewParams);
            tempView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String roomNum = tempView.tvNumber.getText().toString();
                    Log.d("test",roomNum);
                    ImageView mapImage = findViewById(R.id.floor_map);

                    int mapHeight = mapImage.getHeight();
                    int mapWidth = mapImage.getWidth();
                    int mapMarginLeft = mapImage.getLeft();
                    int mapMarginTop = mapImage.getTop();
                    FrameLayout tempLayout = findViewById(R.id.frameLayout_btn);
                    for(int i = 0; i < tempLayout.getChildCount(); i++){
                        Button selButton = (Button) tempLayout.getChildAt(i);
                        Log.d("btn",selButton.getText().toString());
                        if(selButton.getText().toString().toLowerCase().trim().equals(roomNum.toLowerCase().trim())){
                            Log.d("input",roomNum);
                            openRoomInfo(roomNum, mapWidth, mapHeight, mapMarginLeft, mapMarginTop, selButton.getWidth(), selButton.getHeight(), selButton.getLeft(), selButton.getTop(), selButton.getRotation());
                            break;
                        }
                    }
                }
            });
            if(floor.equals("10") || floor.equals("11") || floor.equals("12")){
                //tempView.tvNumber.setTextSize(9.4f);
                //tempView.tvTitle.setTextSize(10f);
                switch((i*4/(cateList.size()))){
                    case 0:
                        Log.d("fuc","0");
                        Log.d("test_sie",String.valueOf(i));
                        categoryLayout[0].addView(tempView);
                        break;
                    case 1:
                        Log.d("fuc","1");
                        categoryLayout[1].addView(tempView);
                        break;
                    case 2:
                        Log.d("fuc","2");
                        categoryLayout[2].addView(tempView);
                        break;
                    case 3:
                        Log.d("fuc","3");
                        categoryLayout[3].addView(tempView);
                        break;
                }

            }
            else if(  floor.equals("B3") || floor.equals("B4") || floor.equals("B5")|| floor.equals("B6")){
                categoryLayout[0].addView(tempView);
            }
            else if (floor.equals("B1")|| floor.equals("B2")){
                switch((i*2/(cateList.size()))){
                    case 0:
                        Log.d("fuc","0");
                        Log.d("test_sie",String.valueOf(i));
                        categoryLayout[0].addView(tempView);
                        break;
                    case 1:
                        Log.d("fuc","1");
                        categoryLayout[1].addView(tempView);
                        break;
                }

            }
            else{
                switch((i*3/(cateList.size()))){
                    case 0:
                        Log.d("fuc","0");
                        Log.d("test_sie",String.valueOf(i));
                        categoryLayout[0].addView(tempView);
                        break;
                    case 1:
                        Log.d("fuc","1");
                        categoryLayout[1].addView(tempView);
                        break;
                    case 2:
                        Log.d("fuc","2");
                        categoryLayout[2].addView(tempView);
                        break;
                }

            }
        }
        for(int j = 0; j < categoryLayout.length; j++){
            Log.d("categoryLayout_length", String.valueOf(categoryLayout.length));
            categoryLayout[j].setWeightSum(categoryLayout[j].getChildCount());
        }

        sampleDB.close();
    }


    public void openRoomInfo(String selRoom, int width, int height, int marginLeft, int marginTop, int btnWidth, int btnHeight, int btnMarginLeft, int btnMarginTop, float btnRotation){
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        intent.putExtra("NUM", selRoom);
        intent.putExtra("width", width);
        intent.putExtra("height", height);
        intent.putExtra("marginLeft", marginLeft);
        intent.putExtra("marginTop", marginTop);
        intent.putExtra("btnWidth", btnWidth);
        intent.putExtra("btnHeight", btnHeight);
        intent.putExtra("btnMarginLeft", btnMarginLeft);
        intent.putExtra("btnMarginTop", btnMarginTop);
        intent.putExtra("btnRotation", btnRotation);
        startActivity(intent);
        finish();
    }

    void makeTextViewGroup(){
        for(int i = 0; i < btn_frameLayout.getChildCount(); i++){
            tempButton = (Button) btn_frameLayout.getChildAt(i);
            tempButton.setTextSize(0);
            tempButton.setBackgroundColor(Color.parseColor("#00ff0000"));

            tempView = new TextView(this);
            tempView.setText(tempButton.getText());
            if(tempView.getText().equals("B401") ||tempView.getText().equals("630-1") ||tempView.getText().equals("940-1") ||tempView.getText().equals("740-1") ||tempView.getText().equals("836-1") ||tempView.getText().equals("1011") ||tempView.getText().equals("1110") ||tempView.getText().equals("1111") ||tempView.getText().equals("1211") || tempView.getText().equals("1210") ||tempView.getText().equals("205-2") || tempView.getText().equals("204-3") || tempView.getText().equals("205-1") ||  tempView.getText().equals("204-2") || tempView.getText().equals("B110-1") || tempView.getText().equals("B504") ){
                tempView.setVisibility(View.INVISIBLE);
            }
            if(tempButton.getRotation() > 3f){
                tempView.setRotation(270+tempButton.getRotation());
            }

            tempView.setTypeface(typefaceSC);
            tempView.setTextSize(10.7f);
            if(curFloor.equals("10") || curFloor.equals("11") || curFloor.equals("12")){
                tempView.setTextSize(9.4f);
            }
            tempView.setLayoutParams(tempButton.getLayoutParams());
            tempView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
            textView_frameLayout.addView(tempView);


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