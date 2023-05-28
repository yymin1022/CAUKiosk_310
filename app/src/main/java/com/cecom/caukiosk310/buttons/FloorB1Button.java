package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class FloorB1Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button101 = view.findViewById(R.id.btn_room_b101);
        Button button102 = view.findViewById(R.id.btn_room_b102);
        Button button103 = view.findViewById(R.id.btn_room_b103);
        Button button104 = view.findViewById(R.id.btn_room_b104);
        Button button105 = view.findViewById(R.id.btn_room_b105);
        //Button button106 = view.findViewById(R.id.btn_room_b106);
        //Button button107 = view.findViewById(R.id.btn_room_b107);
        Button button108 = view.findViewById(R.id.btn_room_b108);
        Button button109 = view.findViewById(R.id.btn_room_b109);

        Button button110_0 = view.findViewById(R.id.btn_room_b110_0);
        Button button110_1 = view.findViewById(R.id.btn_room_b110_1);
        Button button110_2 = view.findViewById(R.id.btn_room_b110_2);
        Button button111 = view.findViewById(R.id.btn_room_b111);
        Button button112 = view.findViewById(R.id.btn_room_b112);
        Button button113 = view.findViewById(R.id.btn_room_b113);
        Button button114 = view.findViewById(R.id.btn_room_b114);
        Button button115 = view.findViewById(R.id.btn_room_b115);
        Button button116 = view.findViewById(R.id.btn_room_b116);
        Button button117 = view.findViewById(R.id.btn_room_b117);
        Button button118 = view.findViewById(R.id.btn_room_b118);
        Button button119 = view.findViewById(R.id.btn_room_b119);

        Button button120 = view.findViewById(R.id.btn_room_b120);
        //Button button121 = view.findViewById(R.id.btn_room_b121);
        //Button button122 = view.findViewById(R.id.btn_room_b122);

        button101.setOnClickListener(buttonListener);
        button104.setOnClickListener(buttonListener);
        button105.setOnClickListener(buttonListener);
        //button106.setOnClickListener(buttonListener);
        //button107.setOnClickListener(buttonListener);
        button108.setOnClickListener(buttonListener);
        button109.setOnClickListener(buttonListener);
        button110_0.setOnClickListener(buttonListener);
        button110_1.setOnClickListener(buttonListener);
        button110_2.setOnClickListener(buttonListener);
        button111.setOnClickListener(buttonListener);
        button112.setOnClickListener(buttonListener);
        button113.setOnClickListener(buttonListener);
        button114.setOnClickListener(buttonListener);
        button115.setOnClickListener(buttonListener);
        button116.setOnClickListener(buttonListener);
        button117.setOnClickListener(buttonListener);
        button118.setOnClickListener(buttonListener);
        button119.setOnClickListener(buttonListener);
        button120.setOnClickListener(buttonListener);
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
