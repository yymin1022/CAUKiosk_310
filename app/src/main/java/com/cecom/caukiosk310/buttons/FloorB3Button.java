package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class FloorB3Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button301 = view.findViewById(R.id.btn_room_b301);
        Button button302 = view.findViewById(R.id.btn_room_b302);
        Button button303 = view.findViewById(R.id.btn_room_b303);
        Button button304 = view.findViewById(R.id.btn_room_b304);
        Button button305 = view.findViewById(R.id.btn_room_b305);
        Button button306 = view.findViewById(R.id.btn_room_b306);
        Button button307 = view.findViewById(R.id.btn_room_b307);
        Button button308 = view.findViewById(R.id.btn_room_b308);
        Button button309 = view.findViewById(R.id.btn_room_b309);
        Button button310 = view.findViewById(R.id.btn_room_b310);

        Button button311 = view.findViewById(R.id.btn_room_b311);
        Button button312 = view.findViewById(R.id.btn_room_b312);
        Button button313 = view.findViewById(R.id.btn_room_b313);

        button301.setOnClickListener(buttonListener);
        button302.setOnClickListener(buttonListener);
        button303.setOnClickListener(buttonListener);
        button304.setOnClickListener(buttonListener);
        button305.setOnClickListener(buttonListener);
        button306.setOnClickListener(buttonListener);
        button307.setOnClickListener(buttonListener);
        button308.setOnClickListener(buttonListener);
        button309.setOnClickListener(buttonListener);
        button310.setOnClickListener(buttonListener);
        button311.setOnClickListener(buttonListener);
        button312.setOnClickListener(buttonListener);
        button313.setOnClickListener(buttonListener);
        //button315.setOnClickListener(buttonListener);
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
