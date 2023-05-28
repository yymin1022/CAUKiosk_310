package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor12Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button1201 = view.findViewById(R.id.btn_room_1201);
        Button button1202 = view.findViewById(R.id.btn_room_1202);
        Button button1203 = view.findViewById(R.id.btn_room_1203);
        Button button1204 = view.findViewById(R.id.btn_room_1204);
        Button button1205 = view.findViewById(R.id.btn_room_1205);
        Button button1206 = view.findViewById(R.id.btn_room_1206);
        Button button1207 = view.findViewById(R.id.btn_room_1207);
        Button button1208 = view.findViewById(R.id.btn_room_1208);
        Button button1209 = view.findViewById(R.id.btn_room_1209);
        //Button button1210 = view.findViewById(R.id.btn_room_1210);

        Button button1211 = view.findViewById(R.id.btn_room_1211);
        Button button1212 = view.findViewById(R.id.btn_room_1212);
        Button button1213 = view.findViewById(R.id.btn_room_1213);
        Button button1214 = view.findViewById(R.id.btn_room_1214);
        Button button1215 = view.findViewById(R.id.btn_room_1215);
        Button button1216 = view.findViewById(R.id.btn_room_1216);
        Button button1217 = view.findViewById(R.id.btn_room_1217);
        Button button1218 = view.findViewById(R.id.btn_room_1218);
        Button button1219 = view.findViewById(R.id.btn_room_1219);
        Button button1220 = view.findViewById(R.id.btn_room_1220);

        Button button1221 = view.findViewById(R.id.btn_room_1221);
        Button button1222 = view.findViewById(R.id.btn_room_1222);
        Button button1223 = view.findViewById(R.id.btn_room_1223);
        Button button1224 = view.findViewById(R.id.btn_room_1224);
        Button button1225 = view.findViewById(R.id.btn_room_1225);
        Button button1226 = view.findViewById(R.id.btn_room_1226);
        Button button1227 = view.findViewById(R.id.btn_room_1227);
        Button button1228 = view.findViewById(R.id.btn_room_1228);
        Button button1229 = view.findViewById(R.id.btn_room_1229);
        Button button1230 = view.findViewById(R.id.btn_room_1230);

        Button button1231 = view.findViewById(R.id.btn_room_1231);
        Button button1232 = view.findViewById(R.id.btn_room_1232);
        //Button button1233 = view.findViewById(R.id.btn_room_1233);
        Button button1234 = view.findViewById(R.id.btn_room_1234);
        Button button1235 = view.findViewById(R.id.btn_room_1235);
        Button button1236 = view.findViewById(R.id.btn_room_1236);
        //Button button1237 = view.findViewById(R.id.btn_room_1237);
        //Button button1238 = view.findViewById(R.id.btn_room_1238);
        //Button button1239 = view.findViewById(R.id.btn_room_1239);
        //Button button1240 = view.findViewById(R.id.btn_room_1240);

        //Button button1241 = view.findViewById(R.id.btn_room_1241);
        //Button button1242 = view.findViewById(R.id.btn_room_1242);
        //Button button1243 = view.findViewById(R.id.btn_room_1243);
        //Button button1244 = view.findViewById(R.id.btn_room_1244);
        //Button button1245 = view.findViewById(R.id.btn_room_1245);


        button1201.setOnClickListener(buttonListener);
        button1202.setOnClickListener(buttonListener);
        button1203.setOnClickListener(buttonListener);
        button1204.setOnClickListener(buttonListener);
        button1205.setOnClickListener(buttonListener);
        button1206.setOnClickListener(buttonListener);
        button1207.setOnClickListener(buttonListener);
        button1208.setOnClickListener(buttonListener);
        button1209.setOnClickListener(buttonListener);

        //button1210.setOnClickListener( buttonListener);
        button1211.setOnClickListener( buttonListener);
        button1212.setOnClickListener( buttonListener);
        button1213.setOnClickListener( buttonListener);
        button1214.setOnClickListener( buttonListener);
        button1215.setOnClickListener( buttonListener);
        button1216.setOnClickListener( buttonListener);
        button1217.setOnClickListener( buttonListener);
        button1218.setOnClickListener( buttonListener);
        button1219.setOnClickListener( buttonListener);

        button1220.setOnClickListener( buttonListener);
        button1221.setOnClickListener( buttonListener);
        button1222.setOnClickListener( buttonListener);
        button1223.setOnClickListener( buttonListener);
        button1224.setOnClickListener( buttonListener);
        button1225.setOnClickListener( buttonListener);
        button1226.setOnClickListener( buttonListener);
        button1227.setOnClickListener( buttonListener);
        button1228.setOnClickListener( buttonListener);
        button1228.setOnClickListener( buttonListener);

        button1230.setOnClickListener( buttonListener);
        button1231.setOnClickListener( buttonListener);
        button1232.setOnClickListener( buttonListener);
        //button1233.setOnClickListener( buttonListener);
        button1234.setOnClickListener( buttonListener);
        button1235.setOnClickListener( buttonListener);
        button1236.setOnClickListener( buttonListener);
        //button1237.setOnClickListener( buttonListener);
        //button1238.setOnClickListener( buttonListener);
        //button1239.setOnClickListener( buttonListener);

        //button1240.setOnClickListener( buttonListener);
        //button1241.setOnClickListener( buttonListener);
        //button1242.setOnClickListener( buttonListener);
        //button1243.setOnClickListener( buttonListener);
        //button1244.setOnClickListener( buttonListener);
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