package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor8Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button801 = view.findViewById(R.id.btn_room_801);
        Button button802 = view.findViewById(R.id.btn_room_802);
        Button button803 = view.findViewById(R.id.btn_room_803);
        Button button804 = view.findViewById(R.id.btn_room_804);
        Button button805 = view.findViewById(R.id.btn_room_805);
        Button button806 = view.findViewById(R.id.btn_room_806);
        Button button807 = view.findViewById(R.id.btn_room_807);
        Button button808 = view.findViewById(R.id.btn_room_808);
        Button button809 = view.findViewById(R.id.btn_room_809);
        Button button810 = view.findViewById(R.id.btn_room_810);

        Button button811 = view.findViewById(R.id.btn_room_811);
        Button button812 = view.findViewById(R.id.btn_room_812);
        Button button813 = view.findViewById(R.id.btn_room_813);
        Button button814 = view.findViewById(R.id.btn_room_814);
        Button button815 = view.findViewById(R.id.btn_room_815);
        Button button816 = view.findViewById(R.id.btn_room_816);
        Button button817 = view.findViewById(R.id.btn_room_817);
        Button button818 = view.findViewById(R.id.btn_room_818);
        Button button819 = view.findViewById(R.id.btn_room_819);
        Button button820 = view.findViewById(R.id.btn_room_820);

        Button button821 = view.findViewById(R.id.btn_room_821);
        Button button822 = view.findViewById(R.id.btn_room_822);
        Button button823 = view.findViewById(R.id.btn_room_823);
        Button button824 = view.findViewById(R.id.btn_room_824);
        Button button825 = view.findViewById(R.id.btn_room_825);
        Button button826 = view.findViewById(R.id.btn_room_826);
        Button button827 = view.findViewById(R.id.btn_room_827);
        Button button828 = view.findViewById(R.id.btn_room_828);
        Button button829 = view.findViewById(R.id.btn_room_829);
        Button button830 = view.findViewById(R.id.btn_room_830);

        Button button831 = view.findViewById(R.id.btn_room_831);
        Button button832 = view.findViewById(R.id.btn_room_832);
        Button button833 = view.findViewById(R.id.btn_room_833);
        Button button834 = view.findViewById(R.id.btn_room_834);
        Button button835 = view.findViewById(R.id.btn_room_835);
        Button button836 = view.findViewById(R.id.btn_room_836);
        Button button837 = view.findViewById(R.id.btn_room_837);
        Button button838 = view.findViewById(R.id.btn_room_838);
        Button button839 = view.findViewById(R.id.btn_room_839);
        Button button840 = view.findViewById(R.id.btn_room_840);

        Button button841 = view.findViewById(R.id.btn_room_841);
        Button button842 = view.findViewById(R.id.btn_room_842);
        Button button843 = view.findViewById(R.id.btn_room_843);
        Button button844 = view.findViewById(R.id.btn_room_844);
        Button button845 = view.findViewById(R.id.btn_room_845);
        Button button846 = view.findViewById(R.id.btn_room_846);
        Button button847 = view.findViewById(R.id.btn_room_847);

        button801.setOnClickListener(buttonListener);
        button802.setOnClickListener(buttonListener);
        button803.setOnClickListener(buttonListener);
        button804.setOnClickListener(buttonListener);
        button805.setOnClickListener(buttonListener);
        button806.setOnClickListener(buttonListener);
        button807.setOnClickListener(buttonListener);
        button808.setOnClickListener(buttonListener);
        button809.setOnClickListener(buttonListener);

        button810.setOnClickListener( buttonListener);
        button811.setOnClickListener( buttonListener);
        button812.setOnClickListener( buttonListener);
        button813.setOnClickListener( buttonListener);
        button814.setOnClickListener( buttonListener);
        button815.setOnClickListener( buttonListener);
        button816.setOnClickListener( buttonListener);
        button817.setOnClickListener( buttonListener);
        button818.setOnClickListener( buttonListener);
        button819.setOnClickListener( buttonListener);

        button820.setOnClickListener( buttonListener);
        button821.setOnClickListener( buttonListener);
        button822.setOnClickListener( buttonListener);
        button823.setOnClickListener( buttonListener);
        button824.setOnClickListener( buttonListener);
        button825.setOnClickListener( buttonListener);
        button826.setOnClickListener( buttonListener);
        button827.setOnClickListener( buttonListener);
        button828.setOnClickListener( buttonListener);
        button828.setOnClickListener( buttonListener);
        button829.setOnClickListener( buttonListener);

        button830.setOnClickListener( buttonListener);
        button831.setOnClickListener( buttonListener);
        button832.setOnClickListener( buttonListener);
        button833.setOnClickListener( buttonListener);
        button834.setOnClickListener( buttonListener);
        button835.setOnClickListener( buttonListener);
        button836.setOnClickListener( buttonListener);
        button837.setOnClickListener( buttonListener);
        button838.setOnClickListener( buttonListener);
        button839.setOnClickListener( buttonListener);

        button840.setOnClickListener( buttonListener);
        button841.setOnClickListener( buttonListener);
        button842.setOnClickListener( buttonListener);
        button843.setOnClickListener( buttonListener);
        button844.setOnClickListener( buttonListener);
        button845.setOnClickListener( buttonListener);
        button846.setOnClickListener( buttonListener);
        button847.setOnClickListener( buttonListener);

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