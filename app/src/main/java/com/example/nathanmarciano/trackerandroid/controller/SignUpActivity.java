package com.example.nathanmarciano.trackerandroid.controller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nathanmarciano.trackerandroid.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText SignUpEmail;
    private EditText SignUpPassword;
    private Button SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        // Components
        SignUpEmail = (EditText) findViewById(R.id.activity_signUp_email);
        SignUpPassword = (EditText) findViewById(R.id.activity_signUp_password);
        SignUpButton = (Button) findViewById(R.id.activity_signUp_btn);

        // firebase
        mAuth = FirebaseAuth.getInstance();
    }

}
