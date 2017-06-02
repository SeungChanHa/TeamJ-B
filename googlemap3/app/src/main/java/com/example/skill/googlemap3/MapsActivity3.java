package com.example.skill.googlemap3;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity3 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LocationManager locationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps3);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
    }

    public void buttonClicked(View v) {
        switch (v.getId()) {

            case R.id.gps:
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                if(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
                    //GPS 설정화면으로 이동
                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    intent.addCategory(Intent.CATEGORY_DEFAULT);
                    startActivity(intent);
                }
                mMap.setMyLocationEnabled(true);

            case R.id.marker:
                // LatLng COLLEGE = new LatLng(35.155159, 128.095464);//351동
                MarkerOptions optFirst = new MarkerOptions();
                optFirst.position(new LatLng(35.155159, 128.095464));
                optFirst.icon(BitmapDescriptorFactory.fromResource(R.drawable.first));
                mMap.addMarker(optFirst).showInfoWindow();
                //  Marker college = mMap.addMarker(new MarkerOptions().position(COLLEGE));
                //  mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE));
                //  mMap.animateCamera(CameraUpdateFactory.newLatLng(COLLEGE));



                break;
            case R.id.marker1:
                MarkerOptions optSecond = new MarkerOptions();
                optSecond.position(new LatLng(35.155543, 128.096399));//352동
                optSecond.icon(BitmapDescriptorFactory.fromResource(R.drawable.hsc));
                mMap.addMarker(optSecond).showInfoWindow();
             /*   LatLng COLLEGE1 = new LatLng(35.155543, 128.096399);//352동
                Marker college1 = mMap.addMarker(new MarkerOptions().position(COLLEGE1));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE1));
                mMap.animateCamera(CameraUpdateFactory.newLatLng(COLLEGE1));
                */

                break;
            case R.id.marker2:
                MarkerOptions optThird = new MarkerOptions();
                optThird.position(new LatLng(35.155034, 128.098480));//353동
                optThird.icon(BitmapDescriptorFactory.fromResource(R.drawable.hsc));
                mMap.addMarker(optThird).showInfoWindow();
             /*   LatLng COLLEGE2 = new LatLng(35.155034, 128.098480);//353동
                Marker college2 = mMap.addMarker(new MarkerOptions().position(COLLEGE2));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE2));
                mMap.animateCamera(CameraUpdateFactory.newLatLng(COLLEGE2));
                */

                break;
            case R.id.marker3:
                MarkerOptions optFourth = new MarkerOptions();
                optFourth.position(new LatLng(35.156069, 128.096871));//354동
                optFourth.icon(BitmapDescriptorFactory.fromResource(R.drawable.hsc));
                mMap.addMarker(optFourth).showInfoWindow();
                /*
                LatLng COLLEGE3 = new LatLng(35.156069, 128.096871);//354동
                Marker college3 = mMap.addMarker(new MarkerOptions().position(COLLEGE3));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE3));
                mMap.animateCamera(CameraUpdateFactory.newLatLng(COLLEGE3));
                */

                break;
            case R.id.marker4:
                MarkerOptions optFifth = new MarkerOptions();
                optFifth.position(new LatLng(35.154508, 128.098437));//30동
                optFifth.icon(BitmapDescriptorFactory.fromResource(R.drawable.hsc));
                mMap.addMarker(optFifth).showInfoWindow();
                /*
                LatLng COLLEGE4 = new LatLng(35.154508, 128.098437);//30동
                Marker college4 = mMap.addMarker(new MarkerOptions().position(COLLEGE4));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE4));
                mMap.animateCamera(CameraUpdateFactory.newLatLng(COLLEGE4));
                */

                break;
        }

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


       // LatLng gnu = new LatLng(35.155168, 128.096965);
        //mMap.addMarker(new MarkerOptions().position(gnu).title("Marker in GNU"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(gnu));
        LatLng COLLEGE = new LatLng(35.155168, 128.096965);
        LatLng curPoint= new LatLng(35.155168, 128.096965);
       // Marker college = mMap.addMarker(new MarkerOptions().position(COLLEGE));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(COLLEGE));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(curPoint, 17));



    }
}



