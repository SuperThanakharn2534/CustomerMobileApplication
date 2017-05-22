package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
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
import android.widget.Spinner;

import com.alignsolution.customermobileapplication.AdapterMenu.PolicyListActivity_Adapter;
import com.alignsolution.customermobileapplication.AdapterMenu.ProductPomotionDetail_Adapter;
import com.alignsolution.customermobileapplication.Bize.MenuMGR;

import java.util.ArrayList;

/**
 * Created by aligndev on 27-Apr-17.
 */

public class ProductPromotionDetailActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{


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



    private Spinner dataspiner,dataspinner2 ;
    private ArrayList<String> textlist1 = new ArrayList<String>();
    private ArrayList<String> textlist2 = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_promotion_detail);
         SetMenu();


        ProductPomotionDetail_Adapter adapter0=new ProductPomotionDetail_Adapter(ProductPromotionDetailActivity.this,
                itemname, arrImg);
        list1=(ListView)findViewById(R.id.drawerList);
        list1.setAdapter(adapter0);



        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);



       // Adapter spinner1
        dataspiner = (Spinner) findViewById(R.id.spinner1);
        dataspinner2 = (Spinner) findViewById(R.id.spinner2);
        createview();
        createview2();


        // Adapter Spinner 1
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, textlist1);
        dataspiner.setAdapter(adapter1);

        // Adapter Spinner 2
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, textlist2);
        dataspinner2.setAdapter(adapter2);
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

    private void createview() {
        textlist1.add("Silver1+");
        textlist1.add("Silver2+");
        textlist1.add("Silver3+");

    }
    private void createview2() {
        textlist2.add("ช่วงเวลาที่สะดวกติดต่อ");
        textlist2.add("08.00 - 09.00 น");
        textlist2.add("09.00 - 10.00 น");
        textlist2.add("10.00 - 11.00 น");
        textlist2.add("11.00 - 12.00 น");
        textlist2.add("12.00 - 13.00 น");
        textlist2.add("13.00 - 14.00 น");
        textlist2.add("14.00 - 15.00 น");
        textlist2.add("15.00 - 16.00 น");
        textlist2.add("16.00 - 17.00 น");
        textlist2.add("17.00 - 18.00 น");

    }

}
