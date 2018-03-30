package com.example.nathanmarciano.trackerandroid.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nathanmarciano.trackerandroid.R;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private EditText LogInEmail;
    private EditText LogInPassword;
    private Button LogInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        LogInEmail = (EditText) findViewById(R.id.activity_login_email);
        LogInPassword = (EditText) findViewById(R.id.activity_login_password);
        LogInButton = (Button) findViewById(R.id.activity_login_btn);

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = LogInEmail.getText().toString().trim();
                String password = LogInPassword.getText().toString().trim();

                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                if (!task.isSuccessful()) {
                                    // there was an error

                                    Toast.makeText(LogInActivity.this, "Authentication failed." + task.getException(),
                                            Toast.LENGTH_SHORT).show();
                                    }
                                 else {
                                    Toast.makeText(LogInActivity.this, "Vous êtes connecté",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }
        });
    }
}