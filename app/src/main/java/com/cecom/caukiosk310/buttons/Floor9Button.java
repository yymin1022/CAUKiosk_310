package com.cecom.caukiosk310.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cecom.caukiosk310.FloorActivity;
import com.cecom.caukiosk310.R;

public class Floor9Button {
    FloorActivity floorActivity;
    View view;

    public void initializeButton(FloorActivity floorActivity, View view){
        this.floorActivity = floorActivity;
        this.view = view;

        Button button901 = view.findViewById(R.id.btn_room_901);
        Button button902 = view.findViewById(R.id.btn_room_902);
        Button button903 = view.findViewById(R.id.btn_room_903);
        Button button904 = view.findViewById(R.id.btn_room_904);
        Button button905 = view.findViewById(R.id.btn_room_905);
        Button button906 = view.findViewById(R.id.btn_room_906);
        Button button907 = view.findViewById(R.id.btn_room_907);
        Button button908 = view.findViewById(R.id.btn_room_908);
        Button button909 = view.findViewById(R.id.btn_room_909);
        Button button910 = view.findViewById(R.id.btn_room_910);

        Button button911 = view.findViewById(R.id.btn_room_911);
        Button button912 = view.findViewById(R.id.btn_room_912);
        Button button913 = view.findViewById(R.id.btn_room_913);
        Button button914 = view.findViewById(R.id.btn_room_914);
        Button button915 = view.findViewById(R.id.btn_room_915);
        Button button916 = view.findViewById(R.id.btn_room_916);
        Button button917 = view.findViewById(R.id.btn_room_917);
        Button button918 = view.findViewById(R.id.btn_room_918);
        Button button919 = view.findViewById(R.id.btn_room_919);
        Button button920 = view.findViewById(R.id.btn_room_920);

        Button button921 = view.findViewById(R.id.btn_room_921);
        Button button922 = view.findViewById(R.id.btn_room_922);
        Button button923 = view.findViewById(R.id.btn_room_923);
        Button button924 = view.findViewById(R.id.btn_room_924);
        Button button925 = view.findViewById(R.id.btn_room_925);
        Button button926 = view.findViewById(R.id.btn_room_926);
        Button button927 = view.findViewById(R.id.btn_room_927);
        Button button928 = view.findViewById(R.id.btn_room_928);
        Button button929 = view.findViewById(R.id.btn_room_929);
        Button button930 = view.findViewById(R.id.btn_room_930);

        Button button931 = view.findViewById(R.id.btn_room_931);
        Button button932 = view.findViewById(R.id.btn_room_932);
        Button button933 = view.findViewById(R.id.btn_room_933);
        Button button934 = view.findViewById(R.id.btn_room_934);
        Button button935 = view.findViewById(R.id.btn_room_935);
        Button button936 = view.findViewById(R.id.btn_room_936);
        Button button937 = view.findViewById(R.id.btn_room_937);
        Button button938 = view.findViewById(R.id.btn_room_938);
        Button button939 = view.findViewById(R.id.btn_room_939);
        Button button940 = view.findViewById(R.id.btn_room_940);

        Button button941 = view.findViewById(R.id.btn_room_941);
        Button button942 = view.findViewById(R.id.btn_room_942);
        Button button943 = view.findViewById(R.id.btn_room_943);
        Button button944 = view.findViewById(R.id.btn_room_944);
        Button button945 = view.findViewById(R.id.btn_room_945);
        Button button946 = view.findViewById(R.id.btn_room_946);
        Button button947 = view.findViewById(R.id.btn_room_947);
        Button button948 = view.findViewById(R.id.btn_room_948);
        Button button949 = view.findViewById(R.id.btn_room_949);
        Button button950 = view.findViewById(R.id.btn_room_950);

        Button button951 = view.findViewById(R.id.btn_room_951);

        button901.setOnClickListener(buttonListener);
        button902.setOnClickListener(buttonListener);
        button903.setOnClickListener(buttonListener);
        button904.setOnClickListener(buttonListener);
        button905.setOnClickListener(buttonListener);
        button906.setOnClickListener(buttonListener);
        button907.setOnClickListener(buttonListener);
        button908.setOnClickListener(buttonListener);
        button909.setOnClickListener(buttonListener);

        button910.setOnClickListener( buttonListener);
        button911.setOnClickListener( buttonListener);
        button912.setOnClickListener( buttonListener);
        button913.setOnClickListener( buttonListener);
        button914.setOnClickListener( buttonListener);
        button915.setOnClickListener( buttonListener);
        button916.setOnClickListener( buttonListener);
        button917.setOnClickListener( buttonListener);
        button918.setOnClickListener( buttonListener);
        button919.setOnClickListener( buttonListener);

        button920.setOnClickListener( buttonListener);
        button921.setOnClickListener( buttonListener);
        button922.setOnClickListener( buttonListener);
        button923.setOnClickListener( buttonListener);
        button924.setOnClickListener( buttonListener);
        button925.setOnClickListener( buttonListener);
        button926.setOnClickListener( buttonListener);
        button927.setOnClickListener( buttonListener);
        button928.setOnClickListener( buttonListener);
        button929.setOnClickListener( buttonListener);

        button930.setOnClickListener( buttonListener);
        button931.setOnClickListener( buttonListener);
        button932.setOnClickListener( buttonListener);
        button933.setOnClickListener( buttonListener);
        button934.setOnClickListener( buttonListener);
        button935.setOnClickListener( buttonListener);
        button936.setOnClickListener( buttonListener);
        button937.setOnClickListener( buttonListener);
        button938.setOnClickListener( buttonListener);
        button939.setOnClickListener( buttonListener);

        button940.setOnClickListener( buttonListener);
        button941.setOnClickListener( buttonListener);
        button942.setOnClickListener( buttonListener);
        button943.setOnClickListener( buttonListener);
        button944.setOnClickListener( buttonListener);
        button945.setOnClickListener( buttonListener);
        button946.setOnClickListener( buttonListener);
        button947.setOnClickListener( buttonListener);
        button948.setOnClickListener( buttonListener);
        button949.setOnClickListener( buttonListener);

        button950.setOnClickListener( buttonListener);
        button951.setOnClickListener( buttonListener);
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