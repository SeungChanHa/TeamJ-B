/**
 * Created by skill on 2017-05-28.
 */

public class GpsInfo {
    GpsInfo gps = new GpsInfo(CurrentMapActivity.this);
// GPS 사용유무 가져오기
if (gps.isGetLocation()) {

    }
    double latitude = gps.getLatitude();
    double longitude = gps.getLongitude();

    // Creating a LatLng object for the current location
    LatLng latLng = new LatLng(latitude, longitude);

// Showing the current location in Google Map
mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

// Map 을 zoom 합니다.
mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(13));

    MarkerOptions optFirst = new MarkerOptions();
optFirst.position(latLng);// 위도 • 경도
optFirst.title("Current Position");// 제목 미리보기
optFirst.snippet("Snippet");
optFirst.icon(BitmapDescriptorFactory.fromResource(
    R.drawable.ic_launcher));
mGoogleMap.addMarker(optFirst).showInfoWindow();


    출처: http://mainia.tistory.com/1168 [녹두장군 - 상상을 현실로]




}
