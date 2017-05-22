package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by aligndev on 26-Apr-17.
 */

public class RegisterOTPActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_otp);

        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);


        Button cmd2 = (Button) findViewById(R.id.button4);
        cmd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),RegisterOTPPopUpActivity.class);
                startActivity(it2);
            }
        });

        Button cmd3 = (Button) findViewById(R.id.button5);
        cmd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),RegisterTeamCondition.class);
                startActivity(it2);
            }
        });


    }
}
