package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor3Button {
    FloorActivity floorActivity;
    View view;
    FrameLayout btn_frameLayout;
    FrameLayout textView_frameLayout;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button301 = view.findViewById(R.id.btn_room_301);
        Button button302 = view.findViewById(R.id.btn_room_302);
        Button button303 = view.findViewById(R.id.btn_room_303);
        Button button304 = view.findViewById(R.id.btn_room_304);
        Button button305 = view.findViewById(R.id.btn_room_305);
        Button button306 = view.findViewById(R.id.btn_room_306);
        Button button307 = view.findViewById(R.id.btn_room_307);
        Button button308 = view.findViewById(R.id.btn_room_308);
        Button button309_1 = view.findViewById(R.id.btn_room_309_1);
        Button button309_2 = view.findViewById(R.id.btn_room_309_2);
        Button button309_3 = view.findViewById(R.id.btn_room_309_3);
        Button button309_4 = view.findViewById(R.id.btn_room_309_4);
        Button button309_5 = view.findViewById(R.id.btn_room_309_5);
        Button button309_6 = view.findViewById(R.id.btn_room_309_6);
        Button button309_7 = view.findViewById(R.id.btn_room_309_7);
        Button button309_8 = view.findViewById(R.id.btn_room_309_8);
        Button button310 = view.findViewById(R.id.btn_room_310);
        Button button311 = view.findViewById(R.id.btn_room_311);
        Button button312 = view.findViewById(R.id.btn_room_312);
        Button button313 = view.findViewById(R.id.btn_room_313);
        Button button314 = view.findViewById(R.id.btn_room_314);
        Button button315 = view.findViewById(R.id.btn_room_315);
        Button button316 = view.findViewById(R.id.btn_room_316);
        Button button317 = view.findViewById(R.id.btn_room_317);
        Button button318 = view.findViewById(R.id.btn_room_318);
        Button button319 = view.findViewById(R.id.btn_room_319);
        Button button320 = view.findViewById(R.id.btn_room_320);
        Button button321 = view.findViewById(R.id.btn_room_321);
        Button button322 = view.findViewById(R.id.btn_room_322);
        Button button323 = view.findViewById(R.id.btn_room_323);
        Button button324 = view.findViewById(R.id.btn_room_324);
        Button button325 = view.findViewById(R.id.btn_room_325);
        Button button326 = view.findViewById(R.id.btn_room_326);
        Button button327 = view.findViewById(R.id.btn_room_327);
        Button button328 = view.findViewById(R.id.btn_room_328);
        Button button329 = view.findViewById(R.id.btn_room_329);
        Button button330 = view.findViewById(R.id.btn_room_330);
        Button button331 = view.findViewById(R.id.btn_room_331);
        Button button332 = view.findViewById(R.id.btn_room_332);
        Button button333 = view.findViewById(R.id.btn_room_333);
        Button button334 = view.findViewById(R.id.btn_room_334);
        Button button335 = view.findViewById(R.id.btn_room_335);
        Button button336 = view.findViewById(R.id.btn_room_336);

         button301.setOnClickListener(buttonListener);
         button302.setOnClickListener(buttonListener);
         button303.setOnClickListener(buttonListener);
         button304.setOnClickListener(buttonListener);
         button305.setOnClickListener( buttonListener);
         button306.setOnClickListener( buttonListener);
         button307.setOnClickListener( buttonListener);
         button308.setOnClickListener( buttonListener);
         button309_1.setOnClickListener( buttonListener);
         button309_2.setOnClickListener( buttonListener);
         button309_3.setOnClickListener( buttonListener);
         button309_4.setOnClickListener( buttonListener);
         button309_5.setOnClickListener( buttonListener);
         button309_6.setOnClickListener( buttonListener);
         button309_7.setOnClickListener( buttonListener);
         button309_8.setOnClickListener( buttonListener);
         button310.setOnClickListener( buttonListener);
         button311.setOnClickListener( buttonListener);
         button312.setOnClickListener( buttonListener);
         button313.setOnClickListener( buttonListener);
         button314.setOnClickListener( buttonListener);
         button315.setOnClickListener( buttonListener);
         button316.setOnClickListener( buttonListener);
         button317.setOnClickListener( buttonListener);
         button318.setOnClickListener( buttonListener);
         button319.setOnClickListener( buttonListener);
         button320.setOnClickListener( buttonListener);
         button321.setOnClickListener( buttonListener);
         button322.setOnClickListener( buttonListener);
         button323.setOnClickListener( buttonListener);
         button324.setOnClickListener( buttonListener);
         button325.setOnClickListener( buttonListener);
         button326.setOnClickListener( buttonListener);
         button327.setOnClickListener( buttonListener);
         button328.setOnClickListener( buttonListener);
         button329.setOnClickListener( buttonListener);
         button330.setOnClickListener( buttonListener);
         button331.setOnClickListener( buttonListener);
         button332.setOnClickListener( buttonListener);
         button333.setOnClickListener( buttonListener);
         button334.setOnClickListener( buttonListener);
         button335.setOnClickListener( buttonListener);
         button336.setOnClickListener( buttonListener);



    }

    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button selButton = view.findViewById(view.getId());
            ImageView mapImage = floorActivity.getWindow().findViewById(R.id.floor_map);

            int mapHeight = mapImage.getHeight();
            int mapWidth = mapImage.getWidth();
            int mapMarginLeft = mapImage.getLeft();
            int mapMarginTop = mapImage.getTop();

            floorActivity.openRoomInfo(selButton.getText().toString(), mapWidth, mapHeight, mapMarginLeft, mapMarginTop, selButton.getWidth(), selButton.getHeight(), selButton.getLeft(), selButton.getTop(), selButton.getRotation());
        }
    };
}
//TODO: 밑에 설명란 부분이 4층이후랑 안맞음