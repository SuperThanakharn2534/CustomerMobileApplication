package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aligndev on 26-Apr-17.
 */

public class RegisterOTPPopUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register_otp_popup);

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vi = inflater.inflate(R.layout.activity_header_toolbar, null); //log.xml is your file.
        TextView tv = (TextView)vi.findViewById(R.id.txtTitle);
        tv.setText("OTP");

        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);




        //PopUp Page
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.17));


        Button cmd2 = (Button) findViewById(R.id.button6);
        cmd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),RegisterOTPActivity.class);
                startActivity(it2);
            }
        });
    }
}
