package com.cecom.caukiosk310;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.io.File;
import java.util.Locale;

public class DetailActivity extends BaseActivity{
    String selRoom = "";

    TextView tvInfo;
    TextView tvNum ;
    TextView tvPhone;
    TextView tvTitle ;
    ImageView imgViewDetail;

    FrameLayout.LayoutParams mapLayoutParams;
    FrameLayout.LayoutParams roomLayoutParams;
    ImageView mapImage;
    Intent intent;
    LinearLayout imageLayout;
    LinearLayout infoLayout;
    FrameLayout mapLayout;
    LinearLayout numLayout;
    LinearLayout titleLayout;
    boolean checkNull = false;
    View roomView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initialView();

        mapImage = findViewById(R.id.detail_image_map);
        roomView = findViewById(R.id.detail_view_room);
        roomView.setVisibility(View.INVISIBLE)                                                                                                                              ;
        imgViewDetail  = findViewById(R.id.detail_imageView);
        tvInfo = findViewById(R.id.detail_text_info);
        tvNum = findViewById(R.id.detail_text_number);
        tvPhone = findViewById(R.id.detail_text_phone);
        tvTitle = findViewById(R.id.detail_text_title);
        imageLayout = findViewById(R.id.detail_layout_image);
        infoLayout = findViewById  (R.id.detail_layout_info);
        mapLayout = findViewById(R.id.detail_layout_map);
        numLayout = findViewById(R.id.detail_layout_number);
        titleLayout = findViewById(R.id.detail_layout_title);
        mapLayoutParams = (FrameLayout.LayoutParams)mapLayout.getLayoutParams();
        roomLayoutParams = (FrameLayout.LayoutParams)roomView.getLayoutParams();

        imageLayout.setVisibility(View.INVISIBLE);
        infoLayout.setVisibility(View.INVISIBLE);
        numLayout.setVisibility(View.INVISIBLE);
        titleLayout.setVisibility(View.INVISIBLE);

        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
        mapLayoutParams.width = getIntent().getIntExtra("width", 0);
        mapLayoutParams.height = getIntent().getIntExtra("height", 0);
        mapLayout.setLayoutParams(mapLayoutParams);

        selRoom = getIntent().getStringExtra("NUM");
        File imgFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "room_image" + File.separator, selRoom+ ".png");
        if(imgFile.exists()){
            Bitmap bm = BitmapFactory.decodeFile(imgFile.getPath());
            imgViewDetail.setImageBitmap(bm);
        }
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator, "building_310.db");
        SQLiteDatabase sampleDB =  SQLiteDatabase.openOrCreateDatabase(file,  null);
        Cursor c = sampleDB.rawQuery("SELECT * FROM total_desc",null);

        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    Log.d("roomd_id",c.getString(c.getColumnIndex("id")).toLowerCase());
                    if(c.getString(c.getColumnIndex("id")).toLowerCase().equals(selRoom.toLowerCase())){
                        //File imgFile = new  File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "img_file" +File.separator, c.getString(c.getColumnIndex("img_url")));
                        //if(imgFile.exists()){
                        //    Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                        //    imgViewDetail.setImageBitmap(myBitmap);
                        //}
                        checkNull = true;
                        String tvInfoText = c.getString(c.getColumnIndex("room_desc"));
                        tvInfoText = tvInfoText.replaceFirst("\\(", "\n(");
                        tvInfo.setText(tvInfoText);
                        Log.d("tvInfoText",tvInfoText);
                        if(c.getString(c.getColumnIndex("id")).toLowerCase().startsWith("b")){
                            String temp = "B"+c.getString(c.getColumnIndex("id")).substring(1);
                            tvNum.setText(temp+"호");
                        }
                        else{
                            tvNum.setText(c.getString(c.getColumnIndex("id")));
                        }
                        tvPhone.setText(c.getString(c.getColumnIndex("phone_num")));
                        tvTitle.setText(c.getString(c.getColumnIndex("name")));
                    }
                } while (c.moveToNext());
            }
        }
        if (checkNull == false){
            tvTitle.setText(selRoom.toUpperCase() + "호");
            tvInfo.setText("자세한 정보는 방호실에 문의바랍니다.");
            tvNum.setText("");
            tvPhone.setText("");
        }
        sampleDB.close();
        updateFloorButton(selRoom);
        setUpAdmin();
    }

    void initLeftPanel(){
        imageLayout.setVisibility(View.VISIBLE);
        infoLayout.setVisibility(View.VISIBLE);
        numLayout.setVisibility(View.VISIBLE);
        titleLayout.setVisibility(View.VISIBLE);

        Typeface typefaceSC = Typeface.createFromAsset(getAssets(), "fonts/SCDreamEB.otf");
        tvNum.setTypeface(typefaceSC);
        tvPhone.setTypeface(typefaceSC);
        tvTitle.setTypeface(typefaceSC);

        Typeface typefaceNG = Typeface.createFromAsset(getAssets(), "fonts/NanumBarunGothicR.otf");
        tvInfo.setTypeface(typefaceNG);
    }

    void updateFloorButton(String room){
        Button btnFloor = findViewById(R.id.main_btn_floor_1);
        intent = new Intent(getApplicationContext(), FloorActivity.class);
        Handler mHandler = new Handler();
        if(room.toLowerCase().startsWith("b")){
            switch(room.substring(1, 2)){
                case "1":
                    btnFloor = findViewById(R.id.main_btn_floor_b1);
                    mapImage.setImageResource(R.drawable.img_floor_b1);
                    intent.putExtra("Floor", "B1");
                    mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            runMapAnimationB1();
                        }
                    }, 500); // 0.5초후
                    break;
                case "2":
                    btnFloor = findViewById(R.id.main_btn_floor_b2);
                    mapImage.setImageResource(R.drawable.img_floor_b2);
                    intent.putExtra("Floor", "B2");
                    mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            runMapAnimationB2();
                        }
                    }, 500); // 0.5초후
                    break;
                case "3":
                    btnFloor = findViewById(R.id.main_btn_floor_b3);
                    mapImage.setImageResource(R.drawable.img_floor_b3);
                    intent.putExtra("Floor", "B3");
                    mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                    mHandler.postDelayed(new Runnable()  {
                        public void run() {
                            runMapAnimationB3();
                        }
                    }, 500); // 0.5초후
                    break;
                case "4":
                    btnFloor = findViewById(R.id.main_btn_floor_b4);
                    mapImage.setImageResource(R.drawable.img_floor_b4);
                    intent.putExtra("Floor", "B4");
                    mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                    mHandler.postDelayed(new Runnable()  {
                        public void run() {
                            runMapAnimationB4();
                        }
                    }, 500); // 0.5초후
                    break;
                case "5":
                    btnFloor = findViewById(R.id.main_btn_floor_b5);
                    mapImage.setImageResource(R.drawable.img_floor_b5);
                    intent.putExtra("Floor", "B5");
                    runMapAnimationB5();
                    break;
                case "6":
                    btnFloor = findViewById(R.id.main_btn_floor_b6);
                    mapImage.setImageResource(R.drawable.img_floor_b6);
                    intent.putExtra("Floor", "B6");
                    runMapAnimationB6();
                    break;
            }
        }
        else{

            if(room.length() == 3 || room.length() == 5){
                Log.d("room_number",room);
                switch(room.substring(0, 1).toLowerCase()) {
                    case "1":
                        btnFloor = findViewById(R.id.main_btn_floor_1);
                        mapImage.setImageResource(R.drawable.img_floor_1);
                        intent.putExtra("Floor", "1");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(0,1,0.0f,0.066f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "2":
                        btnFloor = findViewById(R.id.main_btn_floor_2);
                        mapImage.setImageResource(R.drawable.img_floor_2);
                        intent.putExtra("Floor", "2");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-3,0,0,0.066f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "3":
                        btnFloor = findViewById(R.id.main_btn_floor_3);
                        mapImage.setImageResource(R.drawable.img_floor_3);
                        intent.putExtra("Floor", "3");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-2,0,0,0.062f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "4":
                        btnFloor = findViewById(R.id.main_btn_floor_4);
                        mapImage.setImageResource(R.drawable.img_floor_4);
                        intent.putExtra("Floor", "4");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(7,-4,0.02f,0.062f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "5":
                        btnFloor = findViewById(R.id.main_btn_floor_5);
                        mapImage.setImageResource(R.drawable.img_floor_5);
                        intent.putExtra("Floor", "5");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-3,0,-0.015f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "6":
                        btnFloor = findViewById(R.id.main_btn_floor_6);
                        mapImage.setImageResource(R.drawable.img_floor_6);
                        intent.putExtra("Floor", "6");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(1,0,0.0f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "7":
                        Log.d("room_number",room);
                        btnFloor = findViewById(R.id.main_btn_floor_7);
                        mapImage.setImageResource(R.drawable.img_floor_7);
                        intent.putExtra("Floor", "7");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-14,0,-0.05f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "8":
                        btnFloor = findViewById(R.id.main_btn_floor_8);
                        mapImage.setImageResource(R.drawable.img_floor_8);
                        intent.putExtra("Floor", "8");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-2,-1,-0.02f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "9":
                        btnFloor = findViewById(R.id.main_btn_floor_9);
                        mapImage.setImageResource(R.drawable.img_floor_9);
                        intent.putExtra("Floor", "9");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-14,0,-0.04f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                }
            }else{
                switch(room.substring(0, 2)){
                    case "10":
                        btnFloor = findViewById(R.id.main_btn_floor_10);
                        mapImage.setImageResource(R.drawable.img_floor_10);
                        intent.putExtra("Floor", "10");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-14,0,-0.05f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "11":
                        btnFloor = findViewById(R.id.main_btn_floor_11);
                        mapImage.setImageResource(R.drawable.img_floor_11);
                        intent.putExtra("Floor", "11");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-6,0,-0.03f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                    case "12":
                        btnFloor = findViewById(R.id.main_btn_floor_12);
                        mapImage.setImageResource(R.drawable.img_floor_12);
                        intent.putExtra("Floor", "12");
                        mapLayoutParams.setMargins(getIntent().getIntExtra("marginLeft", 0), getIntent().getIntExtra("marginTop", 0), 0, 0);
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                runMapAnimationDefaultParameter(-6,0,-0.03f,0.07f);
                            }
                        }, 500); // 0.5초후
                        break;
                }
            }
        }
        btnFloor.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_main_floor_pressed));
        Button btnReturn = findViewById(R.id.detail_btn_return);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });
    }





    void runMapAnimationDefault(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.2 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.2/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 1.05;
            startTop += 0.9;
        }
        /*
        TranslateAnimation translateAnimation = new TranslateAnimation(
                getIntent().getIntExtra("marginLeft", 0),
                500,
                getIntent().getIntExtra("marginTop", 0),
                500);

        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        mapLayout.startAnimation(translateAnimation);
*/
        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)+2, getIntent().getIntExtra("btnMarginTop", 0) - 98, 0, 0);
        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }
    /* marginLeft => 얼마나 빨간 상자를 왼쪽으로 옮길 것인가. 양수면 오른쪽으로 옮기고 음수면 왼쪽으로 옮김. marginTop: 음수면 위로, 양수면 아래로, mapLeft: 미니맵을 음수면 왼쪽, 양수면 오른쪽*/
    void runMapAnimationDefaultParameter(int marginLeft, int marginTop, float mapLeft, float mapTop){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.2 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.2/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 1.05+mapLeft;
            startTop += 0.9+mapTop;
        }
        /*
        TranslateAnimation translateAnimation = new TranslateAnimation(
                getIntent().getIntExtra("marginLeft", 0),
                500,
                getIntent().getIntExtra("marginTop", 0),
                500);

        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        mapLayout.startAnimation(translateAnimation);
*/
        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)+2 + marginLeft, getIntent().getIntExtra("btnMarginTop", 0) - 98 + marginTop, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }
    void runMapAnimationB1(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.4 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.6/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 0.94;
            startTop += 0.15;
        }
        /*
        TranslateAnimation translateAnimation = new TranslateAnimation(
                getIntent().getIntExtra("marginLeft", 0),
                500,
                getIntent().getIntExtra("marginTop", 0),
                500);

        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        mapLayout.startAnimation(translateAnimation);
*/
        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)-35 , getIntent().getIntExtra("btnMarginTop", 0) - 212, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0)+1;
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }
    void runMapAnimationB2(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.4 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.9/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 0.41;
            startTop += 0.35;
        }
        /*
        TranslateAnimation translateAnimation = new TranslateAnimation(
                getIntent().getIntExtra("marginLeft", 0),
                500,
                getIntent().getIntExtra("marginTop", 0),
                500);

        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        mapLayout.startAnimation(translateAnimation);
*/
        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)-225 , getIntent().getIntExtra("btnMarginTop", 0) - 163, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0)+1;
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }
    void runMapAnimationB4(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.4 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.8/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 0.98;
            startTop += 0.01;
        }

        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)-2, getIntent().getIntExtra("btnMarginTop", 0)-245, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }

    void runMapAnimationB3(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.9 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.9/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 2.56;
            startTop += -0.01;
        }

        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)+499, getIntent().getIntExtra("btnMarginTop", 0)-246, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }


    void runMapAnimationB5(){
        mapImage.setRotation(-28);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*1.4 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*1.96/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 0.96;
            startTop += 0.83;
        }

        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0), getIntent().getIntExtra("btnMarginTop", 0)-50, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
    }

    void runMapAnimationB6(){
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                mapLayout.animate()
                        .scaleX((float) (600.0*2.1 / getIntent().getIntExtra("width", 0)))
                        .scaleY((float) (200.0*2.1/ getIntent().getIntExtra("height", 0)))
                        .setDuration(400);
            }
        }, 80); // 0.5초후

        float startLeft = mapLayout.getLeft();
        float startTop = mapLayout.getTop();
        for(int i = 0; i < 500; i++){
            final float tempSL = startLeft;
            final float tempST = startTop;

            mHandler.postDelayed(new Runnable()  {
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(
                            tempSL, tempSL,
                            tempST, tempST);

                    translateAnimation.setDuration(10);
                    translateAnimation.setFillAfter(true);
                    mapLayout.startAnimation(translateAnimation);
                }
            }, (int)(100+0.8*(i+1))); // 0.5초후
            startLeft += 1.66;
            startTop += 0.55;
        }

        roomLayoutParams.setMargins(getIntent().getIntExtra("btnMarginLeft", 0)+598, getIntent().getIntExtra("btnMarginTop", 0)-202, 0, 0);
        Log.d("marginLeft", String.valueOf(getIntent().getIntExtra("btnMarginLeft", 0)));

        roomLayoutParams.width = getIntent().getIntExtra("btnWidth", 0);
        roomLayoutParams.height = getIntent().getIntExtra("btnHeight", 0);
        roomView.setLayoutParams(roomLayoutParams);
        roomView.setRotation(getIntent().getFloatExtra("btnRotation", 0));
        roomView.setVisibility(View.VISIBLE);

        initLeftPanel();
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