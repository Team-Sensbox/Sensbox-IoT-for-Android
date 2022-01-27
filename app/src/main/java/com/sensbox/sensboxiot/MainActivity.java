package com.sensbox.sensboxiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name;
    private ImageView iv_profilepic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String profilepic = intent.getStringExtra("profilepic");

        tv_name = findViewById(R.id.tv_name);
        tv_name.setText(name);

        iv_profilepic = findViewById(R.id.iv_profilepic);
        Glide.with(this).load(profilepic).into(iv_profilepic);
    }
}