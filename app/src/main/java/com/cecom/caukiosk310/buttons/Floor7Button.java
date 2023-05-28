package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor7Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;
        Button button701 = view.findViewById(R.id.btn_room_701);
        Button button702 = view.findViewById(R.id.btn_room_702);
        Button button703 = view.findViewById(R.id.btn_room_703);
        Button button704 = view.findViewById(R.id.btn_room_704);
        Button button705 = view.findViewById(R.id.btn_room_705);
        Button button706 = view.findViewById(R.id.btn_room_706);
        Button button707 = view.findViewById(R.id.btn_room_707);
        Button button708 = view.findViewById(R.id.btn_room_708);
        Button button709 = view.findViewById(R.id.btn_room_709);
        Button button710 = view.findViewById(R.id.btn_room_710);

        Button button711 = view.findViewById(R.id.btn_room_711);
        Button button712 = view.findViewById(R.id.btn_room_712);
        Button button713 = view.findViewById(R.id.btn_room_713);
        Button button714 = view.findViewById(R.id.btn_room_714);
        Button button715 = view.findViewById(R.id.btn_room_715);
        Button button716 = view.findViewById(R.id.btn_room_716);
        Button button717 = view.findViewById(R.id.btn_room_717);
        Button button718 = view.findViewById(R.id.btn_room_718);
        Button button719 = view.findViewById(R.id.btn_room_719);
        Button button720 = view.findViewById(R.id.btn_room_720);

        Button button721 = view.findViewById(R.id.btn_room_721);
        Button button722 = view.findViewById(R.id.btn_room_722);
        Button button723 = view.findViewById(R.id.btn_room_723);
        Button button724 = view.findViewById(R.id.btn_room_724);
        Button button725 = view.findViewById(R.id.btn_room_725);
        Button button726 = view.findViewById(R.id.btn_room_726);
        Button button727 = view.findViewById(R.id.btn_room_727);
        Button button728 = view.findViewById(R.id.btn_room_728);
        Button button729 = view.findViewById(R.id.btn_room_729);
        Button button730 = view.findViewById(R.id.btn_room_730);

        Button button731 = view.findViewById(R.id.btn_room_731);
        Button button732 = view.findViewById(R.id.btn_room_732);
        Button button733 = view.findViewById(R.id.btn_room_733);
        Button button734 = view.findViewById(R.id.btn_room_734);
        Button button735 = view.findViewById(R.id.btn_room_735);
        Button button736 = view.findViewById(R.id.btn_room_736);
        Button button737 = view.findViewById(R.id.btn_room_737);
        Button button738 = view.findViewById(R.id.btn_room_738);
        Button button739 = view.findViewById(R.id.btn_room_739);
        Button button740 = view.findViewById(R.id.btn_room_740);

        Button button741 = view.findViewById(R.id.btn_room_741);
        Button button742 = view.findViewById(R.id.btn_room_742);
        Button button743 = view.findViewById(R.id.btn_room_743);
        Button button744 = view.findViewById(R.id.btn_room_744);
        Button button745 = view.findViewById(R.id.btn_room_745);
        Button button746 = view.findViewById(R.id.btn_room_746);
        Button button747 = view.findViewById(R.id.btn_room_747);
        Button button748 = view.findViewById(R.id.btn_room_748);
        Button button749 = view.findViewById(R.id.btn_room_749);
        Button button750 = view.findViewById(R.id.btn_room_750);

        Button button751 = view.findViewById(R.id.btn_room_751);

        button701.setOnClickListener(buttonListener);
        button702.setOnClickListener(buttonListener);
        button703.setOnClickListener(buttonListener);
        button704.setOnClickListener(buttonListener);
        button705.setOnClickListener(buttonListener);
        button706.setOnClickListener(buttonListener);
        button707.setOnClickListener(buttonListener);
        button708.setOnClickListener(buttonListener);
        button709.setOnClickListener(buttonListener);

        button710.setOnClickListener( buttonListener);
        button711.setOnClickListener( buttonListener);
        button712.setOnClickListener( buttonListener);
        button713.setOnClickListener( buttonListener);
        button714.setOnClickListener( buttonListener);
        button715.setOnClickListener( buttonListener);
        button716.setOnClickListener( buttonListener);
        button717.setOnClickListener( buttonListener);
        button718.setOnClickListener( buttonListener);
        button719.setOnClickListener( buttonListener);

        button720.setOnClickListener( buttonListener);
        button721.setOnClickListener( buttonListener);
        button722.setOnClickListener( buttonListener);
        button723.setOnClickListener( buttonListener);
        button724.setOnClickListener( buttonListener);
        button725.setOnClickListener( buttonListener);
        button726.setOnClickListener( buttonListener);
        button727.setOnClickListener( buttonListener);
        button727.setOnClickListener( buttonListener);
        button728.setOnClickListener( buttonListener);
        button729.setOnClickListener( buttonListener);

        button730.setOnClickListener( buttonListener);
        button731.setOnClickListener( buttonListener);
        button732.setOnClickListener( buttonListener);
        button733.setOnClickListener( buttonListener);
        button734.setOnClickListener( buttonListener);
        button735.setOnClickListener( buttonListener);
        button736.setOnClickListener( buttonListener);
        button737.setOnClickListener( buttonListener);
        button738.setOnClickListener( buttonListener);
        button739.setOnClickListener( buttonListener);

        button740.setOnClickListener( buttonListener);
        button741.setOnClickListener( buttonListener);
        button742.setOnClickListener( buttonListener);
        button743.setOnClickListener( buttonListener);
        button744.setOnClickListener( buttonListener);
        button745.setOnClickListener( buttonListener);
        button746.setOnClickListener( buttonListener);
        button747.setOnClickListener( buttonListener);
        button748.setOnClickListener( buttonListener);
        button749.setOnClickListener( buttonListener);

        button750.setOnClickListener( buttonListener);
        button751.setOnClickListener( buttonListener);
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

//TODO: 에니메이션 시 빨간색 위치 안맞음, 버튼 연결 안되어있음
//TODO: 밑에 설명란 부분이 4층이후랑 안맞음