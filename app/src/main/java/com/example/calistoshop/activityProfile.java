package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityProfile extends AppCompatActivity {

    public TextView category;
    Button btnCatW, btnP, btnCatA, btnU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnCatW = (Button) findViewById(R.id.btnWanita);
        btnCatW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(getApplicationContext(), activityCatWanita.class);
                startActivity(intent);
            }
        });

        btnP = (Button) findViewById(R.id.btnPria);
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(getApplicationContext(), activityCatPria.class);
                startActivity(intent);

            }
        });

        btnCatA = (Button) findViewById(R.id.btnAnak);
        btnCatA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityCatAnak.class);
                startActivity(intent);
            }
        });

        btnU = (Button) findViewById(R.id.btnUser);
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(getApplicationContext(), activityUser.class);
                startActivity(intent);

            }
        });






    }
}