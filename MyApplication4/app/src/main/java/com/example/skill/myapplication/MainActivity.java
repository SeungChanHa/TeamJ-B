package com.example.skill.myapplication;

import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //GPS
    LocationManager locationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GPS ON/OFF 확인해서 OFF이면 GPS 설정화면으로 이동하기


        //LocationManager
        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
    }

    //버튼
    public void mOnGPSClick(View v){
        //GPS가 켜져있는지 체크
        if(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            //GPS 설정화면으로 이동
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivity(intent);
        }
    }
}


