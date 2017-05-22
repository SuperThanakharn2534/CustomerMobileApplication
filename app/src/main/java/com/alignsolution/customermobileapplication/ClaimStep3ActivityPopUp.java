package com.alignsolution.customermobileapplication;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aligndev on 28-Apr-17.
 */

public class ClaimStep3ActivityPopUp extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_step_3_popup);



        //  Header  TooBar  image and icon
        getSupportActionBar().setDisplayOptions(getSupportActionBar().getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        getSupportActionBar().setCustomView(R.layout.activity_header_toolbar);

        Button cmd1 = (Button) findViewById(R.id.button21);
        cmd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),ClaimStep3Activity.class);
                startActivity(it2);
            }
        });


        Button cmd2 = (Button) findViewById(R.id.button22);
        cmd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it2 = new Intent(getBaseContext(),Nav_Activity.class);
                Intent it2 = new Intent(getBaseContext(),ClaimStep3Activity.class);
                startActivity(it2);
            }
        });
    }
}
