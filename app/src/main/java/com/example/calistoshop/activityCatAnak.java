package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityCatAnak extends AppCompatActivity {

    Button btnbajuA, btncelanaA, btnsepatuA, btnouterA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_anak);

        btncelanaA = (Button) findViewById(R.id.celanaAnak);
        btncelanaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityCelanaAnak.class);
                startActivity(intent);
            }
        });

        btnbajuA = (Button) findViewById(R.id.bajuAnak);
        btnbajuA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityBajuAnak.class);
                startActivity(intent);
            }
        });

        btnsepatuA = (Button) findViewById(R.id.sepatuAnak);
        btnsepatuA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activitySepatuAnak.class);
                startActivity(intent);
            }
        });

        btnouterA = (Button) findViewById(R.id.outerAnak);
        btnouterA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent= new Intent(getApplicationContext(), activityOuterAnak.class);
                startActivity(intent);
            }
        });


    }
}