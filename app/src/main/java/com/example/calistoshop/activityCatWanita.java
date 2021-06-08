package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityCatWanita extends AppCompatActivity {

    Button btnCardiW, btnBajuW, btnCelanaW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_wanita);

        btnCardiW = (Button) findViewById(R.id.cardiganWanita);
        btnCardiW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityWanita.class);
                startActivity(intent);
            }
        });

        btnBajuW = (Button) findViewById(R.id.bajuWanita);
        btnBajuW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityBajuWanita.class);
                startActivity(intent);
            }
        });

        btnCelanaW = (Button) findViewById(R.id.celanaWanita);
        btnCelanaW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityCelanaWanita.class);
                startActivity(intent);
            }
        });




    }
}