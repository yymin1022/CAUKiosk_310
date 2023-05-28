package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor2Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button201 = view.findViewById(R.id.btn_room_201);
        Button button202 = view.findViewById(R.id.btn_room_202);
        Button button203 = view.findViewById(R.id.btn_room_203);
        Button button204 = view.findViewById(R.id.btn_room_204);
        Button button204_1 = view.findViewById(R.id.btn_room_204_1);
        Button button204_2 = view.findViewById(R.id.btn_room_204_2);
        Button button204_3 = view.findViewById(R.id.btn_room_204_3);
        Button button205_1 = view.findViewById(R.id.btn_room_205_1);
        Button button205_2 = view.findViewById(R.id.btn_room_205_2);
        Button button206 = view.findViewById(R.id.btn_room_206);
        Button button207 = view.findViewById(R.id.btn_room_207_0);
        Button button207_1 = view.findViewById(R.id.btn_room_207_1);
        Button button210 = view.findViewById(R.id.btn_room_210);
        Button button211 = view.findViewById(R.id.btn_room_211);
        Button button212 = view.findViewById(R.id.btn_room_212);
        button201.setOnClickListener(buttonListener);
        button202.setOnClickListener(buttonListener);
        button203.setOnClickListener(buttonListener);
        button204.setOnClickListener(buttonListener);
        button204_1.setOnClickListener(buttonListener);
        button204_2.setOnClickListener(buttonListener);
        button204_3.setOnClickListener(buttonListener);
        button205_1.setOnClickListener(buttonListener);
        button205_2.setOnClickListener(buttonListener);
        button206.setOnClickListener(buttonListener);
        button207.setOnClickListener(buttonListener);
        button207_1.setOnClickListener(buttonListener);
        button210.setOnClickListener(buttonListener);
        button211.setOnClickListener(buttonListener);
        button212.setOnClickListener(buttonListener);
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
