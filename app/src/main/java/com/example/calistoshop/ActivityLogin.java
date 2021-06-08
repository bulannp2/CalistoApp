package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener {

    public EditText username, password;
    public Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin) {
            String ambilUsername = username.getText().toString().trim();
            String ambilPassword = password.getText().toString().trim();

            if(ambilUsername.equals("calisto") && ambilPassword.equals("123456")){
                Toast.makeText(this, "Happy Shopping", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(com.example.calistoshop.ActivityLogin.this, activityProfile.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "Username or Password might be wrong. Please try again.", Toast.LENGTH_SHORT).show();
            }
        }

    }
}