package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor4Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button401 = view.findViewById(R.id.btn_room_401);
        Button button402 = view.findViewById(R.id.btn_room_402);
        Button button403 = view.findViewById(R.id.btn_room_403);
        Button button404 = view.findViewById(R.id.btn_room_404);
        Button button405 = view.findViewById(R.id.btn_room_405);
        Button button406 = view.findViewById(R.id.btn_room_406);
        Button button407 = view.findViewById(R.id.btn_room_407);
        Button button408 = view.findViewById(R.id.btn_room_408);
        Button button409 = view.findViewById(R.id.btn_room_409);
        Button button410 = view.findViewById(R.id.btn_room_410);

        Button button411 = view.findViewById(R.id.btn_room_411);
        Button button412 = view.findViewById(R.id.btn_room_412);
        Button button413 = view.findViewById(R.id.btn_room_413);
        Button button414 = view.findViewById(R.id.btn_room_414);
        Button button415 = view.findViewById(R.id.btn_room_415);
        Button button416 = view.findViewById(R.id.btn_room_416);
        Button button417 = view.findViewById(R.id.btn_room_417);
        Button button418 = view.findViewById(R.id.btn_room_418);
        Button button419 = view.findViewById(R.id.btn_room_419);
        Button button420 = view.findViewById(R.id.btn_room_420);

        Button button421 = view.findViewById(R.id.btn_room_421);
        Button button422 = view.findViewById(R.id.btn_room_422);
        Button button423 = view.findViewById(R.id.btn_room_423);
        Button button424 = view.findViewById(R.id.btn_room_424);
        Button button425 = view.findViewById(R.id.btn_room_425);
        Button button426 = view.findViewById(R.id.btn_room_426);
        Button button427 = view.findViewById(R.id.btn_room_427);
        Button button428 = view.findViewById(R.id.btn_room_428);
        Button button429 = view.findViewById(R.id.btn_room_429);
        Button button430 = view.findViewById(R.id.btn_room_430);

        Button button431 = view.findViewById(R.id.btn_room_431);
        Button button432 = view.findViewById(R.id.btn_room_432);
        Button button433 = view.findViewById(R.id.btn_room_433);
        Button button434 = view.findViewById(R.id.btn_room_434);
        Button button435 = view.findViewById(R.id.btn_room_435);
        Button button436 = view.findViewById(R.id.btn_room_436);
        Button button437 = view.findViewById(R.id.btn_room_437);
        Button button438 = view.findViewById(R.id.btn_room_438);
        Button button439 = view.findViewById(R.id.btn_room_439);
        Button button440 = view.findViewById(R.id.btn_room_440);
        Button button441 = view.findViewById(R.id.btn_room_441);

        Button button305 = view.findViewById(R.id.btn_room_305);

        button305.setOnClickListener(buttonListener);
        button401.setOnClickListener(buttonListener);
        button402.setOnClickListener(buttonListener);
        button403.setOnClickListener(buttonListener);
        button404.setOnClickListener(buttonListener);
        button404.setOnClickListener(buttonListener);
        button405.setOnClickListener( buttonListener);
        button406.setOnClickListener( buttonListener);
        button407.setOnClickListener( buttonListener);
        button408.setOnClickListener( buttonListener);
        button409.setOnClickListener( buttonListener);

        button410.setOnClickListener( buttonListener);
        button411.setOnClickListener( buttonListener);
        button412.setOnClickListener( buttonListener);
        button413.setOnClickListener( buttonListener);
        button414.setOnClickListener( buttonListener);
        button415.setOnClickListener( buttonListener);
        button416.setOnClickListener( buttonListener);
        button417.setOnClickListener( buttonListener);
        button418.setOnClickListener( buttonListener);
        button419.setOnClickListener( buttonListener);
        button420.setOnClickListener( buttonListener);

        button421.setOnClickListener( buttonListener);
        button422.setOnClickListener( buttonListener);
        button423.setOnClickListener( buttonListener);
        button424.setOnClickListener( buttonListener);
        button425.setOnClickListener( buttonListener);
        button426.setOnClickListener( buttonListener);
        button427.setOnClickListener( buttonListener);
        button428.setOnClickListener( buttonListener);
        button429.setOnClickListener( buttonListener);
        button430.setOnClickListener( buttonListener);

        button431.setOnClickListener( buttonListener);
        button432.setOnClickListener( buttonListener);
        button433.setOnClickListener( buttonListener);
        button434.setOnClickListener( buttonListener);
        button435.setOnClickListener( buttonListener);
        button436.setOnClickListener( buttonListener);
        button437.setOnClickListener( buttonListener);
        button438.setOnClickListener( buttonListener);
        button439.setOnClickListener( buttonListener);
        button440.setOnClickListener( buttonListener);

        button441.setOnClickListener( buttonListener);
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
//TODO: 버튼 연결 안되어있음, 빨간점이 왼쪽으로 5픽셀정도 밀림