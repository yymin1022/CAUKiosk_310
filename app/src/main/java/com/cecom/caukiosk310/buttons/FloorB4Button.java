package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class FloorB4Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button401 = view.findViewById(R.id.btn_room_b401);
        Button button404 = view.findViewById(R.id.btn_room_b404);
        Button button405 = view.findViewById(R.id.btn_room_b405);
        Button button406 = view.findViewById(R.id.btn_room_b406);
        Button button407 = view.findViewById(R.id.btn_room_b407);
        Button button408 = view.findViewById(R.id.btn_room_b408);
        Button button409 = view.findViewById(R.id.btn_room_b409);
        Button button410 = view.findViewById(R.id.btn_room_b410);
        Button button411 = view.findViewById(R.id.btn_room_b411);
        Button button412 = view.findViewById(R.id.btn_room_b412);
        Button button413 = view.findViewById(R.id.btn_room_b413);
        Button button414 = view.findViewById(R.id.btn_room_b414);
        Button button415 = view.findViewById(R.id.btn_room_b415);
        button401.setOnClickListener(buttonListener);
        button404.setOnClickListener(buttonListener);
        button405.setOnClickListener(buttonListener);
        button406.setOnClickListener(buttonListener);
        button407.setOnClickListener(buttonListener);
        button408.setOnClickListener(buttonListener);
        button409.setOnClickListener(buttonListener);
        button410.setOnClickListener(buttonListener);
        button411.setOnClickListener(buttonListener);
        button412.setOnClickListener(buttonListener);
        button413.setOnClickListener(buttonListener);
        button414.setOnClickListener(buttonListener);
        button415.setOnClickListener(buttonListener);
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
//TODO: 설명란 만들어야함,
// 401호 글자 없애야함