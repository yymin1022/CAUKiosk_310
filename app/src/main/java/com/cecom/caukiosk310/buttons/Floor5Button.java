package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor5Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button501 = view.findViewById(R.id.btn_room_501);
        Button button502 = view.findViewById(R.id.btn_room_502);
        Button button503 = view.findViewById(R.id.btn_room_503);
        Button button504 = view.findViewById(R.id.btn_room_504);
        Button button505 = view.findViewById(R.id.btn_room_505);
        Button button506 = view.findViewById(R.id.btn_room_506);
        Button button507 = view.findViewById(R.id.btn_room_507);
        Button button508 = view.findViewById(R.id.btn_room_508);
        Button button509 = view.findViewById(R.id.btn_room_509);
        Button button510 = view.findViewById(R.id.btn_room_510);

        Button button511 = view.findViewById(R.id.btn_room_511);
        Button button512 = view.findViewById(R.id.btn_room_512);
        Button button513 = view.findViewById(R.id.btn_room_513);
        Button button514 = view.findViewById(R.id.btn_room_514);
        Button button515 = view.findViewById(R.id.btn_room_515);
        Button button516 = view.findViewById(R.id.btn_room_516);
        Button button517 = view.findViewById(R.id.btn_room_517);
        Button button518 = view.findViewById(R.id.btn_room_518);
        Button button519 = view.findViewById(R.id.btn_room_519);
        Button button520 = view.findViewById(R.id.btn_room_520);

        Button button521 = view.findViewById(R.id.btn_room_521);
        Button button522 = view.findViewById(R.id.btn_room_522);
        Button button523 = view.findViewById(R.id.btn_room_523);
        Button button524 = view.findViewById(R.id.btn_room_524);
        Button button525 = view.findViewById(R.id.btn_room_525);
        Button button526 = view.findViewById(R.id.btn_room_526);
        Button button527 = view.findViewById(R.id.btn_room_527);
        Button button528 = view.findViewById(R.id.btn_room_528);
        Button button529 = view.findViewById(R.id.btn_room_529);
        Button button530 = view.findViewById(R.id.btn_room_530);

        Button button531 = view.findViewById(R.id.btn_room_531);
        Button button532 = view.findViewById(R.id.btn_room_532);
        Button button533 = view.findViewById(R.id.btn_room_533);
        Button button534 = view.findViewById(R.id.btn_room_534);
        Button button535 = view.findViewById(R.id.btn_room_535);
        Button button536 = view.findViewById(R.id.btn_room_536);
        Button button537 = view.findViewById(R.id.btn_room_537);
        Button button538 = view.findViewById(R.id.btn_room_538);
        Button button539 = view.findViewById(R.id.btn_room_539);
        Button button540 = view.findViewById(R.id.btn_room_540);

        Button button541 = view.findViewById(R.id.btn_room_541);
        Button button542 = view.findViewById(R.id.btn_room_542);



        button501.setOnClickListener(buttonListener);
        button502.setOnClickListener(buttonListener);
        button503.setOnClickListener(buttonListener);
        button504.setOnClickListener(buttonListener);
        button505.setOnClickListener(buttonListener);
        button506.setOnClickListener( buttonListener);
        button507.setOnClickListener( buttonListener);
        button508.setOnClickListener( buttonListener);
        button509.setOnClickListener( buttonListener);

        button510.setOnClickListener( buttonListener);
        button511.setOnClickListener( buttonListener);
        button512.setOnClickListener( buttonListener);
        button513.setOnClickListener( buttonListener);
        button514.setOnClickListener( buttonListener);
        button515.setOnClickListener( buttonListener);
        button516.setOnClickListener( buttonListener);
        button517.setOnClickListener( buttonListener);
        button518.setOnClickListener( buttonListener);
        button519.setOnClickListener( buttonListener);
        button520.setOnClickListener( buttonListener);

        button521.setOnClickListener( buttonListener);
        button522.setOnClickListener( buttonListener);
        button523.setOnClickListener( buttonListener);
        button524.setOnClickListener( buttonListener);
        button525.setOnClickListener( buttonListener);
        button526.setOnClickListener( buttonListener);
        button527.setOnClickListener( buttonListener);
        button528.setOnClickListener( buttonListener);
        button529.setOnClickListener( buttonListener);
        button530.setOnClickListener( buttonListener);

        button531.setOnClickListener( buttonListener);
        button532.setOnClickListener( buttonListener);
        button533.setOnClickListener( buttonListener);
        button534.setOnClickListener( buttonListener);
        button535.setOnClickListener( buttonListener);
        button536.setOnClickListener( buttonListener);
        button537.setOnClickListener( buttonListener);
        button538.setOnClickListener( buttonListener);
        button539.setOnClickListener( buttonListener);
        button540.setOnClickListener( buttonListener);

        button541.setOnClickListener( buttonListener);
        button542.setOnClickListener( buttonListener);


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
//TODO: 버튼 연결 안되어있음