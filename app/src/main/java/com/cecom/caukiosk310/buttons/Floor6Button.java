package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor6Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button601 = view.findViewById(R.id.btn_room_601);
        Button button602 = view.findViewById(R.id.btn_room_602);
        Button button603 = view.findViewById(R.id.btn_room_603);
        Button button604 = view.findViewById(R.id.btn_room_604);
        Button button605 = view.findViewById(R.id.btn_room_605);
        Button button606 = view.findViewById(R.id.btn_room_606);
        Button button607 = view.findViewById(R.id.btn_room_607);
        Button button608 = view.findViewById(R.id.btn_room_608);
        Button button609 = view.findViewById(R.id.btn_room_609);
        Button button610 = view.findViewById(R.id.btn_room_610);

        Button button611 = view.findViewById(R.id.btn_room_611);
        Button button612 = view.findViewById(R.id.btn_room_612);
        Button button613 = view.findViewById(R.id.btn_room_613);
        Button button614 = view.findViewById(R.id.btn_room_614);
        Button button615 = view.findViewById(R.id.btn_room_615);
        Button button616 = view.findViewById(R.id.btn_room_616);
        Button button617 = view.findViewById(R.id.btn_room_617);
        Button button618 = view.findViewById(R.id.btn_room_618);
        Button button619 = view.findViewById(R.id.btn_room_619);
        Button button620 = view.findViewById(R.id.btn_room_620);

        Button button621 = view.findViewById(R.id.btn_room_621);
        Button button622 = view.findViewById(R.id.btn_room_622);
        Button button623 = view.findViewById(R.id.btn_room_623);
        Button button624 = view.findViewById(R.id.btn_room_624);
        Button button625 = view.findViewById(R.id.btn_room_625);
        Button button626 = view.findViewById(R.id.btn_room_626);
        Button button627 = view.findViewById(R.id.btn_room_627);
        Button button628 = view.findViewById(R.id.btn_room_628);
        Button button629 = view.findViewById(R.id.btn_room_629);
        Button button630 = view.findViewById(R.id.btn_room_630);

        Button button631 = view.findViewById(R.id.btn_room_631);
        Button button632 = view.findViewById(R.id.btn_room_632);
        Button button633 = view.findViewById(R.id.btn_room_633);
        Button button634 = view.findViewById(R.id.btn_room_634);
        Button button635 = view.findViewById(R.id.btn_room_635);
        Button button636 = view.findViewById(R.id.btn_room_636);
        Button button637 = view.findViewById(R.id.btn_room_637);
        Button button638 = view.findViewById(R.id.btn_room_638);
        Button button639 = view.findViewById(R.id.btn_room_639);
        Button button640 = view.findViewById(R.id.btn_room_640);

        Button button641 = view.findViewById(R.id.btn_room_641);

        button601.setOnClickListener(buttonListener);
        button602.setOnClickListener(buttonListener);
        button603.setOnClickListener(buttonListener);
        button604.setOnClickListener(buttonListener);
        button605.setOnClickListener(buttonListener);
        button606.setOnClickListener(buttonListener);
        button607.setOnClickListener(buttonListener);
        button608.setOnClickListener(buttonListener);
        button609.setOnClickListener(buttonListener);

        button610.setOnClickListener( buttonListener);
        button611.setOnClickListener( buttonListener);
        button612.setOnClickListener( buttonListener);
        button613.setOnClickListener( buttonListener);
        button614.setOnClickListener( buttonListener);
        button615.setOnClickListener( buttonListener);
        button616.setOnClickListener( buttonListener);
        button616.setOnClickListener( buttonListener);
        button617.setOnClickListener( buttonListener);
        button618.setOnClickListener( buttonListener);
        button619.setOnClickListener( buttonListener);

        button620.setOnClickListener( buttonListener);
        button621.setOnClickListener( buttonListener);
        button622.setOnClickListener( buttonListener);
        button623.setOnClickListener( buttonListener);
        button624.setOnClickListener( buttonListener);
        button625.setOnClickListener( buttonListener);
        button626.setOnClickListener( buttonListener);
        button627.setOnClickListener( buttonListener);
        button628.setOnClickListener( buttonListener);
        button629.setOnClickListener( buttonListener);

        button630.setOnClickListener( buttonListener);
        button631.setOnClickListener( buttonListener);
        button632.setOnClickListener( buttonListener);
        button633.setOnClickListener( buttonListener);
        button634.setOnClickListener( buttonListener);
        button635.setOnClickListener( buttonListener);
        button636.setOnClickListener( buttonListener);
        button637.setOnClickListener( buttonListener);
        button638.setOnClickListener( buttonListener);
        button639.setOnClickListener( buttonListener);

        button640.setOnClickListener( buttonListener);
        button641.setOnClickListener( buttonListener);

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

//TODO: 빨간색 위치 약간 더 왼쪽으로 움직이고 상하크기 줄여야함