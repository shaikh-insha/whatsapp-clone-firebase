package com.example.whatsappclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn, signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure your XML file is named activity_main.xml

        loginBtn = findViewById(R.id.login_button);
        signupBtn = findViewById(R.id.signup_button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // You can navigate to LoginActivity or add Firebase logic here
                Toast.makeText(MainActivity.this, "Login Clicked!", Toast.LENGTH_SHORT).show();
                // startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // You can navigate to SignupActivity or add Firebase logic here
                Toast.makeText(MainActivity.this, "Signup Clicked!", Toast.LENGTH_SHORT).show();
                // startActivity(new Intent(MainActivity.this, SignupActivity.class));
            }
        });
    }
}
