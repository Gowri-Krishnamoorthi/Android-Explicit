package com.example.explicit_example;


import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView usernameDisplay = findViewById(R.id.username_display);
        TextView passwordDisplay = findViewById(R.id.password_display);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        usernameDisplay.setText("Username: " + username);
        passwordDisplay.setText("Password: " + password);
    }
}
