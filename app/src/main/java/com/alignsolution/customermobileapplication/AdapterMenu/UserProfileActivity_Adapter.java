package com.alignsolution.customermobileapplication.AdapterMenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alignsolution.customermobileapplication.R;
import com.alignsolution.customermobileapplication.UserProfileActivity;

/**
 * Created by aligndev on 28-Apr-17.
 */

public class UserProfileActivity_Adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;


    public UserProfileActivity_Adapter(UserProfileActivity context,
                                       String[] web, Integer[] imageId) {
        super(context, R.layout.activity_mainmenu_listview, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_mainmenu_listview, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView173);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView16);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
