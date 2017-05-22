package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.alignsolution.customermobileapplication.AdapterMenu.PayCustomerActivity_Adapter;
import com.alignsolution.customermobileapplication.AdapterMenu.UserProfileActivity_Adapter;
import com.alignsolution.customermobileapplication.Bize.MenuMGR;

/**
 * Created by aligndev on 28-Apr-17.
 */

public class PayCustomerAcitivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


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
    protected void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_customer);
        SetMenu();

        PayCustomerActivity_Adapter adapter1=new PayCustomerActivity_Adapter(PayCustomerAcitivity.this,
                itemname, arrImg);
        list1=(ListView)findViewById(R.id.drawerList);
        list1.setAdapter(adapter1);


        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);


        final ListView listView = (ListView) findViewById(R.id.datalist_policy);

        // Defined Array values to show in ListView
        String[] values = new String[] {" APP ID : 00000001 \n" +
                "        ชื่อ-นามสกุล : ณเดช รักดี\n" +
                "        รหัสเลข Co-band : 484800059888\n" +
                "        แผนประกัน : 501 – Silver\n" +
                "        สถานะกรมธรรม์ : ปกติ"
                ,"APP ID : 00000002\n" +
                "ชื่อ-นามสกุล : ณเดช รักดี \n" +
                "รหัสเลข Co-band : 484800059888 \n" +
                "แผนประกัน : 502 – Gold\n" +
                "สถานะกรมธรรม์ : ยกเลิก\n"};

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, values){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,16);

                // Return the view
                return view;
            }
        };

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Item Click Listener
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        // ListView Clicked item index
                        int itemPosition     = position;
                        switch (position){
                            case  0:
                                Intent myIntent = new Intent(getBaseContext(),PayDetailActivity.class);
                                startActivity(myIntent);
                                break;
                            case  1:
                                //Toast.makeText(activity," ข้อมูลผลิตภัณฑ์/โปรโมชั่น ", Toast.LENGTH_SHORT).show();
                                //myIntent =new Intent(activity,Activity_Opportunity2.class);
                                //Intent myIntent = new Intent(getBaseContext(),Activity_Login.class);
                                // activity.startActivity(myIntent);
                                break;
                            default:
                                break;

                        }
                    }

                });

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






