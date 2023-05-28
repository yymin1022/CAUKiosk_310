package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor11Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button1101 = view.findViewById(R.id.btn_room_1101);
        Button button1102 = view.findViewById(R.id.btn_room_1102);
        Button button1103 = view.findViewById(R.id.btn_room_1103);
        Button button1104 = view.findViewById(R.id.btn_room_1104);
        Button button1105 = view.findViewById(R.id.btn_room_1105);
        Button button1106 = view.findViewById(R.id.btn_room_1106);
        Button button1107 = view.findViewById(R.id.btn_room_1107);
        Button button1108 = view.findViewById(R.id.btn_room_1108);
        Button button1109 = view.findViewById(R.id.btn_room_1109);
        Button button1110 = view.findViewById(R.id.btn_room_1110);

        Button button1111 = view.findViewById(R.id.btn_room_1111);
        Button button1112 = view.findViewById(R.id.btn_room_1112);
        Button button1113 = view.findViewById(R.id.btn_room_1113);
        Button button1114 = view.findViewById(R.id.btn_room_1114);
        Button button1115 = view.findViewById(R.id.btn_room_1115);
        Button button1116 = view.findViewById(R.id.btn_room_1116);
        Button button1117 = view.findViewById(R.id.btn_room_1117);
        Button button1118 = view.findViewById(R.id.btn_room_1118);
        Button button1119 = view.findViewById(R.id.btn_room_1119);
        Button button1120 = view.findViewById(R.id.btn_room_1120);

        Button button1121 = view.findViewById(R.id.btn_room_1121);
        Button button1122 = view.findViewById(R.id.btn_room_1122);
        Button button1123 = view.findViewById(R.id.btn_room_1123);
        Button button1124 = view.findViewById(R.id.btn_room_1124);
        Button button1125 = view.findViewById(R.id.btn_room_1125);
        Button button1126 = view.findViewById(R.id.btn_room_1126);
        Button button1127 = view.findViewById(R.id.btn_room_1127);
        Button button1128 = view.findViewById(R.id.btn_room_1128);
        Button button1129 = view.findViewById(R.id.btn_room_1129);
        Button button1130 = view.findViewById(R.id.btn_room_1130);

        Button button1131 = view.findViewById(R.id.btn_room_1131);
        Button button1132 = view.findViewById(R.id.btn_room_1132);
        Button button1133 = view.findViewById(R.id.btn_room_1133);
        Button button1134 = view.findViewById(R.id.btn_room_1134);
        Button button1135 = view.findViewById(R.id.btn_room_1135);
        Button button1136 = view.findViewById(R.id.btn_room_1136);
        Button button1137 = view.findViewById(R.id.btn_room_1137);
        //Button button1138 = view.findViewById(R.id.btn_room_1138);
        Button button1139 = view.findViewById(R.id.btn_room_1139);
        //Button button1140 = view.findViewById(R.id.btn_room_1140);

        Button button1141 = view.findViewById(R.id.btn_room_1141);
        Button button1142 = view.findViewById(R.id.btn_room_1142);
        Button button1143 = view.findViewById(R.id.btn_room_1143);
        Button button1144 = view.findViewById(R.id.btn_room_1144);
        //Button button1145 = view.findViewById(R.id.btn_room_1145);
        //Button button1146 = view.findViewById(R.id.btn_room_1146);
        //Button button1147 = view.findViewById(R.id.btn_room_1147);
        //Button button1148 = view.findViewById(R.id.btn_room_1148);


        button1101.setOnClickListener(buttonListener);
        button1102.setOnClickListener(buttonListener);
        button1103.setOnClickListener(buttonListener);
        button1104.setOnClickListener(buttonListener);
        button1105.setOnClickListener(buttonListener);
        button1106.setOnClickListener(buttonListener);
        button1107.setOnClickListener(buttonListener);
        button1108.setOnClickListener(buttonListener);
        button1109.setOnClickListener(buttonListener);

        button1110.setOnClickListener( buttonListener);
        button1111.setOnClickListener( buttonListener);
        button1112.setOnClickListener( buttonListener);
        button1113.setOnClickListener( buttonListener);
        button1114.setOnClickListener( buttonListener);
        button1115.setOnClickListener( buttonListener);
        button1116.setOnClickListener( buttonListener);
        button1117.setOnClickListener( buttonListener);
        button1118.setOnClickListener( buttonListener);
        button1119.setOnClickListener( buttonListener);

        button1120.setOnClickListener( buttonListener);
        button1121.setOnClickListener( buttonListener);
        button1122.setOnClickListener( buttonListener);
        button1123.setOnClickListener( buttonListener);
        button1124.setOnClickListener( buttonListener);
        button1125.setOnClickListener( buttonListener);
        button1126.setOnClickListener( buttonListener);
        button1127.setOnClickListener( buttonListener);
        button1128.setOnClickListener( buttonListener);
        button1129.setOnClickListener( buttonListener);

        button1130.setOnClickListener( buttonListener);
        button1131.setOnClickListener( buttonListener);
        button1132.setOnClickListener( buttonListener);
        button1133.setOnClickListener( buttonListener);
        button1134.setOnClickListener( buttonListener);
        button1135.setOnClickListener( buttonListener);
        button1136.setOnClickListener( buttonListener);
        button1137.setOnClickListener( buttonListener);
        //button1138.setOnClickListener( buttonListener);
        button1139.setOnClickListener( buttonListener);

        //button1140.setOnClickListener( buttonListener);
        button1141.setOnClickListener( buttonListener);
        button1142.setOnClickListener( buttonListener);
        button1143.setOnClickListener( buttonListener);
        button1144.setOnClickListener( buttonListener);
        //button1145.setOnClickListener( buttonListener);
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