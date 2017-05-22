package com.alignsolution.customermobileapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.alignsolution.customermobileapplication.Bize.MenuMGR;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class activity_other_map extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    //spinner
    private Spinner list_type;
    private ArrayList<String> Data = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_map2);
        list_type = (Spinner) findViewById(R.id.spinner);
        createList();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        // Spinner   Adapter ตัวแรก
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Data);
        list_type.setAdapter(adapter);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Bangkok = new LatLng(	13.75633,100.50177);
        mMap.addMarker(new MarkerOptions().position(Bangkok).title("กรุงเทพมหานคร"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bangkok,12.0f));
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }

    private void createList() {
        Data.add("เลือก จังหวัดที่ต้องการค้นหา");
        Data.add("กรุงเทพมหานคร ");
        Data.add("กระบี่ ");
        Data.add("กาญจนบุรี ");
        Data.add("กาฬสินธุ์ ");
        Data.add("กำแพงเพชร ");
        Data.add("ขอนแก่น ");
        Data.add("จันทบุรี ");
        Data.add("ฉะเชิงเทรา ");
        Data.add("ชลบุรี ");
        Data.add("ชัยนาท ");
        Data.add("ชัยภูมิ ");
        Data.add("ชุมพร ");
        Data.add("เชียงราย ");
        Data.add("เชียงใหม่ ");
        Data.add("ตรัง ");
        Data.add("ตราด ");
        Data.add("ตาก ");
        Data.add("นครนายก ");
        Data.add("นครปฐม ");
        Data.add("นครพนม ");
        Data.add("นครราชสีมา ");
        Data.add("นครศรีธรรมราช ");
        Data.add("นครสวรรค์ ");
        Data.add("นนทบุรี ");
        Data.add("นราธิวาส ");
        Data.add("น่าน ");
        Data.add("บึงกาฬ ");
        Data.add("บุรีรัมย์ ");
        Data.add("ปทุมธานี ");
        Data.add("ประจวบคีรีขันธ์ ");
        Data.add("ปราจีนบุรี ");
        Data.add("ปัตตานี ");
        Data.add(" พระนครศรีอยุธยา ");
        Data.add("พังงา ");
        Data.add("พัทลุง ");
        Data.add("พิจิตร ");
        Data.add("พิษณุโลก ");
        Data.add("เพชรบุรี ");
        Data.add("เพชรบูรณ์ ");
        Data.add("แพร่ ");
        Data.add("พะเยา ");
        Data.add("ภูเก็ต ");
        Data.add("มหาสารคาม ");
        Data.add("มุกดาหาร ");
        Data.add("แม่ฮ่องสอน ");
        Data.add("ยะลา  ");
        Data.add("ยโสธร  ");
        Data.add("ร้อยเอ็ด  ");
        Data.add("ระนอง  ");
        Data.add("ระยอง  ");
        Data.add("ราชบุรี  ");
        Data.add("ลพบุรี  ");
        Data.add("ลำปาง  ");
        Data.add("ลำพูน  ");
        Data.add("เลย  ");
        Data.add("ศรีสะเกษ  ");
        Data.add("สกลนคร  ");
        Data.add("สงขลา  ");
        Data.add("สตูล  ");
        Data.add("สมุทรปราการ  ");
        Data.add("สมุทรสงคราม  ");
        Data.add("สมุทรสาคร  ");
        Data.add("สระแก้ว  ");
        Data.add("สระบุรี   ");
        Data.add("สิงห์บุรี  ");
        Data.add("สุโขทัย  ");
        Data.add("สุพรรณบุรี  ");
        Data.add("สุราษฎร์ธานี  ");
        Data.add("สุรินทร์  ");
        Data.add("หนองคาย  ");
        Data.add("หนองบัวลำภู  ");
        Data.add("อ่างทอง  ");
        Data.add("อุดรธานี  ");
        Data.add("อุทัยธานี  ");
        Data.add("อุตรดิตถ์  ");
        Data.add("อุบลราชธานี  ");
        Data.add("อำนาจเจริญ ");
    }
}
