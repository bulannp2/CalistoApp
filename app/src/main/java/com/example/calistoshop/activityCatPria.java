package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityCatPria extends AppCompatActivity {

    Button btnkemejaP, btnbajuP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_pria);

        btnkemejaP = (Button) findViewById(R.id.kemejaPria);
        btnkemejaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityKemejaPria.class);
                startActivity(intent);
            }
        });

        btnbajuP = (Button) findViewById(R.id.bajuPria);
        btnbajuP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityPria.class);
                startActivity(intent);
            }
        });


    }


}