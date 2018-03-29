package com.example.nathanmarciano.trackerandroid.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nathanmarciano.trackerandroid.R;

public class MainActivity extends AppCompatActivity {
    private Button SignUpButton;
    private Button LogInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SignUpButton = (Button) findViewById(R.id.activity_main_signup_btn);
        LogInButton = (Button) findViewById(R.id.activity_main_login_btn);

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogInActivityIntent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(LogInActivityIntent);
            }
        });
        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent SignUpActivityIntent = new Intent(MainActivity.this, SignUpActivity.class);
               startActivity(SignUpActivityIntent);

            }
        });
    }



}
