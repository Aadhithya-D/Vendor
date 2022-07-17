package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser use = mAuth.getCurrentUser();
        if(use != null){
            Intent intent= new Intent(MainActivity.this,Dashboard.class);
            startActivity(intent);
        }
        else {
            Intent intent= new Intent(MainActivity.this,SignIn.class);
            startActivity(intent);
        }

    }
}