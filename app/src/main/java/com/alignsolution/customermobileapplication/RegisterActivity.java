package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by aligndev on 26-Apr-17.
 */

public class RegisterActivity extends AppCompatActivity {
    private Spinner dataspiner1,dataspiner2,dataspiner3,dataspiner4,dataspiner5,dataspiner6;
    private ArrayList<String> textlist = new ArrayList<String>();
    private ArrayList<String> textlist2 = new ArrayList<String>();
    private ArrayList<String> textlist3 = new ArrayList<String>();
    private ArrayList<String> textlist4 = new ArrayList<String>();
    private ArrayList<String> textlist5 = new ArrayList<String>();
    private ArrayList<String> textlist6 = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        Button cmd1 = (Button) findViewById(R.id.button4);
        cmd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),LoginActivity.class);
                startActivity(it2);
            }
        });



        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);


//        Button cmd = (Button) findViewById(R.id.button8);
//        cmd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
//                Intent it2 = new Intent(getBaseContext(),RegisterActivity.class);
//                startActivity(it2);
//            }
//        });


        createview();
        prefecture();
        canton();
        createview2();
        prefecture2();
        canton2();

        dataspiner1 = (Spinner) findViewById(R.id.spinner01);
        dataspiner2 = (Spinner) findViewById(R.id.spinner02);
        dataspiner3 = (Spinner) findViewById(R.id.spinner03);
        dataspiner4 = (Spinner) findViewById(R.id.spinner04);
        dataspiner5 = (Spinner) findViewById(R.id.spinner05);
        dataspiner6 = (Spinner) findViewById(R.id.spinner06);

        // spinner Adapter  selectlist
        ArrayAdapter<String> adapterpovince1 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist);
        ArrayAdapter<String> adapterpovince2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist2);
        ArrayAdapter<String> adapterpovince3 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist3);
        ArrayAdapter<String> adapterpovince4 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist4);
        ArrayAdapter<String> adapterpovince5 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist5);
        ArrayAdapter<String> adapterpovince6 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, textlist6);

        dataspiner1.setAdapter(adapterpovince1);
        dataspiner2.setAdapter(adapterpovince2);
        dataspiner3.setAdapter(adapterpovince3);
        dataspiner4.setAdapter(adapterpovince4);
        dataspiner5.setAdapter(adapterpovince5);
        dataspiner6.setAdapter(adapterpovince6);

    }

    private void createview() {
        textlist.add("จังหวัด");
        textlist.add("กรุงเทพมหานคร ");
        textlist.add("กระบี่ ");
        textlist.add("กาญจนบุรี ");
        textlist.add("กาฬสินธุ์ ");
        textlist.add("กำแพงเพชร ");
        textlist.add("ขอนแก่น ");
        textlist.add("จันทบุรี ");
        textlist.add("ฉะเชิงเทรา ");
        textlist.add("ชลบุรี ");
        textlist.add("ชัยนาท ");
        textlist.add("ชัยภูมิ ");
        textlist.add("ชุมพร ");
        textlist.add("เชียงราย ");
        textlist.add("เชียงใหม่ ");
        textlist.add("ตรัง ");
        textlist.add("ตราด ");
        textlist.add("ตาก ");
        textlist.add("นครนายก ");
        textlist.add("นครปฐม ");
        textlist.add("นครพนม ");
        textlist.add("นครราชสีมา ");
        textlist.add("นครศรีธรรมราช ");
        textlist.add("นครสวรรค์ ");
        textlist.add("นนทบุรี ");
        textlist.add("นราธิวาส ");
        textlist.add("น่าน ");
        textlist.add("บึงกาฬ ");
        textlist.add("บุรีรัมย์ ");
        textlist.add("ปทุมธานี ");
        textlist.add("ประจวบคีรีขันธ์ ");
        textlist.add("ปราจีนบุรี ");
        textlist.add("ปัตตานี ");
        textlist.add(" พระนครศรีอยุธยา ");
        textlist.add("พังงา ");
        textlist.add("พัทลุง ");
        textlist.add("พิจิตร ");
        textlist.add("พิษณุโลก ");
        textlist.add("เพชรบุรี ");
        textlist.add("เพชรบูรณ์ ");
        textlist.add("แพร่ ");
        textlist.add("พะเยา ");
        textlist.add("ภูเก็ต ");
        textlist.add("มหาสารคาม ");
        textlist.add("มุกดาหาร ");
        textlist.add("แม่ฮ่องสอน ");
        textlist.add("ยะลา  ");
        textlist.add("ยโสธร  ");
        textlist.add("ร้อยเอ็ด  ");
        textlist.add("ระนอง  ");
        textlist.add("ระยอง  ");
        textlist.add("ราชบุรี  ");
        textlist.add("ลพบุรี  ");
        textlist.add("ลำปาง  ");
        textlist.add("ลำพูน  ");
        textlist.add("เลย  ");
        textlist.add("ศรีสะเกษ  ");
        textlist.add("สกลนคร  ");
        textlist.add("สงขลา  ");
        textlist.add("สตูล  ");
        textlist.add("สมุทรปราการ  ");
        textlist.add("สมุทรสงคราม  ");
        textlist.add("สมุทรสาคร  ");
        textlist.add("สระแก้ว  ");
        textlist.add("สระบุรี   ");
        textlist.add("สิงห์บุรี  ");
        textlist.add("สุโขทัย  ");
        textlist.add("สุพรรณบุรี  ");
        textlist.add("สุราษฎร์ธานี  ");
        textlist.add("สุรินทร์  ");
        textlist.add("หนองคาย  ");
        textlist.add("หนองบัวลำภู  ");
        textlist.add("อ่างทอง  ");
        textlist.add("อุดรธานี  ");
        textlist.add("อุทัยธานี  ");
        textlist.add("อุตรดิตถ์  ");
        textlist.add("อุบลราชธานี  ");
        textlist.add("อำนาจเจริญ ");
    }
    private void prefecture(){
        textlist2.add("อำเภอ / เขต");
        textlist2.add("อำเภอ1");
        textlist2.add("อำเภอ2");
        textlist2.add("อำเภอ3");
        textlist2.add("อำเภอ4");
        textlist2.add("อำเภอ5");
        textlist2.add("อำเภอ6");
        textlist2.add("อำเภอ7");
        textlist2.add("อำเภอ8");
        textlist2.add("อำเภอ9");
        textlist2.add("อำเภอ10");
    }
    private void canton(){
        textlist3.add("ตำบล / แขวง");
        textlist3.add("ตำบล1");
        textlist3.add("ตำบล2");
        textlist3.add("ตำบล3");
        textlist3.add("ตำบล4");
        textlist3.add("ตำบล5");
        textlist3.add("ตำบล6");
        textlist3.add("ตำบล7");
        textlist3.add("ตำบล8");
        textlist3.add("ตำบล9");
        textlist3.add("ตำบล10");

    }
    private void createview2() {
        textlist4.add("จังหวัด");
        textlist4.add("กรุงเทพมหานคร ");
        textlist4.add("กระบี่ ");
        textlist4.add("กาญจนบุรี ");
        textlist4.add("กาฬสินธุ์ ");
        textlist4.add("กำแพงเพชร ");
        textlist4.add("ขอนแก่น ");
        textlist4.add("จันทบุรี ");
        textlist4.add("ฉะเชิงเทรา ");
        textlist4.add("ชลบุรี ");
        textlist4.add("ชัยนาท ");
        textlist4.add("ชัยภูมิ ");
        textlist4.add("ชุมพร ");
        textlist4.add("เชียงราย ");
        textlist4.add("เชียงใหม่ ");
        textlist4.add("ตรัง ");
        textlist4.add("ตราด ");
        textlist4.add("ตาก ");
        textlist4.add("นครนายก ");
        textlist4.add("นครปฐม ");
        textlist4.add("นครพนม ");
        textlist4.add("นครราชสีมา ");
        textlist4.add("นครศรีธรรมราช ");
        textlist4.add("นครสวรรค์ ");
        textlist4.add("นนทบุรี ");
        textlist4.add("นราธิวาส ");
        textlist4.add("น่าน ");
        textlist4.add("บึงกาฬ ");
        textlist4.add("บุรีรัมย์ ");
        textlist4.add("ปทุมธานี ");
        textlist4.add("ประจวบคีรีขันธ์ ");
        textlist4.add("ปราจีนบุรี ");
        textlist4.add("ปัตตานี ");
        textlist4.add(" พระนครศรีอยุธยา ");
        textlist4.add("พังงา ");
        textlist4.add("พัทลุง ");
        textlist4.add("พิจิตร ");
        textlist4.add("พิษณุโลก ");
        textlist4.add("เพชรบุรี ");
        textlist4.add("เพชรบูรณ์ ");
        textlist4.add("แพร่ ");
        textlist4.add("พะเยา ");
        textlist4.add("ภูเก็ต ");
        textlist4.add("มหาสารคาม ");
        textlist4.add("มุกดาหาร ");
        textlist4.add("แม่ฮ่องสอน ");
        textlist4.add("ยะลา  ");
        textlist4.add("ยโสธร  ");
        textlist4.add("ร้อยเอ็ด  ");
        textlist4.add("ระนอง  ");
        textlist4.add("ระยอง  ");
        textlist4.add("ราชบุรี  ");
        textlist4.add("ลพบุรี  ");
        textlist4.add("ลำปาง  ");
        textlist4.add("ลำพูน  ");
        textlist4.add("เลย  ");
        textlist4.add("ศรีสะเกษ  ");
        textlist4.add("สกลนคร  ");
        textlist4.add("สงขลา  ");
        textlist4.add("สตูล  ");
        textlist4.add("สมุทรปราการ  ");
        textlist4.add("สมุทรสงคราม  ");
        textlist4.add("สมุทรสาคร  ");
        textlist4.add("สระแก้ว  ");
        textlist4.add("สระบุรี   ");
        textlist4.add("สิงห์บุรี  ");
        textlist4.add("สุโขทัย  ");
        textlist4.add("สุพรรณบุรี  ");
        textlist4.add("สุราษฎร์ธานี  ");
        textlist4.add("สุรินทร์  ");
        textlist4.add("หนองคาย  ");
        textlist4.add("หนองบัวลำภู  ");
        textlist4.add("อ่างทอง  ");
        textlist4.add("อุดรธานี  ");
        textlist4.add("อุทัยธานี  ");
        textlist4.add("อุตรดิตถ์  ");
        textlist4.add("อุบลราชธานี  ");
        textlist4.add("อำนาจเจริญ ");
    }
    private void prefecture2(){
        textlist5.add("อำเภอ / เขต");
        textlist5.add("อำเภอ1");
        textlist5.add("อำเภอ2");
        textlist5.add("อำเภอ3");
        textlist5.add("อำเภอ4");
        textlist5.add("อำเภอ5");
        textlist5.add("อำเภอ6");
        textlist5.add("อำเภอ7");
        textlist5.add("อำเภอ8");
        textlist5.add("อำเภอ9");
        textlist5.add("อำเภอ10");
    }
    private void canton2(){
        textlist6.add("ตำบล / แขวง");
        textlist6.add("ตำบล1");
        textlist6.add("ตำบล2");
        textlist6.add("ตำบล3");
        textlist6.add("ตำบล4");
        textlist6.add("ตำบล5");
        textlist6.add("ตำบล6");
        textlist6.add("ตำบล7");
        textlist6.add("ตำบล8");
        textlist6.add("ตำบล9");
        textlist6.add("ตำบล10");

    }
}
