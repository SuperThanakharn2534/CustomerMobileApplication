package com.alignsolution.customermobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.alignsolution.customermobileapplication.AdapterMenu.OtherMenuActivity_Adapter;
import com.alignsolution.customermobileapplication.AdapterMenu.UserProfileActivity_Adapter;
import com.alignsolution.customermobileapplication.Bize.MenuMGR;

/**
 * Created by aligndev on 28-Apr-17.
 */

public class OtherMenuActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private ListView listView;
    private   String[] planets;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    MenuMGR menuMGR = new MenuMGR();
    ListView list1;

    final Integer[] arrImg = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8
    };
    String[] itemname ={
            "ข้อมูลส่วนตัว",
            "ข้อมูลกรมธรรม์",
            "ข้อมูลผลิตภัณฑ์/โปรโมชั่น",
            "บริการเคลมสุขภาพ",
            "ชำระเบี้ย",
            "ติดต่อสอบถามข้อมูลเพิ่มเติม",
            "ข้อเสนอแนะ/ร้องเรียน",
            "Log Out"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_menu);
        SetMenu();

        OtherMenuActivity_Adapter adapter1=new OtherMenuActivity_Adapter(OtherMenuActivity.this,
                itemname, arrImg);
        list1=(ListView)findViewById(R.id.drawerList);
        list1.setAdapter(adapter1);



        ImageView img = (ImageView) findViewById(R.id.imageView12);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),OtherCallCenterActivity.class));
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.imageView13);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),activity_other_map.class));
            }
        });


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this,planets[position]+ "   was selected ", Toast.LENGTH_SHORT).show();

        selectItem(position);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void selectItem(int position) {



        menuMGR.CustomerMenuSelect(position,this);
//        drawerLayout.closeDrawer(listView);
//        listView.setItemChecked(position,true);
//        setTitle(planets[position]);
    }
    public void  SetMenu(){

        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
        planets=getResources().getStringArray(R.array.CustomerMenu);
        listView=(ListView) findViewById(R.id.drawerList);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,planets));
        listView.setOnItemClickListener(this);

        //Close and open sideBar
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
