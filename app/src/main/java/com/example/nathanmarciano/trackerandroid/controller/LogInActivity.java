package com.example.nathanmarciano.trackerandroid.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.nathanmarciano.trackerandroid.R;

public class LogInActivity extends AppCompatActivity {
    private EditText LogInEmail;
    private EditText LogInPassword;
    private Button LogInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        LogInEmail = (EditText) findViewById(R.id.activity_login_email);
        LogInPassword = (EditText) findViewById(R.id.activity_login_password);
        LogInButton = (Button) findViewById(R.id.activity_login_btn);

    }
}