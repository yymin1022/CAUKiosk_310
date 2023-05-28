package com.cecom.caukiosk310;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class PermissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);
        activateKIOSK(true);
        Intent mainIntent = new Intent(PermissionActivity.this, MainActivity.class);
        startActivity(mainIntent);
        finish();

    }
    private void activateKIOSK(boolean status){
        LockUtil.lock(PermissionActivity.this);
        startLockTask();
    }



}