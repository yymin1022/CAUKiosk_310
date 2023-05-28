package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class FloorB2Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button201 = view.findViewById(R.id.btn_room_b201);
        Button button202 = view.findViewById(R.id.btn_room_b202);
        Button button203 = view.findViewById(R.id.btn_room_b203);
        Button button204 = view.findViewById(R.id.btn_room_b204);
        Button button205 = view.findViewById(R.id.btn_room_b205);
        Button button206 = view.findViewById(R.id.btn_room_b206);
        Button button207 = view.findViewById(R.id.btn_room_b207);
        Button button208 = view.findViewById(R.id.btn_room_b208);
        Button button209 = view.findViewById(R.id.btn_room_b209);

        Button button210 = view.findViewById(R.id.btn_room_b210);
        Button button211 = view.findViewById(R.id.btn_room_b211);
        Button button212 = view.findViewById(R.id.btn_room_b212);
        Button button213 = view.findViewById(R.id.btn_room_b213);
        Button button214 = view.findViewById(R.id.btn_room_b214);
        Button button215 = view.findViewById(R.id.btn_room_b215);
        //Button button210 = view.findViewById(R.id.btn_room_b216);


        button201.setOnClickListener(buttonListener);
        button202.setOnClickListener(buttonListener);
        button203.setOnClickListener(buttonListener);
        button204.setOnClickListener(buttonListener);
        button205.setOnClickListener(buttonListener);
        button206.setOnClickListener(buttonListener);
        button207.setOnClickListener(buttonListener);
        button208.setOnClickListener(buttonListener);
        button209.setOnClickListener(buttonListener);

        button210.setOnClickListener(buttonListener);
        button211.setOnClickListener(buttonListener);
        button212.setOnClickListener(buttonListener);
        button213.setOnClickListener(buttonListener);
        button214.setOnClickListener(buttonListener);
        button215.setOnClickListener(buttonListener);
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
