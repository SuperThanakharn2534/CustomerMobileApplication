package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by aligndev on 26-Apr-17.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);

        Button cmd1 = (Button) findViewById(R.id.button);
        cmd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),UserProfileActivity.class);
                startActivity(it2);
            }
        });


        Button cmd2 = (Button) findViewById(R.id.button2);
        cmd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),RegisterOTPActivity.class);
                startActivity(it2);
            }
        });


        Button cmd3 = (Button) findViewById(R.id.button3);
        cmd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),ForgetPasswordActivity.class);
                startActivity(it2);
            }
        });

    }
}
